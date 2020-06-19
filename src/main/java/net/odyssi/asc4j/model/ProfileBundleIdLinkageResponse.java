
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A response containing the ID of the related resource.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "links" })
public class ProfileBundleIdLinkageResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("")
	private ResourceObjectData data;

	@JsonProperty("links")
	@JsonPropertyDescription("Self-links to documents that can contain information for one or more resources.")
	private DocumentLinks links;

	public ResourceObjectData getData() {
		return this.data;
	}

	public DocumentLinks getLinks() {
		return this.links;
	}

	public void setData(ResourceObjectData data) {
		this.data = data;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfileBundleIdLinkageResponse other = (ProfileBundleIdLinkageResponse) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (!links.equals(other.links))
			return false;
		return true;
	}

}
