package tut_5_week_7.Question_1;

import java.util.Arrays;

public class Question_1 {
    public static void main(String[] args) {
        int[] array_1 = new int[]{7};
        loadArray(array_1);
        System.out.println(Arrays.toString(array_1));
        int[] array_2 = new int[]{3, 6};
        loadArray(array_2);
        System.out.println(Arrays.toString(array_2));
        int[] array_3 = new int[] {4, 6, 8};
        loadArray(array_3);
        System.out.println(Arrays.toString(array_3));
        int[] array_4 = new int[] {4, 6, 8};
        loadArray(array_4);
        System.out.println(Arrays.toString(array_4));
        int[] array_5 = new int[]{8, 4, 2, 0, 4};
        loadArray(array_5);
        System.out.println(Arrays.toString(array_5));
    }

    public static void loadArray(int[] list) {
        for (int i = 1; i < list.length; i++)
        {
            list[i] = list[i] + list[i - 1];
        }
    }
}
