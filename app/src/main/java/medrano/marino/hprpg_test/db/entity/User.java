package medrano.marino.hprpg_test.db.entity;

import java.util.Date;

public class User {
    private int user_id = 0, lvl = 0;
    private String username = "";
    private Date date_co = new Date();
    private Perso persos = new Perso();

    public User(int user_id, int lvl, String username, Date date_co, Perso perso) {
        this.user_id = user_id;
        this.lvl = lvl;
        this.username = username;
        this.date_co = date_co;
        this.persos = perso;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate_co() {
        return date_co;
    }

    public void setDate_co(Date date_co) {
        this.date_co = date_co;
    }

    public Perso getPerso() {
        return persos;
    }

    public void setPerso(Perso perso) {
        this.persos = perso;
    }

    @Override
    public String toString(){
        return "#" + getUser_id() + ", Username: " + getUsername() + ", lvl: " + getLvl() + ", date_co: " + getDate_co().toString() + ", Perso: " + getPerso().toString();
    }
}
