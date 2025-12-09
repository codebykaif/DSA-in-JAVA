// public class Demo{
//     public static void main(String[] args){
//         String s = "hello";
//         int count = 0;
//         for(int i=0; i<s.length(); i++){
//             count++;
//         }
//         System.out.println("Total character" + count);
//         }
//     }


// public class Demo{
//     public static void main(String[] args){
//         String str = "madam";
//         int count = 0;
//         for(char c : str.toCharArray()){
//             if("aeiouAEIOU".indexOf(c) != -1){
//                 count++;
//             }
//             System.out.println("Total vowel :" + count);
//         }
//     }
// }   

// public class Demo{
//     public static void main(String[] args){
//         String s = "hello world";
//         int count = 0;

//         for(char c : s.toCharArray()){
//             if(Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1){
//                 count++;
//             }
//         }
//         System.out.println("Counsonate : " + count);
//     }
// }

// public class Demo{
//     public static void main(String[] args){
//         String str = "hello";
//         String rev = "";
        
//         for(int i = str.length() -1; i>=0; i--){
//             rev += str.charAt(i);
//         }
//         System.out.println("Reversed :" + rev);
//     }
// }

// Palindrom

import java.util.Arrays;
import java.util.Scanner;

// public class str{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the any letter from A to Z");
//         String s = sc.nextLine();
//         boolean isPal = true;
//         int i = 0, j = s.length() -1;

//         while (i < j) {
//             if(s.charAt(i) != s.charAt(j)){
//                 isPal = false;
//                 break;
//             }
//             i++;
//             j--;
//         }
//         if(isPal) System.out.print("Palindrom");
//         else{
//             System.out.print("Not palindrome");
//         }
//     }
// }

// public class str{
//     public static void main(String[] args){
//         String s = "Hello coder keep learning and keep growing";
//         String[] parts = s.trim().split("\\s+");
//         System.out.println("words :"+ parts.length);
//     }
// }

// public class str{
//     public static void main(String[] args){
//         String s = "h e l l w o r l d ";
//         String convertUpper = s.toUpperCase();
//         System.out.println(convertUpper);
//     }
// // }

// public class str{
//     public static void main(String[] args){
//         String s = "banana";
//         int[] ffi = new int[256];

//         for(char c : s.toCharArray()){
//             ffi[c]++;
//         }
//         for(int i = 0; i<256; i++){
//             if(ffi[i] > 0){
//                 System.out.println((char)i + " = " + ffi[i]);
//             }
//         }
//     }
// }

// public class str {

//     public static void main(String[] args){
//         String s = "hello";

//         for(int i = 0; i<s.length(); i++){
//             System.out.println(i+ " => " + s.charAt(i));
//         }
//     }
// }

// public class str{
//     public static void main(String[] args){
//         String s = "banana";
//         String updated = s.replace('a', 'x');
//         System.out.println(updated); 
//     }
// }

// public class str {

//     public static void main(String[] args){
//         String s = "education";
//         String result = s.replaceAll("[aeiouAEIOU]", "");
//         System.out.println(result);
//     }
// }

// public class str{
//     public static void main(String[] args){
//         String s = "12345";
//         boolean inNum = s.matches("\\d");
//         System.out.println(inNum ? "Only digit " : "Not digit");
//     }
// }

// public class str{
//     public static void main(String[] args){
//         String s = "bdxac";
//         char maxss = s.charAt(0);
//         for(char c : s.toCharArray()){
//             if(c > maxss) maxss = c;
//         }
//         System.out.println("Largest :" + maxss);
//     }
// }

// public class str{
//     public static void main(String[] args){
//         String s = "zxybc";
//         char min = s.charAt(0);
//         for(char b : s.toCharArray()){
//             if(b < min) 
//                 min = b;
//         }
//         System.out.println("Smallest "+ min );
//     }
// }

// remove duplicate character

// public class str{
//     public static void main(String[] args){
//         String s = "aabbccddeeff";
//         String ans = "";

//         for(char c : s.toCharArray()){
//             if(ans.indexOf(c) == -1){
//                 ans += c;
//             }
//         }
//         System.out.println(ans);
//     }
// }

public class str{
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "hisy";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}

public class strs{
    public static void main(String[] args){
        String s = "hellow world";
        String result = s.substring(0,1).toUpperCase() + s.substring(1);
        System.out.println(result);
    }
}

