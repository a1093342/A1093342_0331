public class SnowQueen extends Human {
    String freezing_skill;

    SnowQueen(String name, double height, double weight, double speed, String gender, String freezing_skill) {
        super(name, height, weight, speed, gender);
        this.freezing_skill = freezing_skill;
    }

    public void show() {
        super.show();
        System.out.println("Freezing Skill: " + freezing_skill);
    }

  
    public double distance(int x, double y) {
        return x * y * speed * 2;
    }

    public double distance(int x) {
        return x * speed * 2;
    }
}
