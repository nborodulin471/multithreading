package tasks.task2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Collection<Callable<Integer>> callables = List.of(
                new MyCallable(),
                new MyCallable(),
                new MyCallable(),
                new MyCallable()

        );
        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        threadPool.invokeAll(callables);
        Thread.sleep(5000);
        System.out.println("Результат: " + threadPool.invokeAny(callables));
        threadPool.shutdown();
    }

}
