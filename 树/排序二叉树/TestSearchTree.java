package Tree;

public class TestSearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TestSearchTree();  
		
	}
	public TestSearchTree()
	{
		      int []array={90,70,55,67,42,98,83,10,45,92};
		      BiSearchTree stree=new BiSearchTree(63);
		     for(int i=0;i<array.length;i++)
		     {
		    	    stree.insert(stree.root, array[i]);
		     }
		     stree.inTravelShow();
		     if(stree.find(95,stree.root))
		     {
		    	 System.out.println("find it");
		     }else{
		    	 System.out.println("not find it");
		     }
		   
	}

}
