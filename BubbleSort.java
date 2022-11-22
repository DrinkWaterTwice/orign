import java.util.Arrays;

public class BubbleSort {
    public static void change(int index1, int index2, int[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static long sort(int[] array) {
        long cont = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            boolean haveChange = false;
            for (int j = array.length - 1; j >= array.length - i; j--) {
                if (array[j] < array[j - 1]) {
                    change(j, j - 1, array);
                    haveChange = true;
                    cont++;
                }

            }
            if (!haveChange) {
                break;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 2, 3};
        System.out.println(sort(a));
        System.out.println(Arrays.toString(a));
    }
}
