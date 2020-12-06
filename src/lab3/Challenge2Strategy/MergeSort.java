package lab3.Challenge2Strategy;

public class MergeSort implements SortingStrategy{

    public void sort(Integer[] list) {
        int n = list.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = list[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = list[i];
        }
        sort(left);
        sort(right);

        merge(list, left, right);
    }

    public static void merge(Integer[] list, Integer[] left, Integer[] right) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                list[k++] = left[i++];
            }
            else {
                list[k++] = right[j++];
            }
        }
        while (i < nL) {
            list[k++] = left[i++];
        }
        while (j < nR) {
            list[k++] = right[j++];
        }
    }
}
