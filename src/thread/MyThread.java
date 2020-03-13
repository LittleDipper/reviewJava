package thread;

public class MyThread extends Thread{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        MyThread s=new MyThread();
        t.start();
        System.out.println("one.");
        s.start();
        System.out.println("two.");
        
        byte b = (byte)129;
        System.out.println((byte)b);
        
    }
    public void run() {
        System.out.println("Thread");
    }
    
}