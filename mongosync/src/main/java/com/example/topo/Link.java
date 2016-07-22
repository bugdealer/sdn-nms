
package com.example.topo;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

public class Link {

	@Field("link-id")
	private String linkId;
	private Destination destination;
	private Source source;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Link() {
	}

	/**
	 * 
	 * @param linkId
	 * @param source
	 * @param destination
	 */
	public Link(String linkId, Destination destination, Source source) {
		this.linkId = linkId;
		this.destination = destination;
		this.source = source;
	}

	/**
	 * 
	 * @return The linkId
	 */
	public String getLinkId() {
		return linkId;
	}

	/**
	 * 
	 * @param linkId
	 *            The linkId
	 */
	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}

	/**
	 * 
	 * @return The destination
	 */
	public Destination getDestination() {
		return destination;
	}

	/**
	 * 
	 * @param destination
	 *            The destination
	 */
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	/**
	 * 
	 * @return The source
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * 
	 * @param source
	 *            The source
	 */
	public void setSource(Source source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "Link [linkId=" + linkId + ", destination=" + destination + ", source=" + source + "]";
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(linkId).append(destination).append(source).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Link) == false) {
			return false;
		}
		Link rhs = ((Link) other);
		return new EqualsBuilder().append(linkId, rhs.linkId).append(destination, rhs.destination)
				.append(source, rhs.source).isEquals();
	}

}
