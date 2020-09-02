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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppPreviewSetRelationships
 */
@JsonPropertyOrder({ AppPreviewSetRelationships.JSON_PROPERTY_APP_STORE_VERSION_LOCALIZATION,
		AppPreviewSetRelationships.JSON_PROPERTY_APP_PREVIEWS })

public class AppPreviewSetRelationships implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 8505050142969284311L;

	public static final String JSON_PROPERTY_APP_PREVIEWS = "appPreviews";

	public static final String JSON_PROPERTY_APP_STORE_VERSION_LOCALIZATION = "appStoreVersionLocalization";

	private AppPreviewSetRelationshipsAppPreviews appPreviews;
	private AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization;

	public AppPreviewSetRelationships appPreviews(AppPreviewSetRelationshipsAppPreviews appPreviews) {

		this.appPreviews = appPreviews;
		return this;
	}

	public AppPreviewSetRelationships appStoreVersionLocalization(
			AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {

		this.appStoreVersionLocalization = appStoreVersionLocalization;
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
		AppPreviewSetRelationships appPreviewSetRelationships = (AppPreviewSetRelationships) o;
		return Objects.equals(this.appStoreVersionLocalization, appPreviewSetRelationships.appStoreVersionLocalization)
				&& Objects.equals(this.appPreviews, appPreviewSetRelationships.appPreviews);
	}

	/**
	 * Get appPreviews
	 *
	 * @return appPreviews
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP_PREVIEWS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppPreviewSetRelationshipsAppPreviews getAppPreviews() {
		return this.appPreviews;
	}

	/**
	 * Get appStoreVersionLocalization
	 *
	 * @return appStoreVersionLocalization
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_LOCALIZATION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppPreviewSetRelationshipsAppStoreVersionLocalization getAppStoreVersionLocalization() {
		return this.appStoreVersionLocalization;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.appStoreVersionLocalization, this.appPreviews);
	}

	public void setAppPreviews(AppPreviewSetRelationshipsAppPreviews appPreviews) {
		this.appPreviews = appPreviews;
	}

	public void setAppStoreVersionLocalization(
			AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
		this.appStoreVersionLocalization = appStoreVersionLocalization;
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
		sb.append("class AppPreviewSetRelationships {\n");
		sb.append("    appStoreVersionLocalization: ").append(toIndentedString(this.appStoreVersionLocalization))
				.append("\n");
		sb.append("    appPreviews: ").append(toIndentedString(this.appPreviews)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}