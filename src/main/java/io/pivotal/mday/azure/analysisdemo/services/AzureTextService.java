/**
 * Sentiment service, ugly but gets it done
 * 
 * @author Matt Day
 */
package io.pivotal.mday.azure.analysisdemo.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.pivotal.mday.azure.analysisdemo.config.AzureTextAnalysisConfig;
import io.pivotal.mday.azure.analysisdemo.model.azure.text.request.SentimentRequest;
import io.pivotal.mday.azure.analysisdemo.model.azure.text.response.SentimentResponse;
import io.pivotal.mday.azure.analysisdemo.model.azure.text.response.SentimentResponseDocument;

@Service
public class AzureTextService {

	private RestTemplate restTemplate;
	private AzureTextAnalysisConfig textConfig;

	public AzureTextService(AzureTextAnalysisConfig textConfig) {
		super();
		this.restTemplate = new RestTemplate();
		this.textConfig = textConfig;
	}

	public SentimentResponseDocument getSentiment(String text) {
		SentimentRequest req = new SentimentRequest(text, textConfig.getLanguage());
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			final String reqBody = objectMapper.writeValueAsString(req);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("Ocp-Apim-Subscription-Key", textConfig.getApiKey());
			HttpEntity<String> entity = new HttpEntity<String>(reqBody, headers);
			ResponseEntity<SentimentResponse> response = restTemplate.exchange(textConfig.getUri(), HttpMethod.POST,
					entity, SentimentResponse.class);

			return response.getBody().getDocuments().get(0);

		} catch (Exception e) {
			// Lazily re-throw as a runtime exception so hystrix can catch it
			throw new RuntimeException(e);
		}
	}
}
