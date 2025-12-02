public class loop {
    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
    
}

public class loop {

    public static void main(String[] args){
        int i = 2;
        do{
            System.out.println(i);
            i+=2;
        }
        while(i<=20);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eenter the number for revrsing");
        int revers = sc.nextInt();
        int revs = 0;
        do{
            revs = revs*10 + revers%10;
            revers/= 10;
        }
        while(revers>0);
        System.out.println(revs);
    }
}

public class loop {

    public static void main(String[] args){
        int n = 66433, rev = 0;
        do{
            rev = rev*10 + n%10;
            n/=10;
        }while(n>0);
        System.out.println(rev);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sun = 0;
        do{
            sun += num%10;
            num/=10;
        }while(num>0);
        System.out.println(sun);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1, i = 1;
        do{
            fact *= i;
            i++;
        }while(i<= num);
        System.out.println(fact);
    }
}

public class loop {

    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println("Hello");
            i++;
        }while(i<=5);
    }
}

public class loop {

    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println(i);
            i+= 2;
        }while(i<=100);
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        do{
            count++;
            num/=10;
        }while(num>0);
    System.out.println(count);
    }
}

public class loop {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int i = 1, sum = 0;
    do{
        sum += 1;
        i++;
    }while(i<=num);
    System.out.println(sum);
}
}


public class loop {

    public static void main(String[] args){
        for(int i=0; i<5; i++){
            System.out.println("Hello " + i);
            i += 2;
        }
        
    }
}

public class loop {

    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        int num ;
        int choise ;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.println("Enter the number");
            num =  sc.nextInt();
            if(num %2 == 0){
            evensum += num;
            }
        else{
            oddsum += num;
        }
        System.out.println("Do you want to  continue ? please 1 for yes or noo ");
        choise = sc.nextInt();
    
            } 
            while(choise == 1);
            System.out.println("Sum of even number" + evensum);
            System.out.println("Sum of oddsum" + oddsum);
        }
}

public class loop {

    public static void main(String[] args){
        int i = 1, n = 6;
        do{
            System.out.println(n+" x "+i+" = " +(n*i));
            i++;
        }while(i<=10);
    }
}

public class loop {

    public static void main(String[] args){
        int n = 5;
        do{
            System.out.println(n>0 ? "possitive" : "Negative");
        }while(false);
    }
}

public class loop {

    public static void main(String[] args){
        int base = 3, exp=3, res=1;
        do{
            res*=base;
            exp--;
        }while(exp>0);
        System.out.println(res);
    }
}
