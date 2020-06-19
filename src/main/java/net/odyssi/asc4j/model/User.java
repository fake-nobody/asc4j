
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The data structure that represents the resource.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class User extends ResourceObject {

	@JsonProperty("attributes")
	@JsonPropertyDescription("The resource's attributes")
	private UserAttributes attributes;

	@JsonProperty("relationships")
	@JsonPropertyDescription("Navigational links to related data and included resource types and IDs.")
	private UserRelationships relationships;

	public UserAttributes getAttributes() {
		return this.attributes;
	}

	public UserRelationships getRelationships() {
		return this.relationships;
	}

	public void setAttributes(UserAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(UserRelationships relationships) {
		this.relationships = relationships;
	}

}
