package com.example.vmsetting;

import java.util.ArrayList;
import java.util.List;

public class Vmsetting {

    private int topoHashcode;
    private long timeStamp;
    private boolean selected;
	private List<VmInfo> vmInfo = new ArrayList<VmInfo>();
	
	public int getTopoHashcode() {
		return topoHashcode;
	}
	public void setTopoHashcode(int topoHashcode) {
		this.topoHashcode = topoHashcode;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public List<VmInfo> getVmInfo() {
		return vmInfo;
	}
	public void setVmInfo(List<VmInfo> vmInfo) {
		this.vmInfo = vmInfo;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	@Override
	public String toString() {
		return "Vmsetting [topoHashcode=" + topoHashcode + ", timeStamp=" + timeStamp + ", selected=" + selected
				+ ", vmInfo=" + vmInfo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (selected ? 1231 : 1237);
		result = prime * result + (int) (timeStamp ^ (timeStamp >>> 32));
		result = prime * result + topoHashcode;
		result = prime * result + ((vmInfo == null) ? 0 : vmInfo.hashCode());
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
		Vmsetting other = (Vmsetting) obj;
		if (selected != other.selected)
			return false;
		if (timeStamp != other.timeStamp)
			return false;
		if (topoHashcode != other.topoHashcode)
			return false;
		if (vmInfo == null) {
			if (other.vmInfo != null)
				return false;
		} else if (!vmInfo.equals(other.vmInfo))
			return false;
		return true;
	}
	
	
}
