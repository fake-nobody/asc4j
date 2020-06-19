
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
public class UserInvitation extends ResourceObject {

	@JsonProperty("attributes")
	@JsonPropertyDescription("The resource's attributes")
	private UserInvitationAttributes attributes;

	@JsonProperty("relationships")
	@JsonPropertyDescription("Navigational links to related data and included resource types and IDs.")
	private UserInvitationRelationships relationships;

	public UserInvitationAttributes getAttributes() {
		return this.attributes;
	}

	public UserInvitationRelationships getRelationships() {
		return this.relationships;
	}

	public void setAttributes(UserInvitationAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(UserInvitationRelationships relationships) {
		this.relationships = relationships;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((relationships == null) ? 0 : relationships.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInvitation other = (UserInvitation) obj;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (relationships == null) {
			if (other.relationships != null)
				return false;
		} else if (!relationships.equals(other.relationships))
			return false;
		return true;
	}

}
