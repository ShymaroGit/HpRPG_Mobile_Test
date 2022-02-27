package medrano.marino.hprpg_test.entity;

public class Competence extends Ability{
    private int competence_id;

    public Competence(int competence_id,String nom, String description, int progression, int visible) {
        super(nom, description, progression, visible);
        setCompetence_id(competence_id);
    }

    public Competence(int competence_id,String nom, String description, int progression){
        super(nom, description, progression,1);
        setCompetence_id(competence_id);
    }

    public int getCompetence_id() {
        return competence_id;
    }

    public void setCompetence_id(int competence_id) {
        this.competence_id = competence_id;
    }

    /*@Override
    public String toString(){
        return super.toString();
        //return "Competence  Nom: " + this.getNom() + ", Description: " + this.getDescription() +", Progression: " + this.getProgression();
    }*/
}
