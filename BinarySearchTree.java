// import java.util.LinkedList;
// import java.util.Queue;

class Node {
  int data;
  Node left, right;
  
  public Node(int item) {
    data = item;
    left = right = null;
  }
}

class BinarySearchTree {
  Node root;
  
  public BinarySearchTree() {
    root = null;
  }
  
  void insert(int data) {
    root = insertda(root, data);
  }
  
  private Node insertda(Node current, int data) {
    if (current == null) {
      return new Node(data);
    }
    
    if (data < current.data) {
      current.left = insertda(current.left, data);
    } else if (data > current.data) {
      current.right = insertda(current.right, data);
    }
    
    return current;
  }
  public  static void preorder(Node root)
  {
if(root==null)
return;
System.out.print(root.data+" ");
preorder(root.left);
preorder(root.right);
  }
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    
    int[] nodes = new int[]{15,5, 2, 7, 4, 16, 6, 19, 8};
    
    for (int node : nodes) {
      tree.insert(node);
    }
    System.out.println(tree.root.data);
    preorder(tree.root);
  }
}
