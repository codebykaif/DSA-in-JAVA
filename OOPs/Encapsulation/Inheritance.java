// Single Inheritance (Basic)

// class Animal{
//     void eat(){
//         System.out.println("Animals eats");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog barks");
//     }
// }
// public class Inheritance {

//     public static void main(String[] args){
//         Dog d = new Dog();
//         d.eat();
//         d.bark();
//     }
// }

// Method Inheritance

// class A{
//     void show(){
//         System.out.println("Class A method");
//     }
// }
// class B extends A{
// }

// public class Inheritance {

//     public static void main(String[] args){
//         B obj = new B();
//         obj.show();
//     }
// }

// Method Overriding => When Method parent and child name and parameter same is called method Overriding

// import javax.swing.plaf.synth.SynthStyle;
// class Parent{
//     void display(){
//         System.out.println("Parent display");
//     }
// }
// class Child extends Parent{
//     void display(){
//         System.out.println("Child display");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args){
//         Parent p = new Child();
//         p.display();
//     }
// }

//  Multilevel Inheritance

// class A{
//     void  a (){
//         System.out.println("A");
//         }
//     }
//     class B extends A{
//         void b(){
//             System.out.println("B");
//         }
//     }
//         class C extends B{
//             void c(){
//                 System.out.println("C");
//                 }
//             }
//             public class Inheritance {
//             public static void main(String[] args){
//                 C obj = new C();
//                 obj.a();
//                 obj.b();
//                 obj.c();
//             }
//         } 

//  Herarchical Inheritance

// class Animal{
//     void sound(){
//         System.out.println("Animal Sound");
//     }
// }
// class Dog extends Animal{}
// class Cat extends Animal{}

// public class Inheritance {

//     public static void main(String[] args){
//         Dog d = new Dog();
//         Cat c = new Cat();
//         d.sound();
//         c.sound();
//     }
// }

// Constructor Inheritance

// class A{
//     A(){
//         System.out.println("A constructor");
//     }
// }
// class B extends A{
//     B() {
//         System.out.println("B constructor");
//     }
// }
// public class Inheritance {

//     public static void main(String[] args){
//         B obj = new B();
//     }
// }

//Super keyword (Method)

// class A{
//     void show(){
//         System.out.println("A show");
//     }
// }
// class B extends A{
//     void show(){
//         super.show();       // Parent Constructor caall 
//         System.out.println("Parent Constructor");
//     }
// }
// public class Inheritance {

//     public static void main(String[] args){
//         B obj = new B();
//         obj.show();
//     }
// }

// Super keyword (Variable)

// class A{
//     int x = 10;
// }
// class B extends A{
//     int x = 20;

//     void print(){
//         System.out.println(super.x);
//     }
// }
// public class Inheritance {

//     public static void main(String[] args){
//         B obj = new B();
//         obj.print();
//     }
// }

// Protected Access

// class A{
//     protected int x = 5;
// }
// class B extends A{
//     void show(){
//         System.out.println(x);
//     }
// }
// public class Inheritance {

//     public static void main(String[] args){
//         B obj = new B();
//         obj.show();
//     }
// }

// Final (Method Cannot Override)

// class A{
//     final void show(){
//         System.out.println("Final method");
//     }
// }
// class B extends A{
//     public class Inheritance {
    
//     public static void main(String[] args){
//         B obj = new B();
//         obj.show();
//         }
//     }
// }

// Upcasting

// class A {
//     void show() {
//         System.out.println("A");
//     }
// }

// class B extends A {
//     void show() {
//         System.out.println("B");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.show();
//     }
// }

// Downcasting

// class A {
//     void show(){
//         System.out.println("A");
//     }
// }
// class B extends A{
//     void print(){
//         System.out.println("B");
//     }
// } 
// public class Inheritance {

//     public static void main(String[] args){
//         A obj = new B();
//         B b = (B) obj;
//         b.print();
//     }
// }

// instanceof wit Inheritance , Cheuq ki ye object is class ka hai ki nhi 

// class A{}
//     class B extends A{}

//     public class Inheritance {
    
//         public static void main(String[] args){
//             A obj = new B();
//             System.out.println(obj instanceof B);
//         }
// }

//  Overriding parent child + samre + same parameter 

// class A{
//     void msg(){
//         System.out.println("Hello A");
//     }
// }
// class B extends A{
//     void msg(){
//         super.msg();
//         System.out.println("Hello B");
//     }
// }
// public class Inheritance {

