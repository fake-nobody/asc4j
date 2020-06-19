
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "attributes", "id" })
public class BundleIdUpdateRequestData {

	@JsonProperty("attributes")
	@JsonPropertyDescription("")
	private BundleIdAttributes attributes;

	@JsonProperty("id")
	@JsonPropertyDescription("")
	private String id;

	@JsonProperty("type")
	@JsonPropertyDescription("Value: bundleIds")
	private String type;

	public BundleIdAttributes getAttributes() {
		return this.attributes;
	}

	public String getId() {
		return this.id;
	}

	public String getType() {
		return this.type;
	}

	public void setAttributes(BundleIdAttributes attributes) {
		this.attributes = attributes;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

}
