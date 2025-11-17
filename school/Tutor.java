package school;

import java.time.LocalDate;

public class Tutor extends Person {
    private String relationDescription;

    public Tutor(int id, String nom, String prenom, LocalDate dateNaissance,
                 String email, String telephone, String relationDescription) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.relationDescription = relationDescription;
    }

    public String getRelationDescription() { return relationDescription; }
    public void setRelationDescription(String relationDescription) { this.relationDescription = relationDescription; }
}
