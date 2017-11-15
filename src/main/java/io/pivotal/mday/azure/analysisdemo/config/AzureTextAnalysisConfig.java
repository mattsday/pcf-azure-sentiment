/**
 * Configuration class for the Azure text service
 * 
 * @author Matt Day
 */
package io.pivotal.mday.azure.analysisdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureTextAnalysisConfig {

	@Value("${azure.text-analysis.uri}")
	private String uri;
	@Value("${azure.text-analysis.subscription-key}")
	private String apiKey;
	@Value("${azure.text-analysis.language}")
	private String language;

	public String getUri() {
		return uri;
	}

	public String getApiKey() {
		return apiKey;
	}

	public String getLanguage() {
		return language;
	}

}
