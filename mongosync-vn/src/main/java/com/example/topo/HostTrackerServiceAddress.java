
package com.example.topo;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class HostTrackerServiceAddress {

	// private int id;
	private String mac;
	private double lastSeen;
	private String ip;
	private double firstSeen;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public HostTrackerServiceAddress() {
	}

	/**
	 * 
	 * @param id
	 * @param lastSeen
	 * @param mac
	 * @param firstSeen
	 * @param ip
	 */
	public HostTrackerServiceAddress(int id, String mac, int lastSeen, String ip, int firstSeen) {
		// this.id = id;
		this.mac = mac;
		this.lastSeen = lastSeen;
		this.ip = ip;
		this.firstSeen = firstSeen;
	}

	/**
	 * 
	 * @return The id
	 */
	/*
	 * public int getId() { return id; }
	 * 
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	/**
	 * 
	 * @return The mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * 
	 * @param mac
	 *            The mac
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}

	/**
	 * 
	 * @return The lastSeen
	 */
	public double getLastSeen() {
		return lastSeen;
	}

	/**
	 * 
	 * @param lastSeen
	 *            The last-seen
	 */
	public void setLastSeen(double lastSeen) {
		this.lastSeen = lastSeen;
	}

	/**
	 * 
	 * @return The ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * 
	 * @param ip
	 *            The ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * 
	 * @return The firstSeen
	 */
	public double getFirstSeen() {
		return firstSeen;
	}

	/**
	 * 
	 * @param firstSeen
	 *            The first-seen
	 */
	public void setFirstSeen(double firstSeen) {
		this.firstSeen = firstSeen;
	}

	@Override
	public String toString() {
		return "HostTrackerServiceAddress [ mac=" + mac + ", lastSeen=" + lastSeen + ", ip=" + ip + ", firstSeen="
				+ firstSeen + "]";
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(mac).append(lastSeen).append(ip).append(firstSeen).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof HostTrackerServiceAddress) == false) {
			return false;
		}
		HostTrackerServiceAddress rhs = ((HostTrackerServiceAddress) other);
		return new EqualsBuilder().append(mac, rhs.mac).append(lastSeen, rhs.lastSeen).append(ip, rhs.ip)
				.append(firstSeen, rhs.firstSeen).isEquals();
	}

}
