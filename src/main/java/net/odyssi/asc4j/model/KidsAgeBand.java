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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets KidsAgeBand
 */
public enum KidsAgeBand {

	FIVE_AND_UNDER("FIVE_AND_UNDER"),

	NINE_TO_ELEVEN("NINE_TO_ELEVEN"),

	SIX_TO_EIGHT("SIX_TO_EIGHT");

	@JsonCreator
	public static KidsAgeBand fromValue(String value) {
		for (KidsAgeBand b : KidsAgeBand.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	KidsAgeBand(String value) {
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