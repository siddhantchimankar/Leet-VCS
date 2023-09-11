package patterns.composite;

import javax.swing.*;
import java.util.ArrayList;

public class manager implements employee {

    private String name;
    private ArrayList<developer> team;

    public manager(String name) {
        this.name = name;
        this.team = new ArrayList<developer>();
    }

    public void addDev(developer d) {
        team.add(d);
    }

    @Override
    public void whatAmI() {
        System.out.println("I am a manager called " + this.name + " my team is - ");
        for (int i = 0; i < team.size(); i++) {
            team.get(i).whatAmI();
        }
    }
}
