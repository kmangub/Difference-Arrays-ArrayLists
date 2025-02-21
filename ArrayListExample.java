import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);

        System.out.println(arrList);

        arrList.remove(2);

        System.out.println(arrList);

        System.out.println(arrList.get(0));
    }
}


