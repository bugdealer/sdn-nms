
package com.example.cluster;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.springframework.data.mongodb.core.mapping.Field;

@Generated("org.jsonschema2pojo")
public class EdgePort {

	@Field("dp_id")
    private String dpId;
	@Field("dp_port")
    private List<String> dpPort = new ArrayList<String>();
	@Field("mac_address")
    private List<String> macAddress = new ArrayList<String>();

    /**
     * 
     * @return
     *     The dpId
     */
    public String getDpId() {
        return dpId;
    }

    /**
     * 
     * @param dpId
     *     The dp_id
     */
    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    /**
     * 
     * @return
     *     The dpPort
     */
    public List<String> getDpPort() {
        return dpPort;
    }

    /**
     * 
     * @param dpPort
     *     The dp_port
     */
    public void setDpPort(List<String> dpPort) {
        this.dpPort = dpPort;
    }

    /**
     * 
     * @return
     *     The macAddress
     */
    public List<String> getMacAddress() {
        return macAddress;
    }

    /**
     * 
     * @param macAddress
     *     The mac_address
     */
    public void setMacAddress(List<String> macAddress) {
        this.macAddress = macAddress;
    }

	@Override
	public String toString() {
		return "EdgePort [dpId=" + dpId + ", dpPort=" + dpPort + ", macAddress=" + macAddress + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dpId == null) ? 0 : dpId.hashCode());
		result = prime * result + ((dpPort == null) ? 0 : dpPort.hashCode());
		result = prime * result + ((macAddress == null) ? 0 : macAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EdgePort other = (EdgePort) obj;
		if (dpId == null) {
			if (other.dpId != null)
				return false;
		} else if (!dpId.equals(other.dpId))
			return false;
		if (dpPort == null) {
			if (other.dpPort != null)
				return false;
		} else if (!dpPort.equals(other.dpPort))
			return false;
		if (macAddress == null) {
			if (other.macAddress != null)
				return false;
		} else if (!macAddress.equals(other.macAddress))
			return false;
		return true;
	}
    
    

}
