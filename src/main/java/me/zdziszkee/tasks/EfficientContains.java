package me.zdziszkee.tasks;

public class EfficientContains {
    public static boolean exists(int element, int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == element) {
                return true;
            } else if (array[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
