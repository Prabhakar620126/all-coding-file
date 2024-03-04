import java.util.ArrayList;
import java.util.Collections;
public class arraylist_L_24 {
    static void  reverselist(ArrayList<Integer> list){
        
        int i =0 , j =list.size() -1;
        while(i<j){
            Integer temp =Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        
    }
    public static void main(String[] args) {
        // wrapper classes
        Integer p = Integer.valueOf(4);
        System.out.println(p);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Float> l2 = new ArrayList<>();
        // ArrayList<Boolean> l3 = new ArrayList<>();
        
        //add new elements
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i 
        System.out.println(l1.get(2)); //7


        // print with for loop
        for(int i=0; i<l1.size();i++){
            System.out.println(l1.get(i));

        }

        // printing the array list directly 
        System.out.println(l1);

        // adding element at some index i
        l1.add(1, 100 );
        System.out.println(l1);

        // modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1); 

        // removing an element e
        System.out.println(l1.remove(Integer.valueOf(7)));
        System.out.println(l1);

        // checking if an element exists 
        boolean ans = l1.contains(6);
        System.out.println(ans);

        // if you don't specify class , you can put anythings inside
        // ArrayList l = new ArrayList<>();
        // l.add("prabhakar ");
        // l.add(4);
        // l.add(true);
        // System.out.println(l);

        // problem in arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println(" original list" + list);
        Collections.reverse(list);
        //reverselist(list);
        System.out.println(" reversed list " + list);
        Collections.sort(list);
        System.out.println("assending order" + list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(" decreasing order " + list);

        ArrayList<String> ll = new ArrayList<>();
        ll.add("welcome");
        ll.add("to");
        ll.add("physics");
        ll.add("wallah");
        System.out.println("OG "+ ll);
        Collections.sort(ll, Collections.reverseOrder());
        System.out.println("sorted "+ ll);


         
    }
    
}
