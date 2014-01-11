package Tree;

public class BiSearchTree {
	       
	      TreeNode root;
	      private int count;
	      
	      final static int LH=1;
	      final static int EH=0;
	      final static int RH=-1;
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
	      public boolean find(int value)//非递归实现排序二叉树的查找
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
	    	    		 else
	    	    		 {
	    	    			 return(temp);
	    	    		}
	    	    		 
	    	    	 }
	    	    	 if(p==null)
	    	    	 {
	    	    		 temp=false;
	    	    	 }else
	    	    	 {
	    	    		 temp=true;
	    	    	 }
	    	    }
	    	    return (temp);
	      }
	     
	      public void  insert(TreeNode ptr,int item)//二叉排序树的建立和插入算法
	      {
	    	  if(item<ptr.getItem())
	    	  {
	    		  if(ptr.lchild==null)
	    		  {
	    			    TreeNode p=new TreeNode(item);
	    			    ptr.lchild=p;
	    			    p.parent=ptr;
	    			    count++;
	    	      }else
	    		  {
	    		       insert(ptr.lchild,item);
	    		  }
	    	  }
	    	  else{
	    		   if(ptr.rchild==null)
	    		   {
	    			    TreeNode p=new TreeNode(item);
	    			    ptr.rchild=p;
	    			    p.parent=ptr;
	    			    count++;
	    		   }else{
	    			  insert(ptr.rchild,item);
	    		   }
	    	  }
	    	  
	      }
	      public void inTravel(TreeNode q)//注：只有中序遍历排序二叉树的时候才有排序的效果
	      {
	    	     if(q!=null)
	    	   {
	    	    	 inTravel(q.lchild);
	    	    	 if(q.parent!=null)
	    	      {
	    	    	 System.out.print("父母节点的数据"+q.parent.getItem()+"\t");
	    	      }else{
	    	          System.out.print("此节点为该二叉树的根节点"+"\t");  	 
	    	         }
	    	    	 System.out.println("此节点数据"+q.item+"->");
	    	    	 inTravel(q.rchild);
	    	    }
	    	    return;
	      }
	      public void preTravel(TreeNode p)//先序遍历,没有意义,仅在排序二叉树仅有右子树的时候很神奇
	      {
	    	   if(p!=null)
	    	   {
	    		   System.out.print(p.item+"->");
	    		   preTravel(p.lchild);
	    		   preTravel(p.rchild);
	    	   }
	    	   return;
	      }
	      public void postTravel(TreeNode p)//先序遍历,没有意义,仅在排序二叉树仅有右子树的时候很神奇，为DESC排序
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
	    	     System.out.println("二叉排序树的中序遍历结果");
	    	     TreeNode p=this.root;
	    	     if(p!=null)
	    	     {
	    	    	  this.inTravel(p);
	    	     }
	      }
	      public boolean find(int item,TreeNode p)//递归实现排序二叉树的查找
	      {
	    	      if(p!=null)
	    	      {
	    	    	   if(p.getItem()<item)
	    	    	   {
	    	    		   return(find(item,p.rchild));
	    	    	   }else if(p.getItem()>item)
	    	    	   {
	    	    		   return(find(item,p.lchild));
	    	    	   }else
	    	    	   {
	    	    		   return true;
	    	    	   }
	    	      }
	    	     return false;
	      }
          
	      public int getCount()
	      {
	    	  return(this.count);
	      }
	      public void delete(TreeNode ptr,int item)//二叉排序树的删除节点算法
	      {
	    	  if(ptr!=null)//ptr为当前可能会被删除的节点的指针
	    	  {
	    		   if(item<ptr.getItem())
	    		   {
	    			   delete(ptr.lchild,item);
	    		   }else if(item>ptr.getItem())
	    		   {
	    			   delete(ptr.rchild,item);
	    		   }else if(ptr.lchild!=null&&ptr.rchild!=null)//左子树或者右子树均存在的情况
	    		   {
	    			      TreeNode pre=ptr.rchild;
	    			      while(pre.lchild!=null)
	    			      {
	    			    	  pre=pre.lchild;//走左子树路线，找到最小的值，即后继
	    			      }
	    			      ptr.item=pre.getItem();//赋值
	    			      delete(ptr.rchild,pre.getItem());//再次递归，主要目的是解决需要移动的节点的问题
	    		   }
	    		   else
	    		   {
	    			    if(ptr.rchild==null&&ptr.lchild!=null)//仅有左子树的情况
	    			    {
	    			    	    ptr.parent.lchild=ptr.lchild;
	    			    	    ptr.lchild.parent=ptr.parent;
	    			    }
	    			    else if(ptr.rchild!=null&&ptr.lchild==null)//仅有右子树的情况
	    			    {
	    			    	  ptr.parent.rchild=ptr.rchild;//类似与双链表的删除
	    			    	  ptr.rchild.parent=ptr.parent;
	    			    }
	    			    else//叶子节点的删除
	    			    {
	    			    	TreeNode temp=ptr.parent;
	    			    	if(temp.lchild==ptr)
	    			    	{
	    			    		 temp.lchild=null;
	    			    	}else
	    			    	{
	    			    		temp.rchild=null;
	    			    	}
	    			    }
	    		   }
	    	  }else
	    	  {
	    		    System.out.println("the node can't find");
	    	  }
	      }
	      public int getHigh(TreeNode p)
	      {
	    	    int m,n;
	    	    if(p==null)
	    	    {
	    	    	return 0;
	    	    }else{
	    	      m=getHigh(p.lchild);
	    	      n=getHigh(p.rchild);
	    	      return(m>n?m:n)+1;
	    	    }
	      }
	      public int getLHigh(TreeNode p)
	      {
	    	    return(this.getHigh(p.lchild));
	      }
	      public int getRHigh(TreeNode p)
	      {
	    	  return(this.getHigh(p.rchild));
	      }
	      public int getSubHigh(TreeNode p)
	      {
	    	   int sub=this.getLHigh(p)-this.getRHigh(p);
	    	   return(sub);
	      }
	      /*以下是平衡二叉树的算法*/
	      public void RR_rotate(TreeNode p)//RR旋转算法
	      {
	    	    TreeNode lp;
	    	    lp=p.lchild;//找到失衡节点的左儿子
	    	    p.lchild=lp.rchild;//将左儿子的右子树作为失衡节点的左子树
	    	    lp.rchild=p;//将左儿子作为子树的根节点
	    	    if(p.parent==null)//判定是否为该子树的根
	    	    {
	    	    	this.root=lp;
	    	    	p.parent=lp;
	    	    	lp.parent=null;
	    	    }else{//做与上面节点的连接连接
	    	    	lp.parent=p.parent;
	    	    	p.parent=lp;
                    if(lp.parent.bf>0)
                    {
                    	lp.parent.lchild=lp;
                    }else{
                    	lp.parent.rchild=lp;
                    }
	    	    }
	      }
	      public void LL_rotate(TreeNode p)//LL旋转算法
	      {
	    	    TreeNode rp;
	    	    rp=p.rchild;//将失衡节点的右儿子赋值
	    	    p.rchild=rp.lchild;//将右儿子的左子树作为失衡节点的右边子树
	    	    rp.lchild=p;//将右儿子的作为子树的根节点
	    	    if(p.parent==null)//判定是否为根节点
	    	    {
	    	    	 this.root=rp;
	    	    	 p.parent=rp;
	    	    	 rp.parent=null;
	    	    }else{
	    	    	rp.parent=p.parent;
                    p.parent=rp;
                    if(rp.parent.bf>0)
                    {
                    	rp.parent.lchild=rp;
                    }else {
                    	rp.parent.rchild=rp;
                    }
                }
	      }
	      public void LR_rotate(TreeNode p)//LR旋转算法
	      {
	    	     TreeNode lp;
	    	     TreeNode grandrp;
	    	     lp=p.lchild;//失衡节点的左儿子赋值
	    	     grandrp=p.lchild.rchild;//孙子节点为失衡节点左儿子的右儿子
	    	     /**/
	    	     lp.rchild=grandrp.lchild;//对左儿子进行LL算法
	    	     grandrp.lchild=lp;
	    	     lp.parent=grandrp;
	    	     grandrp.parent=p;
	    	     /**/
	    	     p.lchild=grandrp;//对孙子节点做RR算法
	    	     p.lchild=grandrp.rchild;
	    	     grandrp.rchild=p;
	    	     /**/
	    	     if(p.parent==null)//判定是否为根节点
	    	     {
	    	    	 this.root=grandrp;
	    	    	 p.parent=grandrp;
	    	    	 grandrp.parent=null;
	    	     }else{//若不是根节点的话，需要判定与旋转后的子树与之前的parent节点的关系
	    	    	 grandrp.parent=p.parent;
	    	    	 p.parent=grandrp;
	    	    	 if(grandrp.parent.bf>0)
	    	    	 {
	    	    		 grandrp.parent.lchild=grandrp;
	    	    	 }else{
	    	    		 grandrp.parent.rchild=grandrp;
	    	    	 }
	    	     } 
	      }
	      public void RL_rotate(TreeNode p)//RL旋转算法
	      {
	    	     TreeNode rp;
	    	     TreeNode grandlp;
	    	     rp=p.rchild;//右儿子节点的复制
	    	     grandlp=p.rchild.lchild;//孙子节点是失衡节点的右儿子的左儿子
	    	     /**/
	    	     rp.lchild=grandlp.rchild;//对孙子节点做RR算法
	    	     grandlp.rchild=rp;
	    	     rp.parent=grandlp;
	    	     grandlp.parent=p;
	    	     /**/
	    	     p.rchild=grandlp;//对孙子节点做LL算法
	    	     p.rchild=grandlp.lchild;
	    	     grandlp.lchild=p;
	    	     if(p.parent==null)//判定是否为根节点
	    	     {
	    	    	 this.root=grandlp;
	    	    	 grandlp.parent=null;
	    	    	 p.parent=grandlp;
	    	     }else{
	    	    	 grandlp.parent=p.parent;
	    	         p.parent=grandlp;
	    	         if(grandlp.parent.bf>0)
	    	         {
	    	        	 grandlp.parent.lchild=grandlp;
	    	         }else {
	    	        	 grandlp.parent.rchild=grandlp;
	    	         }
	    	     }
	      }
	      public void getBf(TreeNode p)//复杂度为O(N2)
	      {
	    	     if(p!=null)
	    	     {
	    	    	  p.bf=this.getSubHigh(p);
	    	    	  getBf(p.lchild);
	    	    	  getBf(p.rchild);
	    	     }
	    	     return;
	      }
	      public void checkBf(TreeNode p)//检查平衡度
	      {
	    	    if(p!=null)
	    	    {
	    	       if(p.bf==2)//这个节点的左子树不平衡
	    	       {
	    	    	 	if(p.lchild.bf==-1)//呈现"<"这种不平衡,使用LR旋转算法
	    	    	   {
	    	    		   this.LR_rotate(p);
	    	    	   }else if(p.lchild.bf==1)//呈现"/"这种不平衡，使用RR旋转算法
	    	    	   {
	    	    		   this.RR_rotate(p);
	    	    	   }else {
	    	    		   checkBf(p.lchild);//可能下面的节点的也不平衡，即该节点不是失衡节点
	    	    	   }
	    	    	 
	    	       }
	    	       else if(p.bf==-2)//这个的节点的右子树不平衡
	    	       {
	    	    	   if(p.rchild.bf==1)//这种呈现">"不平衡,使用RL旋转算法
	    	    	  {
	    	    		   this.RL_rotate(p);
	    	    	   }else if(p.rchild.bf==-1)//呈现"\"这种不平衡,用LL旋转算法
	    	    	   {
	    	    		   this.LL_rotate(p);
	    	    	   }else {
	    	    		   checkBf(p.rchild);//该节点下还有不平衡节点，即该节点不是失衡节点
	    	    	   }
	    	    	 
	    	       }
	    	       else{
	    	    	    checkBf(p.lchild);
	    	    	    checkBf(p.rchild);
	    	       }
	    	    }
	    	    return;
	      }
	      public void BalanceTree(int item)
	      {
	    	  this.insert(this.root, item);
	    	  /*进行一次插入操作后判定节点的平衡度*/
	    	  this.getBf(this.root);
	    	  this.checkBf(this.root);
	    	  
	      }
	      public void showBf(TreeNode p)
	      {
	    	     if(p!=null)
	    	     {
	    	    	 System.out.println(p.getItem()+""+p.bf);
	    	    	 showBf(p.lchild);
	    	    	 showBf(p.rchild);
	    	     }
	    	     return;
	      }
	      public int BiTreeLeaf(TreeNode p)
	      {
	    	   if(p==null)
	    	   {
	    		   return 0;
	    	   }
	    	   if(p.rchild==null&&p.lchild==null)
	    	   {
	    		   return 1;
	    	   }
	    	   return (BiTreeLeaf(p.lchild)+BiTreeLeaf(p.rchild));
	      }
	     
}
