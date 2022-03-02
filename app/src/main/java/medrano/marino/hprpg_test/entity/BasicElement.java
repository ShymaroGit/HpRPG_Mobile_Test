package medrano.marino.hprpg_test.entity;

/**
 * Classe contenant les informations de base
 * Sera hérité par toutes les classes avec un nom, une descriptions, une progression et une visibilité
 */
public class BasicElement {
    private String nom = "";
    private String description = "";
    protected int progression = 0;
    protected int visible = 0;

    public BasicElement(String nom, String description, int progression, int visible) {
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

    /**
     * Défini la progression de l'élément
     * La valeur minimal est de 0 et
     * La valeur maximal est de 100
     * @param progression
     */
    public void setProgression(int progression) {
        // Vérifie si la valeur est supérieure à 0
        // Si Oui, assigne la plus petit valeur entre la progression saisie et 100
        // Si Non, assigne la valeur 0
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
