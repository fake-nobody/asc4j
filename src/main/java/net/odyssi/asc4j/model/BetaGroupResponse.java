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
 * BetaGroupResponse
 */
@JsonPropertyOrder({ BetaGroupResponse.JSON_PROPERTY_DATA, BetaGroupResponse.JSON_PROPERTY_INCLUDED,
		BetaGroupResponse.JSON_PROPERTY_LINKS })

public class BetaGroupResponse implements Serializable {
	public static final String JSON_PROPERTY_DATA = "data";

	public static final String JSON_PROPERTY_INCLUDED = "included";

	public static final String JSON_PROPERTY_LINKS = "links";
	/**
	 *
	 */
	private static final long serialVersionUID = 659729012343958777L;

	private BetaGroup data;

	private List<BetaGroupResponseIncludedOneOf> included = null;
	private DocumentLinks links;

	public BetaGroupResponse addIncludedItem(BetaGroupResponseIncludedOneOf includedItem) {
		if (this.included == null) {
			this.included = new ArrayList<>();
		}
		this.included.add(includedItem);
		return this;
	}

	public BetaGroupResponse data(BetaGroup data) {

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
		BetaGroupResponse betaGroupResponse = (BetaGroupResponse) o;
		return Objects.equals(this.data, betaGroupResponse.data)
				&& Objects.equals(this.included, betaGroupResponse.included)
				&& Objects.equals(this.links, betaGroupResponse.links);
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@NotNull
	@Valid

	@JsonProperty(JSON_PROPERTY_DATA)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)

	public BetaGroup getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_INCLUDED)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public List<BetaGroupResponseIncludedOneOf> getIncluded() {
		return this.included;
	}

	/**
	 * Get links
	 *
	 * @return links
	 **/
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

	public BetaGroupResponse included(List<BetaGroupResponseIncludedOneOf> included) {

		this.included = included;
		return this;
	}

	public BetaGroupResponse links(DocumentLinks links) {

		this.links = links;
		return this;
	}

	public void setData(BetaGroup data) {
		this.data = data;
	}

	public void setIncluded(List<BetaGroupResponseIncludedOneOf> included) {
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
		sb.append("class BetaGroupResponse {\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
