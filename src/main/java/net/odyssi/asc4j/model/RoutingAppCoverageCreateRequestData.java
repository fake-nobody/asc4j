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
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * RoutingAppCoverageCreateRequestData
 */
@JsonPropertyOrder({ RoutingAppCoverageCreateRequestData.JSON_PROPERTY_TYPE,
		RoutingAppCoverageCreateRequestData.JSON_PROPERTY_ATTRIBUTES,
		RoutingAppCoverageCreateRequestData.JSON_PROPERTY_RELATIONSHIPS })

public class RoutingAppCoverageCreateRequestData implements Serializable {
	/**
	 * Gets or Sets type
	 */
	public enum TypeEnum {
		ROUTINGAPPCOVERAGES("routingAppCoverages");

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return this.value;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}
	}

	public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";

	public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";

	public static final String JSON_PROPERTY_TYPE = "type";
	/**
	 *
	 */
	private static final long serialVersionUID = -8879027880126667129L;

	private AppScreenshotCreateRequestDataAttributes attributes;

	private AppStoreReviewDetailCreateRequestDataRelationships relationships;
	private TypeEnum type;

	public RoutingAppCoverageCreateRequestData attributes(AppScreenshotCreateRequestDataAttributes attributes) {

		this.attributes = attributes;
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
		RoutingAppCoverageCreateRequestData routingAppCoverageCreateRequestData = (RoutingAppCoverageCreateRequestData) o;
		return Objects.equals(this.type, routingAppCoverageCreateRequestData.type)
				&& Objects.equals(this.attributes, routingAppCoverageCreateRequestData.attributes)
				&& Objects.equals(this.relationships, routingAppCoverageCreateRequestData.relationships);
	}

	/**
	 * Get attributes
	 *
	 * @return attributes
	 **/
	@NotNull
	@Valid

	@JsonProperty(JSON_PROPERTY_ATTRIBUTES)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)

	public AppScreenshotCreateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

	/**
	 * Get relationships
	 *
	 * @return relationships
	 **/
	@NotNull
	@Valid

	@JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)

	public AppStoreReviewDetailCreateRequestDataRelationships getRelationships() {
		return this.relationships;
	}

	/**
	 * Get type
	 *
	 * @return type
	 **/
	@NotNull

	@JsonProperty(JSON_PROPERTY_TYPE)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)

	public TypeEnum getType() {
		return this.type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.type, this.attributes, this.relationships);
	}

	public RoutingAppCoverageCreateRequestData relationships(
			AppStoreReviewDetailCreateRequestDataRelationships relationships) {

		this.relationships = relationships;
		return this;
	}

	public void setAttributes(AppScreenshotCreateRequestDataAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(AppStoreReviewDetailCreateRequestDataRelationships relationships) {
		this.relationships = relationships;
	}

	public void setType(TypeEnum type) {
		this.type = type;
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
		sb.append("class RoutingAppCoverageCreateRequestData {\n");
		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(this.attributes)).append("\n");
		sb.append("    relationships: ").append(toIndentedString(this.relationships)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public RoutingAppCoverageCreateRequestData type(TypeEnum type) {

		this.type = type;
		return this;
	}

}
