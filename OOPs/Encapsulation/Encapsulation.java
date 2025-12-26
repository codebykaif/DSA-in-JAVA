 import java.util.*;
 import java.util.Scanner; 

Student Marks (Basic Encapsulation)
 class Student{
     private int marks;

    public void setMarks(int m){
         if(m >= 0 && m <=  100){
            marks = m;
        }
    }
      public int getMarks(){
         return marks;
     }
 }
 public class Encapsulation {

     public static void main(String[] args){
         Student s = new Student();
         s.setMarks(87);
         System.out.println(s.getMarks());
     }
 }

// Bank with Condition

class Account {
    private int balance = 1000;

    public void withdrow(int amt){
        if(amt <= 1000){
            balance -= amt;
        }
    }
    public int getBalance(){
        return balance;
    }
}

public class Encapsulation{
public static void main(String[] args){
    Account a = new Account();
    a.withdrow(300);
    System.out.println(a.getBalance());
    }
}

// Bank Account balance

// class  BankAccount{
// private double balance;

// public void deposite(double amount){
//     balance += amount;
//     }
//     public double getBalance(){
//         return balance;
//     }
// }

// public class Encapsulation {
// public static void main(String[] args){
//     BankAccount b = new BankAccount();
//     b.deposite(5000);
//     System.out.println(b.getBalance());    
//     }
    
// }

// withdrow with Condition

class Account{
    private int balance = 1000;

    public void withdrow(int amt){
        if(amt <= balance){
            balance -= amt;
        }
        else{
            System.out.println("Insuficent Balance");
        }
    }
    public int getBalance(){
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Account a = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ammount for withdrow");
        int amt = sc.nextInt();
        a.withdrow(amt);
        System.out.println(a.getBalance()+  "₹  Your Availbale balance");
    }
}

// Read only DATA
// class Employee{
//     private String id = "EMP101";
    
//     public String getId(){
//         return id;
//     }
// }

// public class Encapsulation {

//     public static void main(String[] args){
//         Employee e = new Employee();
//         System.out.println(e.getId());
//     }
// }

// Write Only password

// class User{
//     private String password;

//     public void setPassword(String p){
//         password = p;
//     }
// }
// public class Encapsulation {
//     public static void main(String[] args){
//         User u = new User();
//         u.setPassword("secrete1234");
//     }
// }

// Age Validation

// class Person{
//     private int age;

//     public void setAge(int a){
//         if(a >= 18)
//             age = a;
//     }
//     public int getAge(){
//         return age;
//     }
// }
// public class Encapsulation{
//     public static void main(String[] args){
//         Person p = new Person();
//         p.setAge(20);
//         System.out.println(p.getAge());
//     }
// }

//  product price

// class Product{
//     private int price;

//     public void setPrice(int p){
//         if (p > 0)
//             price = p;
//     }
//     public int getPrice(){
//         return price;
//     }
// }

// public class Encapsulation {

//     public static void main(String[] args){
//         Product p = new Product();
//         p.setPrice(999);
//         System.out.println(p.getPrice()); 
//     }
// }

// Encapsulation with Constructor

// class Car{
//     private String model;
//     public Car(String m){
//         model = m;
//     }
//     public String getModel(){
//         return model;
//     }
// }
// public class Encapsulation {
//     public static void main(String[] args){
//         Car c = new Car("BMW");
//         System.out.println(c.getModel());
//     }
// }

//     Counter Increment

// class Counter{
//     private int count;

//     public void increment(){
//         count++;
//     }
//     public int getCount(){
//         return count;
//     }
// }
// public class Encapsulation {
// public static void main(String[] args){
//     Counter c = new Counter();
//     c.increment();
//     c.increment();
//     c.increment();
//     System.out.println(c.getCount());
//     }    
// }

// Encapsulation with boolean

// class Light{
//     private boolean isOn;

//     public void turnOn(){
//         isOn = true;
//     }
//     public boolean getStatus(){
//         return isOn;
//     }
// }

// public class Encapsulation {

//     public static void main(String[] args){
//         Light l = new Light();
//         l.turnOn();
//         System.out.println(l.getStatus());
//     }
// }

