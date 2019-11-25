package practice.lambda;

import java.util.function.Function;

/**
 * Practice with literal functions in Java 8
 * @author Owen McMonagle.
 * @since 25/11/2019
 * @version 0.2
 */
public class LiteralFunctions
{

    public static void main(String[] args)
    {
        // Create literal function and assign to variable
        Function<String, Void> print = string ->
        {
            System.out.println(string);
            return null;
        };

        // Use that literal function variable to print messages.
        print.apply("Hi");
        print.apply("this");
        print.apply("is");
        print.apply("my");
        print.apply("Java");
        print.apply("Literal");
        print.apply("Function.");


        // Assign lambda to Runnable.
        // Using the functional interface annoatation.
        Runnable run = () -> System.out.println("Hello world.");

        // Use of literal as runnable.
        new Thread(run).start();

        // Assign lambda to a function interface.
        PracticeInterface practiceFunction = () -> { return "Injected"; };
        // Execute the lambda through the functional interface callback.
        System.out.println(practiceFunction.execute());
    }


    // Allows us to assign lambdas/literal functions to this interface Type.
    @FunctionalInterface
    private interface PracticeInterface
    {
        public abstract String execute();
    }
}
