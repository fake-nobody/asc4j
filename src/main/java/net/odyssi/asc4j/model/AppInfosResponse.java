/*
 * App Store Connect API
 * Automate the tasks you perform on the Apple Developer website and in App Store Connect.  The App Store Connect API is a REST API that enables the automation of actions you take in App Store Connect.  Calls to the API require JSON Web Tokens (JWT) for authorization; you obtain keys to create the tokens from your organization’s App Store Connect account.
 *
 * The version of the OpenAPI document: 1.2
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppInfosResponse
 */
@JsonPropertyOrder({ AppInfosResponse.JSON_PROPERTY_DATA, AppInfosResponse.JSON_PROPERTY_INCLUDED,
		AppInfosResponse.JSON_PROPERTY_LINKS, AppInfosResponse.JSON_PROPERTY_META })
public class AppInfosResponse implements Serializable {

	public static final String JSON_PROPERTY_DATA = "data";

	public static final String JSON_PROPERTY_INCLUDED = "included";

	public static final String JSON_PROPERTY_LINKS = "links";
	public static final String JSON_PROPERTY_META = "meta";

	private static final long serialVersionUID = 7952775310064043867L;

	private List<AppInfo> data = new ArrayList<>();
	private List<AppInfosResponseIncludedOneOf> included = null;

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public AppInfosResponse addDataItem(AppInfo dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public AppInfosResponse addIncludedItem(AppInfosResponseIncludedOneOf includedItem) {
		if (this.included == null) {
			this.included = new ArrayList<>();
		}
		this.included.add(includedItem);
		return this;
	}

	public AppInfosResponse data(List<AppInfo> data) {
		this.data = data;
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppInfosResponse appInfosResponse = (AppInfosResponse) o;
		return Objects.equals(this.data, appInfosResponse.data)
				&& Objects.equals(this.included, appInfosResponse.included)
				&& Objects.equals(this.links, appInfosResponse.links)
				&& Objects.equals(this.meta, appInfosResponse.meta);
	}

	@NotNull
	@Valid
	@JsonProperty(JSON_PROPERTY_DATA)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public List<AppInfo> getData() {
		return this.data;
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_INCLUDED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public List<AppInfosResponseIncludedOneOf> getIncluded() {
		return this.included;
	}

	@NotNull
	@Valid
	@JsonProperty(JSON_PROPERTY_LINKS)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public PagedDocumentLinks getLinks() {
		return this.links;
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_META)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public PagingInformation getMeta() {
		return this.meta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.data, this.included, this.links, this.meta);
	}

	public AppInfosResponse included(List<AppInfosResponseIncludedOneOf> included) {
		this.included = included;
		return this;
	}

	public AppInfosResponse links(PagedDocumentLinks links) {
		this.links = links;
		return this;
	}

	public AppInfosResponse meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<AppInfo> data) {
		this.data = data;
	}

	public void setIncluded(List<AppInfosResponseIncludedOneOf> included) {
		this.included = included;
	}

	public void setLinks(PagedDocumentLinks links) {
		this.links = links;
	}

	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppInfosResponse {\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
