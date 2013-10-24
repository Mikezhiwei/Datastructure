package Jones;

public class JonseGame {
                
	             public JonseTable table[];
	             public int length;
	             public  JonseGame(int n)
	             {
	            	 this.table=new JonseTable[n];
	            	 this.length=n;
	            	 for(int i=0;i<n;i++)
	            	 {
	            		  this.table[i]=new JonseTable(i);
	            	 }
	             }
	             public  void display(int d,int last)
	             {
	            	     int j=0;
	            	     for(int i=0;i<(length-last);i++)
	            	     {
	            	    	   int count=0;
	            	    	   while(count<d-1)
	            	    	   {
	            	    		    if(this.table[((j+1)%length)].tag)
	            	    		    {    
	            	    		    	count++;
	            	    		    	j=(j+1)%length;
	            	    		    }else{
	            	    		    	 j=(j+1)%length;
	            	    		    }
	            	    	   }
	            	    	   j=this.delete(j);
	            	    }
	                     	     
	             }
	              
	             public int delete(int pos)
	             {
	            	    this.table[pos].tag=false;
	            	    while(!table[pos].tag)
	            	    {
	            	    	pos=(pos+1)%length;
	            	    }
	            	    return (pos);
	             }
	             public void output()
	             {
	            	  for(int i=0;i<length;i++)
	            	  {
	            		   if(this.table[i].tag)
	            		   {
	            			   System.out.println("最后生存人的编号"+(table[i].data+1));
	            		   }
	            	  }
	             }
}
