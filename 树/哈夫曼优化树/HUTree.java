package Tree;

public class HUTree {
                    
	        void  setHUtree(int []weight,Node []tree)
	        {
	        	  int n=weight.length;
	        	  int m1,m2,x1,x2;
	        	  int MaxValue=-1;
	        	  for(int i=0;i<2*n-1;i++)//严格二叉树,数组的长度必定为2n-1;
	        	  {
	        		    Node temp=new Node();
	        		    if(i<n)
	        		    {
	        		    	temp.weight=weight[i];
	        		    }
	        		    else
	        		    {
	        		    	 temp.weight=0;
	        		    }
	        		    temp.tag=0;
	        		    temp.parent=null;
	        		    temp.lchild=null;
	        		    temp.rchild=null;
	        		    tree[i]=temp;
	        	  }
	        	  for(int i=0;i<2*n-1;i++)
	        	  {
	        		     if(tree[i].weight>MaxValue)
	        		     {
	        		    	  MaxValue=tree[i].weight;
	        		     }
	        	  }
	        	  for(int i=0;i<n-1;i++)
	        	  {
	        		     m1=m2=MaxValue;
	        		     x1=x2=0;
	        		     for(int j=0;j<n+i;j++)
	        		     {
	        		    	  if(tree[j].weight<=m1&&tree[j].tag==0)
	        		    	  {
	        		    		    m2=m1;//有比当前还小的两个值时，将当前最小值的列为次小值
	        		    		    x2=x1;//将当前最小值的位置列为次小值的位置
	        		    		    m1=tree[j].weight;//记录下当前读到循环中最小值
	        		    		    x1=j;//记录下他的位置
	        		    	  }
	        		    	  else if(tree[j].weight<=m2&&tree[j].tag==0)
	        		    	  {
	        		    		    m2=tree[j].weight;//次小值
	        		    		    x2=j;//记录下当前次小值的位置
	        		    	  }
	        		     }
	        		     tree[x1].tag=1;
	        		     tree[x2].tag=1;
	        		     tree[x1].parent=tree[n+i];
	        		     tree[x2].parent=tree[n+i];
	        		     tree[n+i].weight=tree[x1].weight+tree[x2].weight;
	        		     tree[n+i].lchild=tree[x1];
	        		     tree[n+i].rchild=tree[x2];
	        		     if(tree[n+i].weight>MaxValue)
	        		     {
	        		    	    MaxValue=tree[n+i].weight;
	        		     }
	        	  }
	        	//  return (tree);
	        }
	        
	        
}
