package medrano.marino.hprpg_test.entity;

/**
 * Classe contenant les informations d'une competence
 * Hérite de la classe Basic Element
 * Rajoute son id, sinon identique à la classe qu'elle hérite
 */
public class Competence extends BasicElement {
    private int competence_id = 0;

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

    @Override
    public String toString() {
        return "Competence{" +
                "competence_id=" + competence_id +
                " " + super.toString();
    }
}
