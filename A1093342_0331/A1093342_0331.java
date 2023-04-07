import java.util.Scanner;

public class A1093342_0331 {
    public static void main(String[] args) {
        Animal.showinfo();

        
        Animal A = new Animal("A", 1.1, 52, 100);
        Animal B = new Animal("B", 1.5, 99, 200);
        Human C = new Human("C", 1.9, 80, 150, "Male");
        Human D = new Human("D", 1.8, 78, 130, "Male");
        Human E = new Human("E", 1.7, 48, 120, "Female");
        SnowQueen F = new SnowQueen("F", 1.7, 50, 120, "Female", "YES");

        
        A.show();
        System.out.println();
        B.show();
        System.out.println();
        C.show();
        System.out.println();
        D.show();
        System.out.println();
        E.show();
        System.out.println();
        F.show();
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X and Y values for A (separated by space): ");
        int x1 = scanner.nextInt();
        double y1 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance1 = A.distance(x1, y1);
        System.out.println("Running distance of Xuebao: " + distance1 + " km");

        System.out.print("Enter X and Y values for B (separated by space): ");
        int x2 = scanner.nextInt();
        double y2 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance2 = B.distance(x2, y2);
        System.out.println("Running distance of Arkhans: " + distance2 + " km");

        System.out.print("Enter X and Y values for C (separated by space): ");
        int x3 = scanner.nextInt();
        double y3 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance3 = C.distance(x3, y3);
        System.out.println("Running distance of Xuebao: " + distance3 + " km");

        System.out.print("Enter X and Y values for D (separated by space): ");
        int x4 = scanner.nextInt();
        double y4 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance4 = C.distance(x4, y4);
        System.out.println("Running distance of Xuebao: " + distance4 + " km");

        System.out.print("Enter X and Y values for E (separated by space): ");
        int x5 = scanner.nextInt();
        double y5 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance5 = C.distance(x5, y5);
        System.out.println("Running distance of Xuebao: " + distance5 + " km");

        System.out.print("Enter X and Y values for F (separated by space): ");
        int x6 = scanner.nextInt();
        double y6 = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;
        double distance6 = C.distance(x6, y6);
        System.out.println("Running distance of Xuebao: " + distance6 + " km");
    }
}
