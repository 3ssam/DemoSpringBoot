package mo.essam.models;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int id;
    private String name;

    public Laptop() {

    }

    public Laptop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void compile() {
        System.out.println("this is our laptop");
    }

}
