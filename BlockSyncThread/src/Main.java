
class Msg{
    public void show(String name){
        ;;;;;;;;; // 100 Line of code(LOC)
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("How are you " + name);
            }
        }
        ;;;;;;;;; // 100 LOC
    }
}

class Thread1 extends Thread{
    Msg m;
    String name;
    Thread1(Msg m, String name){
        this.m = m;
        this.name = name;
    }
    public void run(){
        m.show(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Msg obj = new Msg();
        Thread1 t1 = new Thread1(obj,"Raj");
        Thread1 t2 = new Thread1(obj, "Simran");

        t1.start();
        t2.start();
    }
}