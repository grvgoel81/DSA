package com.inzy.ds.example;


import java.util.Arrays;

class SeasonAlgo {
    public static void main(String[] args) {
//        int[] arr = {-3, -14, -5, 7, 8, 42, 8, 3};
        int[] arr = {2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18};
        solution(arr);
    }


    public static String solution(int[] T) {

        int[] arr1 = Arrays.copyOfRange(T, 0, T.length / 2);
        int[] arr2 = Arrays.copyOfRange(T, T.length / 2, T.length);

        int[] winter = Arrays.copyOfRange(arr1, 0, arr1.length / 2);
        int[] spring = Arrays.copyOfRange(arr1, arr1.length / 2, arr1.length);

        int[] summer = Arrays.copyOfRange(arr2, 0, arr2.length / 2);
        int[] automn = Arrays.copyOfRange(arr2, arr2.length / 2, arr2.length);

        quickSort(winter, 0, winter.length - 1);
        quickSort(spring, 0, winter.length - 1);
        quickSort(summer, 0, winter.length - 1);
        quickSort(automn, 0, winter.length - 1);

        int apmWint = winter[winter.length - 1] - winter[0];
        int apmSpring = spring[spring.length - 1] - spring[0];
        int apmSummer = summer[summer.length - 1] - summer[0];
        int apmAutom = automn[automn.length - 1] - automn[0];
        System.out.println("");

        Season[] s = new Season[4];
        s[0] = new Season("winter", apmWint);
        s[1] = new Season("spring", apmSpring);
        s[2] = new Season("summer", apmSummer);
        s[3] = new Season("automn", apmAutom);

        Arrays.sort(s);
        System.out.println("" + s[3].name);
        return "";
    }


    private static void quickSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[(i + j) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }

    public static class Season implements Comparable<Season> {

        String name;
        int amp;
        public Season(String seasonName, int amplitude ) {
            this.name = seasonName;
            this.amp = amplitude;
        }


        @Override
        public int compareTo(Season season) {
            int result = this.amp - season.amp;
            return result;
        }
    }

    /*public class SortByID implements Comparable<Season> {

        @Override
        public int compareTo(Season season) {
            return this.;
        }
    }*/

}