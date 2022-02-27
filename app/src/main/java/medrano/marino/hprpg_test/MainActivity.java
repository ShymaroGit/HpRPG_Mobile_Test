package medrano.marino.hprpg_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import medrano.marino.hprpg_test.entity.Competence;
import medrano.marino.hprpg_test.http.HprpgApi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        HprpgApi api = new HprpgApi(this);
        //api.getTest();
        //"competence_id":4517,"nom":"Analyse","description":"Trouver les liens entre les informations disponibles et comprendre ces liens","quantite":1,"progression":60,"visible":1
        Competence testComp = new Competence(4517,"Analyse","Trouver les liens entre les informations disponibles et comprendre ces liens",60,1);
        Log.d("Competence", String.valueOf(testComp));
    }
}
