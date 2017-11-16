package io.pivotal.mday.azure.analysisdemo.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "reviews")
public class ReviewSeedConfig {
	private List<String> seeds;

	public List<String> getSeeds() {
		return seeds;
	}

	public void setSeeds(List<String> seeds) {
		this.seeds = seeds;
	}
}
