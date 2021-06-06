/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_3;

/**
 *
 * @author User
 */
public class SearchST {
//    private int N;           
//    private Node first;      
//
//    private class Node {
//        private String key;
//        private Integer val;
//        private Node next;
//
//        public Node(String key, Integer val, Node next)  {
//            this.key  = key;
//            this.val  = val;
//            this.next = next;
//        }
//    }
//
//    public SearchST() {
//    }
//
//    
//    public int size() {
//        return N;
//    }
//  
//    public boolean isEmpty() {
//        return size() == 0;
//    }
//
//    public boolean contains(String key) {
//        return get(key) != null;
//    }
//
//    public Integer get(String key) {
//        for (Node x = first; x != null; x = x.next) {
//            if (key.equals(x.key)) return x.val;
//        }
//        return null;
//    }
//
//    public void put(String key, Integer val) {
//        if (val == null) { delete(key); return; }
//        for (Node x = first; x != null; x = x.next)
//            if (key.equals(x.key)) { x.val = val; return; }
//        first = new Node(key, val, first);
//        N++;
//    }
//
//    public void delete(String key) {
//        first = delete(first, key);
//    }
//
//    private Node delete(Node x, String key) {
//        if (x == null) return null;
//        if (key.equals(x.key)) { N--; return x.next; }
//        x.next = delete(x.next, key);
//        return x;
//    }
//
//    public static void main(String[] args) {
//        SearchST st = new SearchST();
//        
//     // ONLY for IDE version, remove otherwise
////    	Scanner input = null;
////		try {
////			input = new Scanner(new File("mediumST.txt"));
////		} catch (FileNotFoundException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		// END of IDE version
//		
//        // for (int i = 0; !StdIn.isEmpty(); i++) {     <- For console/terminal version only
//		for (int i = 0; input.hasNext(); i++) {
//            String key = input.next();
//            st.put(key, Integer.valueOf(i));
//        }
//        
//        // Your display of the contents...
//        
//        for (Node x = st.first; x != null; x = x.next) {
//        	//StdOut.println(x.key + " " + x.val);
//        }
//        
//        // Your search of the contents...
//        
//        // Enter the character to search its last occurrence on the input string...
//        
//        String MySearch = "R";
//        
//        // measure time spent on sequential search....
//        
//        Stopwatch timer = new Stopwatch();
//        
//        if (st.get(MySearch) != null) {
//        	System.out.println("Character " + MySearch + " has been found lastly appearing at position " + st.get(MySearch));
//        }
//        else System.out.println("Character " + MySearch + " has NOT been found....");
//        
//        System.out.println("Time spent for sequential search: " + timer.elapsedTime());
//        
//    }
}
    

