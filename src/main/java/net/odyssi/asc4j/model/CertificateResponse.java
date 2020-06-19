
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A response containing a single resource.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links" })
public class CertificateResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("The data structure that represents the resource.")
	private Certificate data;

	@JsonProperty("links")
	@JsonPropertyDescription("Self-links to documents that can contain information for one or more resources.")
	private DocumentLinks links;

	public Certificate getData() {
		return this.data;
	}

	public DocumentLinks getLinks() {
		return this.links;
	}

	public void setData(Certificate data) {
		this.data = data;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

}
