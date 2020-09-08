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
 * DeviceAttributes
 */
@JsonPropertyOrder({ DeviceAttributes.JSON_PROPERTY_NAME, DeviceAttributes.JSON_PROPERTY_PLATFORM,
		DeviceAttributes.JSON_PROPERTY_UDID, DeviceAttributes.JSON_PROPERTY_DEVICE_CLASS,
		DeviceAttributes.JSON_PROPERTY_STATUS, DeviceAttributes.JSON_PROPERTY_MODEL,
		DeviceAttributes.JSON_PROPERTY_ADDED_DATE })

public class DeviceAttributes implements Serializable {
	/**
	 * Gets or Sets deviceClass
	 */
	public enum DeviceClassEnum {
		APPLE_TV("APPLE_TV"),

		APPLE_WATCH("APPLE_WATCH"),

		IPAD("IPAD"),

		IPHONE("IPHONE"),

		IPOD("IPOD"),

		MAC("MAC");

		@JsonCreator
		public static DeviceClassEnum fromValue(String value) {
			for (DeviceClassEnum b : DeviceClassEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		DeviceClassEnum(String value) {
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

	/**
	 * Gets or Sets status
	 */
	public enum StatusEnum {
		DISABLED("DISABLED"),

		ENABLED("ENABLED");

		@JsonCreator
		public static StatusEnum fromValue(String value) {
			for (StatusEnum b : StatusEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		StatusEnum(String value) {
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

	public static final String JSON_PROPERTY_ADDED_DATE = "addedDate";

	public static final String JSON_PROPERTY_DEVICE_CLASS = "deviceClass";

	public static final String JSON_PROPERTY_MODEL = "model";
	public static final String JSON_PROPERTY_NAME = "name";

	public static final String JSON_PROPERTY_PLATFORM = "platform";
	public static final String JSON_PROPERTY_STATUS = "status";

	public static final String JSON_PROPERTY_UDID = "udid";

	/**
	 *
	 */
	private static final long serialVersionUID = 1285174670215477670L;

	private OffsetDateTime addedDate;

	private DeviceClassEnum deviceClass;
	private String model;

	private String name;
	private BundleIdPlatform platform;

	private StatusEnum status;
	private String udid;

	public DeviceAttributes addedDate(OffsetDateTime addedDate) {

		this.addedDate = addedDate;
		return this;
	}

	public DeviceAttributes deviceClass(DeviceClassEnum deviceClass) {

		this.deviceClass = deviceClass;
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
		DeviceAttributes deviceAttributes = (DeviceAttributes) o;
		return Objects.equals(this.name, deviceAttributes.name)
				&& Objects.equals(this.platform, deviceAttributes.platform)
				&& Objects.equals(this.udid, deviceAttributes.udid)
				&& Objects.equals(this.deviceClass, deviceAttributes.deviceClass)
				&& Objects.equals(this.status, deviceAttributes.status)
				&& Objects.equals(this.model, deviceAttributes.model)
				&& Objects.equals(this.addedDate, deviceAttributes.addedDate);
	}

	/**
	 * Get addedDate
	 *
	 * @return addedDate
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_ADDED_DATE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public OffsetDateTime getAddedDate() {
		return this.addedDate;
	}

	/**
	 * Get deviceClass
	 *
	 * @return deviceClass
	 **/

	@JsonProperty(JSON_PROPERTY_DEVICE_CLASS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public DeviceClassEnum getDeviceClass() {
		return this.deviceClass;
	}

	/**
	 * Get model
	 *
	 * @return model
	 **/

	@JsonProperty(JSON_PROPERTY_MODEL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getModel() {
		return this.model;
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
	 * Get platform
	 *
	 * @return platform
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_PLATFORM)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public BundleIdPlatform getPlatform() {
		return this.platform;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/

	@JsonProperty(JSON_PROPERTY_STATUS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public StatusEnum getStatus() {
		return this.status;
	}

	/**
	 * Get udid
	 *
	 * @return udid
	 **/

	@JsonProperty(JSON_PROPERTY_UDID)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public String getUdid() {
		return this.udid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.platform, this.udid, this.deviceClass, this.status, this.model,
				this.addedDate);
	}

	public DeviceAttributes model(String model) {

		this.model = model;
		return this;
	}

	public DeviceAttributes name(String name) {

		this.name = name;
		return this;
	}

	public DeviceAttributes platform(BundleIdPlatform platform) {

		this.platform = platform;
		return this;
	}

	public void setAddedDate(OffsetDateTime addedDate) {
		this.addedDate = addedDate;
	}

	public void setDeviceClass(DeviceClassEnum deviceClass) {
		this.deviceClass = deviceClass;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(BundleIdPlatform platform) {
		this.platform = platform;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public DeviceAttributes status(StatusEnum status) {

		this.status = status;
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
		sb.append("class DeviceAttributes {\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    udid: ").append(toIndentedString(this.udid)).append("\n");
		sb.append("    deviceClass: ").append(toIndentedString(this.deviceClass)).append("\n");
		sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
		sb.append("    model: ").append(toIndentedString(this.model)).append("\n");
		sb.append("    addedDate: ").append(toIndentedString(this.addedDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public DeviceAttributes udid(String udid) {

		this.udid = udid;
		return this;
	}

}
