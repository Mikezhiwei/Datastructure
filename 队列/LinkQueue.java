package Queue;
import java.util.Scanner;

import Table.OneLineNode;
public class LinkQueue {
   
	           OneLineNode front=null,rear=null;
	           
	           public LinkQueue(int n)
	           {
	        	     OneLineNode q,p;
	        	     System.out.println("please input the value head of linkqueue");
	        	     this.front=new OneLineNode(-1);//设置为带头节点的链表
	        	     q=this.front;
	        	     for(int i=0;i<n;i++)
	        	     {
	        	    	 System.out.println("please input the value of linkqueue");
	        	    	 p=new OneLineNode(new Scanner(System.in).nextInt());
	        	    	 q.next=p;
	        	    	 q=p;
	        	     }
	        	     this.rear=q;
	           }
	           
	           public void enqueue(int item)
	           {
	        	     OneLineNode p=new OneLineNode(item);
	        	    if(!this.isEmpty())
	        	    {
	        	          this.rear.next=p;
	        	    	  this.rear=p;
	        	    }else{
	        	       this.front=new OneLineNode(-1);
	        	       this.front.next=p;
	        	       this.rear=p;
	        	    }
	           }
	           public int dequeue()
	           {
	        	      int temp=0;
	        	      if(!this.isEmpty())
	        	      {
	        	    	   OneLineNode p=this.front.next;
	        	    	   temp=p.data;
	        	    	   if(p.next==null){//判断p指针是否已经指向队列的最后一个节点了
	        	    		     this.front=p.next;//销毁头指针
	        	    		     this.rear=null;//销毁尾指针，并使之与头结点相等,判断队列空
	        	    	   }else{
	        	    		    front.next=p.next;//出对列，转换头结点指向
	        	    	   }
	        	      }else{
	        	    	  System.out.println("thie linkquque is empty");
	        	      }
	        	      return(temp);
	           }
	           public boolean  isEmpty()
	           {
	        	   return(this.rear==this.front);
	           }
	           public  void output()
	           {
	                if(this.isEmpty()){
	                	  System.out.println("linkqueue is empty");
	                }else{
	                	  OneLineNode p=this.front.next;
	                	  while(p!=null){
	                		    System.out.print(p.data+"->");
	                		    p=p.next;
	                	  }
	                }
	        		   
	           }
}
