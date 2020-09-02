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
 * UploadOperationHeader
 */
@JsonPropertyOrder({ UploadOperationHeader.JSON_PROPERTY_NAME, UploadOperationHeader.JSON_PROPERTY_VALUE })

public class UploadOperationHeader implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -3117776283687341069L;

	public static final String JSON_PROPERTY_NAME = "name";

	public static final String JSON_PROPERTY_VALUE = "value";

	private String name;
	private String value;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UploadOperationHeader uploadOperationHeader = (UploadOperationHeader) o;
		return Objects.equals(this.name, uploadOperationHeader.name)
				&& Objects.equals(this.value, uploadOperationHeader.value);
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/

	@JsonProperty(JSON_PROPERTY_NAME)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getName() {
		return this.name;
	}

	/**
	 * Get value
	 *
	 * @return value
	 **/

	@JsonProperty(JSON_PROPERTY_VALUE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getValue() {
		return this.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.value);
	}

	public UploadOperationHeader name(String name) {

		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
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
		sb.append("class UploadOperationHeader {\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    value: ").append(toIndentedString(this.value)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public UploadOperationHeader value(String value) {

		this.value = value;
		return this;
	}

}