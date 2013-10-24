package Table;

import java.util.Scanner;

public class DoubleLink {
           
	       DoubleLineNode  head;
	       int n;
	       
	       public  DoubleLink(int n)
	       {
	    	      this.n=n;
	    	      DoubleLineNode q,p;
	    	      int k=new Scanner(System.in).nextInt();
	    	      DoubleLineNode head=new DoubleLineNode(k);
	    	      q=head;
	    	      for(int i=1;i<=n-1;i++)
	    	      {
	    	    	    int j=new Scanner(System.in).nextInt();
	    	    	    p=new DoubleLineNode(j);
	    	    	    q.next=p;
	    	    	    p.priorr=q;//建立双向链表
	    	    	    q=p;//指针域的滑动
	    	      }
	    	    
	       }
	       public void headoutput(DoubleLineNode q)
	       {
	    	      q=this.head;
	    	      while(q!=null)
	    	      {   
	    	    	  System.out.print(q.data+"->");
	    	    	  q=q.next;
	    	      }
	       }
}
