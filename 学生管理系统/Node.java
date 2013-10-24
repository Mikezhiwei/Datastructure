package studennode;

public class Node {
	       String name;
	       String num;
	       Subject grades=new Subject();
	       Node next;
	       
	       public  Node (String name,String num)
	       {
	    	     this.name=name;
	    	     this.num=num;
	    	     this.next=null;
	       }
	       public  void  buildgrades(int c,int cd,int j,int ds)
	       {
	    	      this.grades.cgrade=c;
	    	      this.grades.cdoubleaddgrade=cd;
	    	      this.grades.javagrade=j;
	    	      this.grades.datastrugrade=ds;
	       }

}
