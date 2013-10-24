package studennode;

import java.util.Scanner;

public class TestDemo {
	          public  Link stulink=new Link();
	          public  boolean  first=true;
	          static int  choose;
	          public  static void main(String [] agrs)
	          {    
	        	   new TestDemo();
	          }
	          public   void  lookstudentinfo()
	          {      
	        	     Node p=this.stulink.head;
	        	     this.stulink.observe(p);
	          }
	          public  void   firstinput(int n)
	          {
	        	       this.stulink.fisrtaddstudent(n);
	          }
	          public  void  inputstu(int n)
	          {
	        	    this.stulink.addstudent(n);
	          }
	          public void inputgrade()
	          {
	        	     this.stulink.inputgrade();
	          }
	          public void move(String str)
	          {
	        	      this.stulink.remove(str);
	          }
	          public void lookgrade()
	          {
	        	     this.stulink.lookgrade();
	          }
	          public   TestDemo()
	          {
	        	  while(true){
	        	    System.out.println("学生管理系统");
	        	    System.out.println("使用说明");
	        	    System.out.println("请严格按照提示语句进行");
	        	    System.out.println("1代表查看学生的信息" );
	        	    System.out.println("2代表查看学生的成绩");
	        	    System.out.println("3代表输入学生信息");
	        	    System.out.println("4代表输入学生成绩");
	        	    System.out.println("5代表删除学生信息");
	        	    System.out.println("6代表退出");
	        	    choose=new Scanner(System.in).nextInt();
	        	    switch(choose)
	        	    {
	        	      case 1:
	        	    	   this.lookstudentinfo();
	        	    	   break;
	        	      case 2:
	        	    	  this.lookgrade();
	        	    	  break;
	        	      case 3:
	        	    	   System.out.println("请输入想要输入的学生数目");
	        	    	   int count=new Scanner(System.in).nextInt();
	        	    	   if(this.first)
	        	    	   {      
	        	    		     this.first=false;
	        	    		     this.firstinput(count);
	        	    	   }
	        	    	   else{
	        	    		      this.inputstu(count);
	        	    	   }  
	        	    	   break;
	        	      case 4:
	        	    	   this.inputgrade();
	        	    	   break;
	        	      case 5:
	        	    	   System.out.println("请输入删除学生的姓名");
	        	    	   String s=new Scanner(System.in).nextLine();
	        	    	   this.move(s);
	        	    	   break;
	        	      case 6:
	        	    	    System.out.println("谢谢使用");
	        	    	    return ;
	        	     }
	        	  }
	          }

}
