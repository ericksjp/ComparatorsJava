package entities;

public class Box {

    private Integer id;
    private String name;
    private Short idade;

    public Box(Integer id, String name, short idade) {
        this.id = id;
        this.name = name;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getIdade() {
        return idade;
    }

    public void setIdade(Short idade) {
        this.idade = idade;
    }
}
