package SpareArray;

public class SpareLink {
	              
	            public SpareNode table[];//类似于指针数组
	            
	            public SpareLink(int num[][])
	            {
	            	   int length=num.length;
	            	   this.table=new SpareNode[length];
	            	   SpareNode q,p=null;
	            	   for(int i=0;i<length;i++)
	            	   { 
	            		  for(int j=0;j<num[i].length;j++)
	            		  {
	            			     if(num[i][j]!=0)
	            			     {
	            			    	 q=new SpareNode(i+1,j+1,num[i][j]);   
	            			    	 if(this.table[i]==null){//判断是否为第一个不为零的链表头结点
	            			    		  this.table[i]=q;
	            			    	 }else{
	            			    		 p.next=q; 
	            			    	 }
	            			    	 p=q;//链表指针的传递
	            			     }
	            		  }
	            	   }
	            }
	            
	            public void output()
	            {
	                 for(int i=0;i<this.table.length;i++)
	                 {
	                	    SpareNode p=table[i];
	                	    while(p!=null)
	                	    {      
	                	    	   System.out.println("now the row is"+(i+1));
	                	    	   System.out.println("\t"+"row"+"\t"+"col"+"\t"+"data");
	                	    	   p.output();
	                	    	   p=p.next;
	                	    	   
	                	    }
	                 }
	            }
	            
	            public SpareNode[] spareAdd(SpareNode table1[],SpareNode table2[],SpareNode table3[])
	            {
	            	  int col=0;
	            	  int i=0,sum=0;
	            	  if(table1.length!=table2.length)
	            	  {
	            		    System.out.println("the sparearray is illegal");
	            		    return (null);
	            	  }
	            	  if(table3.length<table1.length+table2.length)
	            	  {
	            		    System.out.println("the addasparearray is illegal");
	            		    return (null);
	            	  }
	            	  for(i=0;i<table1.length;i++)
	                  {
	                	      SpareNode p=table1[i];
	                	      SpareNode q=table2[i];
	                	      table3[i]=null;
	                	      SpareNode s=null;
	                	      SpareNode last=null;
	                	      while(p!=null &&q!=null)
	                	      {
	                	    	     if(p.col==q.col)
	                	    	     {
	                	    	    	   sum=p.data+q.data;
	                	    	    	   col=p.col;
	                	    	    	   p=p.next;
	                	    	    	   q=q.next;
	                	    	     }
	                	    	     else if(p.col<q.col)
	                	    	     {
	                	    	    	  sum=p.data;
	                	    	    	  col=p.col;
	                	    	    	  p=p.next;
	                	    	     }
	                	    	     else {
	                	    	    	  sum=q.data;
	                	    	    	  col=q.col;
	                	    	    	  q=q.next;
	                	    	     }
	                	            if(sum!=0)
	                	        {
	                	    	   s=new SpareNode((i+1),col,sum);
	                	    	   if(table3[i]==null)
	                	    	    {
	                	    		      table3[i]=s;
	                	    		      last=s;
	                	    	    }
	                	    	   else{
	                	                  last.next=s;  
	                	                  last=s;
	                	    	    }
	                	       }
	                	    }
	                	       while(p!=null)
	                	       {
	                	    	     s=new SpareNode(p.col,p.row,p.data);
	                	    	     last.next=s;
	                	    	     p=p.next;
	                	       }
	                	       while(q!=null)
	                	       {
	                	    	     s=new SpareNode(q.col,q.row,q.data);
	                	    	     last.next=s;
	                	    	     q=q.next;
	                	       }
	                	  }
	            	    return(table3);
	                }
                 public SpareNode[] getSpareNode()
                 {
                	 return(this.table);
                 }
                 public  void setSpareNode(SpareNode table[])
                 {
                       this.table=table;
                	 
                 }
                 public void output(SpareNode output[])
                 {
                	 for(int i=0;i<output.length;i++)
                	 {
                		   SpareNode p=output[i];
                		   while(p!=null)
                		   {
                			   System.out.println("now the row is"+(i+1));
                	    	   System.out.println("\t"+"row"+"\t"+"col"+"\t"+"data");
                	    	   p.output();
                	    	   p=p.next;
                		   }
                	 }
                 }
}
