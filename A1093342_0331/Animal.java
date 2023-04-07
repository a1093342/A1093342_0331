public class Animal {
    String name;
    double height;
    double weight;
    double speed;

    Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("Name\theight\tweight\tspeed");
        System.out.println(name+"\t"+height+"\t"+weight+"\t"+speed);
    }

    public double distance(int x, double y) {
        return x * y * speed;
    }

    public double distance(int x) {
        return x * speed;
    }

    public static void showinfo() {
        System.out.println("Welcome to the Frozen system");
    }
}
