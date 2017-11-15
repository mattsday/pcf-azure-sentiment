/**
 * Generated using jsonschema2pojo.org from the schema provided here:
 * https://westus.dev.cognitive.microsoft.com/docs/services/TextAnalytics.V2.0/operations/56f30ceeeda5650db055a3c9 
 */
package io.pivotal.mday.azure.analysisdemo.model.azure.text.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class SentimentResponseDocument {

	/**
	 * A decimal number between 0 and 1 denoting the sentiment of the document.
	 * A score above 0.7 usually refers to a positive document while a score
	 * below 0.3 normally has a negative connotation. Mid values refer to
	 * neutral text.
	 *
	 */
	@JsonProperty("score")
	@JsonPropertyDescription("A decimal number between 0 and 1 denoting the sentiment of the document. \r\n A score above 0.7 usually refers to a positive document while a score below 0.3 normally has a negative connotation.\r\n Mid values refer to neutral text.")
	private Double score;
	/**
	 * Unique document identifier.
	 *
	 */
	@JsonProperty("id")
	@JsonPropertyDescription("Unique document identifier.")
	private String id;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * A decimal number between 0 and 1 denoting the sentiment of the document.
	 * A score above 0.7 usually refers to a positive document while a score
	 * below 0.3 normally has a negative connotation. Mid values refer to
	 * neutral text.
	 *
	 */
	@JsonProperty("score")
	public Double getScore() {
		return score;
	}

	/**
	 * A decimal number between 0 and 1 denoting the sentiment of the document.
	 * A score above 0.7 usually refers to a positive document while a score
	 * below 0.3 normally has a negative connotation. Mid values refer to
	 * neutral text.
	 *
	 */
	@JsonProperty("score")
	public void setScore(Double score) {
		this.score = score;
	}

	/**
	 * Unique document identifier.
	 *
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * Unique document identifier.
	 *
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
