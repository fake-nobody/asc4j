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
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppPreOrderCreateRequestDataAttributes
 */
@JsonPropertyOrder({ AppPreOrderCreateRequestDataAttributes.JSON_PROPERTY_APP_RELEASE_DATE })
public class AppPreOrderCreateRequestDataAttributes implements Serializable {

	public static final String JSON_PROPERTY_APP_RELEASE_DATE = "appReleaseDate";

	private static final long serialVersionUID = -5744187147089892176L;

	private LocalDate appReleaseDate;

	public AppPreOrderCreateRequestDataAttributes appReleaseDate(LocalDate appReleaseDate) {
		this.appReleaseDate = appReleaseDate;
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
		AppPreOrderCreateRequestDataAttributes appPreOrderCreateRequestDataAttributes = (AppPreOrderCreateRequestDataAttributes) o;
		return Objects.equals(this.appReleaseDate, appPreOrderCreateRequestDataAttributes.appReleaseDate);
	}

	@Valid
	@JsonProperty(JSON_PROPERTY_APP_RELEASE_DATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
	public LocalDate getAppReleaseDate() {
		return this.appReleaseDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.appReleaseDate);
	}

	public void setAppReleaseDate(LocalDate appReleaseDate) {
		this.appReleaseDate = appReleaseDate;
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
		sb.append("class AppPreOrderCreateRequestDataAttributes {\n");
		sb.append("    appReleaseDate: ").append(toIndentedString(this.appReleaseDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
