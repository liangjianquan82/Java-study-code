package arraylistexercise;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Integer a[] = {0, 1, 4, 6, 8, 9, 11, 13, 21, 33, 55, 89, 91, 95, 99, 100};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("Enter search number:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Integer index = jumpSearchInt(a, x);
        if(index ==null)
        {System.out.println("Search element:" + x + ", Not in array.");
        }
        else {
            System.out.println("Search element:" + x + ", Position number:" + index);
        }
    }
    //平方根跳查询
    public static Integer jumpSearchInt(Integer[] intArraylist, int searchElement) {
        int arraylength = intArraylist.length;
        int jumpStep = (int) Math.sqrt(arraylength);//Block Size(计算块大小)
        int previousStep = 0;
        // 用数组的平方值为跳转搜索找到数组中小于搜索值的位置。记录当前这跳转第n块的第一个数。
        // Compare A[0] with item. Since A[0] != item and A[0]<item, skip to the next block
        // do jump search
        while (intArraylist[Math.min(jumpStep, arraylength) - 1] < searchElement) {
            previousStep = jumpStep;
            jumpStep += (int) Math.sqrt(arraylength);
            //如果跳转超出或等于数组长度返回-1
            // i>length
            if (previousStep >= arraylength) {
                return null;
            }
        }
        //在跳转到数组第n块做线性循环，找到小于查找值的数。
        //Comparing A[previousStep] and searchElement (Linear Search)
        while (intArraylist[previousStep] < searchElement) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arraylength)) {
                return null;
            }
        }
        //如果数组中搜索到的当前位置下一个数跟要查询的值相同，就返回该位置的值否者返回-1.
        if (intArraylist[previousStep] == searchElement) {
            return previousStep;
        }
        return null;
    }
}
