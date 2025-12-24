public class method {
    static void sayHello(){
        System.out.println("Hello World");
    }
    public static void main(String[] args){
        sayHello();
    }
}

public class method {

    static void printName(String name){
        System.out.println("Hello" + name + "!");
    }
    public static void main(String[] args){
        printName("kaif");
    }
}

public class method{
    static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        System.out.println(add(5,7));
    }
}


public class method{
        static int add(int a, int b){
            return a+b;
        }
        public static void main(String[] args){
            System.out.println(add(5,9));
        }
    }

    public class method {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 9));
    }
}

public class method {

    static int square(int n){
        return n * n;
    }
    public static void main(String[] args){
        System.out.println(square(8));
    }
}

public class method{
    static void evenOdd(int n){
        if(n%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
    public static void main(String[] args){
        evenOdd(765);
    }
}

public class method{
    static int max(int a ,int b){
        return (a>b) ? a :b;
    }
    public static void main(String[] args){
        System.out.println(max(20,30));
    }
}

public class method {

    static int factorial(int n){
        int fact = 1;
        for(int i =1; i<=n; i++) fact *= i;
        return fact;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }
}

public class method{
    static int factorial(int n ){
        int facat = 1;
        for(int i=1; i<=n; i++)
        facat *= i;
        return facat;
    }
    public static void main(String[] args){
        System.out.println(factorial(7));
    }
}

public class method{
    static double area(double r){
        return Math.PI * r *r;
    }
    public static void main(String[] args){
        System.out.println(area(5));
    }
}



public class method{
    static int reverse(int n){
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + n % 10;
            n/= 10;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(reverse(12345));
    }
}

public class method{
    static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i<= n / 2; i++){
        if(n % i == 0) return false;
    }
    return true;
}

public static void main(String[] args){
    System.out.println(isPrime(7));
}
}
public class method{
    static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i =2; i<= n/2; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int  num = sc.nextInt();

        if(isPrime(num))
        System.out.println(num + " Is prime number");
        else
        System.out.println(num + " Is not prime number");

        sc.close();
    }
}

public class method{
    static int countDigit(int n){
        int count = 0;
        while (n != 0) {
            count++;
            n/= 10;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(countDigit(76665));
    }
}


public class method{
    static boolean isPalindrome(String s){
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("LeveL"));
    }
}

import java.util.*;
public class method{
    static boolean  isPalindrome(String s){
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a string for checking a isPalindrome or not");
        String  str = sc.nextLine();
        if(str.isEmpty()){
            System.out.println("Invalid Syntax please check your character");
        }
        else if(isPalindrome(str)){
        System.out.println(str + " This string is palindrom");
        }
        else{
        System.out.println(str + " This string is not palindrome");
    }
}

}

public class method{
    static int poer(int base, int exp){
        int result = 1;
        for(int i =0; i<exp; i++)
        result *= base;
        return result;
    }
    public static void main(String[] args){
        System.out.println(poer(2, 5));
    }
}

public class method {

    static int fib(int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        for(int i=0; i<10; i++)
        System.out.print(fib(i) + " ");
    }
}

public class method {
    public static void hollo_rectangl(int totrow, int totcol){
        // outer loop
        for(int i=1; i<=totrow; i++){
            for(int j=1; j<=totcol; j++){
                // Cell i,  j 
                if(i == 1 || i == totrow ||  j == 1 || j == totcol ){
                    // Boundry Cell
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        
        System.out.println();
    }
}
public static void main(String[] args){
    hollo_rectangl(4,4);
}
}
