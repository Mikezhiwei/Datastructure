package Table;

import java.util.Scanner;

public class OneLink {
            
	       public OneLineNode head;
	       public  OneLink(int n)//从头创建链表
	       {
	    	      OneLineNode p,rear;
	    	      System.out.println("input the first of fist node of link");
	    	      int  k=new Scanner(System.in).nextInt();
	    	      if(n>0)
	    	      {
	    	    	    this.head=new OneLineNode(k);
	    	    	    rear=this.head;
	    	    	    for(int i=1;i<=n-1;i++)
	    	    	    {     
	    	    	    	  System.out.println("input the "+(i+1)+"node of link");
	    	    	    	  int j=new Scanner(System.in).nextInt();
	    	    	    	  p=new OneLineNode(j);
	    	    	    	  rear.next=p;
	    	    	    	  rear=p;
	    	    	    }
	    	      }
	    	}
	        
	        public boolean isempty(OneLineNode h)
	        {
	        	    return(this.head==null);
	        }
	         
	        public  void headoutput(OneLineNode q)//头部创建头部输出
	        {
	        	    while(q!=null)
	        	    {
	                   System.out.print(q.data+"->");
	                   q=q.next;
	        	    }
	        	    System.out.println();
	        }
	        public int  lengthlink(OneLineNode q)
	        {      
	        	   int i=0;
	        	   while(q!=null)
	        	   {
	        		   q=q.next;
	        		   i++;
	        	   }
	        	   return (i);
	        }
	        
	       
	        public  void rearinsert (OneLineNode node)
	        {
	        	      OneLineNode q;
	        	      q=this.head;
	        	      int length=this.lengthlink(this.head);
	        	      int i=1;
	        	      while(i<length)
	        	      {
	        	    	    i++;
	        	    	    q=q.next;
	        	      }
	        	      q.next=node;
	        	      node.next=null;
	        }
	        public void headinsert(OneLineNode node)
	        {
	        	     node.next=this.head;
	        	     this.head=node;//链表头部的转换
	        }
	        public void middleinsert(OneLineNode node,int pos)
	        {  
	        	      OneLineNode q=null;
	        	      OneLineNode p=null;
	        	      int i=1;
	        	      q=this.head;
	        	      if(pos>this.lengthlink(head)){
	        	    	    System.out.println("error :out of length");
	        	    	    System.out.println("can't  insert");
	        	      }
	        	      while(i<pos-1)//循环n-2次
	        	      {
	        	    	    q=q.next;
	        	    	    i++;
	        	      }
	        	      p=q.next;//取得要插入的节点的后继
	        	      q.next=node;//前驱的next赋值
	        	      node.next=p;//成功的插入与链表之中
	       }
	       public void display(int s,int d)
	       {
                    	    	        
	       }
 }   
