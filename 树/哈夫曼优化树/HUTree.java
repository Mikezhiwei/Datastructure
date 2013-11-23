package Tree;

public class HUTree {
                    
	        void  setHUtree(int []weight,Node []tree)
	        {
	        	  int n=weight.length;
	        	  int m1,m2,x1,x2;
	        	  int MaxValue=-1;
	        	  for(int i=0;i<2*n-1;i++)//�ϸ������,����ĳ��ȱض�Ϊ2n-1;
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
	        		    		    m2=m1;//�бȵ�ǰ��С������ֵʱ������ǰ��Сֵ����Ϊ��Сֵ
	        		    		    x2=x1;//����ǰ��Сֵ��λ����Ϊ��Сֵ��λ��
	        		    		    m1=tree[j].weight;//��¼�µ�ǰ����ѭ������Сֵ
	        		    		    x1=j;//��¼������λ��
	        		    	  }
	        		    	  else if(tree[j].weight<=m2&&tree[j].tag==0)
	        		    	  {
	        		    		    m2=tree[j].weight;//��Сֵ
	        		    		    x2=j;//��¼�µ�ǰ��Сֵ��λ��
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
