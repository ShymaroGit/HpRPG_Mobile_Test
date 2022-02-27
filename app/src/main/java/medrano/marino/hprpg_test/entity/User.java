package medrano.marino.hprpg_test.entity;

import java.util.Date;

public class User {
    private int user_id, lvl;
    private String username;
    private Date date_co;
    private Perso perso;

    public User(int user_id, int lvl, String username, Date date_co, Perso perso) {
        this.user_id = user_id;
        this.lvl = lvl;
        this.username = username;
        this.date_co = date_co;
        this.perso = perso;
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
        return perso;
    }

    public void setPerso(Perso perso) {
        this.perso = perso;
    }
}
