public class MainCachedThreadPool {

    public static void main(String[] args) {

        CachedPool executor = new CachedPool();


        for (int i = 1; i <= 10; i++) {

            Pow pow = new Pow((double) i);
            executor.execute(pow);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        try {
            executor.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Se han ejecutado %d hilos", executor.getThreads());

    }

}
