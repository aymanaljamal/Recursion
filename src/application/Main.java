package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Application");

        Label titleLabel = new Label("Enter Input:");
        TextField inputField = new TextField();
        Button executeButton = new Button("Execute");
        Label resultLabel = new Label();

        executeButton.setOnAction(event -> {
            String input = inputField.getText();
            int inputValue = Integer.parseInt(input); // Assuming input is an integer for simplicity
            
            // Call the existing methods here based on user input and display the result
            int fibonacciResult = fib(inputValue);
            int sumResult = computeSum(inputValue);
            int factorialResult = factorial(inputValue);
            double gcdResult = gcd(30, 20); // Assuming fixed input for gcd method
            boolean palindromeResult = isPalindrome("radar"); // Assuming fixed input for palindrome method
            
            resultLabel.setText("Fibonacci of " + inputValue + " is: " + fibonacciResult + "\n" +
                                "Sum of numbers from 1 to " + inputValue + " is: " + sumResult + "\n" +
                                "Factorial of " + inputValue + " is: " + factorialResult + "\n" +
                                "GCD of 30 and 20 is: " + gcdResult + "\n" +
                                "Is 'radar' a palindrome? " + palindromeResult);
        });

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(titleLabel, inputField, executeButton, resultLabel);
        
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Existing methods
    public static int fib(int index) {
        if (index <= 1) {
            return index;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }

    public static int computeSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + computeSum(n - 1);
        }
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static double gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
    
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
