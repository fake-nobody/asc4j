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
 * PrereleaseVersionRelationships
 */
@JsonPropertyOrder({ PrereleaseVersionRelationships.JSON_PROPERTY_BUILDS,
		PrereleaseVersionRelationships.JSON_PROPERTY_APP })

public class PrereleaseVersionRelationships implements Serializable {
	public static final String JSON_PROPERTY_APP = "app";

	public static final String JSON_PROPERTY_BUILDS = "builds";

	/**
	 *
	 */
	private static final long serialVersionUID = -8068393032042394011L;

	private AppEncryptionDeclarationRelationshipsApp app;
	private AppRelationshipsBuilds builds;

	public PrereleaseVersionRelationships app(AppEncryptionDeclarationRelationshipsApp app) {

		this.app = app;
		return this;
	}

	public PrereleaseVersionRelationships builds(AppRelationshipsBuilds builds) {

		this.builds = builds;
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
		PrereleaseVersionRelationships prereleaseVersionRelationships = (PrereleaseVersionRelationships) o;
		return Objects.equals(this.builds, prereleaseVersionRelationships.builds)
				&& Objects.equals(this.app, prereleaseVersionRelationships.app);
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppEncryptionDeclarationRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get builds
	 *
	 * @return builds
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_BUILDS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppRelationshipsBuilds getBuilds() {
		return this.builds;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.builds, this.app);
	}

	public void setApp(AppEncryptionDeclarationRelationshipsApp app) {
		this.app = app;
	}

	public void setBuilds(AppRelationshipsBuilds builds) {
		this.builds = builds;
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
		sb.append("class PrereleaseVersionRelationships {\n");
		sb.append("    builds: ").append(toIndentedString(this.builds)).append("\n");
		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}
