package models.entities;

import java.util.HashMap;
import java.util.Map;

public class UserEntidad {
    public int id;

    public String name;

    private Map<Integer, RoundEntidad> rounds = new HashMap<Integer, RoundEntidad>();

    public UserEntidad() {
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public Map<Integer, RoundEntidad> getRounds() {
        return rounds;
    }

    public void setRounds(Map<Integer, RoundEntidad> rounds) {
        this.rounds = rounds;
    }
}
