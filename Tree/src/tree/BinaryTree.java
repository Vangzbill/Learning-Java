package tree;

/**
 *
 * @author sabil
 */
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }
    
    void add(int data){
        if(isEmpty()){
            root = new Node(data);
        } else {
            Node current = root;
            while(true){
                if(data < current.data){
                    if(current.left != null){
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if(data > current.data){
                    if(current.right != null){
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                }
            }
        }
    }
    
    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
    
    void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" " +node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node node){
        if(node != null){
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.print(" " +node.data);
        }
    }
    
    void traverseInOrder(Node node){
        if(node != null){
            traversePreOrder(node.left);
            System.out.print(" " +node.data);
            traversePreOrder(node.right);
        }
    }
    
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is Empty");
            return;
        }
        
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current == null){
            System.out.println("Couldn't find data!");
            return;
        }else {
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                }else {
                    if(isLeftChild){
                        parent.left = null;
                    }else {
                        parent.right = null;
                    }
                }
            }else if(current.left == null){
                if(current == root){
                    root = current.right;
                }else {
                    if(isLeftChild){
                        parent.left = current.right;
                    }else {
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){
                if(current == root){
                    root = current.left;
                }else {
                    if(isLeftChild){
                        parent.left = current.left;
                    }else {
                        parent.right = current.left;
                    }
                }
            }else {
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                }else {
                    if(isLeftChild){
                        parent.left = successor;
                    }else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    
    void addRekursif(int data, Node node){
        if(isEmpty()){
            root = new Node(data);
        } else {
            if(data < node.data){
                if(node.left != null){
                    addRekursif(data, node.left);
                }else{
                    node.left = new Node(data);
                }
            }else if(data > node.data){
                if(node.right != null){
                    addRekursif(data, node.right);
                }else {
                    node.right = new Node(data);
                }
            }
        }
    }
    
    void printTerkecil(){
        if(isEmpty()){
            System.out.println("Data Kosong");
        }else {
            int terkecil = 0;
            Node current = root;
            do {
                current = current.left;
            }while (current.left != null);
            System.out.println("Nilai terkecil yaitu " + current.data);
        }
    }
    
    void printTerbesar(){
        if(isEmpty()){
            System.out.println("Data Kosong");
        }else {
            int terbesar = 0;
            Node current = root;
            do {
                current = current.right;
            }while (current.right != null);
            System.out.println("Nilai terbesar yaitu " + current.data);
        }
    }
    
    void printLeaf(){
        if(!isEmpty()){
            System.out.print("Leaf : ");
            printLeaf(root);
            System.out.println();
        }
    }
    
    void printLeaf(Node node){
        if (node != null){
            if(node.left == null && node.right == null){
                System.out.print(" " + node.data);
            }else {
                printLeaf(node.left);
                printLeaf(node.right);
            }
        }
    }
    
    void countLeaf(){
        if(!isEmpty()){
            int jumlah = countLeaf(root);
            System.out.println("Jumlah leaf = " +jumlah);
        }
    }
    
    int countLeaf(Node current){
        if(current != null){
            if(current.left == null && current.right == null){
                return 1;
            }else {
                int leafkiri = 0;
                int leafkanan = 0;
                leafkiri += countLeaf(current.left);
                leafkanan += countLeaf(current.right);
                return leafkiri + leafkanan;
            }
        }else {
            return 0;
        }
    }
        
}
