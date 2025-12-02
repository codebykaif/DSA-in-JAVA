import java.util.*;

public class  LinearSearch{
    // function to perform linear search
    static int linearsearch(int[] arr, int x){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == x){
                return i; // eement found, return index
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[]  numbers  = {10, 20, 30 , 40};
        int key = 30;
        int result = linearsearch(numbers, key);
        if(result == -1)
        System.out.println("Element is not found");
        else 
        System.out.println("Element is found at index " + result);
    }
}

import java.util.Scanner;

public class LinearSearch {

    static int linearsearch(int[] a, int x){
        for(int i=0; i<a.length; i++){
            if(a[i] == x){
            return i;
        }
    }
    return -1;
    }
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int num2 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num3 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        int num4 = sc3.nextInt();
        
        int key = 65;
        int[] number = {num1,num2,num3,num4};
        int result = linearsearch(number, key);
        if(result == -1)
        System.out.println("Elemenyt is not found");
        else
        System.out.println("Element is at index " + result);
    }

}

public class LinearSearch {

    static  boolean linearsearch(int[] arr, int key){
        for(int num : arr){
            if(num == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,75};
        int key = 30;
        boolean result = linearsearch(arr, key);
        if(result)
        System.out.println("Element found");
        else
        System.out.println("Element is at index " + key);
    }
}


public class LinearSearch {

    public int linearsearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();  // object create kiya
        int[] numbers = {10, 20, 30, 40};
        int key = 30;

        int result = ls.linearsearch(numbers, key);  // object se call
        if (result == -1)
            System.out.println("Element is not found");
        else
            System.out.println("Element is at index " + result);
    }
}

// Binaey Search
public class BinarySearch {

    static int binarysearch(int[] arr, int x){
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
            return mid;
            if(arr[mid] < x)
            left = mid + 1;
            else
            right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40};
        int key = 30;
        int result = binarysearch(arr, key);

        if(result == -1)
        System.out.println("Element is not found in this element ");
        else
        System.out.println("Elemnt found at index " + result);
    }
}


class sorting {
    public static void main(String[] args){
        int[]  arr = {5,1,9,3};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
} 

public class sorting {

    public static void main(String[] args){
        int[] arr = {5,1,3,9,7};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

public class sorting {

    public static void main(String[] args){
        Integer[] arr = {4,1,9,2};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}

public class sorting {

    public static void main(String[] args){
        int[] arr = {5,3,8,4,2};

        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j ++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class sorting {

    public static void main(String[] args){
        int[] arr = {9,4,6,2,8};

        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]) min = j;
            }

            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}

Insertion 

public class sorting {

    public static void main(String[] args){
        int[] arr = {8,6,4,2,0};
        for(int i =1; i<arr.length; i++){
            int key = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}

Merge Sort

import java.util.*;
public class Main{
    static void mergeSort(int[] arr, int l, int r){
        if( 1 >= r)
            return;
        int mid = (l + r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+l, r);
        merge(arr, l, mid, r);
    }
    static void merge(int[] arr, int l, int m, int r){
        int[] temp = new int[r-l+1];
        int i=1, j=m+1, k=0;

        while (i<=m && j<=r) {
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];

            while (i<=m) temp[k++] = arr[i++];
            while (j<=r) temp[k++] = arr[j++];

            for(int x=0; x<temp.length; x++)
                arr[l+x] = temp[x];
        }
        public static void main(String[] args){
            int[] arr = {5,1,6,2,3,4};
            mergeSort(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));
        }
    }
}

Quick Sort

import java.util.*;

public class Main {

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low,  high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;

        for(int j = low; j<high; j++){
            
        }
    }
}

Sorting a string Alphabetically 

public class Main{
    public static void main(String[] args){
        String s = "dcaga";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        System.out.println(new String(ch));
    }
}

Sort word by length

public class sorting{
    public static void main(String[] args){
        String[] arr = {"apple", "cat", "banana"};
        Arrays.sort(arr, (a,b) -> a.length() - b.length());

        System.out.println(Arrays.toString(arr));
    }
}

public class sorting{
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};

        int low=0, mid=0, high=arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int t=arr[low];
                arr[low]=arr[mid];
                arr[mid]=t;
                low++; mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                int t=arr[mid];
                arr[mid]=arr[high]; arr[high] = t;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class sorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gues the number from 1 to 100 🤞");
        int arr1 = sc.nextInt();
        int arr2 = sc.nextInt();
        int arr3 = sc.nextInt();
        int arr4 = sc.nextInt();

        Integer[] arr = {arr1,arr2,arr3,arr4 }; 

        Arrays.sort(arr, (a,b) -> {
            if(a%2 == b%2) 
                return a - b;
            return (a%2 == 0) ? -1 :  1;
        });
        System.out.println(Arrays.toString(arr));
    }
}

public class sorting{
    public static void main(String[] args){
        int[] arr = {2,3,4,4,5,5,5};

        Map<Integer,Integer> map = new HashMap<>();
        for(int x : arr) map.put(x, map.getOrDefault(x, 0)+1 );
        Integer[] a = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(a, (x,y) -> map.get(y) - map.get(x));
        System.out.println(Arrays.toString(a));
    }
}

public class sorting{
    public static void main(String[] args){
        int[][] arr = {{3,50}, {1,90}, {2,40}};

        Arrays.sort(arr, Comparator.comparingInt(x -> x[0]));

        for(int[] x : arr)
            System.out.println(x[0] + " " + x[1]);
    }
}

Sort student by age 

public class Student{
    int age;
    String name;
    Student(int a, String n){
        age =a; name=n;
    }
    public static void main(String[] args){
        Student[] arr = {
            new Student(21, "Ram"),
            new Student(18, "kaif"),
            new Student(25, "Arun")
        };

        Arrays.sort(arr, Comparator.comparing(s -> s.age));

        for(Student s : arr)
            System.out.println(s.name+ " "+ s.age);
    }
}

Sort array and remove duplicates


public class Student{
    public static void main(String[] args){
        int[] arr = {4,2,9,4,2,1};

        Arrays.sort(arr);
        int last = -1;

        for(int x : arr){
            if(x != last){
                System.out.println(x + " ");
                last = x;
            }
        }
    }
}



import java.util.*;

class  {
    public static void main(String[] args){
        int[]  arr = {5,1,9,3};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
} 

public class sorting {

