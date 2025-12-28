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
