package medrano.marino.hprpg_test.entity;

/**
 *
 */
public class Item extends BasicElement {
    private int item_id = 0, quantite = 0, max_progression = 100;
    private String item_type = "";

    public Item(String nom, String description, int progression, int visible) {
        super(nom, description, progression, visible);
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    @Override
    public void setProgression(int progression) {
        // Vérifie si la valeur est supérieure à 0
        // Si Oui, assigne la plus petit valeur entre la progression saisie et la valeur maximale
        // Si Non, assigne la valeur 0
        this.progression = (progression >= 0) ? Math.min(progression, max_progression) : 0;
    }

    public int getMax_progression() {
        return max_progression;
    }

    /**
     * Défini la progression maximal que l'élément peut avoir
     * @param max_progression
     */
    public void setMax_progression(int max_progression) {
        this.max_progression = (max_progression >= 0) ? max_progression : 0;
    }
}
