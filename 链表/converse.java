 public void converse()
	        {
	        	OneLineNode p=this.head;
	        	OneLineNode q;
	        	OneLineNode pre=this.head;
	        	boolean first=true;
	        	while(p!=null)
	        	{
	                 if(first){
	                	  q=p;
	                	  p=p.next;
	                	  q.next=null;
	                	  pre=q;
	                	  first=false;
	                	  continue;
	                 }else{
	                	   q=p;
	                	   p=p.next;
	                	   q.next=pre;
	                	   pre=q;
	                	   first=false;
	                 }
	            }
	        	this.head=pre;
	        }