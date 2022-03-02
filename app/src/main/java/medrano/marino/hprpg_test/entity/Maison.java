package medrano.marino.hprpg_test.entity;

public class Maison {
    private int house_id= 2;
    private String dark_color = "", light_color = "";
    final static String[] houses = {"Gryffindor","Ravenclaw","Hufflepuff","Slytherin"};

    public Maison(int house_id, String dark_color, String light_color) {
       setHouse_id(house_id);
       setDark_color(dark_color);
       setLight_color(light_color);
    }

    public Maison(){
        this(2,"","");
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = (house_id >= 1) ? Math.min(house_id, 4) : 1;
    }

    public String getHouse_nom() {
        return Maison.houses[getHouse_id() - 1];
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

    @Override
    public String toString() {
        return "Maison{" +
                "house_id=" + house_id +
                ", house_nom='" + getHouse_nom() + '\'' +
                ", dark_color='" + dark_color + '\'' +
                ", light_color='" + light_color + '\'' +
                '}';
    }
}
