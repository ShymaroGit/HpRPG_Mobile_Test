package medrano.marino.hprpg_test.entity;

public class Perso {
    private int perso_id = 0, house_id = 0, baguette_id = 0, profil_id = 0;
    private int age = 0, chance, dex = 0, perc = 0,con = 0, intel = 0,magie = 0,taille = 0,str = 0,cha = 0,npc = 0,type = 0;
    private String nom = "", prenom = "", patronus = "";
    private Maison maison = new Maison();


    public Perso(int perso_id, int house_id, int baguette_id, int profil_id, int age, int chance, int dex, int perc, int con, int intel, int magie, int taille, int str, int cha, int npc, int type, String nom, String prenom, String patronus) {
        setPerso_id(perso_id);
        setHouse_id(house_id);
        setBaguette_id(baguette_id);
        setProfil_id(profil_id);
        setAge(age);
        setTaille(taille);
        setCha(cha);
        setStr(str);
        setCon(con);
        setDex(dex);
        setPerc(perc);
        setChance(chance);
        setIntel(intel);
        setMagie(magie);
        setType(type);
        setNpc(npc);
        setNom(nom);
        setPrenom(prenom);
        setPatronus(patronus);
    }

    public Perso(){
    }

    public int getPerso_id() {
        return perso_id;
    }

    public void setPerso_id(int perso_id) {
        this.perso_id = perso_id;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public int getBaguette_id() {
        return baguette_id;
    }

    public void setBaguette_id(int baguette_id) {
        this.baguette_id = baguette_id;
    }

    public int getProfil_id() {
        return profil_id;
    }

    public void setProfil_id(int profil_id) {
        this.profil_id = profil_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age >= 0) ? Math.min(age, 100) : 0;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = (chance >= 0) ? Math.min(chance, 100) : 0;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = (dex >= 0) ? Math.min(dex, 100) : 0;
    }

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = (perc >= 0) ? Math.min(perc, 100) : 0;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = (con >= 0) ? Math.min(con, 100) : 0;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = (intel >= 0) ? Math.min(intel, 100) : 0;
    }

    public int getMagie() {
        return magie;
    }

    public void setMagie(int magie) {
        this.magie = (magie >= 0) ? Math.min(magie, 100) : 0;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = (str >= 0) ? Math.min(str, 100) : 0;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = (cha >= 0) ? Math.min(cha, 100) : 0;
    }

    public int getNpc() {
        return npc;
    }

    public void setNpc(int npc) {
        this.npc = npc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public Maison getMaison() {
        return maison;
    }

    public void setMaison(Maison maison) {
        this.maison = maison;
    }

    @Override
    public String toString() {
        return "Perso{" +
                "perso_id=" + perso_id +
                ", house_id=" + house_id +
                ", baguette_id=" + baguette_id +
                ", profil_id=" + profil_id +
                ", age=" + age +
                ", chance=" + chance +
                ", dex=" + dex +
                ", perc=" + perc +
                ", con=" + con +
                ", intel=" + intel +
                ", magie=" + magie +
                ", taille=" + taille +
                ", str=" + str +
                ", cha=" + cha +
                ", npc=" + npc +
                ", type=" + type +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", patronus='" + patronus + '\'' +
                ", maison=" + maison +
                '}';
    }
}
