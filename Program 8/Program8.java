class FirstThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); 
            }
        } catch (InterruptedException e) {
            System.out.println("FirstThread interrupted");
        }
    }
}

class SecondThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("SecondThread interrupted");
        }
    }
}

public class Program8 {
    public static void main(String[] args) {
        FirstThread ob1=new FirstThread();
        SecondThread ob2=new SecondThread();

        ob1.start();
        ob2.start();
    }
}