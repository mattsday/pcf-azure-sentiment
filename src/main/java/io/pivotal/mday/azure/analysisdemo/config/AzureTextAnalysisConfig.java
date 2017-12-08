/**
 * Configuration class for the Azure text service
 * 
 * @author Matt Day
 */
package io.pivotal.mday.azure.analysisdemo.config;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureTextAnalysisConfig {

	private String uri;
	private String apiKey;
	@Value("${azure.text-analysis.language}")
	private String language;

	public AzureTextAnalysisConfig() {
		final String env = System.getenv("VCAP_SERVICES");
		try {
			// Pull out the first credentials in VCAP_SERVICES
			JSONObject credentialJson = new JSONObject(env).getJSONArray("azure-cognitive-text").getJSONObject(0)
					.getJSONObject("credentials");

			this.uri = credentialJson.getString("uri");
			this.apiKey = credentialJson.getString("secret");
		} catch (Exception e) {
			throw new RuntimeException("Can't get VCAP Services - is there a service instance bound?");
		}
	}

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
