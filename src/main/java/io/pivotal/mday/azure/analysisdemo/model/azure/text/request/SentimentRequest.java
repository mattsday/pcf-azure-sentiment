/**
 * Generated using jsonschema2pojo.org from the schema provided here:
 * https://westus.dev.cognitive.microsoft.com/docs/services/TextAnalytics.V2.0/operations/56f30ceeeda5650db055a3c9 
 */
package io.pivotal.mday.azure.analysisdemo.model.azure.text.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "documents" })
public class SentimentRequest {

	@JsonProperty("documents")
	private List<SentimentRequestDocument> documents = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public SentimentRequest() {
	}

	// Convenience constructor to make this particular app easier
	public SentimentRequest(String text, String language) {
		SentimentRequestDocument doc = new SentimentRequestDocument();
		doc.setId("1");
		doc.setLanguage(language);
		doc.setText(text);
		List<SentimentRequestDocument> docs = new ArrayList<>(1);
		docs.add(doc);
		this.setDocuments(docs);
	}

	@JsonProperty("documents")
	public List<SentimentRequestDocument> getDocuments() {
		return documents;
	}

	@JsonProperty("documents")
	public void setDocuments(List<SentimentRequestDocument> documents) {
		this.documents = documents;
	}

}
