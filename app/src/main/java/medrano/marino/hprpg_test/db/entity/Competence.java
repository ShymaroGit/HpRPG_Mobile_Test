package medrano.marino.hprpg_test.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * Classe contenant les informations d'une competence
 * Hérite de la classe Basic Element
 * Rajoute son id, sinon identique à la classe qu'elle hérite
 */
@Entity
public class Competence extends BasicElement {
    @PrimaryKey
    @ColumnInfo(name = COL_ID)
    private int competence_id = 0;

    @Ignore
    public final static String COL_ID = "competence_id";

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
