package arraylistexercise;

public class merge_sort_teacher {
    public static void main(String[] args) {
        int arr[] = { 12, 11, -8,-13,2, 5, 6, 7, 0};
        System.out.println("Given Array");
        for(int i=0;i<arr.length;i++)System.out.print(arr[i]+",");
        sort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
        for(int i=0;i<arr.length;i++)System.out.print(arr[i]+",");
    }
    static void sort(int arr[], int l, int r) {
        if (l < r) {// loop continues till l and r don’t cross
            int m =(r+l)/2;// Find the middle point
            sort(arr, l, m); // Sort first half
            sort(arr, m + 1, r); // Sort second half
            merge(arr, l, m, r); // Merge the sorted halves
        }//return;  //we may write else return;
    }
    static void merge(int arr[], int l, int m, int r)    {
        int len1 = m - l + 1; // Find sizes of two sub-arrays to be merged
        int len2 = r - m;
        int L[] = new int[len1]; // Create 2 temporary arrays
        int R[] = new int[len2];
        for (int i = 0; i < len1; i++) //Copy data to temporary arrays
            L[i] = arr[l + i]; //l is index from previous iteration
        for (int j = 0; j < len2; j++)
            R[j] = arr[m + 1 + j]; //m+l is index from previous iteration
        // Merge the temporary arrays
        int i = 0, j = 0;// Initial indexes of first and second sub-arrays
        int k = l;// Initiate index of merged sub-array array
        while (i < len1 && j < len2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < len1) arr[k++] = L[i++];// Copy remaining elements of L[] if any
        while (j < len2) arr[k++] = R[j++];// Copy remaining elements of R[] if any
    }

}
