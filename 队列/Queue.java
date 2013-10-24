package Queue;

public class Queue {

	         public int table[];
	         public int n;
	         public int front ,rear;
	         
	         public Queue(int length)
	         {
	        	   this.n=length;
	        	   table=new int [n];
	        	   front=rear=-1;
	         }
	         
	         public boolean isEmpty()//循环队列判断空
	         {
	        	   return(this.front==this.rear);
	         }
	         
	         public boolean isFull()//循环队列判断满,牺牲一个存储空间
	         {
	        	   return(((this.rear+1)%this.n)==this.front); 
	         }
	         
	         public void enqueue(int item)
	         {
	        	   if(!this.isFull())
	        	   {
	        		     this.rear=(this.rear+1)%this.n;//离散的域模式
	        		     this.table[rear]=item;
	        	   }else{
	        		   System.out.println("queue is full");
	        	   }
	         }
	         public int dequeue()
	         {
	        	    int temp=0;
	        	    if(!this.isEmpty())
	        	    {
	        	       this.front=(this.front+1)%this.n;
	        	       temp=this.table[front];
	        	    }
	        	    else{
	        	    	System.out.println("queue is empty");
	        	    }
	        	    return(temp);
	         }
             
	         public int queuesize()
	         {
	        	    return((this.rear-this.front)%this.n);
	         }
	         public void output()
	         {
	        	    int i=this.front;
	        	    while(i!=(this.rear))
	        	    {
	        	    	 i=(i+1)%this.n;
	        	    	 System.out.println(this.table[i]);
	        	    }
	         }
}
