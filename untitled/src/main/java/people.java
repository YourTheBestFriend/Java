public class people {
    private int age;
    private String name;

    public people() {
    }

    public people(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "people{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
