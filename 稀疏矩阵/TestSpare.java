package SpareArray;

public class TestSpare {

	/**
	 * @param args
	 */
 	       public static void main(String[] args) {
		   // TODO Auto-generated method stub
             new TestSpare();
	     }
 	       public TestSpare()
 	       {
 	    	      int number[][]={{0,0,0,4},
 	    	      {1,0,14,0},
 	    	      {0,0,3,0},
 	    	      {0,7,0,1}};
 	    	      int number2[][]={{0,0,0,2},
 	    	      {1,8,0,0,},
 	    	      {1,0,0,0},
 	    	      {0,3,0,0}};
 	    	      SpareLink splink=new SpareLink(number);
 	    	      //splink.output();
 	    	      System.out.println("*****");
 	    	      SpareLink splink2=new SpareLink(number2);
 	    	      //splink2.output();
 	    	      SpareNode table[]=new SpareNode[number.length+number2.length];
 	    	      splink2.output(splink2.spareAdd(splink.getSpareNode(), splink2.getSpareNode(), table));
 	       }

}
