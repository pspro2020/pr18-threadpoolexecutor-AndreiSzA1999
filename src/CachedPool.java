import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CachedPool {

    private final ThreadPoolExecutor cachedThreadPool =
            (ThreadPoolExecutor) Executors.newCachedThreadPool();


    void execute(Pow pow) {

        try {
            cachedThreadPool.execute(pow);

        } catch (Exception e) {
            System.out.printf("Error");
        }
    }


    void shutdown() throws InterruptedException {
        cachedThreadPool.shutdown();
    }


    public int getThreads() {

        return cachedThreadPool.getPoolSize();
    }

}
