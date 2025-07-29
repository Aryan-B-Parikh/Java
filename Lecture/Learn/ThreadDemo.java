public class ThreadDemo implements Runnable{
    public ThreadDemo() {
    }
    @Override
    public void run() {
        System.out.println("main Currentlu in RUNNABLE");
        try {
            System.out.println(""+Thread.currentThread().getName());
            System.out.println(""+Thread.currentThread().getState());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getState());
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo);
        thread.start();
        System.out.println(thread);
    }
}
