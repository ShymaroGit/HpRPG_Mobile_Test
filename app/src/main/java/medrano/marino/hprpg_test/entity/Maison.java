package medrano.marino.hprpg_test.entity;

public class Maison {
    private int house_id;
    private String house_nom, dark_color, light_color;

    public Maison(int house_id, String house_nom, String dark_color, String light_color) {
        this.house_id = house_id;
        this.house_nom = house_nom;
        this.dark_color = dark_color;
        this.light_color = light_color;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public String getHouse_nom() {
        return house_nom;
    }

    public void setHouse_nom(String house_nom) {
        this.house_nom = house_nom;
    }

    public String getDark_color() {
        return dark_color;
    }

    public void setDark_color(String dark_color) {
        this.dark_color = dark_color;
    }

    public String getLight_color() {
        return light_color;
    }

    public void setLight_color(String light_color) {
        this.light_color = light_color;
    }
}
