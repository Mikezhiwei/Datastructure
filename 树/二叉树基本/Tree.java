package Tree;
import Stacks.Stack;
import Queue.Queue;
public class Tree {

	         public  TreeNode root;
	         
	         public Tree()
	         {
	        	 this.root=null;
	         }
	         public Tree(String prestr,String instr)
	         {
	        	 this.root=this.enter(prestr, instr);
	         }
	         /* 一下三种方法均是递归定义的,方法源于二叉树的递归定义*/
	         public void preorder(TreeNode p)
	         {
	        	    if(p!=null)
	        	    {
	        	    	System.out.print(p.data);//先访问根节点
	        	    	preorder(p.lchild);//走左节点路线
	        	    	preorder(p.rchild);//走右节点路线
	        	    }
	        	    return ;
	         }
	         
	         public void inorder(TreeNode p)
	         {
	        	   if(p!=null)//递归结束的条件
	        	   {
	        		   inorder(p.lchild);//先走左节点的路线
	        		   System.out.print(p.data);//再访问中间节点的
	        		   inorder(p.rchild);//最后回溯的时候走右边节点的路线
	        	   }
	        	   return ;
	         }
	         
	         public void postorder(TreeNode p)
	         {
	        	   if(p!=null)
	        	   {
	        		     postorder(p.lchild);//先走左边节点的路线
	        		     postorder(p.rchild);//回溯时候走右边节点的路线
	        		     System.out.print(p.data);//最后访问根节点
	        	   }
	        	   return ;
	         }
	         
	         public  void preTraval()
	         {
	        	  System.out.println("先根遍历");
	        	  if(this.root!=null)
	        	  {
	        		  this.preorder(root);
	        	  }
	        	  System.out.println();
	         }
	         public void inTravel()
	         {
	        	 System.out.println("中根遍历");
	        	 if(this.root!=null)
	        	 {
	        		 this.inorder(root);
	        	 }
	        	 System.out.println();
	         }
	         public void postTravel()
	         {
	        	 System.out.println("后根遍历");
	        	 if(this.root!=null)
	        	 {
	        		 this.postorder(root);
	        	 }
	        	 System.out.println();
	         }
	         
	         public TreeNode enter(String prestr,String instr)//中序建立二叉树的算法(返回类的值）
	         {  
	        	  TreeNode p=null;
	        	  int k,n;
	        	  String first,presub,insub;
	        	  n=prestr.length();
	        	  if(n>0)
	        	  {
	        		  System.out.println("prestr=\t"+prestr+"\t"+"instr=\t"+instr);
	        		  first=prestr.substring(0, 1);
	        		  p=new TreeNode(first);
	        		  k=instr.indexOf(first);
	        		  System.out.println("\t  first"+first+"\t k="+k );
	        		  presub=prestr.substring(1, k+1);
	        		  insub=instr.substring(0, k);//java的string类中的截取字符串,从此位置开始，截取k个字符
	        		  p.lchild=enter(presub,insub);//递归调用
	        		  presub=prestr.substring(k+1,n);
	        		  insub=instr.substring(k+1, n);
	        		  p.rchild=enter(presub,insub);//递归调用
	        	  }
	        	  return p;
	         }
	         
	         public void layerTravel()//层次遍历算法
	         {
	        	    TreeNode []TreeQueue=new TreeNode[100];
	        	    int front=-1,rear=-1;
	        	    TreeNode p=this.root;
	        	    if(p==null)
	        	    {
	        	    	return;
	        	    }
	        	    rear++;
	                TreeQueue[rear]=p;
	                while(rear!=front)
	                {
	                	 front++;
	                	 System.out.println(TreeQueue[front].data);
	                	 if(TreeQueue[front].lchild!=null)
	                	 {
	                		   rear=(rear+1)%100;
	                		   TreeQueue[rear]=TreeQueue[front].lchild;
	                	 }
	                	 if(TreeQueue[front].rchild!=null)
	                	 {
	                		    rear=(rear+1)%100;
	                		    TreeQueue[rear]=TreeQueue[front].rchild;
	                	 }
	                	 if((rear+1)%100==front)
	                	 {
	                		 System.out.println("Full");
	                		 return;
	                	 }
	                }
	        	 
	         }
	         public void unnormalTravel()//中序非递归实现二叉树的访问
	         {
	        	    Stack treestack=new Stack(100);
	        	    TreeNode p=this.root;
	        	    System.out.println("中序非递归访问二叉树");
	        	    if(p==null){return;}
	        	    while(!(p==null&&treestack.pos==-1))
	        	    {
	        	    	while(p!=null)
	        	    	{
	        	    		if(treestack.pos<99){
	        	    			treestack.push(p);
	        	    		}else{
	        	    			System.out.println("栈满");
	        	    			return;
	        	    		}
	        	    		p=p.lchild;
	        	    	}
	        	    	if(treestack.pos==-1){return;}
	        	    	else{
	        	    		 p=(TreeNode)treestack.pop();
	        	    		 System.out.println(p.data);
	        	    		 p=p.rchild;
	        	    	}
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
	        		  return((m>n?m:n)+1);
	        	  }
	         }
	         public int getLHigh(TreeNode p)
	         {
	        	  TreeNode lp=p.lchild;
	        	  return(this.getHigh(lp));
	         }
	         public int getRHigh(TreeNode p)
	         {
	        	 TreeNode rp=p.rchild;
	        	 return(this.getHigh(rp));
	         }
	         public int SubHigh(TreeNode p)
	         {
	        	  int sub=this.getLHigh(p)-this.getRHigh(p);
	        	  return(sub>0?sub:(-sub));
	         }
}
