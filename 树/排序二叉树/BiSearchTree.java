package Tree;

public class BiSearchTree {
	       
	      TreeNode root;
	      private int count;
	      
	      public  BiSearchTree()
	      {
	    	  this.count=0;
	    	  this.root=null;
	      }
	      public BiSearchTree(int first)
	      {
	    	  this.root=new TreeNode(first);
	    	  this.count=1;
	      }
	      public TreeNode getTreeNoderoot()
	      {
	    	  return(this.root);
	      }
	      public boolean find(int value)//�ǵݹ�ʵ������������Ĳ���
	      {
	    	    boolean temp=true;
	    	    if(this.root!=null)
	    	    {
	    	    	 TreeNode p=this.root;
	    	    	 while(p!=null)
	    	    	 {
	    	    		 if(p.getItem()<value)
	    	    		 {
	    	    			  p=p.rchild;
	    	    		 }
	    	    		 else if(p.getItem()>value)
	    	    		 {
	    	    			   p=p.lchild;
	    	    		 }
	    	    		 else{
	    	    			 return(temp);
	    	    		}
	    	    		 
	    	    	 }
	    	    	 if(p==null)
	    	    	 {
	    	    		 temp=false;
	    	    	 }else{
	    	    		 temp=true;
	    	    	 }
	    	    }
	    	    return (temp);
	      }
	      public void  insert(TreeNode ptr,int item)//�����������Ľ���
	      {
	    	  if(item<ptr.getItem())
	    	  {
	    		  if(ptr.lchild==null)
	    		  {
	    			    TreeNode p=new TreeNode(item);
	    			    ptr.lchild=p;
	    			    count++;
	    			    
	    		  }else{
	    		       insert(ptr.lchild,item);
	    		  }
	    	  }
	    	  else{
	    		   if(ptr.rchild==null)
	    		   {
	    			    TreeNode p=new TreeNode(item);
	    			    ptr.rchild=p;
	    			    count++;
	    		   }else{
	    			  insert(ptr.rchild,item);
	    		   }
	    	  }
	    	  
	      }
	      public void inTravel(TreeNode q)//ע��ֻ��������������������ʱ����������Ч��
	      {
	    	    if(q!=null)
	    	    {
	    	    	 inTravel(q.lchild);
	    	    	 System.out.println(q.item);
	    	    	 inTravel(q.rchild);
	    	    }
	    	    return;
	      }
	      public void preTravel(TreeNode p)//�������,û������,�������������������������ʱ�������
	      {
	    	   if(p!=null)
	    	   {
	    		   System.out.println(p.item);
	    		   preTravel(p.lchild);
	    		   preTravel(p.rchild);
	    	   }
	    	   return;
	      }
	      public void postTravel(TreeNode p)//�������������������������ʱ������棬ΪDESC����
	      {
	    	  if(p!=null)
	    	  {
	    		    postTravel(p.lchild);
	    		    postTravel(p.rchild);
	    		    System.out.println(p.item);
	    	  }
	      }
	      public void inTravelShow()
	      {
	    	     TreeNode p=this.root;
	    	     if(p!=null)
	    	     {
	    	    	  this.inTravel(p);
	    	     }
	      }
	      public boolean find(int item,TreeNode p)//�ݹ�ʵ������������Ĳ���
	      {
	    	      if(p!=null)
	    	      {
	    	    	   if(p.getItem()<item)
	    	    	   {
	    	    		   return(find(item,p.rchild));
	    	    	   }else if(p.getItem()>item){
	    	    		   return(find(item,p.lchild));
	    	    	   }else{
	    	    		   return true;
	    	    	   }
	    	      }
	    	     return false;
	      }
          
	      public int getCount()
	      {
	    	  return(this.count);
	      }
}
