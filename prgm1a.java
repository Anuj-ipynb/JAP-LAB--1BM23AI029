import java.util.Scanner;

public class GymMembershipManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();

        System.out.print("Enter member age: ");
        int age = scanner.nextInt();

        System.out.print("Is the membership active? (true/false): ");
        boolean isActive = scanner.nextBoolean();

        System.out.print("Enter membership duration (in months): ");
        int duration = scanner.nextInt();
        double membershipFee = duration * 50.0;
        System.out.println("\nMember Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Membership Duration: " + duration + " months");
        System.out.println("Membership Fee: $" + membershipFee);

        scanner.close();
    }
}
