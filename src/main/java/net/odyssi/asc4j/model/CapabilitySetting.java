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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CapabilitySetting
 */
@JsonPropertyOrder({ CapabilitySetting.JSON_PROPERTY_KEY, CapabilitySetting.JSON_PROPERTY_NAME,
		CapabilitySetting.JSON_PROPERTY_DESCRIPTION, CapabilitySetting.JSON_PROPERTY_ENABLED_BY_DEFAULT,
		CapabilitySetting.JSON_PROPERTY_VISIBLE, CapabilitySetting.JSON_PROPERTY_ALLOWED_INSTANCES,
		CapabilitySetting.JSON_PROPERTY_MIN_INSTANCES, CapabilitySetting.JSON_PROPERTY_OPTIONS })

public class CapabilitySetting implements Serializable {
	/**
	 * Gets or Sets allowedInstances
	 */
	public enum AllowedInstancesEnum {
		ENTRY("ENTRY"),

		MULTIPLE("MULTIPLE"),

		SINGLE("SINGLE");

		@JsonCreator
		public static AllowedInstancesEnum fromValue(String value) {
			for (AllowedInstancesEnum b : AllowedInstancesEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		AllowedInstancesEnum(String value) {
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
	 * Gets or Sets key
	 */
	public enum KeyEnum {
		APPLE_ID_AUTH_APP_CONSENT("APPLE_ID_AUTH_APP_CONSENT"),

		DATA_PROTECTION_PERMISSION_LEVEL("DATA_PROTECTION_PERMISSION_LEVEL"),

		ICLOUD_VERSION("ICLOUD_VERSION");

		@JsonCreator
		public static KeyEnum fromValue(String value) {
			for (KeyEnum b : KeyEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		KeyEnum(String value) {
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

	public static final String JSON_PROPERTY_ALLOWED_INSTANCES = "allowedInstances";

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	public static final String JSON_PROPERTY_ENABLED_BY_DEFAULT = "enabledByDefault";

	public static final String JSON_PROPERTY_KEY = "key";
	public static final String JSON_PROPERTY_MIN_INSTANCES = "minInstances";

	public static final String JSON_PROPERTY_NAME = "name";
	public static final String JSON_PROPERTY_OPTIONS = "options";

	public static final String JSON_PROPERTY_VISIBLE = "visible";
	/**
	 *
	 */
	private static final long serialVersionUID = 4775127070502267550L;

	private AllowedInstancesEnum allowedInstances;

	private String description;

	private Boolean enabledByDefault;
	private KeyEnum key;

	private Integer minInstances;
	private String name;

	private List<CapabilityOption> options = null;
	private Boolean visible;

	public CapabilitySetting addOptionsItem(CapabilityOption optionsItem) {
		if (this.options == null) {
			this.options = new ArrayList<>();
		}
		this.options.add(optionsItem);
		return this;
	}

	public CapabilitySetting allowedInstances(AllowedInstancesEnum allowedInstances) {

		this.allowedInstances = allowedInstances;
		return this;
	}

	public CapabilitySetting description(String description) {

		this.description = description;
		return this;
	}

	public CapabilitySetting enabledByDefault(Boolean enabledByDefault) {

		this.enabledByDefault = enabledByDefault;
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
		CapabilitySetting capabilitySetting = (CapabilitySetting) o;
		return Objects.equals(this.key, capabilitySetting.key) && Objects.equals(this.name, capabilitySetting.name)
				&& Objects.equals(this.description, capabilitySetting.description)
				&& Objects.equals(this.enabledByDefault, capabilitySetting.enabledByDefault)
				&& Objects.equals(this.visible, capabilitySetting.visible)
				&& Objects.equals(this.allowedInstances, capabilitySetting.allowedInstances)
				&& Objects.equals(this.minInstances, capabilitySetting.minInstances)
				&& Objects.equals(this.options, capabilitySetting.options);
	}

	/**
	 * Get allowedInstances
	 *
	 * @return allowedInstances
	 **/

	@JsonProperty(JSON_PROPERTY_ALLOWED_INSTANCES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AllowedInstancesEnum getAllowedInstances() {
		return this.allowedInstances;
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
	 * Get enabledByDefault
	 *
	 * @return enabledByDefault
	 **/

	@JsonProperty(JSON_PROPERTY_ENABLED_BY_DEFAULT)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getEnabledByDefault() {
		return this.enabledByDefault;
	}

	/**
	 * Get key
	 *
	 * @return key
	 **/

	@JsonProperty(JSON_PROPERTY_KEY)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public KeyEnum getKey() {
		return this.key;
	}

	/**
	 * Get minInstances
	 *
	 * @return minInstances
	 **/

	@JsonProperty(JSON_PROPERTY_MIN_INSTANCES)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Integer getMinInstances() {
		return this.minInstances;
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
	 * Get options
	 *
	 * @return options
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_OPTIONS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public List<CapabilityOption> getOptions() {
		return this.options;
	}

	/**
	 * Get visible
	 *
	 * @return visible
	 **/

	@JsonProperty(JSON_PROPERTY_VISIBLE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public Boolean getVisible() {
		return this.visible;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.key, this.name, this.description, this.enabledByDefault, this.visible,
				this.allowedInstances, this.minInstances, this.options);
	}

	public CapabilitySetting key(KeyEnum key) {

		this.key = key;
		return this;
	}

	public CapabilitySetting minInstances(Integer minInstances) {

		this.minInstances = minInstances;
		return this;
	}

	public CapabilitySetting name(String name) {

		this.name = name;
		return this;
	}

	public CapabilitySetting options(List<CapabilityOption> options) {

		this.options = options;
		return this;
	}

	public void setAllowedInstances(AllowedInstancesEnum allowedInstances) {
		this.allowedInstances = allowedInstances;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEnabledByDefault(Boolean enabledByDefault) {
		this.enabledByDefault = enabledByDefault;
	}

	public void setKey(KeyEnum key) {
		this.key = key;
	}

	public void setMinInstances(Integer minInstances) {
		this.minInstances = minInstances;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOptions(List<CapabilityOption> options) {
		this.options = options;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
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
		sb.append("class CapabilitySetting {\n");
		sb.append("    key: ").append(toIndentedString(this.key)).append("\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    description: ").append(toIndentedString(this.description)).append("\n");
		sb.append("    enabledByDefault: ").append(toIndentedString(this.enabledByDefault)).append("\n");
		sb.append("    visible: ").append(toIndentedString(this.visible)).append("\n");
		sb.append("    allowedInstances: ").append(toIndentedString(this.allowedInstances)).append("\n");
		sb.append("    minInstances: ").append(toIndentedString(this.minInstances)).append("\n");
		sb.append("    options: ").append(toIndentedString(this.options)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CapabilitySetting visible(Boolean visible) {

		this.visible = visible;
		return this;
	}

}
