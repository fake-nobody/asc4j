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
 * AppResponse
 */
@JsonPropertyOrder({ AppResponse.JSON_PROPERTY_DATA, AppResponse.JSON_PROPERTY_INCLUDED,
		AppResponse.JSON_PROPERTY_LINKS })
public class AppResponse implements Serializable {

	public static final String JSON_PROPERTY_DATA = "data";

	public static final String JSON_PROPERTY_INCLUDED = "included";

	public static final String JSON_PROPERTY_LINKS = "links";
	private static final long serialVersionUID = 7175088891555710296L;

	private App data;

	private List<AppResponseIncludedOneOf> included = null;
	private DocumentLinks links;

	public AppResponse addIncludedItem(AppResponseIncludedOneOf includedItem) {
		if (this.included == null) {
			this.included = new ArrayList<>();
		}
		this.included.add(includedItem);
		return this;
	}

	public AppResponse data(App data) {

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
		AppResponse appResponse = (AppResponse) o;
		return Objects.equals(this.data, appResponse.data) && Objects.equals(this.included, appResponse.included)
				&& Objects.equals(this.links, appResponse.links);
	}

	@NotNull
	@Valid
	@JsonProperty(JSON_PROPERTY_DATA)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public App getData() {
		return this.data;
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_INCLUDED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public List<AppResponseIncludedOneOf> getIncluded() {
		return this.included;
	}

	@NotNull
	@Valid
	@JsonProperty(JSON_PROPERTY_LINKS)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)
	public DocumentLinks getLinks() {
		return this.links;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.data, this.included, this.links);
	}

	public AppResponse included(List<AppResponseIncludedOneOf> included) {
		this.included = included;
		return this;
	}

	public AppResponse links(DocumentLinks links) {
		this.links = links;
		return this;
	}

	public void setData(App data) {
		this.data = data;
	}

	public void setIncluded(List<AppResponseIncludedOneOf> included) {
		this.included = included;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
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
		sb.append("class AppResponse {\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
