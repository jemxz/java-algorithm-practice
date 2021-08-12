/*
1. Write a function named largestAdjacentSum that iterates through an array computing the sum of
adjacent elements and returning the largest such sum. You may assume that the array has at least 2
elements.
*/

public class Main {
    public static void main(String[] args){
        int[] x = {12,3,4,5,2,3,10};
        System.out.println(largestAdjacentSum(x));
    }

    public static int largestAdjacentSum(int[] a){
        if (a.length<1) return 0;
        int highestCount = 0;
        for(int i=0; i<a.length; i++){
            if (i==a.length-1) break;
            else {
                int k = i + 1;
                int currentValue = a[i];
                int addedValue = a[k];
                int count = currentValue + addedValue;
                if (highestCount < count) highestCount = count;
            }
        }
        return highestCount;

    }

}
