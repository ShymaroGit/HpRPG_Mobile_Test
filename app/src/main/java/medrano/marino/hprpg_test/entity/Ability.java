package medrano.marino.hprpg_test.entity;

public class Ability {
    private String nom, description;
    private int progression, visible;

    public Ability(String nom, String description, int progression, int visible) {
        setNom(nom);
        setDescription(description);
        setProgression(progression);
        setVisible(visible);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProgression() {
        return progression;
    }

    public void setProgression(int progression) {

        this.progression = (progression >= 0) ? Math.min(progression, 100) : 0;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }


    @Override
    public String toString(){
        return "Nom: " + this.getNom() + " | Progression: " + this.getProgression() + " | Description: " + this.getDescription() + " | Visible: " + this.getVisible();
    }
}
