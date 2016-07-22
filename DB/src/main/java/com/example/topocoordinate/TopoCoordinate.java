
package com.example.topocoordinate;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "configId",
    "link",
    "node"
})

@Document(collection="topocoordinate")
public class TopoCoordinate {

    @JsonProperty("configId")
    private Integer configId;
    @JsonProperty("topoHashcode")
    private int topoHashcode;
    @JsonProperty("timeStamp")
    private long timeStamp;
    @JsonProperty("link")
    private List<Link> link = new ArrayList<Link>();
    @JsonProperty("node")
    private List<Node> node = new ArrayList<Node>();


    /**
     * 
     * @return
     *     The configId
     */
    @JsonProperty("configId")
    public Integer getConfigId() {
        return configId;
    }

    /**
     * 
     * @param configId
     *     The configId
     */
    @JsonProperty("configId")
    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    @JsonProperty("topoHashcode")
    public int getHashCode() {
	return topoHashcode;
    }

    @JsonProperty("topoHashcode")
    public void setHashCode(int hashCode) {
	this.topoHashcode = hashCode;
    }

    @JsonProperty("timeStamp")
    public long getTimeStamp() {
	return timeStamp;
    }

    @JsonProperty("timeStamp")
    public void setTimeStamp(long timeStamp) {
	this.timeStamp = timeStamp;
    }

    /**
     * 
     * @return
     *     The link
     */
    @JsonProperty("link")
    public List<Link> getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    @JsonProperty("link")
    public void setLink(List<Link> link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The node
     */
    @JsonProperty("node")
    public List<Node> getNode() {
        return node;
    }

    /**
     * 
     * @param node
     *     The node
     */
    @JsonProperty("node")
    public void setNode(List<Node> node) {
        this.node = node;
    }

	@Override
	public String toString() {
		return "TopoCoordinate [configId=" + configId + ", link=" + link + ", node=" + node + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((configId == null) ? 0 : configId.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((node == null) ? 0 : node.hashCode());
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
		TopoCoordinate other = (TopoCoordinate) obj;
		if (configId == null) {
			if (other.configId != null)
				return false;
		} else if (!configId.equals(other.configId))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (node == null) {
			if (other.node != null)
				return false;
		} else if (!node.equals(other.node))
			return false;
		return true;
	}
    
    

}