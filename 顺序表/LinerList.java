package Table;

public class LinerList {
	        public  int table[];
	        public int n;
           
	        public void  setuplist(int n,LinerList list)
	        {
	        	   list.table=new int [n];
	        }
	        public boolean isempty(LinerList list)
	        {
	        	  return (list.n==0);
	        }
	        public boolean  isfull(LinerList list)
	        {
	        	  return (list.n>=table.length);
	        }
	        public int listlength(LinerList list)
	        {
	        	  return (list.n);
	        }
	        public  int  getelem(LinerList list,int i)
	        {     
	        	  int  temp;
	        	  if(i>0&&i<=n)
	        	  {
	        		   temp=list.table[n-1];
	        	  }
	        	  else
	        	  {
	        		   return (-1);
	        	  }
	        	  return (temp);
	        }
	        public void setelem(LinerList list,int i,int k)
	        {
	        	  if(i>0&&i<=n)
	        	  {
	        		  list.table[n-1]=k;
	        		  if(i==n)
	        		  {
	        			  n++;
	        		  }
	        	  }
	        }
	        public boolean search(int k,LinerList list)
	        {
	        	  int j=list.indexof(k, list);
	        	  if(j!=-1)
	        	  {  
	        		  return true;
	        	  }
	        	  else	  
	        	  {  
	        		  return false;
	        	  }
	        }
	        public  int   indexof(int k,LinerList list)
	        {
	        	  int j=0;
	        	  int index=0;
	        	  while(j<n&&list.table[j]!=k)
	        	  {
	        		     j++;
	        	  }
	        	  if(j>=0&&j<n)
	        	  {
	        		     index=j;
	        	  }
	        	  else{
	        		    index=-1;
	        	  }
	        	  return (index);
	        }
	        public void insert(int k,int i,LinerList list)
	        {      
	        	   int j;
	        	   if(!list.isfull(list))
	        	   {
	        		    if(i<n&&i>0)
	        		    {
	        		    	
	        		    }
	        	   }
	        	   else {
	        		   System.out.println("表已满，无法存放");
	        	   }
	        }
}
