import Ch4.Ex_4_1_2;
import Ch4.Ex_4_1_3;
import Ch4.Ex_4_1_5;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int[] arr2 = new int[]{-1, -3, -25, -20, -3, -16, -23, -18, -20, -7, -12, -5, -22, -15, -4, -7};
        Ex_4_1_2 ex412 = new Ex_4_1_2();
        ex412.findMax(arr);
        Ex_4_1_3 ex413 = new Ex_4_1_3();
        int[] result = ex413.find(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(result));
        Ex_4_1_5 ex415 = new Ex_4_1_5();
        ex415.find(arr);
        ex415.find(arr2);
    }
}
