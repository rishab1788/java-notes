/**
 * Created by Rishabh on 8/22/2017.
 */
public class TreeMain {
static  int c=1;
    // Root of BST
    Node root;

     TreeMain() {
        root = null;
    }
void insert(int key)
{
    root= insertRec(root,key);

}

    int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
    }
    }




Node insertRec(Node root,int item)
{
   if (root ==null){
 root = new Node(item);
       c++;
        return root;
  }

 if (c%2==0) {
     root.left = insertRec(root.left, item);
      }
 else {
     root.right = insertRec(root.right, item);

 }
  return  root;
 }


    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {

        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
         }

     }


    void preOrder()  {
        preOrderRec(root);
    }

    // A utility function to do preOrder traversal of BST
    void preOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.data);
   preOrderRec(root.left);
            preOrderRec(root.right);
        }

    }



    void postOrder()  {
        postOrderRec(root);
    }

    // A utility function to do postOrder traversal of BST
    void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.println(root.data);
         }

    }






    public  static  void main(String ... args)
    {
        TreeMain tree=new TreeMain();


        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        // print inorder traversal of the BST
        System.out.print("inorder");
        tree.inorder();
        System.out.print("preorder ");
        tree.preOrder();

        System.out.print("postorder ");
        tree.postOrder();

        System.out.print(tree.maxDepth(tree.root));
    }
}
