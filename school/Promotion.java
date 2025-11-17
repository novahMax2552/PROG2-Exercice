package school;

import java.util.List;

public class Promotion {
    private List<String> groupes;

    public Promotion(List<String> groupes) {
        this.groupes = groupes;
    }

    public List<String> getGroupes() { 
        return groupes; 
    }
    public void setGroupes(List<String> groupes) { 
        this.groupes = groupes;
    }
}
