package medrano.marino.hprpg_test.entity;

public class Sort extends Ability{
    private int journal_id;

    public Sort(int journal_id,String nom, String description, int progression, int visible) {
        super(nom, description, progression, visible);
        setJournal_id(journal_id);
    }

    public int getJournal_id() {
        return journal_id;
    }

    public void setJournal_id(int journal_id) {
        this.journal_id = journal_id;
    }
}
