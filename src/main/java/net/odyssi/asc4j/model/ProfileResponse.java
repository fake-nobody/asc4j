
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A response containing a single resource.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links", "included" })
public class ProfileResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("The data structure that represents the resource.")
	private Profile data;

	@JsonProperty("included")
	@JsonPropertyDescription("Possible types: BundleId, Device, Certificate")
	private List<Object> included = new ArrayList<Object>();

	@JsonProperty("links")
	@JsonPropertyDescription("Self-links to documents that can contain information for one or more resources.")
	private DocumentLinks links;

	public Profile getData() {
		return this.data;
	}

	public List<Object> getIncluded() {
		return this.included;
	}

	public DocumentLinks getLinks() {
		return this.links;
	}

	public void setData(Profile data) {
		this.data = data;
	}

	public void setIncluded(List<Object> included) {
		this.included = included;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

}
