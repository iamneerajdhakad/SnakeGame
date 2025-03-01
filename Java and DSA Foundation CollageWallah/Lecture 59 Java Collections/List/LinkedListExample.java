import java.util.LinkedList;


    public class LinkedListExample {
        
        public static void Solution(){
    
            LinkedList<Integer> l = new LinkedList<>();

            l.add(1); // Example usage to avoid "Variable l is never read" error
            l.add(2);
            l.add(3);
            System.out.println(l);

            System.out.println(l.get(1));

            l.set(1, 10);
            System.out.println(l);
            System.out.println(l.contains(10));
        }
    

    public static void main(String[] args) {
        Solution();

    }
}
