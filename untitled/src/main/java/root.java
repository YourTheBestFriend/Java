import java.util.List;

public class root {
    private String name;
    private List<people> my_list_people;

    public root() {
    }

    public root(List<people> my_list_people) {
        this.my_list_people = my_list_people;
    }

    public void SetName(String mainName) {
        this.name = mainName;
    }

    public void setPeople(List<people> peopleL) {
        this.my_list_people = peopleL;
    }

    @Override
    public String toString() {
        return "root{" +
                "name='" + name + '\'' +
                ", my_list_people=" + my_list_people +
                '}';
    }
}
