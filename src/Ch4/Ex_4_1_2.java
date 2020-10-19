package Ch4;

/**
 * 求最大子数组 暴力解法 O(n*n)
 */
public class Ex_4_1_2 {

    public void findMax(int[] arr) {
        int sumMax = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum > sumMax) {
                    left = i + 1;
                    right = j;
                    sumMax = sum;
                }
            }
        }
        System.out.println(left);
        System.out.println(right);
        System.out.println(sumMax);
    }
}
