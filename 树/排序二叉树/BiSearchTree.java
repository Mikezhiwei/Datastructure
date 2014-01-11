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
	     
	      public void  insert(TreeNode ptr,int item)//�����������Ľ����Ͳ����㷨
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
	      public void inTravel(TreeNode q)//ע��ֻ��������������������ʱ����������Ч��
	      {
	    	     if(q!=null)
	    	   {
	    	    	 inTravel(q.lchild);
	    	    	 if(q.parent!=null)
	    	      {
	    	    	 System.out.print("��ĸ�ڵ������"+q.parent.getItem()+"\t");
	    	      }else{
	    	          System.out.print("�˽ڵ�Ϊ�ö������ĸ��ڵ�"+"\t");  	 
	    	         }
	    	    	 System.out.println("�˽ڵ�����"+q.item+"->");
	    	    	 inTravel(q.rchild);
	    	    }
	    	    return;
	      }
	      public void preTravel(TreeNode p)//�������,û������,�������������������������ʱ�������
	      {
	    	   if(p!=null)
	    	   {
	    		   System.out.print(p.item+"->");
	    		   preTravel(p.lchild);
	    		   preTravel(p.rchild);
	    	   }
	    	   return;
	      }
	      public void postTravel(TreeNode p)//�������,û������,�������������������������ʱ������棬ΪDESC����
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
	    	     System.out.println("����������������������");
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
	      public void delete(TreeNode ptr,int item)//������������ɾ���ڵ��㷨
	      {
	    	  if(ptr!=null)//ptrΪ��ǰ���ܻᱻɾ���Ľڵ��ָ��
	    	  {
	    		   if(item<ptr.getItem())
	    		   {
	    			   delete(ptr.lchild,item);
	    		   }else if(item>ptr.getItem())
	    		   {
	    			   delete(ptr.rchild,item);
	    		   }else if(ptr.lchild!=null&&ptr.rchild!=null)//���������������������ڵ����
	    		   {
	    			      TreeNode pre=ptr.rchild;
	    			      while(pre.lchild!=null)
	    			      {
	    			    	  pre=pre.lchild;//��������·�ߣ��ҵ���С��ֵ�������
	    			      }
	    			      ptr.item=pre.getItem();//��ֵ
	    			      delete(ptr.rchild,pre.getItem());//�ٴεݹ飬��ҪĿ���ǽ����Ҫ�ƶ��Ľڵ������
	    		   }
	    		   else
	    		   {
	    			    if(ptr.rchild==null&&ptr.lchild!=null)//���������������
	    			    {
	    			    	    ptr.parent.lchild=ptr.lchild;
	    			    	    ptr.lchild.parent=ptr.parent;
	    			    }
	    			    else if(ptr.rchild!=null&&ptr.lchild==null)//���������������
	    			    {
	    			    	  ptr.parent.rchild=ptr.rchild;//������˫�����ɾ��
	    			    	  ptr.rchild.parent=ptr.parent;
	    			    }
	    			    else//Ҷ�ӽڵ��ɾ��
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
	      /*������ƽ����������㷨*/
	      public void RR_rotate(TreeNode p)//RR��ת�㷨
	      {
	    	    TreeNode lp;
	    	    lp=p.lchild;//�ҵ�ʧ��ڵ�������
	    	    p.lchild=lp.rchild;//������ӵ���������Ϊʧ��ڵ��������
	    	    lp.rchild=p;//���������Ϊ�����ĸ��ڵ�
	    	    if(p.parent==null)//�ж��Ƿ�Ϊ�������ĸ�
	    	    {
	    	    	this.root=lp;
	    	    	p.parent=lp;
	    	    	lp.parent=null;
	    	    }else{//��������ڵ����������
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
	      public void LL_rotate(TreeNode p)//LL��ת�㷨
	      {
	    	    TreeNode rp;
	    	    rp=p.rchild;//��ʧ��ڵ���Ҷ��Ӹ�ֵ
	    	    p.rchild=rp.lchild;//���Ҷ��ӵ���������Ϊʧ��ڵ���ұ�����
	    	    rp.lchild=p;//���Ҷ��ӵ���Ϊ�����ĸ��ڵ�
	    	    if(p.parent==null)//�ж��Ƿ�Ϊ���ڵ�
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
	      public void LR_rotate(TreeNode p)//LR��ת�㷨
	      {
	    	     TreeNode lp;
	    	     TreeNode grandrp;
	    	     lp=p.lchild;//ʧ��ڵ������Ӹ�ֵ
	    	     grandrp=p.lchild.rchild;//���ӽڵ�Ϊʧ��ڵ�����ӵ��Ҷ���
	    	     /**/
	    	     lp.rchild=grandrp.lchild;//������ӽ���LL�㷨
	    	     grandrp.lchild=lp;
	    	     lp.parent=grandrp;
	    	     grandrp.parent=p;
	    	     /**/
	    	     p.lchild=grandrp;//�����ӽڵ���RR�㷨
	    	     p.lchild=grandrp.rchild;
	    	     grandrp.rchild=p;
	    	     /**/
	    	     if(p.parent==null)//�ж��Ƿ�Ϊ���ڵ�
	    	     {
	    	    	 this.root=grandrp;
	    	    	 p.parent=grandrp;
	    	    	 grandrp.parent=null;
	    	     }else{//�����Ǹ��ڵ�Ļ�����Ҫ�ж�����ת���������֮ǰ��parent�ڵ�Ĺ�ϵ
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
	      public void RL_rotate(TreeNode p)//RL��ת�㷨
	      {
	    	     TreeNode rp;
	    	     TreeNode grandlp;
	    	     rp=p.rchild;//�Ҷ��ӽڵ�ĸ���
	    	     grandlp=p.rchild.lchild;//���ӽڵ���ʧ��ڵ���Ҷ��ӵ������
	    	     /**/
	    	     rp.lchild=grandlp.rchild;//�����ӽڵ���RR�㷨
	    	     grandlp.rchild=rp;
	    	     rp.parent=grandlp;
	    	     grandlp.parent=p;
	    	     /**/
	    	     p.rchild=grandlp;//�����ӽڵ���LL�㷨
	    	     p.rchild=grandlp.lchild;
	    	     grandlp.lchild=p;
	    	     if(p.parent==null)//�ж��Ƿ�Ϊ���ڵ�
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
	      public void getBf(TreeNode p)//���Ӷ�ΪO(N2)
	      {
	    	     if(p!=null)
	    	     {
	    	    	  p.bf=this.getSubHigh(p);
	    	    	  getBf(p.lchild);
	    	    	  getBf(p.rchild);
	    	     }
	    	     return;
	      }
	      public void checkBf(TreeNode p)//���ƽ���
	      {
	    	    if(p!=null)
	    	    {
	    	       if(p.bf==2)//����ڵ����������ƽ��
	    	       {
	    	    	 	if(p.lchild.bf==-1)//����"<"���ֲ�ƽ��,ʹ��LR��ת�㷨
	    	    	   {
	    	    		   this.LR_rotate(p);
	    	    	   }else if(p.lchild.bf==1)//����"/"���ֲ�ƽ�⣬ʹ��RR��ת�㷨
	    	    	   {
	    	    		   this.RR_rotate(p);
	    	    	   }else {
	    	    		   checkBf(p.lchild);//��������Ľڵ��Ҳ��ƽ�⣬���ýڵ㲻��ʧ��ڵ�
	    	    	   }
	    	    	 
	    	       }
	    	       else if(p.bf==-2)//����Ľڵ����������ƽ��
	    	       {
	    	    	   if(p.rchild.bf==1)//���ֳ���">"��ƽ��,ʹ��RL��ת�㷨
	    	    	  {
	    	    		   this.RL_rotate(p);
	    	    	   }else if(p.rchild.bf==-1)//����"\"���ֲ�ƽ��,��LL��ת�㷨
	    	    	   {
	    	    		   this.LL_rotate(p);
	    	    	   }else {
	    	    		   checkBf(p.rchild);//�ýڵ��»��в�ƽ��ڵ㣬���ýڵ㲻��ʧ��ڵ�
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
	    	  /*����һ�β���������ж��ڵ��ƽ���*/
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
