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
 * AppInfoLocalizationAttributes
 */
@JsonPropertyOrder({ AppInfoLocalizationAttributes.JSON_PROPERTY_LOCALE,
		AppInfoLocalizationAttributes.JSON_PROPERTY_NAME, AppInfoLocalizationAttributes.JSON_PROPERTY_SUBTITLE,
		AppInfoLocalizationAttributes.JSON_PROPERTY_PRIVACY_POLICY_URL,
		AppInfoLocalizationAttributes.JSON_PROPERTY_PRIVACY_POLICY_TEXT })
public class AppInfoLocalizationAttributes implements Serializable {
	public static final String JSON_PROPERTY_LOCALE = "locale";

	public static final String JSON_PROPERTY_NAME = "name";

	public static final String JSON_PROPERTY_PRIVACY_POLICY_TEXT = "privacyPolicyText";
	public static final String JSON_PROPERTY_PRIVACY_POLICY_URL = "privacyPolicyUrl";

	public static final String JSON_PROPERTY_SUBTITLE = "subtitle";
	/**
	 *
	 */
	private static final long serialVersionUID = -1368939735989587177L;

	private String locale;

	private String name;
	private String privacyPolicyText;

	private String privacyPolicyUrl;
	private String subtitle;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppInfoLocalizationAttributes appInfoLocalizationAttributes = (AppInfoLocalizationAttributes) o;
		return Objects.equals(this.locale, appInfoLocalizationAttributes.locale)
				&& Objects.equals(this.name, appInfoLocalizationAttributes.name)
				&& Objects.equals(this.subtitle, appInfoLocalizationAttributes.subtitle)
				&& Objects.equals(this.privacyPolicyUrl, appInfoLocalizationAttributes.privacyPolicyUrl)
				&& Objects.equals(this.privacyPolicyText, appInfoLocalizationAttributes.privacyPolicyText);
	}

	@JsonProperty(JSON_PROPERTY_LOCALE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getLocale() {
		return this.locale;
	}

	@JsonProperty(JSON_PROPERTY_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getName() {
		return this.name;
	}

	@JsonProperty(JSON_PROPERTY_PRIVACY_POLICY_TEXT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getPrivacyPolicyText() {
		return this.privacyPolicyText;
	}

	@JsonProperty(JSON_PROPERTY_PRIVACY_POLICY_URL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getPrivacyPolicyUrl() {
		return this.privacyPolicyUrl;
	}

	@JsonProperty(JSON_PROPERTY_SUBTITLE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public String getSubtitle() {
		return this.subtitle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.locale, this.name, this.subtitle, this.privacyPolicyUrl, this.privacyPolicyText);
	}

	public AppInfoLocalizationAttributes locale(String locale) {
		this.locale = locale;
		return this;
	}

	public AppInfoLocalizationAttributes name(String name) {
		this.name = name;
		return this;
	}

	public AppInfoLocalizationAttributes privacyPolicyText(String privacyPolicyText) {
		this.privacyPolicyText = privacyPolicyText;
		return this;
	}

	public AppInfoLocalizationAttributes privacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
		return this;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrivacyPolicyText(String privacyPolicyText) {
		this.privacyPolicyText = privacyPolicyText;
	}

	public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public AppInfoLocalizationAttributes subtitle(String subtitle) {
		this.subtitle = subtitle;
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
		sb.append("class AppInfoLocalizationAttributes {\n");
		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    subtitle: ").append(toIndentedString(this.subtitle)).append("\n");
		sb.append("    privacyPolicyUrl: ").append(toIndentedString(this.privacyPolicyUrl)).append("\n");
		sb.append("    privacyPolicyText: ").append(toIndentedString(this.privacyPolicyText)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
