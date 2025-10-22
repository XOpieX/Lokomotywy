package GUI_Projekt_1;

public class Timer extends Thread{

    private int counter = 0;

    public Timer(int counter){
        this.counter = counter;
    }

    public void run(){
        try{
            while (true){
                System.out.println(counter);
                counter++;

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
