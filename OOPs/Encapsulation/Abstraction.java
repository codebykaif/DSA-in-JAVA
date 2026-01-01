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
