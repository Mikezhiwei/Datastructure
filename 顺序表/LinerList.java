package Table;

public class LinerList {
	        public  int table[];
	        public int n;
           
	        public void  setuplist(int n,LinerList list)
	        {      
	        	   this.n=n;
	        	   list.table=new int [n];
	        }
	        public boolean isempty(LinerList list)
	        {
	        	  return (list.n==0);
	        }
	        public boolean  isfull(LinerList list)
	        {
	        	  return (list.table[n-1]!=0);
	        }
	        public int listlength(LinerList list)
	        {
	        	  return (list.table.length);
	        }
	        public  int  getelem(LinerList list,int i)//取出表中的值
	        {     
	        	  int  temp;
	        	  if(i>0&&i<=n)
	        	  {
	        		   temp=list.table[i-1];
	        	  }
	        	  else
	        	  {
	        		   return (-1);
	        	  }
	        	  return (temp);
	        }
	        public void setelem(LinerList list,int i,int k)//设置表中个值
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
	        public boolean search(int k,LinerList list)//查找值
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
	        public void insert(int k,int i,LinerList list)//插入值
	        {      
	        	   int j;
	        	   if(!list.isfull(list))
	        	   {
	        		    if(i<=n&&i>0)
	        		    {
	        		       for(j=n-1;j>=i;j--)
	        		       {
	        		    	      list.table[j]=list.table[j-1];
	        		       }
	        		       table[i-1]=k;
	        		    }
	        		    
	        	   }
	        	   else {
	        		   System.out.println("表已满，无法存放");
	        	   }
	        }
	        
	        public void delete(int k,LinerList list)//删除值
	        {
	        	   int i=list.indexof(k, list);
	        	   int j;
	        	   if(i!=-1){
	        		     for(j=i+1;j<=n-1;j++)
	        		     {
	        		    	   list.table[j-1]=list.table[j];
	        		     }
	        		     list.table[j-1]=0;
	        	   }
	        	   else {
	        		   System.out.println(k+"的值未能找到");
	        	   }
	        		   
	        }
}
