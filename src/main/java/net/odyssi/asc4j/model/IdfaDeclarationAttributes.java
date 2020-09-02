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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * IdfaDeclarationAttributes
 */
@JsonPropertyOrder({ IdfaDeclarationAttributes.JSON_PROPERTY_SERVES_ADS,
		IdfaDeclarationAttributes.JSON_PROPERTY_ATTRIBUTES_APP_INSTALLATION_TO_PREVIOUS_AD,
		IdfaDeclarationAttributes.JSON_PROPERTY_ATTRIBUTES_ACTION_WITH_PREVIOUS_AD,
		IdfaDeclarationAttributes.JSON_PROPERTY_HONORS_LIMITED_AD_TRACKING })

public class IdfaDeclarationAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 5176418464453201816L;

	public static final String JSON_PROPERTY_ATTRIBUTES_ACTION_WITH_PREVIOUS_AD = "attributesActionWithPreviousAd";

	public static final String JSON_PROPERTY_ATTRIBUTES_APP_INSTALLATION_TO_PREVIOUS_AD = "attributesAppInstallationToPreviousAd";
	public static final String JSON_PROPERTY_HONORS_LIMITED_AD_TRACKING = "honorsLimitedAdTracking";

	public static final String JSON_PROPERTY_SERVES_ADS = "servesAds";

	private Boolean attributesActionWithPreviousAd;
	private Boolean attributesAppInstallationToPreviousAd;

	private Boolean honorsLimitedAdTracking;
	private Boolean servesAds;

	public IdfaDeclarationAttributes attributesActionWithPreviousAd(Boolean attributesActionWithPreviousAd) {

		this.attributesActionWithPreviousAd = attributesActionWithPreviousAd;
		return this;
	}

	public IdfaDeclarationAttributes attributesAppInstallationToPreviousAd(
			Boolean attributesAppInstallationToPreviousAd) {

		this.attributesAppInstallationToPreviousAd = attributesAppInstallationToPreviousAd;
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
		IdfaDeclarationAttributes idfaDeclarationAttributes = (IdfaDeclarationAttributes) o;
		return Objects.equals(this.servesAds, idfaDeclarationAttributes.servesAds)
				&& Objects.equals(this.attributesAppInstallationToPreviousAd,
						idfaDeclarationAttributes.attributesAppInstallationToPreviousAd)
				&& Objects.equals(this.attributesActionWithPreviousAd,
						idfaDeclarationAttributes.attributesActionWithPreviousAd)
				&& Objects.equals(this.honorsLimitedAdTracking, idfaDeclarationAttributes.honorsLimitedAdTracking);
	}

	/**
	 * Get attributesActionWithPreviousAd
	 *
	 * @return attributesActionWithPreviousAd
	 **/

	@JsonProperty(JSON_PROPERTY_ATTRIBUTES_ACTION_WITH_PREVIOUS_AD)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getAttributesActionWithPreviousAd() {
		return this.attributesActionWithPreviousAd;
	}

	/**
	 * Get attributesAppInstallationToPreviousAd
	 *
	 * @return attributesAppInstallationToPreviousAd
	 **/

	@JsonProperty(JSON_PROPERTY_ATTRIBUTES_APP_INSTALLATION_TO_PREVIOUS_AD)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getAttributesAppInstallationToPreviousAd() {
		return this.attributesAppInstallationToPreviousAd;
	}

	/**
	 * Get honorsLimitedAdTracking
	 *
	 * @return honorsLimitedAdTracking
	 **/

	@JsonProperty(JSON_PROPERTY_HONORS_LIMITED_AD_TRACKING)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getHonorsLimitedAdTracking() {
		return this.honorsLimitedAdTracking;
	}

	/**
	 * Get servesAds
	 *
	 * @return servesAds
	 **/

	@JsonProperty(JSON_PROPERTY_SERVES_ADS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getServesAds() {
		return this.servesAds;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.servesAds, this.attributesAppInstallationToPreviousAd,
				this.attributesActionWithPreviousAd, this.honorsLimitedAdTracking);
	}

	public IdfaDeclarationAttributes honorsLimitedAdTracking(Boolean honorsLimitedAdTracking) {

		this.honorsLimitedAdTracking = honorsLimitedAdTracking;
		return this;
	}

	public IdfaDeclarationAttributes servesAds(Boolean servesAds) {

		this.servesAds = servesAds;
		return this;
	}

	public void setAttributesActionWithPreviousAd(Boolean attributesActionWithPreviousAd) {
		this.attributesActionWithPreviousAd = attributesActionWithPreviousAd;
	}

	public void setAttributesAppInstallationToPreviousAd(Boolean attributesAppInstallationToPreviousAd) {
		this.attributesAppInstallationToPreviousAd = attributesAppInstallationToPreviousAd;
	}

	public void setHonorsLimitedAdTracking(Boolean honorsLimitedAdTracking) {
		this.honorsLimitedAdTracking = honorsLimitedAdTracking;
	}

	public void setServesAds(Boolean servesAds) {
		this.servesAds = servesAds;
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
		sb.append("class IdfaDeclarationAttributes {\n");
		sb.append("    servesAds: ").append(toIndentedString(this.servesAds)).append("\n");
		sb.append("    attributesAppInstallationToPreviousAd: ")
				.append(toIndentedString(this.attributesAppInstallationToPreviousAd)).append("\n");
		sb.append("    attributesActionWithPreviousAd: ").append(toIndentedString(this.attributesActionWithPreviousAd))
				.append("\n");
		sb.append("    honorsLimitedAdTracking: ").append(toIndentedString(this.honorsLimitedAdTracking)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}