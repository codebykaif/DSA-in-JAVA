// Abstraction using method Overriding
class Animal{
    void sound(){
        System.out.println("Animals sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
    }
}

// Multiple object with loop
class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Animal[] a = {new Dog(), new Cat()};
        for(Animal  x : a){
            x.sound();
        }
    }
}

//Abstract class basic example

abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Shape s = new Circle();
        s.draw();
    }
}

// Abstract classwith two children

abstract class vehicle{
    abstract void start();
}
class Bike extends vehicle{
    void start(){
        System.out.println("Bike start");
    }
}
class Car extends vehicle{
    void start(){
        System.out.println("Car start");
    }
}
public class Abstraction {
    public static void main(String[] args){
        vehicle v1 = new Bike();
        vehicle v2 = new Car();

        v1.start();
        v2.start();
    }
}

// Abstraction + Array

abstract class Employee{
    abstract void salary();
}
class Developer extends Employee{
    void salary(){
        System.out.println("Developer salary 50k");
    }
}
class Tester extends Employee{
    void salary(){
        System.out.println("Tester salary 40k");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Employee[] e = {new Developer(), new Tester()};
        for(Employee x : e){
            x.salary();
        }
    }
}

// Abstract class with concrete method

abstract class Bank{
    abstract void rateofIntrest();
    void branch(){
        System.out.println("Bank has branches");
    }
}
class SBI extends Bank{
    void rateofIntrest(){
        System.out.println("SBI ROI 7%");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Bank b = new SBI();
        b.rateofIntrest();
        b.branch();
    }
}

// Interface Abstraction

interface Animal{
    void sound();
}
class Cow implements Animal{
    public void sound(){
        System.out.println("Cow moos");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Animal a = new Cow();
        a.sound();
    }
}

// Interface with multiple classes

interface Payment{
    void pay();
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Payment via UPI");
    } 
}
class Card implements Payment{
    public void pay(){
        System.out.println("Payment via Card");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Payment p1 = new UPI();
        Payment p2 = new Card();

        p1.pay();
        p2.pay();
    }
}

// Abstract with method call inside loop
abstract class Shape{
    abstract void area();
}
class Square extends Shape{
    void area(){
        System.out.println("Area of square");
    }
}
class Rectangle extends Shape{
    void area(){
        System.out.println("Area of rectangle");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Shape[] s = {new Square(), new Rectangle()};
        for(Shape x : s){
            x.area();
        }
    }
}

// Abstract class Constructor

abstract class Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
    abstract void sound();
}
class Dog extends Animal{
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
    }
}

// abstract class Mobile{
    abstract void price();
    }

class Sumsung extends Mobile{
    void price(){
    System.out.println("Sumsung Price 1,50,000");
    }
}

class Apple extends Sumsung{
    void price(){
        System.out.println("Apple price 1,20,000");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Sumsung m1 = new Apple();
        Sumsung m2 = new Sumsung();
        m1.price();
        m2.price();
    }
}

// ABstract class Stuent method getResult

import javax.sound.midi.SysexMessage;

abstract class Student{
    abstract void getResult();
}

class PassedOut extends Student{
    void getResult(){
        System.out.println("This are Student Passed in 2025");
    }
} 
 class Failed extends Student{
    void getResult(){
        System.out.println("This are Student Fail in 2025");
    }
 }
 public class Abstraction {
 
    public static void main(String[] args){
        Student p =  new PassedOut();
        Student f = new Failed();
        p.getResult();
        f.getResult();
    }
 }

interface flyable{
    void fly();
}
class Bird implements flyable{
    public void fly(){
        System.out.println("Birds are flies using wings");
    }
}
class plane implements flyable{
    public void fly(){
        System.out.println("Plane flies using engine");
    }
}
public class Abstraction {

    public static void main(String[] args){
        flyable f1 = new Bird();
        flyable f2 = new plane();
        f1.fly();
        f2.fly(); 
    }
}

abstract class Machine{
    abstract void work();
}
class Tofho extends Machine{
    public void work(){
        System.out.println("tofho is build-up a paneer ");
    }
}
class Mixser extends Machine{
    public void work(){
        System.out.println("Mixser machine is make juic");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Machine m1 = new Tofho();
        Machine m2 = new Mixser();
        m1.work();
        m2.work();
    }
}

 interface Login{
    void login();
 } 
 class Admin implements Login{
    public void login(){
        System.out.println("Admin logdin with full accses");
    }
 }
 class Users implements Login{
    public void login(){
        System.out.println("User logging with limited accses");
    }
 }
 public class Abstraction {
 
    public static void main(String[] args){
        Login l1 = new Admin();
        Login l2 = new Users();
        l1.login();
        l2.login();
    }
 }

abstract class Appliance{
    abstract void power();
}
class Fan extends Appliance{
    void power(){
        System.out.println("Fan power cunsuption less then 100 w");
    }
}
class Freez extends Appliance{
    void power(){
        System.out.println("Freez power cunsuption 250 w");
    }
} 
public class Abstraction {

    public static void main(String[] args){
        Appliance a1 = new Fan();
        Appliance a2 = new Freez();
        a1.power();
        a2.power();
    }
}

interface Vehicle{
    void speed();
}
class Car implements Vehicle{
    public void speed(){
        System.out.println("Car mximum speed 200 killo meter");
    }
}
class Cycle implements Vehicle{
    public void speed(){
        System.out.println("Cycle speed maximum 30 killo meter");
    }
} 
public class Abstraction {

    public static void main(String[] args){
        Vehicle v1 = new Car();
        Vehicle v2 = new Cycle();
        v1.speed();
        v2.speed();
    }
}

abstract class Fruits{
    abstract void test();
}
class Apple extends Fruits{
    void test(){
        System.out.println("Apple is king of Fruits and this is sweet"
         + "to eat and more then atractive from otjer frutes");
    }
}
class Orange extends Fruits{
    void test(){
        System.out.println("Orange is also good but test is like lemon and sweet");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Fruits f1 = new Apple();
        Fruits f2 = new Orange();
        f1.test();
        f2.test();
    }
}

abstract class Account{
    abstract void intrest();
}
class SBI extends Account{
    public void intrest(){
        System.out.println("SBI given loan on 6% per month");
    }
}
class PNB extends Account{
    public void intrest(){
        System.out.println("Punjab National Bank Given loan on 4.3% per month");
    }
}
public class Abstraction {

    public static void main(String[] args){
        Account a1 = new SBI();
        Account a2 = new PNB();
        a1.intrest();
        a2.intrest();
    }
}

interface Game{
    void play();
}
class Cricket implements Game{
    public void play(){
        System.out.println("The cricket is a international level cricket in this game 11 team member paly in th feild");
    }
}
class Hockey implements Game{
    public void play(){
        System.out.println("Hockey is a indian game and play with two person");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Game g1 = new Cricket();
        Game g2 = new Hockey();
        g1.play();
        g2.play();
    }
}
