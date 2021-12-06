public class BinaryTreeGit
{
	public void insert( TreeNode node, int value )
	{
		if( value < node.value ) {
			if( node.left != null ) {
				insert( node.left, value );
			} else {
				System.out.println( "  Inserted " + value + " to left of node " + node.value );
				node.left = new TreeNode(value);
			}
		} else if( value > node.value ) {
			if( node.right != null ) {
				insert( node.right, value );
			} else {
				System.out.println( "  Inserted " + value + " to right of node " + node.value );
				node.right = new TreeNode( value );
			}
		}
	}

	public void run() {
		TreeNode rootnode = new TreeNode(25);

		/* Build tree */
		System.out.println("Building tree with rootvalue " + rootnode.value);
		System.out.println("=================================");
		insert(rootnode, 11);
		insert(rootnode, 15);
		insert(rootnode, 16);
		insert(rootnode, 23);
		insert(rootnode, 79);

		/* Print tree in order */
		System.out.println("Traversing tree in order");
		System.out.println("=================================");
		printInOrder(rootnode);

		/* Search tree */
		System.out.println("Searching tree");
		System.out.println("=================================");
		search( rootnode, 40 );
		search( rootnode, 11 );
	}

	public void printInOrder( TreeNode node )
	{
		if( node != null ) {
			printInOrder( node.left );
			System.out.println( "  Traversed " + node.value );
			printInOrder( node.right );
		}
	}

	public void search( TreeNode node, int value )
	{
		if( node == null )
			System.out.println( "  Could not find value " + value + " in tree." );
		else if( value < node.value )
			search( node.left, value );
		else if( value > node.value )
			search( node.right, value );
		else
			System.out.println( "  Found value " + value + " in tree." );
	}

	public static void main( String[] args )
	{
		BinaryTreeGit bt = new BinaryTreeGit();
		bt.run();
	}
}
class TreeNode
{
	TreeNode left;
	TreeNode right;
	int value;

	TreeNode( int value )
	{
		this.value = value;
	}
}
