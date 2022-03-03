package medrano.marino.hprpg_test.db.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Journal implements Parcelable {
    private int journal_id, perso_id;
    private String message, dateCreation, dateModification;

    public Journal(int journal_id, int perso_id, String message, String dateCreation, String dateModification) {
       setId(journal_id);
        setPerso_id(perso_id);
        setMessage(message);
        setDateCreation(dateCreation);
        setDateModification(dateModification);
    }

    protected Journal(Parcel in) {
        journal_id = in.readInt();
        perso_id = in.readInt();
        message = in.readString();
        dateCreation = in.readString();
        dateModification = in.readString();
    }

    public static final Creator<Journal> CREATOR = new Creator<Journal>() {
        @Override
        public Journal createFromParcel(Parcel in) {
            return new Journal(in);
        }

        @Override
        public Journal[] newArray(int size) {
            return new Journal[size];
        }
    };

    public int getId() {
        return journal_id;
    }

    public void setId(int id) {
        this.journal_id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDateModification() {
        return dateModification;
    }

    public void setDateModification(String dateModification) {
        this.dateModification = dateModification;
    }

    public int getPerso_id() {
        return perso_id;
    }

    public void setPerso_id(int perso_id) {
        this.perso_id = perso_id;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(journal_id);
        dest.writeInt(perso_id);
        dest.writeString(message);
        dest.writeString(dateCreation);
        dest.writeString(dateModification);
    }

}
