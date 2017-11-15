/**
 * Generated using jsonschema2pojo.org from the schema provided here:
 * https://westus.dev.cognitive.microsoft.com/docs/services/TextAnalytics.V2.0/operations/56f30ceeeda5650db055a3c9 
 */
package io.pivotal.mday.azure.analysisdemo.model.azure.text.request;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "language", "id", "text" })
public class SentimentRequestDocument {

	/**
	 * This is the 2 letter ISO 639-1 representation of a language. For example,
	 * use "en" for English; "es" for Spanish etc.,
	 *
	 */
	@JsonProperty("language")
	@JsonPropertyDescription("This is the 2 letter ISO 639-1 representation of a language.\r\n For example, use \"en\" for English; \"es\" for Spanish etc.,")
	private String language;
	/**
	 * Unique, non-empty document identifier.
	 *
	 */
	@JsonProperty("id")
	@JsonPropertyDescription("Unique, non-empty document identifier.")
	private String id;
	@JsonProperty("text")
	private String text;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * This is the 2 letter ISO 639-1 representation of a language. For example,
	 * use "en" for English; "es" for Spanish etc.,
	 *
	 */
	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	/**
	 * This is the 2 letter ISO 639-1 representation of a language. For example,
	 * use "en" for English; "es" for Spanish etc.,
	 *
	 */
	@JsonProperty("language")
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Unique, non-empty document identifier.
	 *
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * Unique, non-empty document identifier.
	 *
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
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
