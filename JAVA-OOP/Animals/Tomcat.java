package animals;

public class Tomcat extends Cat {
    private final static String gender = "Male";

    public Tomcat(String name, int age) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
