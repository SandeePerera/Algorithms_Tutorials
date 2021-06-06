package Tutorial_1;

public class QuickFind {
    private int[] id;

    public QuickFind(int N){
        id= new int[N];
        for(int i=0;i<N;i++)
            id[i]=i;
    }
    
    public int connected(int id1,int id2){
        return id[id1]=id[id2];
    }
    
    public void Union(int id1,int id2){
        int id_1=id[id1];
        int id_2=id[id2];
        
        for(int i=0;i<id.length;i++){
            if(id[i]==id_1)
                id[i]=id_2;
        }
    }
    
    public static void main(String[] args) {
        QuickFind q = new QuickFind(10);
        
        for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.println("\n");
        q.Union(3, 8);
        
         for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.println("\n");
        q.Union(5, 2);
        
         for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.println("\n");
        q.Union(2, 3);
        
         for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.println("\n");
        q.Union(9, 1);
        
         for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.println("\n");
        q.Union(7, 4);
        
         for(int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
        System.out.println("\n");
        q.Union(3, 9);
        
        for (int i=0;i<10;i++)
            System.out.print(q.id[i]+"");
    }
    
}