    public static void main(String[] args){
        int[] arr = {5,1,3,9,7};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

public class sorting {

    public static void main(String[] args){
        Integer[] arr = {4,1,9,2};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}

public class sorting {

    public static void main(String[] args){
        int[] arr = {5,3,8,4,2};

        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j ++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class sorting {

    public static void main(String[] args){
        int[] arr = {9,4,6,2,8};

        for(int i = 0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]) min = j;
            }

            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}

Insertion 

public class sorting {

    public static void main(String[] args){
        int[] arr = {8,6,4,2,0};
        for(int i =1; i<arr.length; i++){
            int key = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}

Merge Sort

import java.util.*;
public class Main{
    static void mergeSort(int[] arr, int l, int r){
        if( 1 >= r)
            return;
        int mid = (l + r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+l, r);
        merge(arr, l, mid, r);
    }
    static void merge(int[] arr, int l, int m, int r){
        int[] temp = new int[r-l+1];
        int i=1, j=m+1, k=0;

        while (i<=m && j<=r) {
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];

            while (i<=m) temp[k++] = arr[i++];
            while (j<=r) temp[k++] = arr[j++];

            for(int x=0; x<temp.length; x++)
                arr[l+x] = temp[x];
        }
        public static void main(String[] args){
            int[] arr = {5,1,6,2,3,4};
            mergeSort(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));
        }
    }
}

Quick Sort

import java.util.*;

public class Main {

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low,  high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;

        for(int j = low; j<high; j++){
            
        }
    }
}

Sorting a string Alphabetically 

public class Main{
    public static void main(String[] args){
        String s = "dcaga";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        System.out.println(new String(ch));
    }
}

Sort word by length

public class sorting{
    public static void main(String[] args){
        String[] arr = {"apple", "cat", "banana"};
        Arrays.sort(arr, (a,b) -> a.length() - b.length());

        System.out.println(Arrays.toString(arr));
    }
}

public class sorting{
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};

        int low=0, mid=0, high=arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int t=arr[low];
                arr[low]=arr[mid];
                arr[mid]=t;
                low++; mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                int t=arr[mid];
                arr[mid]=arr[high]; arr[high] = t;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class sorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gues the number from 1 to 100 🤞");
        int arr1 = sc.nextInt();
        int arr2 = sc.nextInt();
        int arr3 = sc.nextInt();
        int arr4 = sc.nextInt();

        Integer[] arr = {arr1,arr2,arr3,arr4 }; 

        Arrays.sort(arr, (a,b) -> {
            if(a%2 == b%2) 
                return a - b;
            return (a%2 == 0) ? -1 :  1;
        });
        System.out.println(Arrays.toString(arr));
    }
}

public class sorting{
    public static void main(String[] args){
        int[] arr = {2,3,4,4,5,5,5};

        Map<Integer,Integer> map = new HashMap<>();
        for(int x : arr) map.put(x, map.getOrDefault(x, 0)+1 );
        Integer[] a = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(a, (x,y) -> map.get(y) - map.get(x));
        System.out.println(Arrays.toString(a));
    }
}

public class sorting{
    public static void main(String[] args){
        int[][] arr = {{3,50}, {1,90}, {2,40}};

        Arrays.sort(arr, Comparator.comparingInt(x -> x[0]));

        for(int[] x : arr)
            System.out.println(x[0] + " " + x[1]);
    }
}

Sort student by age 

public class Student{
    int age;
    String name;
    Student(int a, String n){
        age =a; name=n;
    }
    public static void main(String[] args){
        Student[] arr = {
            new Student(21, "Ram"),
            new Student(18, "kaif"),
            new Student(25, "Arun")
        };

        Arrays.sort(arr, Comparator.comparing(s -> s.age));

        for(Student s : arr)
            System.out.println(s.name+ " "+ s.age);
    }
}

Sort array and remove duplicates


public class Student{
    public static void main(String[] args){
        int[] arr = {4,2,9,4,2,1};

        Arrays.sort(arr);
        int last = -1;

        for(int x : arr){
            if(x != last){
                System.out.println(x + " ");
                last = x;
            }
        }
    }
}



