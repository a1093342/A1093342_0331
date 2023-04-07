public class Human extends Animal {
    String gender;

    Human(String name, double height, double weight, double speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    public void show() {
        super.show();
        System.out.println("Gender: " + gender);
    }
}
