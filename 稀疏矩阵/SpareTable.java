package SpareArray;

public class SpareTable {

	        public SpareNode table[];
	        
	        public SpareTable(int num[][])
	        {
	        	 int length=num.length;
	        	 this.table=new SpareNode[(int)(length*length/2)];
	        	 int k=0;
	        	 for(int i=0;i<num.length;i++)
	        	 {
	        		  for(int j=0;j<num[j].length;j++)
	        		  {
	        			    if(num[i][j]!=0)
	        			    {    
	        			    	 if(k<length){
	        			         table[k]=new SpareNode(i,j,num[i][j]);
	        			         k++;
	        			         }
	        			    	 else
	        			    	 {  
	        			    	     System.out.println("the table is full"); 
	        			    		 break;
	        			         }
	        			    }
	        		  }
	        	 }
	        }
	        
	        public void  output()
	        {
	        	 System.out.println("output for the items of table");
	        	 for(int i=0;i<this.table.length;i++)
	        	 {
	        		   System.out.println("\t"+"row"+"\t"+"col"+"\t"+"data");
	        		   if(table[i].data!=0){
	        			      table[i].output();
	        		   }else{
	        			     break;
	        		   }
	        	 }
	        }
	        
}
