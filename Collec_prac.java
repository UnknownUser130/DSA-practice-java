import java.util.*;
public class Collec_prac {
    public static void main(String[] args){
        int arr[]=new int[]{3,2,4,7,10,6,5};
        Vector<Integer> v=new Vector();
        Hashtable<Integer,String> h=new Hashtable();
        v.addElement(16);
        v.addElement(19);

        h.put(1,"Akash");
        h.put(2,"Aman");
        h.put(3,"Amit");

        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        //Array List
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(0,1);
        l1.add(1,2);
        System.out.println(l1);
        List<Integer> l2=new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        //will add l2 from index 1 in l1
        l1.addAll(1,l2);
        System.out.println(l1);
        //removes element at index 1
        l1.remove(1);
        System.out.println(l1);
        //print the element at index 2
        System.out.println(l1.get(2));
        //replace 0th element with 5
        l1.set(0,5);
        System.out.println(l1);
    }
}
