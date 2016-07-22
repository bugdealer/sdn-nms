
package com.example.vmsetting;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PortList {

    private String name;
    private String macAddress;
    private String ipAddress;
    private String network;
    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * 
     * @param macAddress
     *     The macAddress
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * 
     * @return
     *     The ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 
     * @param ipAddress
     *     The ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * 
     * @return
     *     The network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * 
     * @param network
     *     The network
     */
    public void setNetwork(String network) {
        this.network = network;
    }

   

   

    @Override
	public String toString() {
		return "PortList [name=" + name + ", macAddress=" + macAddress + ", ipAddress=" + ipAddress + ", network="
				+ network + "]";
	}

	@Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(macAddress).append(ipAddress).append(network).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortList) == false) {
            return false;
        }
        PortList rhs = ((PortList) other);
        return new EqualsBuilder().append(name, rhs.name).append(macAddress, rhs.macAddress).append(ipAddress, rhs.ipAddress).append(network, rhs.network).isEquals();
    }

}
