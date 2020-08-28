
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class BuildAppEncryptionDeclarationLinkageRequest {

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	private Data data;

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public Data getData() {
		return this.data;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("data")
	public void setData(Data data) {
		this.data = data;
	}

}
