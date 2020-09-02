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
import java.time.OffsetDateTime;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AppStoreVersionAttributes
 */
@JsonPropertyOrder({ AppStoreVersionAttributes.JSON_PROPERTY_PLATFORM,
		AppStoreVersionAttributes.JSON_PROPERTY_VERSION_STRING, AppStoreVersionAttributes.JSON_PROPERTY_APP_STORE_STATE,
		AppStoreVersionAttributes.JSON_PROPERTY_COPYRIGHT, AppStoreVersionAttributes.JSON_PROPERTY_RELEASE_TYPE,
		AppStoreVersionAttributes.JSON_PROPERTY_EARLIEST_RELEASE_DATE,
		AppStoreVersionAttributes.JSON_PROPERTY_USES_IDFA, AppStoreVersionAttributes.JSON_PROPERTY_DOWNLOADABLE,
		AppStoreVersionAttributes.JSON_PROPERTY_CREATED_DATE })

public class AppStoreVersionAttributes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -4381117195898432337L;

	/**
	 * Gets or Sets releaseType
	 */
	public enum ReleaseTypeEnum {
		AFTER_APPROVAL("AFTER_APPROVAL"),

		MANUAL("MANUAL"),

		SCHEDULED("SCHEDULED");

		@JsonCreator
		public static ReleaseTypeEnum fromValue(String value) {
			for (ReleaseTypeEnum b : ReleaseTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ReleaseTypeEnum(String value) {
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

	public static final String JSON_PROPERTY_APP_STORE_STATE = "appStoreState";
	public static final String JSON_PROPERTY_COPYRIGHT = "copyright";

	public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
	public static final String JSON_PROPERTY_DOWNLOADABLE = "downloadable";

	public static final String JSON_PROPERTY_EARLIEST_RELEASE_DATE = "earliestReleaseDate";
	public static final String JSON_PROPERTY_PLATFORM = "platform";

	public static final String JSON_PROPERTY_RELEASE_TYPE = "releaseType";
	public static final String JSON_PROPERTY_USES_IDFA = "usesIdfa";

	public static final String JSON_PROPERTY_VERSION_STRING = "versionString";

	private AppStoreVersionState appStoreState;

	private String copyright;
	private OffsetDateTime createdDate;

	private Boolean downloadable;
	private OffsetDateTime earliestReleaseDate;

	private Platform platform;
	private ReleaseTypeEnum releaseType;

	private Boolean usesIdfa;
	private String versionString;

	public AppStoreVersionAttributes appStoreState(AppStoreVersionState appStoreState) {

		this.appStoreState = appStoreState;
		return this;
	}

	public AppStoreVersionAttributes copyright(String copyright) {

		this.copyright = copyright;
		return this;
	}

	public AppStoreVersionAttributes createdDate(OffsetDateTime createdDate) {

		this.createdDate = createdDate;
		return this;
	}

	public AppStoreVersionAttributes downloadable(Boolean downloadable) {

		this.downloadable = downloadable;
		return this;
	}

	public AppStoreVersionAttributes earliestReleaseDate(OffsetDateTime earliestReleaseDate) {

		this.earliestReleaseDate = earliestReleaseDate;
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
		AppStoreVersionAttributes appStoreVersionAttributes = (AppStoreVersionAttributes) o;
		return Objects.equals(this.platform, appStoreVersionAttributes.platform)
				&& Objects.equals(this.versionString, appStoreVersionAttributes.versionString)
				&& Objects.equals(this.appStoreState, appStoreVersionAttributes.appStoreState)
				&& Objects.equals(this.copyright, appStoreVersionAttributes.copyright)
				&& Objects.equals(this.releaseType, appStoreVersionAttributes.releaseType)
				&& Objects.equals(this.earliestReleaseDate, appStoreVersionAttributes.earliestReleaseDate)
				&& Objects.equals(this.usesIdfa, appStoreVersionAttributes.usesIdfa)
				&& Objects.equals(this.downloadable, appStoreVersionAttributes.downloadable)
				&& Objects.equals(this.createdDate, appStoreVersionAttributes.createdDate);
	}

	/**
	 * Get appStoreState
	 *
	 * @return appStoreState
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP_STORE_STATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreVersionState getAppStoreState() {
		return this.appStoreState;
	}

	/**
	 * Get copyright
	 *
	 * @return copyright
	 **/

	@JsonProperty(JSON_PROPERTY_COPYRIGHT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getCopyright() {
		return this.copyright;
	}

	/**
	 * Get createdDate
	 *
	 * @return createdDate
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_CREATED_DATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public OffsetDateTime getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Get downloadable
	 *
	 * @return downloadable
	 **/

	@JsonProperty(JSON_PROPERTY_DOWNLOADABLE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getDownloadable() {
		return this.downloadable;
	}

	/**
	 * Get earliestReleaseDate
	 *
	 * @return earliestReleaseDate
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_EARLIEST_RELEASE_DATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public OffsetDateTime getEarliestReleaseDate() {
		return this.earliestReleaseDate;
	}

	/**
	 * Get platform
	 *
	 * @return platform
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_PLATFORM)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Platform getPlatform() {
		return this.platform;
	}

	/**
	 * Get releaseType
	 *
	 * @return releaseType
	 **/

	@JsonProperty(JSON_PROPERTY_RELEASE_TYPE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public ReleaseTypeEnum getReleaseType() {
		return this.releaseType;
	}

	/**
	 * Get usesIdfa
	 *
	 * @return usesIdfa
	 **/

	@JsonProperty(JSON_PROPERTY_USES_IDFA)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getUsesIdfa() {
		return this.usesIdfa;
	}

	/**
	 * Get versionString
	 *
	 * @return versionString
	 **/

	@JsonProperty(JSON_PROPERTY_VERSION_STRING)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getVersionString() {
		return this.versionString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.platform, this.versionString, this.appStoreState, this.copyright, this.releaseType,
				this.earliestReleaseDate, this.usesIdfa, this.downloadable, this.createdDate);
	}

	public AppStoreVersionAttributes platform(Platform platform) {

		this.platform = platform;
		return this;
	}

	public AppStoreVersionAttributes releaseType(ReleaseTypeEnum releaseType) {

		this.releaseType = releaseType;
		return this;
	}

	public void setAppStoreState(AppStoreVersionState appStoreState) {
		this.appStoreState = appStoreState;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setDownloadable(Boolean downloadable) {
		this.downloadable = downloadable;
	}

	public void setEarliestReleaseDate(OffsetDateTime earliestReleaseDate) {
		this.earliestReleaseDate = earliestReleaseDate;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public void setReleaseType(ReleaseTypeEnum releaseType) {
		this.releaseType = releaseType;
	}

	public void setUsesIdfa(Boolean usesIdfa) {
		this.usesIdfa = usesIdfa;
	}

	public void setVersionString(String versionString) {
		this.versionString = versionString;
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
		sb.append("class AppStoreVersionAttributes {\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    versionString: ").append(toIndentedString(this.versionString)).append("\n");
		sb.append("    appStoreState: ").append(toIndentedString(this.appStoreState)).append("\n");
		sb.append("    copyright: ").append(toIndentedString(this.copyright)).append("\n");
		sb.append("    releaseType: ").append(toIndentedString(this.releaseType)).append("\n");
		sb.append("    earliestReleaseDate: ").append(toIndentedString(this.earliestReleaseDate)).append("\n");
		sb.append("    usesIdfa: ").append(toIndentedString(this.usesIdfa)).append("\n");
		sb.append("    downloadable: ").append(toIndentedString(this.downloadable)).append("\n");
		sb.append("    createdDate: ").append(toIndentedString(this.createdDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionAttributes usesIdfa(Boolean usesIdfa) {

		this.usesIdfa = usesIdfa;
		return this;
	}

	public AppStoreVersionAttributes versionString(String versionString) {

		this.versionString = versionString;
		return this;
	}

}