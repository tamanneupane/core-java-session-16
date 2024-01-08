package arrarylist;

public class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }
}
