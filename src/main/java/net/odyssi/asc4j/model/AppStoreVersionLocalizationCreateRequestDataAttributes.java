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
import java.net.URI;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppStoreVersionLocalizationCreateRequestDataAttributes
 */
@JsonPropertyOrder({ AppStoreVersionLocalizationCreateRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
		AppStoreVersionLocalizationCreateRequestDataAttributes.JSON_PROPERTY_LOCALE,
		AppStoreVersionLocalizationCreateRequestDataAttributes.JSON_PROPERTY_KEYWORDS,
		AppStoreVersionLocalizationCreateRequestDataAttributes.JSON_PROPERTY_MARKETING_URL,
		AppStoreVersionLocalizationCreateRequestDataAttributes.JSON_PROPERTY_PROMOTIONAL_TEXT,
		AppStoreVersionLocalizationCreateRequestDataAttributes.JSON_PROPERTY_SUPPORT_URL,
		AppStoreVersionLocalizationCreateRequestDataAttributes.JSON_PROPERTY_WHATS_NEW })

public class AppStoreVersionLocalizationCreateRequestDataAttributes implements Serializable {
	public static final String JSON_PROPERTY_DESCRIPTION = "description";

	public static final String JSON_PROPERTY_KEYWORDS = "keywords";

	public static final String JSON_PROPERTY_LOCALE = "locale";
	public static final String JSON_PROPERTY_MARKETING_URL = "marketingUrl";

	public static final String JSON_PROPERTY_PROMOTIONAL_TEXT = "promotionalText";
	public static final String JSON_PROPERTY_SUPPORT_URL = "supportUrl";

	public static final String JSON_PROPERTY_WHATS_NEW = "whatsNew";
	/**
	 *
	 */
	private static final long serialVersionUID = -3213068548015817436L;

	private String description;

	private String keywords;
	private String locale;

	private URI marketingUrl;
	private String promotionalText;

	private URI supportUrl;
	private String whatsNew;

	public AppStoreVersionLocalizationCreateRequestDataAttributes description(String description) {

		this.description = description;
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
		AppStoreVersionLocalizationCreateRequestDataAttributes appStoreVersionLocalizationCreateRequestDataAttributes = (AppStoreVersionLocalizationCreateRequestDataAttributes) o;
		return Objects.equals(this.description, appStoreVersionLocalizationCreateRequestDataAttributes.description)
				&& Objects.equals(this.locale, appStoreVersionLocalizationCreateRequestDataAttributes.locale)
				&& Objects.equals(this.keywords, appStoreVersionLocalizationCreateRequestDataAttributes.keywords)
				&& Objects.equals(this.marketingUrl,
						appStoreVersionLocalizationCreateRequestDataAttributes.marketingUrl)
				&& Objects.equals(this.promotionalText,
						appStoreVersionLocalizationCreateRequestDataAttributes.promotionalText)
				&& Objects.equals(this.supportUrl, appStoreVersionLocalizationCreateRequestDataAttributes.supportUrl)
				&& Objects.equals(this.whatsNew, appStoreVersionLocalizationCreateRequestDataAttributes.whatsNew);
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/

	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getDescription() {
		return this.description;
	}

	/**
	 * Get keywords
	 *
	 * @return keywords
	 **/

	@JsonProperty(JSON_PROPERTY_KEYWORDS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getKeywords() {
		return this.keywords;
	}

	/**
	 * Get locale
	 *
	 * @return locale
	 **/
	@NotNull

	@JsonProperty(JSON_PROPERTY_LOCALE)
	@JsonInclude(value = JsonInclude.Include.ALWAYS)

	public String getLocale() {
		return this.locale;
	}

	/**
	 * Get marketingUrl
	 *
	 * @return marketingUrl
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_MARKETING_URL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public URI getMarketingUrl() {
		return this.marketingUrl;
	}

	/**
	 * Get promotionalText
	 *
	 * @return promotionalText
	 **/

	@JsonProperty(JSON_PROPERTY_PROMOTIONAL_TEXT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getPromotionalText() {
		return this.promotionalText;
	}

	/**
	 * Get supportUrl
	 *
	 * @return supportUrl
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_SUPPORT_URL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public URI getSupportUrl() {
		return this.supportUrl;
	}

	/**
	 * Get whatsNew
	 *
	 * @return whatsNew
	 **/

	@JsonProperty(JSON_PROPERTY_WHATS_NEW)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getWhatsNew() {
		return this.whatsNew;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.description, this.locale, this.keywords, this.marketingUrl, this.promotionalText,
				this.supportUrl, this.whatsNew);
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes keywords(String keywords) {

		this.keywords = keywords;
		return this;
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes locale(String locale) {

		this.locale = locale;
		return this;
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes marketingUrl(URI marketingUrl) {

		this.marketingUrl = marketingUrl;
		return this;
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes promotionalText(String promotionalText) {

		this.promotionalText = promotionalText;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setMarketingUrl(URI marketingUrl) {
		this.marketingUrl = marketingUrl;
	}

	public void setPromotionalText(String promotionalText) {
		this.promotionalText = promotionalText;
	}

	public void setSupportUrl(URI supportUrl) {
		this.supportUrl = supportUrl;
	}

	public void setWhatsNew(String whatsNew) {
		this.whatsNew = whatsNew;
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes supportUrl(URI supportUrl) {

		this.supportUrl = supportUrl;
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
		sb.append("class AppStoreVersionLocalizationCreateRequestDataAttributes {\n");
		sb.append("    description: ").append(toIndentedString(this.description)).append("\n");
		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("    keywords: ").append(toIndentedString(this.keywords)).append("\n");
		sb.append("    marketingUrl: ").append(toIndentedString(this.marketingUrl)).append("\n");
		sb.append("    promotionalText: ").append(toIndentedString(this.promotionalText)).append("\n");
		sb.append("    supportUrl: ").append(toIndentedString(this.supportUrl)).append("\n");
		sb.append("    whatsNew: ").append(toIndentedString(this.whatsNew)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes whatsNew(String whatsNew) {

		this.whatsNew = whatsNew;
		return this;
	}

}
