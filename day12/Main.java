import java.util.*;
public class Node{
    Node data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Main{
    public static void main(String[] args){
        Node nn = new Node(90);
        int root = nn.data;
        System.out.println(root);
    }
}