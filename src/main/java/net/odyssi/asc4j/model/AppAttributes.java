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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AppAttributes
 */
@JsonPropertyOrder({ AppAttributes.JSON_PROPERTY_NAME, AppAttributes.JSON_PROPERTY_BUNDLE_ID,
		AppAttributes.JSON_PROPERTY_SKU, AppAttributes.JSON_PROPERTY_PRIMARY_LOCALE,
		AppAttributes.JSON_PROPERTY_IS_OR_EVER_WAS_MADE_FOR_KIDS,
		AppAttributes.JSON_PROPERTY_AVAILABLE_IN_NEW_TERRITORIES,
		AppAttributes.JSON_PROPERTY_CONTENT_RIGHTS_DECLARATION })
public class AppAttributes implements Serializable {

	/**
	 * Gets or Sets contentRightsDeclaration
	 */
	public enum ContentRightsDeclarationEnum {
		DOES_NOT_USE_THIRD_PARTY_CONTENT("DOES_NOT_USE_THIRD_PARTY_CONTENT"),

		USES_THIRD_PARTY_CONTENT("USES_THIRD_PARTY_CONTENT");

		@JsonCreator
		public static ContentRightsDeclarationEnum fromValue(String value) {
			for (ContentRightsDeclarationEnum b : ContentRightsDeclarationEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ContentRightsDeclarationEnum(String value) {
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

	public static final String JSON_PROPERTY_AVAILABLE_IN_NEW_TERRITORIES = "availableInNewTerritories";

	public static final String JSON_PROPERTY_BUNDLE_ID = "bundleId";
	public static final String JSON_PROPERTY_CONTENT_RIGHTS_DECLARATION = "contentRightsDeclaration";

	public static final String JSON_PROPERTY_IS_OR_EVER_WAS_MADE_FOR_KIDS = "isOrEverWasMadeForKids";
	public static final String JSON_PROPERTY_NAME = "name";

	public static final String JSON_PROPERTY_PRIMARY_LOCALE = "primaryLocale";
	public static final String JSON_PROPERTY_SKU = "sku";

	private static final long serialVersionUID = -4128708845203902694L;

	private Boolean availableInNewTerritories;
	private String bundleId;

	private ContentRightsDeclarationEnum contentRightsDeclaration;
	private Boolean isOrEverWasMadeForKids;

	private String name;

	private String primaryLocale;
	private String sku;

	public AppAttributes availableInNewTerritories(Boolean availableInNewTerritories) {
		this.availableInNewTerritories = availableInNewTerritories;
		return this;
	}

	public AppAttributes bundleId(String bundleId) {
		this.bundleId = bundleId;
		return this;
	}

	public AppAttributes contentRightsDeclaration(ContentRightsDeclarationEnum contentRightsDeclaration) {
		this.contentRightsDeclaration = contentRightsDeclaration;
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
		AppAttributes appAttributes = (AppAttributes) o;
		return Objects.equals(this.name, appAttributes.name) && Objects.equals(this.bundleId, appAttributes.bundleId)
				&& Objects.equals(this.sku, appAttributes.sku)
				&& Objects.equals(this.primaryLocale, appAttributes.primaryLocale)
				&& Objects.equals(this.isOrEverWasMadeForKids, appAttributes.isOrEverWasMadeForKids)
				&& Objects.equals(this.availableInNewTerritories, appAttributes.availableInNewTerritories)
				&& Objects.equals(this.contentRightsDeclaration, appAttributes.contentRightsDeclaration);
	}

	@JsonProperty(JSON_PROPERTY_AVAILABLE_IN_NEW_TERRITORIES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public Boolean getAvailableInNewTerritories() {
		return this.availableInNewTerritories;
	}

	@JsonProperty(JSON_PROPERTY_BUNDLE_ID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getBundleId() {
		return this.bundleId;
	}

	@JsonProperty(JSON_PROPERTY_CONTENT_RIGHTS_DECLARATION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public ContentRightsDeclarationEnum getContentRightsDeclaration() {
		return this.contentRightsDeclaration;
	}

	@JsonProperty(JSON_PROPERTY_IS_OR_EVER_WAS_MADE_FOR_KIDS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public Boolean getIsOrEverWasMadeForKids() {
		return this.isOrEverWasMadeForKids;
	}

	@JsonProperty(JSON_PROPERTY_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getName() {
		return this.name;
	}

	@JsonProperty(JSON_PROPERTY_PRIMARY_LOCALE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getPrimaryLocale() {
		return this.primaryLocale;
	}

	@JsonProperty(JSON_PROPERTY_SKU)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getSku() {
		return this.sku;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.bundleId, this.sku, this.primaryLocale, this.isOrEverWasMadeForKids,
				this.availableInNewTerritories, this.contentRightsDeclaration);
	}

	public AppAttributes isOrEverWasMadeForKids(Boolean isOrEverWasMadeForKids) {
		this.isOrEverWasMadeForKids = isOrEverWasMadeForKids;
		return this;
	}

	public AppAttributes name(String name) {
		this.name = name;
		return this;
	}

	public AppAttributes primaryLocale(String primaryLocale) {
		this.primaryLocale = primaryLocale;
		return this;
	}

	public void setAvailableInNewTerritories(Boolean availableInNewTerritories) {
		this.availableInNewTerritories = availableInNewTerritories;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public void setContentRightsDeclaration(ContentRightsDeclarationEnum contentRightsDeclaration) {
		this.contentRightsDeclaration = contentRightsDeclaration;
	}

	public void setIsOrEverWasMadeForKids(Boolean isOrEverWasMadeForKids) {
		this.isOrEverWasMadeForKids = isOrEverWasMadeForKids;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrimaryLocale(String primaryLocale) {
		this.primaryLocale = primaryLocale;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public AppAttributes sku(String sku) {

		this.sku = sku;
		return this;
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
		sb.append("class AppAttributes {\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    bundleId: ").append(toIndentedString(this.bundleId)).append("\n");
		sb.append("    sku: ").append(toIndentedString(this.sku)).append("\n");
		sb.append("    primaryLocale: ").append(toIndentedString(this.primaryLocale)).append("\n");
		sb.append("    isOrEverWasMadeForKids: ").append(toIndentedString(this.isOrEverWasMadeForKids)).append("\n");
		sb.append("    availableInNewTerritories: ").append(toIndentedString(this.availableInNewTerritories))
				.append("\n");
		sb.append("    contentRightsDeclaration: ").append(toIndentedString(this.contentRightsDeclaration))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}

}
