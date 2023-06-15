import static java.lang.System.*;
import java.util.Scanner;
public class Tree {
    private TreeNode tree;
    public Tree() {
        tree = null;
    }
    public void CreateTree()
    {
        Scanner input=new Scanner(in);
        out.println("请输入根节点（输入#为空）:");
        char data=input.next().charAt(0);
        if(data!='#')
        {
            this.tree=new TreeNode(data,null,null);
            out.println("请输入左节点（#为空）：");
            data=input.next().charAt(0);
            CreateTreeHelp(new TempTreeNode(this.tree.leftchild),data);
            out.println("请输入右节点（#为空）：");
            data=input.next().charAt(0);
            CreateTreeHelp(new TempTreeNode(this.tree.rightchild),data);
        }
    }
    private void CreateTreeHelp(TempTreeNode root,char data)
    {
        if(data!='#') {
            root.node = new TreeNode(data, null, null);
            Scanner input = new Scanner(in);
            out.println("请输入节点（#为空）：");
        }
    }
    public static void main(String args[])
    {

    }
}
class TreeNode
{
    public char data;
    public TreeNode leftchild;
    public TreeNode rightchild;
    public TreeNode(char data,TreeNode leftchild,TreeNode rightchild)
    {
        this.data=data;
        this.leftchild=leftchild;
        this.rightchild=rightchild;
    }
    public TreeNode()
    {
        this.data=0;
        this.rightchild=null;
        this.leftchild=null;
    }
}
class TempTreeNode
{
    public TreeNode node;
    public TempTreeNode(TreeNode node)
    {
        this.node=node;
    }
}


