// import java.util.*;
// import java.util.concurrent.Flow.Subscriber;

// import javax.swing.plaf.synth.SynthStyle;

// public class Q2 {

//         public static void main(String[] args){
//                 for(int i=1; i<=10; i++){
//                         System.out.println("Hello World" +" " + i);
//                 }
//         }
// }

// public class Q2 {

//         public static void main(String[] args){
//                 int sum = 0;
//                 for(int i=1; i<=10; i++){
//                         sum += i;
                        
//                 }
//                 System.out.println(sum);
//         }
// }

// public class Q2 {

//         public static void main(String[] args){
//                 for(int i = 5; i<=50; i+= 5){
//                         System.out.println("5 x "+ i + " = " +(5*i));
//                 }
//         }
// }

// public class Q2 {

//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter your number");
//                 int user = sc.nextInt();
//                 int fact = 1;
//                 for(int i=1; i<=user; i++){
//                         fact *= i;
//                 }
//                 System.out.println(fact);
//         }
// }


// public class Q2 {

//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Guss the number");
//                 int revers = sc.nextInt();
//                 for(int i=revers; i>=1; i--)
//                 System.out.println(i);
//         }
// }

// public class Q2 {

//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter a number");
//                 int num = sc.nextInt();
//                 int  sum = 0;
//                 for(int i=2; i<=num; i+= 2){
//                         sum += i;
//                 }
//                 System.out.println(sum);
//         }
// }

// public class loop {

// public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any alphabet character");
//         char aplha = sc.next().charAt(0);
//         for(char  ch='A'; ch<='Z'; ch++ ){
//             System.out.println(ch + " ");
//         }
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int count = 0;
//         for(; num !=0; num/=10){
//             count++;
//         }    
//         System.out.println(count);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Guss number");
//         int num = sc.nextInt();
//         int rev = 0;
//         for(; num!=0; num/=10){
//             rev = rev*10 + num%10;
//         }
//         System.out.println(rev);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int num1 = 0;
//         int num2 = 1;
//         for(int i=1; i<=num; i++){
//             System.out.println(num1 + " ");
//             int tem = num1+num2;
//             num1 = num2;
//             num2 = tem;
//         }
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Check number prime or not");
//         long number = sc.nextLong();
//         int count = 0;
//         for(int i=2; i<number; i++){
//             if(number%i == 0){
//                 count++;
//                 break;
//             }
//         }
//             if(count == 0 && number > 1)
//             System.out.println("Prime Number");
//             else{
//                 System.out.println("Not prime number");
//             }
//         }
//     }

// public class loop {

//     public static void main(String[] args){
//         for(int i=2; i<=50; i++){
//             int c = 0;
//             for(int j=2; j<i; j++){
//                 if(i%j== 0){
//                     c++;
//                     break;
//                 }
//             }
//                 if(c == 0)
//                 System.out.println(i + " ");
//             }
//         }
//     }


// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter strick character for creating pattern");
//         int pattern = sc.nextInt();
//         for(int i=1; i<=pattern; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//         for(int i=pattern-1; i>=1; i--){
//             for(int j=pattern; j>i; j--){
//                 System.out.print(" ");  // space
//             }
//             for(int j=1; j<=(2*i-1); j++){
//                 System.out.print("*");  // stars
//             }
//             System.out.println();
//         }
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         for(; num>0; num/=10){
//             sum += num%10;
//         }
//         System.out.println(sum);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt(); 
//         int prod = 1;
//         for(; num>0; num/=10){
//             prod *= num%10;
//         }
//         System.out.println(prod);
//     }
// }

// Cont even digiti in number
// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int count = 0;
//         for(; num>0; num/=10){
//             if((num%10)%2==0) 
//             count ++;
//         }
//         System.out.println(count);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0, n=num;
//         for(; n>0; n/=10){
//             int d = n%10;
//             sum += d*d*d;
//         }
//         System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc =  new Scanner(System.in);
//         System.out.println("Enter a number for checking Armstrong or Not");
//         int num = sc.nextInt();
//         int sum = 0;
//         int n = num;
//         for(; n>0; n/=10){
//             int d = n%10;
//             sum += d*d*d;
//         }
//         System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
//     }
// }

// -------------------------------------  While Loop ----------------------------------------

// public class loop {

//     public static void main(String[] args){
//         int i = 1;
//         while (i<10) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int i = 10;
//         while (i>=1) {
//             System.out.println(i);
//             i--;
//         }
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int i = 1;
//         int sum = 0;
//         while (i<= num) {
//             sum += i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int count = 0;
//         while (num>0) {
//             count++;
//             num/=10;
//         }
//         System.out.println(count);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int rev = 0;
//         while (num>0) {
//             rev = rev*10 + num%10;
//             num/=10;
//         }
//         System.out.println(rev);
//     }
// }

// public class loop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         int i = 1;
//         while (i<=num) {
//             sum += i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int digit = sc.nextInt();
//         int count = 0;
//         while (digit>0) {
//             count++;
//             digit/=10;
//         }
//         System.out.println(count);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int rev = 0;
//         while (n>0) {
//             rev = rev*10 + n%10;  // Last digit add     (1234) 0*10 +4 = 4, last digit add 4, , 4*10+ last digit 3,43 = 43...
//             n/=10;                // Remopve last digit
//         }
//         System.out.println(rev);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int n = 123, sum = 0;
//         while (n>0) {
//             sum += n%10;
//             n/=10;
//         }
//         System.out.println(sum);
//     }
// }

// 

// public class loop {

//     public static void main(String[] args){
//         int i=2;
//         while (i<=50) {
//             System.out.println(i);
//             i +=2;
//         }
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int i = 1;
//         int fact = 1;
//         while (i<=5) {
//             fact *= i;
//             i++;
//         }
//         System.out.println("Factorila " + fact);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int base = 2, exp = 5, res = 1;
//         while(exp>0){
//             res*= base;
//             exp--;
//         }
//         System.out.println(res);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int i=2;
//         int sum = 0;
//         while (i<=20) {
//             sum += i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String vowel = sc.nextLine();
//         int i=0, count=0;
//         while (i<vowel.length()) {
//             char ch=vowel.charAt(i);
//             if("aeiou".indexOf(ch)!=-1)count++;
//             i++;
//         }
//         System.out.println(count);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int palindrome = sc.nextInt();
//         int rev = 0;
//         int tem = palindrome;
//         while (palindrome>0) {
//             rev = rev*10 + palindrome%10;
//             palindrome/= 10;
//         }
//         System.out.println(tem == rev ? "Palindrome" : " Not palindrome");
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int n=10, i=1, sum=0;
//         while (i<=n) {
//             sum +=i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int i = 1;
//         while (i<=num) {
//             System.out.println(num);
//             i++;
//         }
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number for create a table");
//         int mul = sc.nextInt();
//         int i = 1;
//         while (i<=10) {
//             System.out.println(mul + " X " + i + " = " +  (mul*i));
//             i++;
//         }
//         sc.close();
//     }
// }

// ------------------------------------------------ Do While Loop ---------------------------------------

// public class loop {
//     public static void main(String[] args){
//         int i = 1;
//         do{
//             System.out.println(i);
//             i++;
//         }
//         while(i<=10);
//     }
    
// }

// public class loop {

//     public static void main(String[] args){
//         int i = 2;
//         do{
//             System.out.println(i);
//             i+=2;
//         }
//         while(i<=20);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Eenter the number for revrsing");
//         int revers = sc.nextInt();
//         int revs = 0;
//         do{
//             revs = revs*10 + revers%10;
//             revers/= 10;
//         }
//         while(revers>0);
//         System.out.println(revs);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int n = 66433, rev = 0;
//         do{
//             rev = rev*10 + n%10;
//             n/=10;
//         }while(n>0);
//         System.out.println(rev);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sun = 0;
//         do{
//             sun += num%10;
//             num/=10;
//         }while(num>0);
//         System.out.println(sun);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int fact = 1, i = 1;
//         do{
//             fact *= i;
//             i++;
//         }while(i<= num);
//         System.out.println(fact);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int i = 1;
//         do{
//             System.out.println("Hello");
//             i++;
//         }while(i<=5);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int i = 1;
//         do{
//             System.out.println(i);
//             i+= 2;
//         }while(i<=100);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int count = 0;
//         do{
//             count++;
//             num/=10;
//         }while(num>0);
//     System.out.println(count);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int i = 1, sum = 0;
//     do{
//         sum += 1;
//         i++;
//     }while(i<=num);
//     System.out.println(sum);
// }
// }


// public class loop {

//     public static void main(String[] args){
//         for(int i=0; i<5; i++){
//             System.out.println("Hello " + i);
//             i += 2;
//         }
        
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         Scanner sc = new Scanner( System.in);
//         int num ;
//         int choise ;
//         int evensum = 0;
//         int oddsum = 0;

//         do{
//             System.out.println("Enter the number");
//             num =  sc.nextInt();
//             if(num %2 == 0){
//             evensum += num;
//             }
//         else{
//             oddsum += num;
//         }
//         System.out.println("Do you want to  continue ? please 1 for yes or noo ");
//         choise = sc.nextInt();
    
//             } 
//             while(choise == 1);
//             System.out.println("Sum of even number" + evensum);
//             System.out.println("Sum of oddsum" + oddsum);
//         }
// }

// public class loop {

//     public static void main(String[] args){
//         int i = 1, n = 6;
//         do{
//             System.out.println(n+" x "+i+" = " +(n*i));
//             i++;
//         }while(i<=10);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int n = 5;
//         do{
//             System.out.println(n>0 ? "possitive" : "Negative");
//         }while(false);
//     }
// }

// public class loop {

//     public static void main(String[] args){
//         int base = 3, exp=3, res=1;
//         do{
//             res*=base;
//             exp--;
//         }while(exp>0);
//         System.out.println(res);
//     }
// }