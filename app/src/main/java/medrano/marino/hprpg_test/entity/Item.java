package medrano.marino.hprpg_test.entity;

public class Item extends Ability{
    private int item_id, max_progression, quantite;
    private String item_type;

    public Item(String nom, String description, int progression, int visible) {
        super(nom, description, progression, visible);
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getMax_progression() {
        return max_progression;
    }

    public void setMax_progression(int max_progression) {
        this.max_progression = max_progression;
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
}
