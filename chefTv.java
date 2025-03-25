import java.util.*;
import java.lang.*;
import java.io.*;


 class chefTv{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            
            // Calculate the number of subscriptions needed
            int subscriptions = (int) Math.ceil((double) n / 6);
            
            // Calculate the total cost
            int totalCost = subscriptions * x;
            System.out.println(totalCost);
        }

        scanner.close();
    }
}