package studennode;

import java.util.Scanner;

public class Link {
	        Node head=null;
	        Node rear=null;
	        boolean  judge=true;
	        public  void   fisrtaddstudent(int n)
	        {
	              System.out.println("you must input the "+n+"students");
	              Node  p=null,q=null;
	              int i=0;
	              for(i=0;i<n;i++)
	              {     
	            	    System.out.println("please input the name of students");
	            	    String name=new Scanner(System.in).nextLine();
	            	    System.out.println("pleade input the numbet of students");
	            	    String num=new Scanner(System.in).nextLine();
	            	    if(judge){
	            	    	 this.judge=false;
	            	         this.head=new Node(name,num);
	            	         p=this.head;
	            	         rear=this.head;
	            	    }
	            	    else{
	            	    	q=new Node(name,num);
	            	    	p.next=q;//搭建链表
	            	    	p=q;//工作指针移动
	            	    }
	              }
	              this.rear=p;//尾指针
	              System.out.println("finish it all");
	        }
           
	        public  void  observe(Node p)
	        {
	              p=this.head;
	              System.out.println("student name"+"\t"+"student number");
	              while(p!=null)
	              {
	            	      System.out.println(p.name+"\t"+p.num);
	            	      p=p.next;
	              }
	        }
	
	        public  void  addstudent(int n)
	        {    
	        	  Node q=null;
	        	  Node p=null;
	        	  p=this.rear;
	        	  int i=0;
	        	  for(i=0;i<n;i++)
	        	  {
	        		    System.out.println("please input the name of students");
	            	    String name=new Scanner(System.in).nextLine();
	            	    System.out.println("pleade input the numbet of students");
	            	    String num=new Scanner(System.in).nextLine();
	            	    q=new Node(name,num);
	            	    p.next=q;
	            	    p=q;
	        	  }
	        	  this.rear=p;
	        	  System.out.println("finish it all");
	        }
	        public void remove(String name)
	        {
	        	   Node p=this.head;
	        	   if(p.name.equals(name))
	        	   {
	        		      this.head=p.next;
	        		      System.out.println("the stu is moved");
	        	   }
	        	   else{
	        		     while(p!=null)
	        		     {
	        		    	    if(p.next.name.equals(name))
	        		    	    {
	        		    	    	   p.next=p.next.next;
	        		    	    	   break;
	        		    	    }
	        		    	    p=p.next;
	        		     }
	        		     if(p==null){
	        		    	   System.out.println("can't find the student");
	        		     }
	        		     else if(p.next==null)
	        		     {
	        		    	   this.rear=p;//确保尾部指针是可以连接的
	        		    	   System.out.println("the studnet is moved");
	        		     }
	        		     else{
	        		    	  System.out.println("the studnet is moved");
	        		     }
	        		     
	        	   }
	        }
	        public  void inputgrade()
	        {
	        	    Node p=this.head;
	        	    int temp;
	        	    int  choose;
	        	    while(p!=null)
	        	    {     
	        	    	  if(p.grades.datastrugrade!=-1)
	        	    	  {
	        	    		      p=p.next;
	        	    		      continue;
	        	    	  }
	        	    	  System.out.println("pleade input the "+p.name+"'s grade");
	        	          System.out.println("please input the c grade");
	        	          temp=new Scanner(System.in).nextInt();
	        	          p.grades.cgrade=temp;
	        	          System.out.println("please input the c++ grade");
	        	          temp=new Scanner(System.in).nextInt();
	        	          p.grades.cdoubleaddgrade=temp;
	        	          System.out.println("please input the java grade");
	        	          temp=new Scanner(System.in).nextInt();
	        	           p.grades.javagrade=temp;
	        	          System.out.println("please input the datastu grade");
	        	          temp=new Scanner(System.in).nextInt();
	        	          p.grades.datastrugrade=temp;
	        	          System.out.println("do want to input aggin?");
	        	          System.out.println("1 to conitune 2 to give up");
	        	          choose=new Scanner(System.in).nextInt();
	        	          if(choose==2){
	        	        	    break;
	        	          }
	        	          else{
	        	        	    p=p.next;
	        	        	    if(p==null){
	        	        	    	  System.out.println("finish if all");
	        	        	    	  break;
	        	        	    }
	        	           }
	        	    }
	        }
	        public  void  lookgrade()
	        {
	        	 Node p=this.head;
      		     System.out.println("c"+"\t"+"c++"+"\t"+"java"+"\t"+"data stu");
      		     while(p!=null)
	        	 {   
      		    	 System.out.println(p.name);
	        		 System.out.println(p.grades.cgrade+"\t"+p.grades.cdoubleaddgrade+"\t"+p.grades.javagrade+"\t"+p.grades.datastrugrade);
	        	 }
	        }
}
