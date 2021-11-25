
public class MyArraySorting {
    public static void selectionSort(int[] mix) {

        for (int m = 0; m < mix.length; m++) {
            int min = m;
            for (int j = min; j < mix.length; j++) {
                if (mix[min] > mix[j]) {
                    min = j;
                }
            }
            int nMin = mix[min];
            mix[min] = mix[m];
            mix[m] = nMin;
        }

    }
}