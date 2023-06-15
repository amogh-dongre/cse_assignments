import java.util.*;
class max_min extends Thread{
    int[] arr;
    max_min(int[] arr){
        this.arr=arr;
    }
    @Override
    public void run() {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The Maximum value of the arrays is "+arr[arr.length-1]);
        System.out.println("The Minimum value of the array is: "+arr[0]);
    }
}
class reverse extends Thread{
    int[] rev;
    max_min m;
    reverse(max_min m,int[] rev){
        this.m=m;
        this.rev=m.arr;
    }
    @Override
    public void run() {
        for(int i=m.arr.length-1;i>=0;i--){
            int j=0;
            rev[j]=m.arr[i];
        }
        for(int i=0;i<rev.length;i++)
            System.out.print(rev[i]+" ");
    }
}
class Q2{
    public static void main(String[] args) throws InterruptedException {
        int[] arr={9,1,5,6,8,3,2,4,5};
        max_min T1 = new max_min(arr);
        reverse T2 = new reverse(T1,arr);
        T1.start();
        T2.start();
        T1.join();
        T2.join();
    }
}
