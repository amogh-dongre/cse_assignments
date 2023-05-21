import java.util.*;
class Computer{
    void display(){
        System.out.println("This is Computer class");
    }

class Monitor {
    String type;
    double price;
    Monitor(String type,double price){
        this.price=price;
        this.type=type;
        }

    public void display(){
     System.out.println("The monitor is of type: "+type);
     System.out.println("And its price is: "+price);
    }

}
class Keyboard {
    String type;
    Keyboard(String type){
        this.type=type;
    }
    public void display(){
        System.out.println("The Keyboard is: "+type);
    }

}
class Mouse {
     String type;
    Mouse(String type){
        this.type=type;
    }
   public void display(){
        System.out.println("The Mouse is: "+type);
    }

}
class CPU {
    String cores,Manufacturer;
    CPU(String cores,String Manufacturer){
        this.Manufacturer=Manufacturer;
        this.cores=cores;
    }
    public void display(){
        System.out.println("The Cpu is a "+cores+" CPU");
        System.out.println("The CPU is manufactured by: "+Manufacturer);
    }
}
class RAM {
    String size,Manufacturer;
    RAM(String size,String Manufacturer){
        this.size=size;
        this.Manufacturer=Manufacturer;
    }
    public void display(){
        System.out.println("The Ram is of size: "+size);
        System.out.println("The manufacturer of the RAM is: "+Manufacturer);
    }
  }
}
class ComputerTest{
    public static void main(String[] args) {
        Computer.Monitor mon = new Computer().new Monitor("LED",14000.00);
        mon.display();
       Computer.Keyboard kb = new Computer().new Keyboard("Wireless");
       kb.display();
       Computer.Mouse mou = new Computer().new Mouse("Wired");
       mou.display();
       Computer.CPU cp = new Computer(). new CPU("4", "AMD");
       cp.display();
       Computer.RAM rm = new Computer().new RAM("16GB", "Samsung");
       rm.display();
    }
}
