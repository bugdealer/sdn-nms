
package com.example.topo;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Generated("org.jsonschema2pojo")
public class Source {

	@Field("source-tp")
	private String sourceTp;
	@Field("source-node")
	private String sourceNode;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Source() {
	}

	/**
	 * 
	 * @param sourceNode
	 * @param sourceTp
	 */
	public Source(String sourceTp, String sourceNode) {
		this.sourceTp = sourceTp;
		this.sourceNode = sourceNode;
	}

	/**
	 * 
	 * @return The sourceTp
	 */
	public String getSourceTp() {
		return sourceTp;
	}

	/**
	 * 
	 * @param sourceTp
	 *            The sourceTp
	 */
	public void setSourceTp(String sourceTp) {
		this.sourceTp = sourceTp;
	}

	/**
	 * 
	 * @return The sourceNode
	 */
	public String getSourceNode() {
		return sourceNode;
	}

	/**
	 * 
	 * @param sourceNode
	 *            The sourceNode
	 */
	public void setSourceNode(String sourceNode) {
		this.sourceNode = sourceNode;
	}

	@Override
	public String toString() {
		return "Source [sourceTp=" + sourceTp + ", sourceNode=" + sourceNode + "]";
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(sourceTp).append(sourceNode).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Source) == false) {
			return false;
		}
		Source rhs = ((Source) other);
		return new EqualsBuilder().append(sourceTp, rhs.sourceTp).append(sourceNode, rhs.sourceNode).isEquals();
	}

}
