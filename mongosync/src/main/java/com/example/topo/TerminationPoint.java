
package com.example.topo;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Generated("org.jsonschema2pojo")
public class TerminationPoint {

	@Field("tp-id")
	private String tpId;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public TerminationPoint() {
	}

	/**
	 * 
	 * @param tpId
	 */
	public TerminationPoint(String tpId) {
		this.tpId = tpId;
	}

	/**
	 * 
	 * @return The tpId
	 */
	public String getTpId() {
		return tpId;
	}

	/**
	 * 
	 * @param tpId
	 *            The tpId
	 */
	public void setTpId(String tpId) {
		this.tpId = tpId;
	}

	@Override
	public String toString() {
		return "TerminationPoint [tpId=" + tpId + "]";
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(tpId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TerminationPoint) == false) {
			return false;
		}
		TerminationPoint rhs = ((TerminationPoint) other);
		return new EqualsBuilder().append(tpId, rhs.tpId).isEquals();
	}

}
