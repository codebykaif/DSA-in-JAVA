
public class loop {

    public static void main(String[] args){
        int i = 1;
        while (i<10) {
            System.out.println(i);
            i++;
        }
    }
}

public class loop {

    public static void main(String[] args){
        int i = 10;
        while (i>=1) {
            System.out.println(i);
            i--;
        }
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i<= num) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num>0) {
            count++;
            num/=10;
        }
        System.out.println(count);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num>0) {
            rev = rev*10 + num%10;
            num/=10;
        }
        System.out.println(rev);
    }
}

public class loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=num) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int count = 0;
        while (digit>0) {
            count++;
            digit/=10;
        }
        System.out.println(count);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n>0) {
            rev = rev*10 + n%10;  // Last digit add     (1234) 0*10 +4 = 4, last digit add 4, , 4*10+ last digit 3,43 = 43...
            n/=10;                // Remopve last digit
        }
        System.out.println(rev);
    }
}

public class loop {

    public static void main(String[] args){
        int n = 123, sum = 0;
        while (n>0) {
            sum += n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}



public class loop {

    public static void main(String[] args){
        int i=2;
        while (i<=50) {
            System.out.println(i);
            i +=2;
        }
    }
}

public class loop {

    public static void main(String[] args){
        int i = 1;
        int fact = 1;
        while (i<=5) {
            fact *= i;
            i++;
        }
        System.out.println("Factorila " + fact);
    }
}

public class loop {

    public static void main(String[] args){
        int base = 2, exp = 5, res = 1;
        while(exp>0){
            res*= base;
            exp--;
        }
        System.out.println(res);
    }
}

public class loop {

    public static void main(String[] args){
        int i=2;
        int sum = 0;
        while (i<=20) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String vowel = sc.nextLine();
        int i=0, count=0;
        while (i<vowel.length()) {
            char ch=vowel.charAt(i);
            if("aeiou".indexOf(ch)!=-1)count++;
            i++;
        }
        System.out.println(count);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        int rev = 0;
        int tem = palindrome;
        while (palindrome>0) {
            rev = rev*10 + palindrome%10;
            palindrome/= 10;
        }
        System.out.println(tem == rev ? "Palindrome" : " Not palindrome");
    }
}

public class loop {

    public static void main(String[] args){
        int n=10, i=1, sum=0;
        while (i<=n) {
            sum +=i;
            i++;
        }
        System.out.println(sum);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while (i<=num) {
            System.out.println(num);
            i++;
        }
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for create a table");
        int mul = sc.nextInt();
        int i = 1;
        while (i<=10) {
            System.out.println(mul + " X " + i + " = " +  (mul*i));
            i++;
        }
        sc.close();
    }
}
