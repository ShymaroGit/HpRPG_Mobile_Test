package medrano.marino.hprpg_test.db.entity;

import android.util.Log;

public class Bourse {
    private int allKnuts = 0, knuts = 0, sicle = 0, gallion = 0;
    final static int GALLION_KNUTS_VAUE = 493, SICLE_KNUTS_VALUE = 29, GALLION_SICLES_VALUE = 17;

    public Bourse(int knuts, int sicle, int gallion) {
        setGallion(gallion);
        setKnuts(knuts);
        setSicle(sicle);
        int tempGal = gallion * GALLION_KNUTS_VAUE;
        int tempSic = sicle * SICLE_KNUTS_VALUE;
        setAllKnuts(tempGal + tempSic + knuts);

        if(knuts >= SICLE_KNUTS_VALUE || sicle >= GALLION_SICLES_VALUE){
            divideFromAllKnuts();
        }

    }
    public Bourse(int allKnuts){
        setAllKnuts(allKnuts);
        divideFromAllKnuts();
    }

    public Bourse(){
        this(0,0,0);
    }

    public void divideFromAllKnuts(){
        int tempAllKnuts = this.getAllKnuts();
        int gallionsLeftover = tempAllKnuts % GALLION_KNUTS_VAUE;

        tempAllKnuts -= gallionsLeftover;
        setGallion(tempAllKnuts / GALLION_KNUTS_VAUE);
        int siclesLeftover = gallionsLeftover % SICLE_KNUTS_VALUE;
        gallionsLeftover -= siclesLeftover;

        setSicle(gallionsLeftover / SICLE_KNUTS_VALUE);
        setKnuts(siclesLeftover);
    }

    public int getKnuts() {
        return knuts;
    }

    public void setKnuts(int knuts) {
        this.knuts = knuts;
    }

    public int getSicle() {
        return sicle;
    }

    public void setSicle(int sicle) {
        this.sicle = sicle;
    }

    public int getGallion() {
        return gallion;
    }

    public void setGallion(int gallion) {
        this.gallion = gallion;
    }

    public int getAllKnuts() {
        return allKnuts;
    }

    public void setAllKnuts(int allKnuts) {
        this.allKnuts = allKnuts;
    }
}
