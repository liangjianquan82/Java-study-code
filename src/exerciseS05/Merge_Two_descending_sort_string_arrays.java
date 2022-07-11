package exerciseS05;

public class Merge_Two_descending_sort_string_arrays {
    public static void main(String[] args) {
        String a[] = {"bb", "cc", "ss", "dd", "aa", "gg", "Jj" };
        String b[] = {"ff", "tt", "ee", "tt", "yy", "uu", "ii", "pp", "oo", "aa", "qq", "zz" };



        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        Merge_Sort_descending_order(a, 0, a.length-1);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }

        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ",");
        }
        Merge_Sort_descending_order(b, 0, b.length-1);
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ",");
        }
        System.out.println();
        String c[] = Merge_descending_sort(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }
    }

    public static String[] descending_sort(String a[]) {
        //使用插入降序排序法 insert descending sort

        int n = a.length;
        for (int i = 1; i < n; i++) {
            int pos = 0;
            String temp = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp.compareToIgnoreCase(a[j]) > 0) {
                    a[j + 1] = a[j];
                } else {
                    pos = j + 1;
                    break;
                }
            }
            a[pos] = temp;
        }
        return a;
    }

    /**
     * Merge 2 descending-sorted string arrays into a single one (should be descending-sorted automatically)
     * @param a array_a
     * @param b array_a
     * @return array
     */
    public static String[] Merge_descending_sort(String a[], String b[]) {
        int la = a.length;
        int lb = b.length;
        int l = la + lb;
        String c[] = new String[l];
        int aa = 0, bb = 0;
        for (int i = 0; i < l; i++) {

            for (; (aa + bb) < l; ) {
                if (a[aa].compareToIgnoreCase(b[bb]) >= 0) {
                    c[i] = a[aa];
                    if (aa < la - 1) {
                        aa++;
                    }
                    break;
                } else if (a[aa].compareTo(b[bb]) < 0) {
                    c[i] = b[bb];
                    if (bb < lb - 1) {
                        bb++;
                    }
                    break;
                }
            }
        }
        return c;
    }

    /**
     * Merge Sort 1 loop separate arrays
     * @param arrays
     * @param forward
     * @param back
     */
    public static void Merge_Sort_descending_order(String arrays[], int forward, int back) {

        int middle = 0;
        if (forward < back) {
            middle = (forward + back) / 2;
            Merge_Sort_descending_order(arrays, forward, middle);//recursion separate arrays to single and go back
            Merge_Sort_descending_order(arrays, middle + 1, back);
            Merge(arrays, forward, middle, back);
        }return;
    }

    /**
     * Take in the first index of the array, the middle index, and the last index
     * After the comparison, move the larger number forward into the array "array".
     * @param arrays
     * @param forward
     * @param middle
     * @param back
     */
    public static void Merge(String arrays[], int forward, int middle, int back) {
        //将数组分为左右两段，
        int leftlen = middle - forward + 1;
        int rightlen = back - middle;

        String leftarray[] = new String[leftlen];
        String rightarray[] = new String[rightlen];

        for (int i = 0; i < leftlen; i++) {
            leftarray[i] = arrays[forward + i];//左边数组
        }
        for (int j = 0; j < rightlen; j++) {
            rightarray[j] = arrays[middle + 1 + j];//右边数组
        }
        int i = 0, j = 0;
        int k = forward;
        while (i < leftlen && j < rightlen) {
            if (leftarray[i].compareToIgnoreCase(rightarray[j]) <= 0) {
                arrays[k++] = rightarray[j++];
            } else {
                arrays[k++] = leftarray[i++];
            }
        }

        while (i < leftlen) {
            arrays[k++] = leftarray[i++];
        }
        while (j < rightlen) {
            arrays[k++] = rightarray[j++];
        }

    }

}
