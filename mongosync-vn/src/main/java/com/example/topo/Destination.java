
package com.example.topo;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Generated("org.jsonschema2pojo")
public class Destination {

	@Field("dest-node")
	private String destNode;
	@Field("dest-tp")
	private String destTp;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Destination() {
	}

	/**
	 * 
	 * @param destNode
	 * @param destTp
	 */
	public Destination(String destNode, String destTp) {
		this.destNode = destNode;
		this.destTp = destTp;
	}

	/**
	 * 
	 * @return The destNode
	 */
	public String getDestNode() {
		return destNode;
	}

	/**
	 * 
	 * @param destNode
	 *            The destNode
	 */
	public void setDestNode(String destNode) {
		this.destNode = destNode;
	}

	/**
	 * 
	 * @return The destTp
	 */
	public String getDestTp() {
		return destTp;
	}

	/**
	 * 
	 * @param destTp
	 *            The destTp
	 */
	public void setDestTp(String destTp) {
		this.destTp = destTp;
	}

	@Override
	public String toString() {
		return "Destination [destNode=" + destNode + ", destTp=" + destTp + "]";
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(destNode).append(destTp).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Destination) == false) {
			return false;
		}
		Destination rhs = ((Destination) other);
		return new EqualsBuilder().append(destNode, rhs.destNode).append(destTp, rhs.destTp).isEquals();
	}

}
