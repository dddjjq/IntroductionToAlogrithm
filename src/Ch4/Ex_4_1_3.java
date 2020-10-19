package Ch4;

/**
 * 最大子数组递归解法
 */
public class Ex_4_1_3 {

    public int[] find(int[] arr, int left, int right) {
        if (left == right) {
            return new int[]{left, right, arr[left]};
        } else {
            int mid = (right + left) / 2;
            int[] findLeft = find(arr, left, mid);
            int[] findRight = find(arr, mid + 1, right);
            int[] findAcross = findAcross(arr, left, mid, right);
            if (findLeft[2] > findRight[2] && findLeft[2] > findAcross[2]) {
                return findLeft;
            } else if (findRight[2] > findLeft[2] && findRight[2] > findAcross[2]) {
                return findRight;
            } else {
                return findAcross;
            }
        }
    }

    /**
     * 找到跨越中点的最大值
     */
    public int[] findAcross(int[] arr, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE;
        int sumL = 0;
        int leftIndex = 0;
        for (int i = mid; i >= left; i--) {
            sumL += arr[i];
            if (leftSum < sumL) {
                leftSum = sumL;
                leftIndex = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        int sumR = 0;
        int rightIndex = 0;
        for (int i = mid + 1; i <= right; i++) {
            sumR += arr[i];
            if (rightSum < sumR) {
                rightSum = sumR;
                rightIndex = i;
            }
        }
        return new int[]{leftIndex, rightIndex, leftSum + rightSum};
    }
}
