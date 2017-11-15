/**
 * Generated using jsonschema2pojo.org from the schema provided here:
 * https://westus.dev.cognitive.microsoft.com/docs/services/TextAnalytics.V2.0/operations/56f30ceeeda5650db055a3c9 
 */

package io.pivotal.mday.azure.analysisdemo.model.azure.text.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "documents", "errors" })
public class SentimentResponse {
	@JsonProperty("documents")
	private List<SentimentResponseDocument> documents = null;
	@JsonProperty("errors")
	private List<SentimentResponseError> errors = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("documents")
	public List<SentimentResponseDocument> getDocuments() {
		return documents;
	}

	@JsonProperty("documents")
	public void setDocuments(List<SentimentResponseDocument> documents) {
		this.documents = documents;
	}

	@JsonProperty("errors")
	public List<SentimentResponseError> getErrors() {
		return errors;
	}

	@JsonProperty("errors")
	public void setErrors(List<SentimentResponseError> errors) {
		this.errors = errors;
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
