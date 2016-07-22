package com.example.tablemapping;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="tableMapping")
public class TableMapping {
	@Field("vnid")
	private int vnId;
	private String nodeId;
	private int vnTableId;
	private int tableId;
	
	public int getVnId() {
		return vnId;
	}
	public void setVnId(int vnId) {
		this.vnId = vnId;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public int getVnTableId() {
		return vnTableId;
	}
	public void setVnTableId(int vnTableId) {
		this.vnTableId = vnTableId;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	@Override
	public String toString() {
		return "TableMapping [vnId=" + vnId + ", nodeId=" + nodeId + ", vnTableId=" + vnTableId + ", tableId=" + tableId
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
		result = prime * result + tableId;
		result = prime * result + vnId;
		result = prime * result + vnTableId;
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
		TableMapping other = (TableMapping) obj;
		if (nodeId == null) {
			if (other.nodeId != null)
				return false;
		} else if (!nodeId.equals(other.nodeId))
			return false;
		if (tableId != other.tableId)
			return false;
		if (vnId != other.vnId)
			return false;
		if (vnTableId != other.vnTableId)
			return false;
		return true;
	}
	

}
