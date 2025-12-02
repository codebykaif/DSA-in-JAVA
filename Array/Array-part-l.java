public class MaxInArray {

    static int findMax(int[] arr){
        int max = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i] > max)
            max = arr[i];
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        System.out.println("Max Element : " + findMax(arr));
    }
}

public class MaxInArray {

    static int findMax(int[] arr){
        int max = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i] > max)
            max = arr[i];
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,55, 54};
        System.out.println("Max Element : " + findMax(arr));
    }
}

// Find Minimum 
public class MinArray {

    static int findMin(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min)
            min = arr[i];
        }
        return min;
    }    
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        System.out.println("Minimum element : " + findMin(arr));
    }
}

public class ReversArray{
    static void revers(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40};
        revers(arr);
        System.out.println("Revers Array :");
        for(int num : arr)
        System.out.println(num + " ");
    }
}

public class ReversArray {

    static void revers(int[] arr){
        // int start = 0; end = arr.length - 1;
        int start = 0, end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
        public static void main(String[] args){
            int[] arr = {10,20,30,40,50};
            revers(arr);
            System.out.println("Revers Array");
            for(int num : arr)
            System.out.println(num + " ");
        }
}

public class SumArray{
    static int sum(int[] arr){
        int total = 0;
        for(int num : arr)
        total += num;
        return total;
    }
    public static void main(String[] args){
        int[] arr = {3,6,7,9,4,2};
        System.out.println("Sum of array elemnt : " + sum(arr));
    }
}

public class SumArray {

    static int sum(int[] arr){
        int total = 0;
        for(int num : arr)
        total += num;
        return total;
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,6,7,8,5,3};
        System.out.println("Sum of Array elemnt : " + sum(arr));
    }
}

// Count even odd
public class EvenOddCount{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int even = 0, odd = 0;
        for(int n : arr){
            if(n%2 == 0)
            even++;
            else
            odd++;
        }
        System.out.println("Even count " + even);
        System.out.println("odd count " + odd);
    }
}

Copy Array

public class CopyArray{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];

        for(int i = 0; i<arr1.length; i++){
            arr2[i] = arr1[i];

            System.out.println("Copied Array");
            for(int num : arr2)
            System.out.print(num + " ");
        }
    }
}

public class SecondLargest{
    static int secondlargest(int[] arr){
        int first = Integer.MIN_VALUE,  second = Integer.MIN_VALUE;
        for(int n : arr){
            if(n > first){
                second = first;
                first = n;
            } else if(n > second && n  != first){
                second = n;
            }
        }
        return second;
    }
    public static void main(String[] args){
        int[] arr = {10,50,30,41,40,20};
        System.out.println("Second largest : " + secondlargest(arr));
    }
}

Ffind Fuplicate Element 

public class DuplicateElemet{
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,7,89,};
        System.out.println("Duplicate Element" );
        for(int i=0; i<arr.length; i ++){
            for(int j = i + 1; j<arr.length; j++){
                if(arr[i] == arr[j])
                System.out.print(arr[i] + " ");
            }
        }
    }
}

public class LeftRotatArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int first = arr[0];
        for(int i =0; i<arr.length+1; i++){
            arr[i] = arr[i + 1];
            arr[arr.length - 1] = first;

            System.out.println("After left rotation :" );
            for(int n : arr)
            System.out.println(n + " ");
        }
    }
}

right Rotat Array one possition

public class RightRoataArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int last = arr[arr.length - 1];
        for(int i=arr.length-1; i>0; i--)
        arr[i] = arr[i - 1];
        arr[0] = last;

        System.out.print("After right rotation: ");
        for(int n : arr)

        System.out.println(n + " ");
    }
} 

Count Frequency of each Element

public class FrequencyCount{
    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,3};
        boolean[] visited = new boolean[arr.length];

        for(int i =0; i<arr.length; i++){
            if(visited[i]) continue;
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.err.println(arr[i] + " occurs " + count + " time");
        }
    }
}

