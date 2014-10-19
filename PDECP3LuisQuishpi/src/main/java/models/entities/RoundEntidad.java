package models.entities;

public class RoundEntidad {
    private int id;

    private String name;

    private UserEntidad userEntidad;

    public RoundEntidad() {
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

    public UserEntidad getUser() {
        return userEntidad;
    }

    public void setUser(UserEntidad user) {
        this.userEntidad = user;
    }
}