//Max Limit Encapsulation

// class Limit{
//     private int value;

//     public void setValue(int v){
//         if(v <= 100)
//             value = v;
//     }
//     public int getValue(){
//         return value;
//     }
// }
// public class Encapsulation {

//     public static void main(String[] args){
//         Limit l = new Limit();
//         l.setValue(80);
//         System.out.println(l.getValue());
//     }
// }

// track charging 

// class Mobile{
//     private int battry = 100;

//     public void useBattery(int b){
//         battry -= b;
//     }
//     public int getBattery(){
//         return battry;
//     }
// }
// public class Encapsulation {

// public static void main(String[] args){
//     Mobile m = new Mobile();
//     m.useBattery(70);
//     System.out.println(m.getBattery());
//     }
// }

// Encapsulation Array logic

// class ArraySum{
//     private int[] arr = {1,2,3,4};

//     public int getSum(){
//         int sum = 0;
//         for(int i : arr)
//             sum += i;
//             return sum;
//         }
//     }
//     public class Encapsulation {
    
//         public static void main(String[] args){
//             ArraySum a = new ArraySum();
//             System.out.println(a.getSum());
//         }
//     }

// String Encapsulation to capital letter

// class Name{
//     private String name;

//     public void setName(String  n){
//         name = n.toUpperCase();
//     }
//     public String getName(){
//         return name;
//     }
// }
// public class Encapsulation {

//     public static void main(String[] args){
//         Name n = new Name();
//         n.setName("kaif");
//         System.out.println(n.getName());
//     }
// }

//  password length check


// class Login{
//     private String password;

//     public void setPassword(String p){
//         if(p.length() <= 6){
//             password = p;
//     }else{
//         System.out.println("Password must be at least 6 character");
//     }
// }
//     public String getPassword(){
//         return password;
//     }
// }

// public class Encapsulation {

//     public static void main(String[] args){
//         Login l = new Login();
//         l.setPassword("u8gevjg8");
//         System.out.println(l.getPassword());
//     }
// }

//Encapsulation wit Math

// class Sqaure{
//     private int num;

//     public void setNum(int n ){
//         num = n;
//     }
//     public int getSquare(){
//         return num * num;
//     }
// }
// public class Encapsulation {

//     public static void main(String[] args){
//         Sqaure s = new Sqaure();
//         s.setNum(5);
//         System.out.println(s.getSquare());
//     }
// }

// Tempreture Control

// class Temp{
//     private int temp;

//     public void setTemp(int t){
//         if(t >= 0 && t <= 50)
//             temp = t;
//     }
//     public int geTemp(){
//         return temp;
//     }
// }
// public class Encapsulation {

//     public static void main(String[] args){
//         Temp t = new Temp();
//         t.setTemp(51);
//         System.out.println(t.geTemp());
//     }
// }

// Encapsulation Condition Counter
// class EvenCounter{
//     private int count;

//     public void add(int n){
//         if(n % 2 == 0)
//             count++;
//     }
//     public int getCount(){
//         return count;
//     }
// }
// public class Encapsulation {

//     public static void main(String[] args){
//         EvenCounter e = new EvenCounter();
//         e.add(2);
//         e.add(3);
//         e.add(4);
//         System.out.println(e.getCount());
//     }
// }

//Student Result 

// class Result{
//     private int marks;

//     public void setMarks(int m){
//         marks = m;
//     }
//     public String getResult() {
//         return marks >= 40 ? "Pass" : "Fail";
//     }
// }
// public class Encapsulation {

//     public static void main(String[] args){
//         Result r = new Result();
//         r.setMarks(55);
//         System.out.println(r.getResult());
//     }
// }

// Enc apsulation + Min Value 

class MinFinder{
    private int[] arr = {5,3,9};

    public int getMin(){
        int min = arr[0];
        for(int i : arr)
            if(i < min)
                min = i;
            return min;
    }
}
public class Encapsulation {

    public static void main(String[] args){
        MinFinder m =  new MinFinder();
        System.out.println(m.getMin());
    }
}
