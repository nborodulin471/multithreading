package tasks.task2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Collection<Callable<Integer>> callables = List.of(
                new MyCallable("1"),
                new MyCallable("2"),
                new MyCallable("3"),
                new MyCallable("4")

        );
        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        threadPool.invokeAll(callables);
        Thread.sleep(5000);
        System.out.println("Результат: " + threadPool.invokeAny(callables));
        threadPool.shutdown();
    }

}
