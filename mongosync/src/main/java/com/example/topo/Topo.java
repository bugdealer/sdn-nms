
package com.example.topo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Topo {

	@Id
	private String id;
	private List<Link> link = new ArrayList<Link>();
	private List<Node> node = new ArrayList<Node>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Topo() {
	}

	/**
	 * 
	 * @param node
	 * @param link
	 */
	public Topo(List<Link> link, List<Node> node) {
		this.link = link;
		this.node = node;
	}

	/**
	 * 
	 * @return The link
	 */
	public List<Link> getLink() {
		return link;
	}

	/**
	 * 
	 * @param link
	 *            The link
	 */
	public void setLink(List<Link> link) {
		this.link = link;
	}

	/**
	 * 
	 * @return The node
	 */
	public List<Node> getNode() {
		return node;
	}

	/**
	 * 
	 * @param node
	 *            The node
	 */
	public void setNode(List<Node> node) {
		this.node = node;
	}

	@Override
	public String toString() {
		return "Topo [id=" + id + " link=" + link + ",\n node=" + node + "]";// "link="
																				// +
																				// link
																				// +
																				// ",
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(link).append(node).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Topo) == false) {
			return false;
		}
		Topo rhs = ((Topo) other);
		return new EqualsBuilder().append(link, rhs.link).append(node, rhs.node).isEquals();
	}

}
