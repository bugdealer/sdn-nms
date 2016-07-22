
package com.example.topocoordinate;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "nodeId",
    "nodeName",
    "xCoordinate",
    "yCoordinate"
})
public class Node {

    @JsonProperty("nodeId")
    private String nodeId;
    @JsonProperty("nodeName")
    private Object nodeName;
    @JsonProperty("xCoordinate")
    private Integer xCoordinate;
    @JsonProperty("yCoordinate")
    private Integer yCoordinate;

    /**
     * 
     * @return
     *     The nodeId
     */
    @JsonProperty("nodeId")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * 
     * @param nodeId
     *     The nodeId
     */
    @JsonProperty("nodeId")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * 
     * @return
     *     The nodeName
     */
    @JsonProperty("nodeName")
    public Object getNodeName() {
        return nodeName;
    }

    /**
     * 
     * @param nodeName
     *     The nodeName
     */
    @JsonProperty("nodeName")
    public void setNodeName(Object nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * 
     * @return
     *     The xCoordinate
     */
    @JsonProperty("xCoordinate")
    public Integer getXCoordinate() {
        return xCoordinate;
    }

    /**
     * 
     * @param xCoordinate
     *     The xCoordinate
     */
    @JsonProperty("xCoordinate")
    public void setXCoordinate(Integer xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    /**
     * 
     * @return
     *     The yCoordinate
     */
    @JsonProperty("yCoordinate")
    public Integer getYCoordinate() {
        return yCoordinate;
    }

    /**
     * 
     * @param yCoordinate
     *     The yCoordinate
     */
    @JsonProperty("yCoordinate")
    public void setYCoordinate(Integer yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

	@Override
	public String toString() {
		return "Node [nodeId=" + nodeId + ", nodeName=" + nodeName + ", xCoordinate=" + xCoordinate + ", yCoordinate="
				+ yCoordinate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
		result = prime * result + ((nodeName == null) ? 0 : nodeName.hashCode());
		result = prime * result + ((xCoordinate == null) ? 0 : xCoordinate.hashCode());
		result = prime * result + ((yCoordinate == null) ? 0 : yCoordinate.hashCode());
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
		Node other = (Node) obj;
		if (nodeId == null) {
			if (other.nodeId != null)
				return false;
		} else if (!nodeId.equals(other.nodeId))
			return false;
		if (nodeName == null) {
			if (other.nodeName != null)
				return false;
		} else if (!nodeName.equals(other.nodeName))
			return false;
		if (xCoordinate == null) {
			if (other.xCoordinate != null)
				return false;
		} else if (!xCoordinate.equals(other.xCoordinate))
			return false;
		if (yCoordinate == null) {
			if (other.yCoordinate != null)
				return false;
		} else if (!yCoordinate.equals(other.yCoordinate))
			return false;
		return true;
	}
    
    

}
