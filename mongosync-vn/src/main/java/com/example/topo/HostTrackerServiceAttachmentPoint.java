
package com.example.topo;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")

public class HostTrackerServiceAttachmentPoint {

	private String tpId;
	private String correspondingTp;
	private boolean active;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public HostTrackerServiceAttachmentPoint() {
	}

	/**
	 * 
	 * @param correspondingTp
	 * @param tpId
	 * @param active
	 */
	public HostTrackerServiceAttachmentPoint(String tpId, String correspondingTp, boolean active) {
		this.tpId = tpId;
		this.correspondingTp = correspondingTp;
		this.active = active;
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

	/**
	 * 
	 * @return The correspondingTp
	 */
	public String getCorrespondingTp() {
		return correspondingTp;
	}

	/**
	 * 
	 * @param correspondingTp
	 *            The correspondingTp
	 */
	public void setCorrespondingTp(String correspondingTp) {
		this.correspondingTp = correspondingTp;
	}

	/**
	 * 
	 * @return The active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * 
	 * @param active
	 *            The active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "HostTrackerServiceAttachmentPoint [tpId=" + tpId + ", correspondingTp=" + correspondingTp + ", active="
				+ active + "]";
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(tpId).append(correspondingTp).append(active).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof HostTrackerServiceAttachmentPoint) == false) {
			return false;
		}
		HostTrackerServiceAttachmentPoint rhs = ((HostTrackerServiceAttachmentPoint) other);
		return new EqualsBuilder().append(tpId, rhs.tpId).append(correspondingTp, rhs.correspondingTp)
				.append(active, rhs.active).isEquals();
	}

}
