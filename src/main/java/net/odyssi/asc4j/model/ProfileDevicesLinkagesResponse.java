
package net.odyssi.asc4j.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A response containing a list of related resource IDs.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class ProfileDevicesLinkagesResponse extends BaseServiceResponse {

	@JsonProperty("data")
	@JsonPropertyDescription("The object types and IDs of the related resources.")
	private List<ResourceObjectData> data;

	public List<ResourceObjectData> getData() {
		return this.data;
	}

	public void setData(List<ResourceObjectData> data) {
		this.data = data;
	}

}
