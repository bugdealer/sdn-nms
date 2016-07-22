
package com.example.topocoordinate;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "linkId",
    "sourceMac",
    "sourceIp",
    "destMac",
    "destIp"
})
public class Link {

    @JsonProperty("linkId")
    private String linkId;
    @JsonProperty("sourceMac")
    private Object sourceMac;
    @JsonProperty("sourceIp")
    private Object sourceIp;
    @JsonProperty("destMac")
    private Object destMac;
    @JsonProperty("destIp")
    private Object destIp;

    /**
     * 
     * @return
     *     The linkId
     */
    @JsonProperty("linkId")
    public String getLinkId() {
        return linkId;
    }

    /**
     * 
     * @param linkId
     *     The linkId
     */
    @JsonProperty("linkId")
    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    /**
     * 
     * @return
     *     The sourceMac
     */
    @JsonProperty("sourceMac")
    public Object getSourceMac() {
        return sourceMac;
    }

    /**
     * 
     * @param sourceMac
     *     The sourceMac
     */
    @JsonProperty("sourceMac")
    public void setSourceMac(Object sourceMac) {
        this.sourceMac = sourceMac;
    }

    /**
     * 
     * @return
     *     The sourceIp
     */
    @JsonProperty("sourceIp")
    public Object getSourceIp() {
        return sourceIp;
    }

    /**
     * 
     * @param sourceIp
     *     The sourceIp
     */
    @JsonProperty("sourceIp")
    public void setSourceIp(Object sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * 
     * @return
     *     The destMac
     */
    @JsonProperty("destMac")
    public Object getDestMac() {
        return destMac;
    }

    /**
     * 
     * @param destMac
     *     The destMac
     */
    @JsonProperty("destMac")
    public void setDestMac(Object destMac) {
        this.destMac = destMac;
    }

    /**
     * 
     * @return
     *     The destIp
     */
    @JsonProperty("destIp")
    public Object getDestIp() {
        return destIp;
    }

    /**
     * 
     * @param destIp
     *     The destIp
     */
    @JsonProperty("destIp")
    public void setDestIp(Object destIp) {
        this.destIp = destIp;
    }

	@Override
	public String toString() {
		return "Link [linkId=" + linkId + ", sourceMac=" + sourceMac + ", sourceIp=" + sourceIp + ", destMac=" + destMac
				+ ", destIp=" + destIp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destIp == null) ? 0 : destIp.hashCode());
		result = prime * result + ((destMac == null) ? 0 : destMac.hashCode());
		result = prime * result + ((linkId == null) ? 0 : linkId.hashCode());
		result = prime * result + ((sourceIp == null) ? 0 : sourceIp.hashCode());
		result = prime * result + ((sourceMac == null) ? 0 : sourceMac.hashCode());
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
		Link other = (Link) obj;
		if (destIp == null) {
			if (other.destIp != null)
				return false;
		} else if (!destIp.equals(other.destIp))
			return false;
		if (destMac == null) {
			if (other.destMac != null)
				return false;
		} else if (!destMac.equals(other.destMac))
			return false;
		if (linkId == null) {
			if (other.linkId != null)
				return false;
		} else if (!linkId.equals(other.linkId))
			return false;
		if (sourceIp == null) {
			if (other.sourceIp != null)
				return false;
		} else if (!sourceIp.equals(other.sourceIp))
			return false;
		if (sourceMac == null) {
			if (other.sourceMac != null)
				return false;
		} else if (!sourceMac.equals(other.sourceMac))
			return false;
		return true;
	}
    
    

}
