package binarysearchtree;
/**
 * node for a binary tree contains a key value and left and right node
 * @author Shravya P
 *
 * @param <K> generic type
 */
public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;
	public MyBinaryNode(K key)
	{
		this.key=key;
		this.left=this.right=null;
	}
}
