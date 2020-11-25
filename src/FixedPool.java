import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixedPool {

    private final ThreadPoolExecutor fixedThreadPool =
            (ThreadPoolExecutor) Executors.newFixedThreadPool(1);


    void execute(Pow pow) {

        try {
            fixedThreadPool.execute(pow);

        } catch (Exception e) {
            System.out.printf("Error");
        }
    }


    void shutdown() throws InterruptedException {
        fixedThreadPool.shutdown();
    }


    public int getThreads() {

        return fixedThreadPool.getPoolSize();
    }


}
