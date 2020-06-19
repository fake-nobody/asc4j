
package net.odyssi.asc4j.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Self-links to documents that can contain information for one or more
 * resources.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "self" })
public class DocumentLinks {

	@JsonProperty("self")
	@JsonPropertyDescription("")
	private String self;

	public String getSelf() {
		return this.self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

}
