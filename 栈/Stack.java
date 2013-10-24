package Stacks;

public class Stack {
          
	            public  int  pos;
	            public  int starray[];
	            public  int length;
	            public boolean lastError=true;
	            
	            public  Stack(int n)
	            {
	            	 this.starray=new int [n];
	            	 pos=-1;
	            	 this.length=n;
	            }
	            public boolean isEmpty()
	            {
	            	  this.lastError=(this.pos==-1);
	            	  return(this.lastError);
	            }
	            public boolean isFull()
	            {
	                this.lastError=(this.pos==(length-1));
	                return(this.lastError);
	            }
	            public void push(int item)
	            {    
	            	  if(!this.isFull())
	            	  {     
	            		   pos++;	   
	            		   this.starray[pos]=item;
	            	  }else{
	            		   System.out.println("the stack is full");
	            	  }
	            }
	            public int pop()
	            {
	            	  int temp=0;
	            	  if(!this.isEmpty())
	            	  {
	            		  temp=this.starray[pos];
	            		  pos--;
	            	  }else{
	            	      System.out.println("the stack is empty");	
	            	      return (0);
	                 }
	            	  return (temp);
	            }
	            
}
