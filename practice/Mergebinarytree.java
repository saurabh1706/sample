package practice;

//Java program to Merge Two Binary Trees

/* A binary tree node has data, pointer to left child
and a pointer to right child */
class Mergebinarytree
{
	int data;
	Mergebinarytree left, right;
	
	public Mergebinarytree(int data, Mergebinarytree left, Mergebinarytree right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	/* Helper method that allocates a new node with the
	given data and NULL left and right pointers. */
	static Mergebinarytree newNode(int data)
	{
		return new Mergebinarytree(data, null, null);
	}
	
	/* Given a binary tree, print its nodes in inorder*/
	static void inorder(Mergebinarytree node)
	{
		if (node == null)
			return;
	
		/* first recur on left child */
		inorder(node.left);
	
		/* then print the data of node */
		System.out.printf("%d ", node.data);
	
		/* now recur on right child */
		inorder(node.right);
	}
	
	/* Method to merge given two binary trees*/
	static Mergebinarytree MergeTrees(Mergebinarytree t1, Mergebinarytree t2)
	{
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;
		t1.data += t2.data;
		t1.left = MergeTrees(t1.left, t2.left);
		t1.right = MergeTrees(t1.right, t2.right);
		return t1;
	}
	
	// Driver method
	public static void main(String[] args)
	{
		/* Let us construct the first Binary Tree
				1
			/ \
			2	 3
			/ \	 \
			4 5	 6
		*/
	
		Mergebinarytree root1 = newNode(1);
		root1.left = newNode(2);
		root1.right = newNode(3);
		root1.left.left = newNode(4);
		root1.left.right = newNode(5);
		root1.right.right = newNode(6);
	
		/* Let us construct the second Binary Tree
				
				/ \
				1	 7
				/	 / \
			3	 2 6 */
		Mergebinarytree root2 = newNode(4);
		root2.left = newNode(1);
		root2.right = newNode(7);
		root2.left.left = newNode(3);
		root2.right.left = newNode(2);
		root2.right.right = newNode(6);
	
		Mergebinarytree root3 = MergeTrees(root1, root2);
		System.out.printf("The Merged Binary Tree is:\n");
		inorder(root3);
	}
}

