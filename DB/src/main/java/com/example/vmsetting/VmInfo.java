
package com.example.vmsetting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;


public class VmInfo {

    private String vmId;
	private String name;
    private String hostIp;
    private String hostMacAddress;
    private String portSize;
    private List<PortList> portList = new ArrayList<PortList>();
    
   
    
    
    
    public String getVmId() {
		return vmId;
	}

	public void setVmId(String vmId) {
		this.vmId = vmId;
	}
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
     *     The hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    /**
     * 
     * @param hostIp
     *     The hostIp
     */
    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    /**
     * 
     * @return
     *     The hostMacAddress
     */
    public String getHostMacAddress() {
        return hostMacAddress;
    }

    /**
     * 
     * @param hostMacAddress
     *     The hostMacAddress
     */
    public void setHostMacAddress(String hostMacAddress) {
        this.hostMacAddress = hostMacAddress;
    }

    /**
     * 
     * @return
     *     The portSize
     */
    public String getPortSize() {
        return portSize;
    }

    /**
     * 
     * @param portSize
     *     The portSize
     */
    public void setPortSize(String portSize) {
        this.portSize = portSize;
    }

    /**
     * 
     * @return
     *     The portList
     */
    public List<PortList> getPortList() {
        return portList;
    }

    /**
     * 
     * @param portList
     *     The portList
     */
    public void setPortList(List<PortList> portList) {
        this.portList = portList;
    }

	@Override
	public String toString() {
		return "VmInfo [vmId=" + vmId + ", name=" + name + ", hostIp=" + hostIp + ", hostMacAddress=" + hostMacAddress
				+ ", portSize=" + portSize + ", portList=" + portList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hostIp == null) ? 0 : hostIp.hashCode());
		result = prime * result + ((hostMacAddress == null) ? 0 : hostMacAddress.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((portList == null) ? 0 : portList.hashCode());
		result = prime * result + ((portSize == null) ? 0 : portSize.hashCode());
		result = prime * result + ((vmId == null) ? 0 : vmId.hashCode());
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
		VmInfo other = (VmInfo) obj;
		if (hostIp == null) {
			if (other.hostIp != null)
				return false;
		} else if (!hostIp.equals(other.hostIp))
			return false;
		if (hostMacAddress == null) {
			if (other.hostMacAddress != null)
				return false;
		} else if (!hostMacAddress.equals(other.hostMacAddress))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (portList == null) {
			if (other.portList != null)
				return false;
		} else if (!portList.equals(other.portList))
			return false;
		if (portSize == null) {
			if (other.portSize != null)
				return false;
		} else if (!portSize.equals(other.portSize))
			return false;
		if (vmId == null) {
			if (other.vmId != null)
				return false;
		} else if (!vmId.equals(other.vmId))
			return false;
		return true;
	}

    

}
