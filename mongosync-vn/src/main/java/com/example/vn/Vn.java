package com.example.vn;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="link")
public class Vn {

private String id;

private String headNodeConnector;

private String tailNodeConnector;

private int vnid;

/**
* 
* @return
* The id
*/

public String getId() {
return id;
}

/**
* 
* @param id
* The _id
*/

public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The headNodeConnector
*/

public String getHeadNodeConnector() {
return headNodeConnector;
}

/**
* 
* @param headNodeConnector
* The headNodeConnector
*/

public void setHeadNodeConnector(String headNodeConnector) {
this.headNodeConnector = headNodeConnector;
}

/**
* 
* @return
* The tailNodeConnector
*/

public String getTailNodeConnector() {
return tailNodeConnector;
}

/**
* 
* @param tailNodeConnector
* The tailNodeConnector
*/

public void setTailNodeConnector(String tailNodeConnector) {
this.tailNodeConnector = tailNodeConnector;
}

/**
* 
* @return
* The vnid
*/

public int getVnid() {
return vnid;
}

/**
* 
* @param vnid
* The vnid
*/

public void setVnid(int vnid) {
this.vnid = vnid;
}

@Override
public String toString() {
	return "Vn [id=" + id + ", headNodeConnector=" + headNodeConnector + ", tailNodeConnector=" + tailNodeConnector
			+ ", vnid=" + vnid + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((headNodeConnector == null) ? 0 : headNodeConnector.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((tailNodeConnector == null) ? 0 : tailNodeConnector.hashCode());
	result = prime * result + vnid;
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
	Vn other = (Vn) obj;
	if (headNodeConnector == null) {
		if (other.headNodeConnector != null)
			return false;
	} else if (!headNodeConnector.equals(other.headNodeConnector))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (tailNodeConnector == null) {
		if (other.tailNodeConnector != null)
			return false;
	} else if (!tailNodeConnector.equals(other.tailNodeConnector))
		return false;
	if (vnid != other.vnid)
		return false;
	return true;
}



}