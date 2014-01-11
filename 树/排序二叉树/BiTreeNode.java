package Tree;

public class BiTreeNode {
	
	     private BiTreeNode lchild;
	     private BiTreeNode rchild;
	     private BiTreeNode parent;
	     private int data;
	     
	     int bf=0;//Æ½ºâ¶È
	     public BiTreeNode()
	     {
	    	 this.lchild=null;
	    	 this.rchild=null;
	    	 this.parent=null;
	    	 this.data=0;
	     }
	     public BiTreeNode(int item)
	     {
	    	 this.lchild=null;
	    	 this.rchild=null;
	    	 this.parent=null;
	    	 this.data=item;
	     }
	     public BiTreeNode(int item,BiTreeNode lchild,BiTreeNode rchild)
	     {
	    	 this.lchild=lchild;
	    	 this.rchild=rchild;
	    	 this.data=item;
	    	 this.parent=null;
	     }
	     public void setLchild(BiTreeNode lchild)
	     {
	    	 this.lchild=lchild;
	     }
	     public BiTreeNode getLchild()
	     {
	    	 return(this.lchild);
	     }
	     public void setRchild(BiTreeNode rchild)
	     {
	    	 this.rchild=rchild;
	     }
	     public BiTreeNode getRchild()
	     {
	    	 return(this.rchild);
	     }
	     public void setParent(BiTreeNode parent)
	     {
	    	 this.parent=parent;
	     }
	     public BiTreeNode getParent()
	     {
	    	 return(this.parent);
	     }
	     public void setData(int item)
	     {
	    	 this.data=item;
	     }
	     public int getData()
	     {
	    	 return(this.data);
	     }
}
