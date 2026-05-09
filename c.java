import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        int K =  sc.nextInt();
        int candiesInJar = N;
        int order = sc.nextInt();
        if (order <= 0 || order > candiesInJar) {
            System.out.println("INVALID INPUT");
        } else {
            candiesInJar = candiesInJar - order;
            if (candiesInJar <= K) {
                candiesInJar = N;
            }
            System.out.println("Number of Candies Sold: " + order);
            System.out.println("Number of Candies available: " + candiesInJar);
        }

        sc.close();
    }
}
