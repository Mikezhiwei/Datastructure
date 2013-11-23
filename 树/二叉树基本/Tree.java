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
	         /* һ�����ַ������ǵݹ鶨���,����Դ�ڶ������ĵݹ鶨��*/
	         public void preorder(TreeNode p)
	         {
	        	    if(p!=null)
	        	    {
	        	    	System.out.print(p.data);//�ȷ��ʸ��ڵ�
	        	    	preorder(p.lchild);//����ڵ�·��
	        	    	preorder(p.rchild);//���ҽڵ�·��
	        	    }
	        	    return ;
	         }
	         
	         public void inorder(TreeNode p)
	         {
	        	   if(p!=null)//�ݹ����������
	        	   {
	        		   inorder(p.lchild);//������ڵ��·��
	        		   System.out.print(p.data);//�ٷ����м�ڵ��
	        		   inorder(p.rchild);//�����ݵ�ʱ�����ұ߽ڵ��·��
	        	   }
	        	   return ;
	         }
	         
	         public void postorder(TreeNode p)
	         {
	        	   if(p!=null)
	        	   {
	        		     postorder(p.lchild);//������߽ڵ��·��
	        		     postorder(p.rchild);//����ʱ�����ұ߽ڵ��·��
	        		     System.out.print(p.data);//�����ʸ��ڵ�
	        	   }
	        	   return ;
	         }
	         
	         public  void preTraval()
	         {
	        	  System.out.println("�ȸ�����");
	        	  if(this.root!=null)
	        	  {
	        		  this.preorder(root);
	        	  }
	        	  System.out.println();
	         }
	         public void inTravel()
	         {
	        	 System.out.println("�и�����");
	        	 if(this.root!=null)
	        	 {
	        		 this.inorder(root);
	        	 }
	        	 System.out.println();
	         }
	         public void postTravel()
	         {
	        	 System.out.println("�������");
	        	 if(this.root!=null)
	        	 {
	        		 this.postorder(root);
	        	 }
	        	 System.out.println();
	         }
	         
	         public TreeNode enter(String prestr,String instr)//���������������㷨(�������ֵ��
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
	        		  insub=instr.substring(0, k);//java��string���еĽ�ȡ�ַ���,�Ӵ�λ�ÿ�ʼ����ȡk���ַ�
	        		  p.lchild=enter(presub,insub);//�ݹ����
	        		  presub=prestr.substring(k+1,n);
	        		  insub=instr.substring(k+1, n);
	        		  p.rchild=enter(presub,insub);//�ݹ����
	        	  }
	        	  return p;
	         }
	         
	         public void layerTravel()//��α����㷨
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
	         public void unnormalTravel()//����ǵݹ�ʵ�ֶ������ķ���
	         {
	        	    Stack treestack=new Stack(100);
	        	    TreeNode p=this.root;
	        	    System.out.println("����ǵݹ���ʶ�����");
	        	    if(p==null){return;}
	        	    while(!(p==null&&treestack.pos==-1))
	        	    {
	        	    	while(p!=null)
	        	    	{
	        	    		if(treestack.pos<99){
	        	    			treestack.push(p);
	        	    		}else{
	        	    			System.out.println("ջ��");
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
