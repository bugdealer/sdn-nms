
package com.example.cluster;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.springframework.data.mongodb.core.mapping.Field;

@Generated("org.jsonschema2pojo")
public class ClusterInfo {

	@Field("cluster_id")
    private String clusterId;
	@Field("dp_list")
    private List<String> dpList = new ArrayList<String>();
	@Field("edge_port")
    private List<EdgePort> edgePort = new ArrayList<EdgePort>();

    /**
     * 
     * @return
     *     The clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * 
     * @param clusterId
     *     The cluster_id
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * 
     * @return
     *     The dpList
     */
    public List<String> getDpList() {
        return dpList;
    }

    /**
     * 
     * @param dpList
     *     The dp_list
     */
    public void setDpList(List<String> dpList) {
        this.dpList = dpList;
    }

    /**
     * 
     * @return
     *     The edgePort
     */
    public List<EdgePort> getEdgePort() {
        return edgePort;
    }

    /**
     * 
     * @param edgePort
     *     The edge_port
     */
    public void setEdgePort(List<EdgePort> edgePort) {
        this.edgePort = edgePort;
    }

	@Override
	public String toString() {
		return "ClusterInfo [clusterId=" + clusterId + ", dpList=" + dpList + ", edgePort=" + edgePort + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clusterId == null) ? 0 : clusterId.hashCode());
		result = prime * result + ((dpList == null) ? 0 : dpList.hashCode());
		result = prime * result + ((edgePort == null) ? 0 : edgePort.hashCode());
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
		ClusterInfo other = (ClusterInfo) obj;
		if (clusterId == null) {
			if (other.clusterId != null)
				return false;
		} else if (!clusterId.equals(other.clusterId))
			return false;
		if (dpList == null) {
			if (other.dpList != null)
				return false;
		} else if (!dpList.equals(other.dpList))
			return false;
		if (edgePort == null) {
			if (other.edgePort != null)
				return false;
		} else if (!edgePort.equals(other.edgePort))
			return false;
		return true;
	}
    

}
