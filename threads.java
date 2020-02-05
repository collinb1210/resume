package prodcon;

public class threads {


    public static class PThread extends Thread{
        @Override
        public void run(){
            System.out.println("1");
        }


    }


    public static class CThread extends Thread{
        @Override
        public void run(){
            System.out.println("2");
        }





    }




    public static void main(String[] args) {

        Thread producer = new PThread();
        Thread consumer = new CThread();

        producer.start();
        consumer.start();

        System.out.println("3");
    }




}
