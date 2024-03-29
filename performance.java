import java.util.LinkedList;
import java.util.ArrayList;

public class performance {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(7);
        linkedList.add(30);

        long LstartTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(Integer.valueOf(i));
        }

        long LendTime = System.currentTimeMillis();

        long LexTime = LendTime - LstartTime;
        System.out.println("Linked list execution time: " + LexTime);

        System.out.println("Elements of LinkedList: ");
        for (int i : linkedList) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i : linkedList) {
            sum += i;
        }
        System.out.println("Sum of all elements: " + sum);

        LinkedList<String> list = new LinkedList<>();
        list.add("Tom");
        list.add("Dick");
        list.add("Harry");
        list.add("Sam");

        int tomIndex = list.indexOf("Tom");
        int samIndex = list.indexOf("Sam");

        list.add(tomIndex, "Bill");
        list.add(samIndex, "Sue");

        list.remove("Bill");
        list.remove("Sam");

        System.out.println("Final LinkedList: ");
        System.out.println(list);

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(30);

        long AstartTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(i);
        }
        long AendTime = System.currentTimeMillis();

        long AexTime = AendTime - AstartTime;
        System.out.println("Linked list execution time: " + AexTime);

        System.out.println("Elements of ArrayList: ");
        for (int i : arrayList) {
            System.out.println(Integer.valueOf(i));
        }

        int sumArray = 0;
        for (int i : arrayList) {
            sumArray += i;
        }
        System.out.println("Sum of all elements: " + sumArray);

        ArrayList<String> Alist = new ArrayList<>();
        Alist.add("Tom");
        Alist.add("Dick");
        Alist.add("Harry");
        Alist.add("Sam");

        int tomIndex1 = Alist.indexOf("Tom");
        int samIndex1 = Alist.indexOf("Sam");

        Alist.add(tomIndex1, "Bill");
        Alist.add(samIndex1, "Sue");

        Alist.remove("Bill");
        Alist.remove("Sam");

        System.out.println("Final ArrayList: ");
        System.out.println(Alist);


    }
}
