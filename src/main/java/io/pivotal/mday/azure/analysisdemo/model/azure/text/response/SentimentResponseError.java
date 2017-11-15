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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "message" })
public class SentimentResponseError {

	/**
	 * Input document unique identifier the error refers to.
	 *
	 */
	@JsonProperty("id")
	@JsonPropertyDescription("Input document unique identifier the error refers to.")
	private String id;
	/**
	 * Error message.
	 *
	 */
	@JsonProperty("message")
	@JsonPropertyDescription("Error message.")
	private String message;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * Input document unique identifier the error refers to.
	 *
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * Input document unique identifier the error refers to.
	 *
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Error message.
	 *
	 */
	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	/**
	 * Error message.
	 *
	 */
	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
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
