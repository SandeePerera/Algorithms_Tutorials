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
public class SequentialSearchST {
    private int N;           // number of key-value pairs
    private Node first;      // the linked list of key-value pairs

    // a helper linked list data type
    private class Node {
        private String key;
        private Integer val;
        private Node next;

        public Node(String key, Integer val, Node next)  {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }

    /**
     * Initialises an empty symbol table.
     */
    public SequentialSearchST() {
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return N;
    }

    /**
     * Is this symbol table empty?
     * @return <tt>true</tt> if this symbol table is empty and <tt>false</tt> otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Does this symbol table contain the given key?
     * @param key the key
     * @return <tt>true</tt> if this symbol table contains <tt>key</tt> and
     *     <tt>false</tt> otherwise
     */
    public boolean contains(String key) {
        return get(key) != null;
    }

    /**
     * Returns the value associated with the given key.
     * @param key the key
     * @return the value associated with the given key if the key is in the symbol table
     *     and <tt>null</tt> if the key is not in the symbol table
     */
    public Integer get(String key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) return x.val;
        }
        return null;
    }

    /**
     * Inserts the key-value pair into the symbol table, overwriting the old value
     * with the new value if the key is already in the symbol table.
     * If the value is <tt>null</tt>, this effectively deletes the key from the symbol table.
     * @param key the key
     * @param val the value
     */
    public void put(String key, Integer val) {
        if (val == null) { delete(key); return; }
        for (Node x = first; x != null; x = x.next)
            if (key.equals(x.key)) { x.val = val; return; }
        first = new Node(key, val, first);
        N++;
    }

    /**
     * Removes the key and associated value from the symbol table
     * (if the key is in the symbol table).
     * @param key the key
     */
    public void delete(String key) {
        first = delete(first, key);
    }

    // delete key in linked list beginning at Node x
    // warning: function call stack too large if table is large
    private Node delete(Node x, String key) {
        if (x == null) return null;
        if (key.equals(x.key)) { N--; return x.next; }
        x.next = delete(x.next, key);
        return x;
    }


    /**
     * Unit tests the <tt>SequentialSearchST</tt> data type.
     */
    public static void main(String[] args) {
        SequentialSearchST st = new SequentialSearchST();
//        for (int i = 0; !StdIn.isEmpty(); i++) {
//            String key = StdIn.readString();
//            st.put(key, Integer.valueOf(i));
//        }
        
        for (Node x = st.first; x != null; x = x.next) {
        	//StdOut.println(x.key + " " + x.val);
        }
        // for (String s : st.keys())
        //    StdOut.println(s + " " + st.get(s));

	String MySearch = "R";
        
        // measure time spent on sequential search....
        
        Stopwatch timer = new Stopwatch();
        
        if (st.get(MySearch) != null) {
        	System.out.println("Character " + MySearch + " has been found lastly appearing at position " + st.get(MySearch));
        }
        else System.out.println("Character " + MySearch + " has NOT been found....");
        
        System.out.println("Time spent for sequential search: " + timer.elapsedTime());
    }
}


   
