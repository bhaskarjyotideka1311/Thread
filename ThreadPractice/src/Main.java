public class Main extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1; i<2; i++){
            System.out.println(name);
        }
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {

        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();

        t1.setName("Raj");
        t2.setName("Simran");
        t3.setName("Rajesh");

        t1.setPriority(5);
        t2.setPriority(2);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();

        //t2.stop();  //t2 thread will dead
    }
}