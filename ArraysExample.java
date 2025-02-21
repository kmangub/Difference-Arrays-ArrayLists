public class ArraysExample {

    public static void main(String[] args) {

        int[] arr = new int[5]; 

        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 19;
        arr[3] = 30;
        arr[4] = 1000;

        for (int i : arr) {
            System.out.print(" " + i);
        }


    }
}