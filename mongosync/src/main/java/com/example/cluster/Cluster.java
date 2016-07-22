
package com.example.cluster;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Generated("org.jsonschema2pojo")
@Document
public class Cluster {

  
    @Field("cluster_info")
	private List<ClusterInfo> clusterInfo = new ArrayList<ClusterInfo>();
    private long timeStamp;
    
    @Transient
	private String name;
    @Transient
    private int topoHashcode;
    
    private boolean selected;
    
   

    /**
     * 
     * @return
     *     The clusterInfo
     */
    public List<ClusterInfo> getClusterInfo() {
        return clusterInfo;
    }

    /**
     * 
     * @param clusterInfo
     *     The cluster_info
     */
    public void setClusterInfo(List<ClusterInfo> clusterInfo) {
        this.clusterInfo = clusterInfo;
    }
    

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHashCode() {
		return topoHashcode;
	}

	public void setHashCode(int hashCode) {
		this.topoHashcode = hashCode;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getTopoHashcode() {
		return topoHashcode;
	}

	public void setTopoHashcode(int topoHashcode) {
		this.topoHashcode = topoHashcode;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		return "Cluster [clusterInfo=" + clusterInfo + ", name=" + name + ", topoHashcode=" + topoHashcode
				+ ", timeStamp=" + timeStamp + ", selected=" + selected + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clusterInfo == null) ? 0 : clusterInfo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (selected ? 1231 : 1237);
		result = prime * result + (int) (timeStamp ^ (timeStamp >>> 32));
		result = prime * result + topoHashcode;
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
		Cluster other = (Cluster) obj;
		if (clusterInfo == null) {
			if (other.clusterInfo != null)
				return false;
		} else if (!clusterInfo.equals(other.clusterInfo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (selected != other.selected)
			return false;
		if (timeStamp != other.timeStamp)
			return false;
		if (topoHashcode != other.topoHashcode)
			return false;
		return true;
	}

	
	

}
