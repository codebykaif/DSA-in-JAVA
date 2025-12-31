class Employee{
    void salary(){
        System.out.println("Employee salary");
    }
}
class Developer extends Employee{
    void salary(){
        System.out.println("Developer Salary + bouns");
    }
}
public class Polymorphism{
    public static void main(String[] args){
        Employee e = new Employee();
        e.salary();
    } 
}

class Employee{
    void work(){
        System.out.println("Employee works");
    }                                                                                                               
}
class Manager extends Employee{
    void work(){
        System.out.println("Manager manegs team");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Employee e = new Manager();
        e.work();
    }
}

class Bank{
    void intrest(){
        System.out.println("General Intrest");
    }
}
class SBI extends Bank{
    void intrest(){
        System.out.println("SBI intrest 6%");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Bank b = new SBI();
        b.intrest();
    }
}

class shap{
    void area(){
        System.out.println("Shap area");
    }
}
class Circle extends shap{
    void area(){
        System.out.println("Circle area");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        shap s = new Circle();
        s.area();
    }
}

class vehicle{
    void speed(){
        System.out.println("Vehicle speed");
    }
}
class Bike extends vehicle{
    void speed(){
        System.out.println("Bike speed 80");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        vehicle v = new Bike();
        v.speed();
    }
}


class Mobile{
    void feature(){
        System.out.println("Calling");
    }
}
class SmartPhone extends Mobile{
    void feature(){
        System.out.println("Calling + Internet");
    }
}

public class Polymorphism {

    public static void main(String[] args){
        Mobile m = new SmartPhone();
        m.feature();
    }
}

class Teacher{
    void teac(){
        System.out.println("Teaching");
    }
}
class MathTeacher extends Teacher{
    void teach(){
        System.out.println("Teaching Math");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Teacher t = new MathTeacher();
        t.teac();
    }
}

class User{
    void access(){
        System.out.println("User access");
    }
}
class Admin extends User{
    void access(){
        System.out.println("Admin full access");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        User u = new Admin();
        u.access();
    }
}

class Food{
    void eat(){
        System.out.println("Eating food");
    }
}
class Pizza extends Food{
    void eat(){
        System.out.println("Eating Pizza");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Food f = new Pizza();
        f.eat();
    }
}

class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog bars");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
    }
}

class Payment{
    void pay(){
        System.out.println("Payment is procening");
    }
}
class UPI extends Payment{
    void pay(){
        System.out.println("UPI Payment");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Payment p = new UPI();
        p.pay();
    }
}

class login{
    void verify(){
        System.out.println("Password login");
    }
}
class OTPLogin extends login{
    void verify(){
        System.out.println("OTP Login");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        login l = new OTPLogin();
        l.verify();
    }
}

class Notification{
    void send(){
        System.out.println("Sending Notification");
    }
}
class Email extends Notification{
    void send(){
        System.out.println("Sending e-mail");
    }
}
public class Polymorphism {
public static void main(String[] args){
    Notification n = new Email();
    n.send();
    }
}

class Game{
    void play(){
        System.out.println("Playing game");
    }
}
class Cricket extends Game{
    void paly(){
        System.out.println("Playing Cricket");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Game g = new Cricket();
        g.play();
    }
}

class Employee{
    void pay(){
        System.out.println("Salary paid");
    }
}
class Intern extends Employee{
    void pay(){
        System.out.println("Stipend paid");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Employee e = new Intern();
        e.pay();
    }
}

class Add{
    int sum(int a, int b){
        return a + b;
    }
}
public class Polymorphism {
    public static void main(String[] args){
        Add a = new Add();
        System.out.println(a.sum(10, 20));
    }
}

class Add{
    int sum(int a, int b){
        return a + b;
    }
    int sum (int a, int b, int c){
        return a + b + c;
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Add a = new Add();
        System.out.println(a.sum(01, 10, 10));
    }
}

class Area{
    void area(int r){
        System.out.println(3.14 * r * r);
    }
    void area(int l, int b){
        System.out.println(l * b);
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Area a = new Area();
        a.area(10, 11);
    }
}

class Demo{
    void show(int a, String b){
        System.out.println(a + " " + b);
    }
    void show(String b, int a){
        System.out.println(b + " " + a);
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Demo d = new Demo();
        d.show(10, "hello");
        d.show("Hii", 23);
    }
}

class Student{
    Student(){
        System.out.println("Default Constructor");
    }
    Student(String name){
        System.out.println("Name : " + name);
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s);
    }
}


    public class Polymorphism {
    
        
    public static void main(String[] args){
        System.out.println("Main method");
        main(10);
    }
    public static void main(int a){
        System.out.println(a);
        }
    }

    Method Overriding (Run Time) Basi ;

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Animal a = new Animal();
        a.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animals make noise");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Animal a = new Animal();
        a.sound();
    }
}

class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawin Circle");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Shape s = new Shape();
        s.draw();
    }
}

class Bank{
    int rate(){
        return 5;
    }
}
class SBI extends Bank{
    int rate(){
        return 7;
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Bank b = new Bank();
        System.out.println(b.rate());
    }
}

class Vehicle{
    void run(){
        System.out.println("vehicle runing");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("Bike runing safely");
    }
}
public class Polymorphism {

    public static void main(String[] args){
        Vehicle v = new Vehicle();
        v.run();
    }
}

