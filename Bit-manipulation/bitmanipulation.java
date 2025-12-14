import java.util.*;
import java.util.Scanner;
// public class bitmanipulation {

//     public static void oddOReven(int n ){
//         int bitmask = 1;
//         if((n & bitmask) == 0){
//             //even
//             System.out.println("Even Number");
//         }else{
//             // Odd Number
//             System.out.println("Odd Number");
//         }
//     }
//     public static void main(String[] args){
//         oddOReven(12);
//         oddOReven(3);
//         oddOReven(976555);
//     }
// }

// public class bitmanipulation {

//     public static void main(String[] args){
//         int n = 5; // 101
//         int i = 2;
//         int bit = (n &(1 << i)) == 0 ? 0 : 1;
//         System.out.println(bit);
//     }
// }

// public class bitmanipulation {

//     public static void main(String[] args){
//         int n = 5;
//         int i = 1;
//         int ans = n | (1 << i);
//         System.out.println(ans);
//     }
// }

// public class bitmanipulation {

//     public static void main(String[] args) {
//         int n = 5;
//         int i = 2;
//         int ans = n & ~(1 << i);
//         System.out.println(ans);
//     }
// }

// public class bitmanipulation {

//     public static void main(String[] args) { // n = 5 , index i = 1 , 
//         int n = 5; 
//         int i = 1;
//         int bit = 0;

//         n = n & ~(1 << i);
//         n = n | (bit << 1);
//         System.out.println(n);
//     }
// }

// public class bitmanipulation {

//     public static void main(String[] args){
//         int n = 5; // 101
//         int i = 2;
//         int ans = n & ~(1 << i);
//         System.out.println(ans);
//     }
// }

//      Clear i-th Bit

// public class bitmanipulation {

//     public static void main(String[] args){
//         int n = 5;
//         int i = 2;
//         int ans = n & ~(1 >> i);
//         System.out.println(ans);
//     }
// }

// Update i-th Bit

// public class bitmanipulation {

//     public static void main(String[] args){
//         int n = 5; // 0101
//         int i = 1; // index of binary 1 
//         int bit = 0; // which value we want change
//         n = n & ~(1<< i);   
//         n = n | (bit << i);
//         System.out.println(n);
//     }
// }

// Check Even or  Odd
// public class bitmanipulation {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Guess the 1st number");
//         int num1  = sc.nextInt();
//         Scanner sc1 = new Scanner(System.in);
//         System.out.println("Gess the 2nd Number");
//         int num2 = sc1.nextInt();
//         System.out.println((num1 & nu) == 0 ? "Even" : "Odd-Number");
//     }
// } 

// public class bitmanipulation {

//     public static void main(String[] args){
//         int n = 7;
//         System.out.println(n << 1);
//     }
// }

// public class bitmanipulation {

//     public static void main(String[] args) {
//         int n = 8;
//         System.out.println(n >> 1);
//     }
// }

//  power of Two

// public class bitmanipulation {

//     public static void main(String[] args){
//         int n = 16;
//         System.out.println((n & (n-1)) == 0);
//     }
// }

// Count Set Bits 

// public class bitmanipulation {

//     public static void main(String[] args) {
//         int n = 29;
//         int count = 0;
//         while(n >0){
//             n = n & (n-1);
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// Convert Decimal to binary

// public class bitmanipulation {

//     public static void main(String[] args) {
//         int n = 13;
//         String bin = "";

//         while(n > 0){
//             bin = (n & 1) + bin;
//             n >>= 1;
//         }
//         System.out.println(bin);
//     }
// }


// public class bitmanipulation {

//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;
//         System.out.println(a + " " + b);
//     }
// }

// Decimal to binary

// public class bitmanipulation {

//     public static void main(String[] args) {
//         int n = 13;
//         String bin = "";

//         while(n > 0){
//             bin = (n & 1) + bin;
//             n >>= 1;
//         }
//         System.out.println(bin);
//     }
// }

// Binary to Decimal

// public class bitmanipulation {

//     public static void main(String[] args){
//         String bin = "1101";
//         int dec = 0;
//         for(int i=0; i<bin.length(); i++){
//             dec = dec * 2 + (bin.charAt(i) - '0');
//         }
//         System.out.println(dec);
//     }
// }

// XOR of Two Number , if both number are same  the zero and both number are diffrent and 1 

// public class bitmanipulation {

//     public static void main(String[] args){
//         int a = 5; 
//         int b = 6;
//         int ans = a ^ b;
//         System.out.println(ans);
//     }
// }

// Check Sign Bit

// public class bitmanipulation {

//     public static void main(String[] args){
//         int n = -5;
//         System.out.println((n >> 31 ) & 1);
//     }
// }

// Clear Last Set Bit

// public class bitmanipulation{
//     public static void main(String[] args) {
//         int n = 12;   // 11 = 1011, 12 = 1100 12 - 11 = 1000 = 8
//         System.out.println(n & (n - 1));
//     }
// }


// Find Unique Element (other twist) 

// public class bitmanipulation{

//     public static void main(String[] args) {
//         int[] arr = {2,3,4,5,3};
//         int ans = 0;

//         for(int x : arr)
//             ans ^= x;
//         System.out.println(ans);
//     }
// }

public class bitmanipulation {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        int xor = 0;

        for(int x : arr)
            xor ^= x;

        int rsb = xor & -xor;
        int a = 0, b =0;

        for(int x : arr){
            if((x & rsb) == 0)
                a ^= x;
            else b ^= x;
        }
        System.out.println(a + " " + b);
    }
}