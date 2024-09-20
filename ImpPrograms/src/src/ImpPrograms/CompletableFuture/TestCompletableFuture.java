package ImpPrograms.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class TestCompletableFuture {
    public static void main(String[] args) {

       CompletableFuture future = CompletableFuture.supplyAsync(() -> "Sachin");
        future.thenAccept(result -> System.out.println("###### " + result));

            CompletableFuture   futures= CompletableFuture.supplyAsync(() -> 10).thenApplyAsync(r -> r*5).thenApplyAsync(s-> s+5);
   futures.thenAccept(result -> System.out.println("Ssdcsfs "+result));

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            // Some long-running operation
            return "Result 1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            // Some long-running operation
            return "Result 2";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            // Some long-running operation
            return "Result 3";
        });

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3);

        allFutures.thenRun(() -> {
            // All futures completed
            String result1 = future1.join();
            String result2 = future2.join();
            String result3 = future3.join();
            System.out.println(result1 + ", " + result2 + ", " + result3);
        });


        CompletableFuture<Integer> futured = CompletableFuture.supplyAsync(() -> {
            int result = 10 / 0; // Causes an ArithmeticException
            return result;
        });

        futured.exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // Default value to return if there's an exception
        }).thenAccept(result -> {
            System.out.println("Result: " + result);
        });


    }


}
