import java.util.*;
class Power{
    synchronized void power(int n) {
        int pow=0;
        for(int i=1;i<=9;i++){
            try{
            pow=(int)(Math.pow(n, i));
            System.out.println(n+" to the power of "+i+" is: "+pow);
            Thread.sleep(10);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
class MyThread extends Thread{
    int n;
    Power p;
    MyThread(int n,Power p){
        this.n=n;
        this.p=p;
    }
    @Override
    public void run() {
        p.power(n);
    }
}
class Q3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        Power p = new Power();
        MyThread mt = new MyThread(n1,p);
         mt.start();
        System.out.println("Enter a number");
        int n2 = sc.nextInt();
        MyThread mt1 = new MyThread(n2, p);
        Thread T2 = new Thread();
        mt1.start();
        mt.join();
        mt1.join();
    }
}
