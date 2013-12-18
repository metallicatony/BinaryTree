package org.datastructure.binarytree;

/**
 * 
 * Represents a single node in a binary tree. Every node in a binary tree 
 * may or may not have a maximum of 2 child nodes.
 * @author skanniah
 * 
 *
 */
public class Node {
	private Integer data;
	private Node left;
	private Node right;
	
	public Node(Integer data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public Node(Integer data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	@Override
	public boolean equals(Object object) {
		if (object == null || this.getClass() != object.getClass()) {
			return false;
		}
		
		final Node anotherElement = (Node)object;
		return this.data.equals(anotherElement.getData());
	}
		
}
