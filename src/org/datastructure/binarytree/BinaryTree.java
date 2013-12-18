package org.datastructure.binarytree;

import java.util.Stack;

/**
 * Illustrates the various traversal algorithms available for a binary tree data structure.
 * @author skanniah
 *
 */
public class BinaryTree {
	
	
/*	 				Binary Tree
// 
//	 					25
//	 				   /  \
//	 				  20  50
//	 				 / \   /
//	 				15 30 40
//	 				 \
//	 				 22
//	 
*/
	
	/**
	 * Creates a binary tree and returns the root node
	 * @return root Node
	 */
	public static Node createBinaryTree() {
		Node root = new Node(25);
		Node level1First = new Node(20);
		Node level1Second = new Node(50);
		Node level2First = new Node(15);
		Node level2Second = new Node(30);
		Node level2Third = new Node(40);
		Node level3First = new Node(22);
		root.setLeft(level1First);
		root.setRight(level1Second);
		level1Second.setLeft(level2Third);
		level1First.setLeft(level2First);
		level1First.setRight(level2Second);
		level2First.setRight(level3First);
		return root;
	}
}