public class Asscendingort{
    public static void main(String[] args){
        int[] arr = {5,1,4,2,3};
        for(int i=0; i<arr.length; i++){
            for(int j =i + 1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.err.println("Sorted array");
        for(int n : arr)
        System.out.println(n + " ");
    }
}

Deccending Order

public class DesscendingSort {

    public static void main(String[] args){
        int[] arr = {2,4,2,5,3,5,7,9};
        for(int i=0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Descendig order : ");
        for(int n : arr)
        System.out.println(n + " ");
    }
}

public class MergeArray{
    public static void main(String[] ars){
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        int[] c = new int[a.length + b.length];

        int index = 0;
        for(int n : a)
        c[index++] = n;
        for(int n : b)
        c[index++] = n;

        System.err.print("Merge Array :");
        for(int n : c)
        System.out.println(n + " ");
    }
}

Remove duplicate Elemnt

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args){
        int[]  arr = {1,2,3,4,5,6,7,8,8};
        LinkedHashSet<IntegssimgNuer> set = new LinkedHashSet<>();
        for(int n : arr)
        set.add(n);

        System.out.print("After removing duplicates");
        for(int n : set)
        System.out.println(n + " ");
    }
}

Find Missing Number in Sequence

public class MissingNumber{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = 5;
        int total = n * (n * 1) / 2;

        int sum = 0;
        for(int num : arr)
        sum += num;

        System.out.println("Missing number: " + (total - sum));
    }
}

public class SumEvenOdd{
    public static void main(String[] args){
        int[] arr = {10,20,31,40};
        int evensum = 0, oddSum = 0;

        for(int n : arr){
            if(n % 2 ==0)
            evensum+= n;
            else
            oddSum+= n;
        }
        System.out.println("Even Sum" + evensum);
        System.out.println("Odd Sum" + oddSum);
    }
}

public class CheckSorted {

    public static void main(String[] args){
        int[] arr = {50,20,30,40};
        boolean Sorted = true;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i + 1]){
                Sorted = false;
                break;
            }
        }
        if(Sorted)
        System.out.println("Array is sorted ");
        else 
        System.out.println("Array is not sorted");
    }
}

public class PairSum{
    public static void main(String[] args){
        int[] arr = {2,4,7,11,15};
        int sum = 9;

        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] + arr[j] == sum)
                    System.out.println(arr[i] + " + " + arr[j] + " + " + sum );
            }
        }
    }
}

Find all Subarray

public class PrintSubarray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            for(int j =i; j<arr.length; j++){
                for(int k = i; k<=j; k++)
                System.out.print(arr[k] + " ");
                System.err.println();
            }
        }
    }
}

public class IndexOccurences{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int arr2 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int arr1 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int arr3 = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        int arr4 = sc4.nextInt(); 
        Scanner sc5 = new Scanner(System.in);
        int arr5 = sc5.nextInt();

        int[] arr = {arr1,arr2,arr3,arr4,arr5};
        int key = 3;

        System.out.print("Index of " + key + " : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key)
            System.out.println(i + " ");
        }
    }
}

public class AverageArray {

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int sum = 0;

        for(int n : arr)
        sum += n;

        double avg = (double) sum / arr.length;
        System.out.println(" Average " + avg);
    }
}

public class countPosNeg {

    public static void main(String[] args){
        int[] arr = {10,-92,73,82,-86,37,-52,9,0};
        int pos = 0, neg = 0;
        for(int n : arr){
            if(n > 0)
            pos++;
            else if(n < 0)
            neg++;
        }
        System.out.println("Possitive number " + pos);
        System.out.println("Negative " + neg);
    }
}

Ffind Sum of diagonal Element 2D Array

public class Diagonal{
    public static void main(String[] args){
        int[][] mat = {{1,3,6,5,6,7,8,32},{4,6,7,3,2,5,2,4,3,2}};

        int leftsum = 0, rightsum = 0;

        for(int i=0; i<mat.length; i++){
            leftsum += mat[i][i];
            rightsum += mat[i][mat.length -1 -i];

            System.out.println(" Sum of Ddiagonal Number"+ leftsum);
            System.out.println(" Sum of Ddiagonal Number"+ rightsum);
        }
    }
}

public class TransportMatix{
    public static void main(String[] args){
        int[][] mat = {{1,2,3,4,5,6,7,8,9},{2,3,4,4,5,6,}};
        int rows = 2, cols = 3;

        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(mat[j][i] + " ");
                System.out.println();
            }
        }
    }
}

public class Duplicate{
    public boolean ContainDuplicate(int[] nums){
        for(int i =0; i<nums.length; i++){

            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){

                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){

        int[] nums = {1,2,3};
        Duplicate obj = new Duplicate();
        boolean result = obj.ContainDuplicate(nums);

        System.out.println(result); 
    }
}
