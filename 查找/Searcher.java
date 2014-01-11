package Search;
import java.util.Scanner;
class Searcher {
                public  int array[];
	            private int length;
	           public Searcher(int n)
	           {
	        	   this.length=n;
	        	   this.array=new int [n];
	           }
	           public void intputArray()
	           {
	        	   for(int i=1;i<this.length;i++)
	        	   {
	        		   System.out.println("please input the number of array");
	        	         this.array[i]=new Scanner(System.in).nextInt(); 
	        	   }
	        	   array[0]=0;
	           }
	           
	           public int  seqsearch(int array[],int key)
	           {
	        	   this.array[0]=key;
	        	   int pos=array.length-1;
	        	   while(array[pos]!=key)
	        	   {
	        		     pos--;
	        	   }
	        	   return(pos);
	           }
	           public int BinarySearch(int array[],int key)
	           {
	        	    array[0]=key;
	        	    int pos=0;
	        	    int low=1;
	        	    int high=array.length-1;
	        	    while(low<=high)
	        	    {
	        	    	int mid=(low+high)/2;
	        	    	if(array[mid]==key)
	        	    	{
	        	    		pos=mid;
	        	    		return(pos);
	        	    	}else if(array[mid]>key)
	        	    	{
	        	    		 high=mid-1;
	        	    	}else{
	        	    		low=mid+1;
	        	    	}
	        	    }
	        	    return (pos);
	           }
	           public int BinarySearch(int array[],int key,int low,int high)//递归使用二分查找算法
	           {
	        	    if(low<=high)
	        	    {
	        	    	  int mid=(low+high)/2;
	        	    	  if(array[mid]==key)
	        	    	  {
	        	    		  return(mid);
	        	    	  }else if(array[mid]<key)
	        	    	  {
	        	    		 return(BinarySearch(array,key,mid+1,high));
	        	    	  }else{
	        	    		 return(BinarySearch(array,key,low,mid-1));
	        	    	  }
	        	    }
	        	    return(0);
	           }
	           
}
