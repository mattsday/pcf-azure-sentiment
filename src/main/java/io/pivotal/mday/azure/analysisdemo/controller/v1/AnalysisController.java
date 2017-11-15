/**
 * Main API entrypoint for the app
 * 
 * @author Matt Day
 */
package io.pivotal.mday.azure.analysisdemo.controller.v1;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.mday.azure.analysisdemo.model.azure.text.response.SentimentResponseDocument;
import io.pivotal.mday.azure.analysisdemo.model.customer.CustomerMessage;
import io.pivotal.mday.azure.analysisdemo.repo.CustomerMessageRepo;
import io.pivotal.mday.azure.analysisdemo.services.AzureTextService;

@RestController
@RequestMapping("/v1")
public class AnalysisController {
	AzureTextService azureTextService;
	CustomerMessageRepo repo;

	public AnalysisController(AzureTextService azureTextService, CustomerMessageRepo repo) {
		this.azureTextService = azureTextService;
		this.repo = repo;
	}

	@GetMapping("/messages")
	public List<CustomerMessage> getMessages() {
		return repo.findAll();
	}

	@RequestMapping("/message")
	public String[] sendMessage(@RequestParam(required = true) String name,
			@RequestParam(required = true) String message) {
		SentimentResponseDocument d = azureTextService.getSentiment(message);
		CustomerMessage c = new CustomerMessage(name, message, new Date(), d.getScore());
		repo.save(c);
		return new String[] { "Received", "OK" };
	}
}
