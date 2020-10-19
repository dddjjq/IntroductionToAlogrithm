package Ch4;

public class Ex_4_1_5 {

    /**
     * 如果子数组的和小于零，则不是最大子数组，将当前最大设置为arr[i]
     */
    public void find(int[] arr) {
        int maxRightContain = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int beginIndex = -1;
        int endIndex = -1;
        int maybeEndIndex = -1;
        int maybeBeginIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (maxRightContain < 0) {
                maxRightContain = arr[i];
                maybeBeginIndex = i;
            } else {
                maxRightContain += arr[i];
                maybeEndIndex = i;
            }
            if (maxSum < maxRightContain) {
                maxSum = maxRightContain;
                beginIndex = maybeBeginIndex;
                endIndex = maybeEndIndex;
            }
        }
        System.out.print(beginIndex);
        System.out.print(" ");
        System.out.print(endIndex);
        System.out.print(" ");
        System.out.print(maxSum);
        System.out.println();
    }
}
