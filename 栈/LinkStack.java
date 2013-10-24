package Stacks;
import java.util.Scanner;

import Table.OneLineNode;
public class LinkStack {
               
	              public OneLineNode head;//设置带头节点的链表
	              public int length;
	              public boolean lasterror=true;
	              
	              public LinkStack(int n)
	              {
	            	    OneLineNode p=null;//尾创建,符合栈模式
	            	    int value;
	            	    this.head=new OneLineNode(-1);
	            	    this.head.next=null;
	            	    OneLineNode q=this.head;
	            	    q.next=this.head.next;
	            	    for(int i=0;i<n;i++)
	            	    {
	            	         System.out.println("please input the element of linkstack");
	            	         value=new Scanner(System.in).nextInt();
	            	         p=new OneLineNode(value);
	            	         p.next=q.next;
	            	         q.next=p;
	            	    }
	            	    this.head.next=q.next;//得到栈顶的值//this.head.next=p;
	            	    this.length=n;
	              }
	              
	              public void push(int item)
	              {
	            	   OneLineNode p=new OneLineNode(item);
	            	   p.next=this.head.next;
	            	   this.head.next=p;
	            	   this.length++;
	              }
	              public int pop()
	              {
	            	   OneLineNode p=this.head.next;
	            	   this.head.next=p.next;
	            	   this.length--;
	            	   return(p.data);
	              }
	              public boolean isEmpty()
	              {
	            	   this.lasterror=(this.head.next==null);
	            	   return(lasterror);
	              }
	              
	              
}
