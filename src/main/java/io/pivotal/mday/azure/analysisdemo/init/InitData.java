package io.pivotal.mday.azure.analysisdemo.init;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import io.pivotal.mday.azure.analysisdemo.config.ReviewSeedConfig;
import io.pivotal.mday.azure.analysisdemo.model.customer.CustomerMessage;
import io.pivotal.mday.azure.analysisdemo.repo.CustomerMessageRepo;
import io.pivotal.mday.azure.analysisdemo.services.AzureTextService;

@Component
public class InitData implements CommandLineRunner {

	private CustomerMessageRepo repo;
	private ReviewSeedConfig reviews;
	private AzureTextService textService;
	private Faker faker;

	public InitData(CustomerMessageRepo repo, ReviewSeedConfig reviews, AzureTextService textService) {
		this.repo = repo;
		this.reviews = reviews;
		this.textService = textService;
		this.faker = Faker.instance();
	}

	@Override
	public void run(String... args) throws Exception {
		if (repo.count() > 0) {
			return;
		}
		for (String review : reviews.getSeeds()) {
			final String name = faker.name().fullName();
			final Date date = faker.date().birthday(0, 1);
			CustomerMessage message = new CustomerMessage(name, review, date);
			// Only do API request if not found in the cache
			if (repo.findByHash(message.getHash()).isEmpty()) {
				final Double sentiment = textService.getSentiment(review).getScore();
				message.setSentiment(sentiment);
				repo.save(message);
			}
		}

	}

}