//     public static void main(String[] args){
//         B obj = new B();
//         obj.msg();
//     }
// }

// Inheritance with data Members
// class A{
//     int x = 20;
// }
// class B extends A{
//     int y = 23;
// }
// public class Inheritance {

//     public static void main(String[] args){
//         B obj = new B();
//         System.out.println(obj.x + obj.y);
//     }
// }

// Method Hiding static

// class A{
//     static void show(){
//         System.out.println("A static");
//     }
// }
// class B extends A{
//     static void show(){
//         System.out.println("B static");
//     }
// }
// public class Inheritance {

//     public static void main(String[] args){
//         A obj = new B();
//         obj.show();
//     }
// }

// Inheritance + Array

// class A{
//     void show(){
//         System.out.println("A");
//     }
// }
// class B extends A{
//     void show(){
//         System.out.println("B");
//     }
// }
// public class Inheritance {

//     public static void main(String[] args){
//         A[] arr = {new A(), new B()};
//         for(A a: arr){
//             a.show();
//         }
//     }
// }

// Inheritance with Return Type Covariant

// Real-World Example 

// class Employee{
//     int salary = 20000;
// }
// class Developer extends Employee{
//     int bouns = 5000;
// }
// public class Inheritance {

//     public static void main(String[] args){
//         Developer d = new Developer();
//         System.out.println(d.salary + d.bouns);
//     }
// }

//  Employee -->  Manager

// class Employee {
//     int salary = 30000;
// }
// class Manager extends Employee{
//     int Incentive = 10000;
// }
// public class Inheritance {

//     public static void main(String[] args){
//         Manager m = new Manager();
//         System.out.println("Manager Total Salary = " + (m.salary + m.Incentive));
//     }
// }

//  Persom --> Student

// class Person{
//     String name = "kaif";
// }
// class Student extends Person{
//     int roll = 10;
// }
// public class Inheritance {

//     public static void main(String[] args){
//         Student s = new Student();
//         System.out.println("Name = " + (s.name));
//         System.out.println("Roll Number = " + s.roll);
//     }
// }

// Account --> Saving Account
// class Account{
//     int balance = 10000;
// }
// class SavingAccount extends Account{
//     int intrest = 500;
// }
// public class Inheritance {

//     public static void main(String[] args){
//         SavingAccount s = new SavingAccount();
//         System.out.println(s.balance + s.intrest);
//     }
// }

import javax.security.sasl.SaslException;

// class Mobile{
//     void call(){
//         System.out.println("Calling...");
//     }
// }
// class Smartphone extends Mobile{
//     void internet(){
//         System.out.println("Using internet");
//     }
// }
// public class Inheritance {

//     public static void main(String[] args){
//         Smartphone s = new Smartphone();
//         s.call();
//         s.internet();
//     }
// }
    
// class Vehicle{
//     int speed = 60;
// }
// class Bike extends Vehicle{
//     int gear = 5;
// }
// public class Inheritance {
//     public static void main(String[] args){
//         Bike b = new Bike();
//         System.out.println("Speed = " + b.speed);
//         System.out.println("Total Gear " + b.gear);
//     }
// }

//

// class Comapany{
//     String companyName = "TCS";
// }
// class Employee extends Comapany{
//     String empName = "Mo kaif";
// }
// public class Inheritance {
//     public static void main(String[] args){
//         Employee e = new Employee();
//         System.out.println("companyName " + e.companyName);
//         System.out.println("Employee name" + e.empName);
//     }
// }

// class Phone{
//     void featur(){
//         System.out.println("Basic function");
//     }
// }
// class Android extends Phone{
//     void featur(){
//         System.out.println("Android phone");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args){
//         Android a = new Android();
//         a.featur();
//     }
// }

// class Teacher{
//     int salary = 25000;
// }
// class MathTeacher extends Teacher{
//     String subject = "Math";
// }
// public class Inheritance {
//     public static void main(String[] args){
//         MathTeacher m = new MathTeacher();
//         System.out.println(" Salary" + m.salary);
//         System.out.println("Which is subject teacher" + m.subject);
//     }
// }

class Car{
    int wheel = 4;
}
class ElectricCar extends Car{
    String battry = "Lithium";
}
public class Inheritance {

    public static void main(String[] args){
        ElectricCar e = new ElectricCar();
        System.out.println("Which type of car " + e.wheel);
        System.out.println("type car "+ e.battry );
    }
}
