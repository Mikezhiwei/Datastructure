package SpareArray;

public class SpareNode {
	           
	            public int row;
	            public int col;
	            public int data;
	            public SpareNode next;
	            
	            public SpareNode(int i,int j,int k)
	            {
	            	  this.row=i;
	            	  this.col=j;
	            	  this.data=k;
	            	  this.next=null;
	            }
	            public SpareNode()
	            {
	            	this(0,0,0);
	            }
	            public void output()
	            {
	            	System.out.println("\t"+this.row+"\t"+this.col+"\t"+this.data);
	            }

}
