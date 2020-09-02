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
 * ImageAsset
 */
@JsonPropertyOrder({ ImageAsset.JSON_PROPERTY_TEMPLATE_URL, ImageAsset.JSON_PROPERTY_WIDTH,
		ImageAsset.JSON_PROPERTY_HEIGHT })

public class ImageAsset implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -3171334028051613982L;

	public static final String JSON_PROPERTY_HEIGHT = "height";

	public static final String JSON_PROPERTY_TEMPLATE_URL = "templateUrl";
	public static final String JSON_PROPERTY_WIDTH = "width";

	private Integer height;

	private String templateUrl;
	private Integer width;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ImageAsset imageAsset = (ImageAsset) o;
		return Objects.equals(this.templateUrl, imageAsset.templateUrl) && Objects.equals(this.width, imageAsset.width)
				&& Objects.equals(this.height, imageAsset.height);
	}

	/**
	 * Get height
	 *
	 * @return height
	 **/

	@JsonProperty(JSON_PROPERTY_HEIGHT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Get templateUrl
	 *
	 * @return templateUrl
	 **/

	@JsonProperty(JSON_PROPERTY_TEMPLATE_URL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getTemplateUrl() {
		return this.templateUrl;
	}

	/**
	 * Get width
	 *
	 * @return width
	 **/

	@JsonProperty(JSON_PROPERTY_WIDTH)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Integer getWidth() {
		return this.width;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.templateUrl, this.width, this.height);
	}

	public ImageAsset height(Integer height) {

		this.height = height;
		return this;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public ImageAsset templateUrl(String templateUrl) {

		this.templateUrl = templateUrl;
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
		sb.append("class ImageAsset {\n");
		sb.append("    templateUrl: ").append(toIndentedString(this.templateUrl)).append("\n");
		sb.append("    width: ").append(toIndentedString(this.width)).append("\n");
		sb.append("    height: ").append(toIndentedString(this.height)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public ImageAsset width(Integer width) {

		this.width = width;
		return this;
	}

}