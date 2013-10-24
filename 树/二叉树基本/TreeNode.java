package Tree;

public class TreeNode {

	         public String data;
	         public  TreeNode rchild,lchild;
	         
	         public  TreeNode()
	         {
	        	 this.data="?";
	         }
	         public TreeNode(String str)
	         {
	        	 this.data=str;
	        	 this.lchild=this.rchild=null;
	         }
}
