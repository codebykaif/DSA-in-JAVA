import java.util.*;
import java.util.concurrent.Flow.Subscriber;

import javax.swing.plaf.synth.SynthStyle;

public class Q2 {

        public static void main(String[] args){
                for(int i=1; i<=10; i++){
                        System.out.println("Hello World" +" " + i);
                }
        }
}

public class Q2 {

        public static void main(String[] args){
                int sum = 0;
                for(int i=1; i<=10; i++){
                        sum += i;
                        
                }
                System.out.println(sum);
        }
}

public class Q2 {

        public static void main(String[] args){
                for(int i = 5; i<=50; i+= 5){
                        System.out.println("5 x "+ i + " = " +(5*i));
                }
        }
}

public class Q2 {

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your number");
                int user = sc.nextInt();
                int fact = 1;
                for(int i=1; i<=user; i++){
                        fact *= i;
                }
                System.out.println(fact);
        }
}


public class Q2 {

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Guss the number");
                int revers = sc.nextInt();
                for(int i=revers; i>=1; i--)
                System.out.println(i);
        }
}

public class Q2 {

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number");
                int num = sc.nextInt();
                int  sum = 0;
                for(int i=2; i<=num; i+= 2){
                        sum += i;
                }
                System.out.println(sum);
        }
}

public class loop {

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet character");
        char aplha = sc.next().charAt(0);
        for(char  ch='A'; ch<='Z'; ch++ ){
            System.out.println(ch + " ");
        }
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(; num !=0; num/=10){
            count++;
        }    
        System.out.println(count);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guss number");
        int num = sc.nextInt();
        int rev = 0;
        for(; num!=0; num/=10){
            rev = rev*10 + num%10;
        }
        System.out.println(rev);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        for(int i=1; i<=num; i++){
            System.out.println(num1 + " ");
            int tem = num1+num2;
            num1 = num2;
            num2 = tem;
        }
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check number prime or not");
        long number = sc.nextLong();
        int count = 0;
        for(int i=2; i<number; i++){
            if(number%i == 0){
                count++;
                break;
            }
        }
            if(count == 0 && number > 1)
            System.out.println("Prime Number");
            else{
                System.out.println("Not prime number");
            }
        }
    }

public class loop {

    public static void main(String[] args){
        for(int i=2; i<=50; i++){
            int c = 0;
            for(int j=2; j<i; j++){
                if(i%j== 0){
                    c++;
                    break;
                }
            }
                if(c == 0)
                System.out.println(i + " ");
            }
        }
    }


public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strick character for creating pattern");
        int pattern = sc.nextInt();
        for(int i=1; i<=pattern; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=pattern-1; i>=1; i--){
            for(int j=pattern; j>i; j--){
                System.out.print(" ");  // space
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");  // stars
            }
            System.out.println();
        }
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(; num>0; num/=10){
            sum += num%10;
        }
        System.out.println(sum);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        int prod = 1;
        for(; num>0; num/=10){
            prod *= num%10;
        }
        System.out.println(prod);
    }
}

Cont even digiti in number
public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(; num>0; num/=10){
            if((num%10)%2==0) 
            count ++;
        }
        System.out.println(count);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, n=num;
        for(; n>0; n/=10){
            int d = n%10;
            sum += d*d*d;
        }
        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number for checking Armstrong or Not");
        int num = sc.nextInt();
        int sum = 0;
        int n = num;
        for(; n>0; n/=10){
            int d = n%10;
            sum += d*d*d;
        }
        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
    }
}
