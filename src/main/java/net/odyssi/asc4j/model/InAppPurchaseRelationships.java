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
 * InAppPurchaseRelationships
 */
@JsonPropertyOrder({ InAppPurchaseRelationships.JSON_PROPERTY_APPS })

public class InAppPurchaseRelationships implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 3521728839409796345L;

	public static final String JSON_PROPERTY_APPS = "apps";

	private BetaTesterRelationshipsApps apps;

	public InAppPurchaseRelationships apps(BetaTesterRelationshipsApps apps) {

		this.apps = apps;
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
		InAppPurchaseRelationships inAppPurchaseRelationships = (InAppPurchaseRelationships) o;
		return Objects.equals(this.apps, inAppPurchaseRelationships.apps);
	}

	/**
	 * Get apps
	 *
	 * @return apps
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APPS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public BetaTesterRelationshipsApps getApps() {
		return this.apps;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.apps);
	}

	public void setApps(BetaTesterRelationshipsApps apps) {
		this.apps = apps;
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
		sb.append("class InAppPurchaseRelationships {\n");
		sb.append("    apps: ").append(toIndentedString(this.apps)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}