package Table;

import java.util.Scanner;

public class LoopLink {
             OneLineNode head;
             static int count;
             OneLineNode rear;
             
             public  LoopLink(int n)//约瑟夫环问题算法
             {
            	    this.count=+n;
            	    OneLineNode p,rear;
            	    if(n>0)
            	    {  
            	    	int h=new Scanner(System.in).nextInt();
            	        this.head=new OneLineNode(h);
            	        p=this.head;
            	        for(int i=1;i<=n-1;i++){
            	        	int j=new Scanner(System.in).nextInt();
            	        	rear=new OneLineNode(j);
            	        	p.next=rear;
            	        	p=rear;
            	        }
            	        p.next=this.head;
            	    }
             }
             public void  headoutput(OneLineNode p)
             {
            	     p=this.head;
            	     int i=0;
            	     int loop=this.count;
            	     while(p!=null&&i<loop)
            	     {
            	    	   System.out.print(p.data+"->");
            	    	   p=p.next;
            	    	   i++;
            	     }
            	     System.out.println();
             }
             public  void  display(int s,int d)
             {
            	    int j=0;
            	    OneLineNode p=this.head;
            	    while(j<s-1)
            	    {
            	    	j++;
            	    	p=p.next;
            	    }
            	    while(p.next!=p)
            	    {
            	    	  j=1;
            	    	  while(j<d-1){
            	    		  p=p.next;
            	    		  j++;
            	    	  }
            	    	 this.delete(p);//指针域指向的后继的改变
            	    	 p=p.next;//链表指针指向下个开始计数的节点
            	    	 this.count--;//循环链表数目要减少（删除一个节点）
                    }
             }
             
            public  void  delete(OneLineNode p)
            {
                    OneLineNode q=p.next;
                    if(q==this.head)//若是循环链表的头部被删除的情况，要将整个类的head变为head的next节点
                    {
                    	this.head=q.next;
                    }
                    p.next=q.next;
            }
}
             
             

