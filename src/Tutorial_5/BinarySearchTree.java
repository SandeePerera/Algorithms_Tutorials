/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_5;

import java.util.Random;

/**
 *
 * @author SANDEEPA PERERA
 */
public class BinarySearchTree {

    private void OutputSubTree(TreeNode root) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public class TreeNode{
        public int data;
        public TreeNode leftChild, rightChild, parent;

        public TreeNode(int d){
            data = d;
            leftChild = null;
            rightChild = null;
            parent = null;
        }

        public void setLeftChild(TreeNode n){
            leftChild = n;
            if(n != null){
                n.parent = this;
            }
        }

        public void setRightChild(TreeNode n){
            rightChild = n;
            if(n != null){
                n.parent = this;
            }
        }
    }
    
    private TreeNode root;
    
    public TreeNode find(int findMe){
        TreeNode n = root;
        while(n != null){
            if(n.data == findMe)
                return n;
            if(n.data < findMe)
                n = n.rightChild;
            else
                n = n.leftChild;
        }
        return null;
    }
    
    /*
    * TO DO: print the contents of the tree in ascending order
    */
    public void output(){
        if(root==null)
            System.out.println("Empty tree");
        else{        
            OutputSubTree(root);
            System.out.println();
        }
    }
    
    /*
    * TO DO: insert the new value, respecting the order
    */
    public void insert(int value){
	if(root == null)
            root = new TreeNode(value);
        else
            insertBelow(root,value);
    }
	
	/* 
	Recursive auxiliarly function: inserts the given value below the given node
	*/
	private void insertBelow(TreeNode node, int value){
	  if(value > node.data)
              if(node.rightChild == null)
                node.setRightChild(new TreeNode(value));
          else
                insertBelow(node.rightChild,value);
            else 
                if (node.leftChild == null)
                node.setLeftChild(new TreeNode(value));
                else
                insertBelow(node.leftChild,value);
        }
    
    /*
    * TO DO: find and remove the given value in case it is in the tree
    *
    * Function replaceNode below may be useful.
    */
    public void remove(int value){
	TreeNode n= find(value);
        if(n!= null)
            if(n.leftChild == null&& n.rightChild == null)
                replaceNode(n,null);
        else if (n.rightChild==null)
                replaceNode(n,n.leftChild);
//        else if(n.leftChild(n,null)
//                replaceNode(n,n.leftChild);
            else{
                TreeNode m = n.leftChild;
            while(m.rightChild!=null)
                m = m.rightChild;
                n.data = m.data;
                replaceNode(m,m.leftChild);
                }                
    }
    
    /*
    * Auxiliary function: replaces a node
    * If node is the root, replacement becomes the new root
    * Otherwise, node is the left/right child of some parent, and replacement takes that place
    */
    private void replaceNode(TreeNode node, TreeNode replacement){
        TreeNode parent = node.parent;
        if(parent == null){  // node is the root 
            root = replacement;
            if(root != null)
                root.parent = null;
        }
        else if(node == parent.leftChild)
            parent.setLeftChild(replacement);
        else parent.setRightChild(replacement);
    }

    
    /*
    * Generates an array of the given size, containing random values
    */
    public static int[] randomValues(int howMany){
        int[] result = new int[howMany];
        Random random = new Random();
        for(int i=0; i<howMany; i++)
           result[i] = random.nextInt() % (10 * howMany);
        return result;
    }
    
    /*
    * Inserts all the values in the given array
    */
    public void insertAll(int[] values, boolean printResults){
        for(int i=0; i<values.length; i++){
            insert(values[i]);
            if(printResults)
                output();
        }
    }
    
    /*
    * Removes all the values in the given array, if present
    */
    public void removeAll(int[] values, boolean printResults){
        for(int i=0; i<values.length; i++){
            remove(values[i]);
            if(printResults)
                output();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // How many values to generate
        int numValues = 10; 
        // Whether to print results. Only use with small numbers of values.
        boolean printResults = true; 
        
        BinarySearchTree t = new BinarySearchTree();
        int[] a = randomValues(numValues);
        if(printResults){
            System.out.print("Input values: ");
            for(int i=0;i<numValues; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
        long start = System.currentTimeMillis();
        t.insertAll(a, printResults);
        t.removeAll(a, printResults);
        long now = System.currentTimeMillis();
        double elapsed = (now - start) / 1000.0;
    	System.out.println();
        System.out.println("Elapsed time = " + elapsed + " seconds");        
    }
}
