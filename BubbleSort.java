import java.util.Arrays;

public class BubbleSort {
    public static void change(int index1, int index2, int[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public static void main(String[] args) {
        int[] a = {4, 1, 2, 3};
        System.out.println(sort(a));
        System.out.println(Arrays.toString(a));
    }
}
