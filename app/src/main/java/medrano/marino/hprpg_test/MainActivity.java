package medrano.marino.hprpg_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import medrano.marino.hprpg_test.entity.Bourse;
import medrano.marino.hprpg_test.entity.Competence;
import medrano.marino.hprpg_test.entity.User;
import medrano.marino.hprpg_test.http.HprpgApi;

public class MainActivity extends AppCompatActivity {
    private User mainUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        HprpgApi api = new HprpgApi(this);
        api.getTest();
        //"competence_id":4517,"nom":"Analyse","description":"Trouver les liens entre les informations disponibles et comprendre ces liens","quantite":1,"progression":60,"visible":1
        //Competence testComp = new Competence(4517,"Analyse","Trouver les liens entre les informations disponibles et comprendre ces liens",60,1);
        //Log.d("Competence", String.valueOf(testComp));
        Bourse newBourse = new Bourse(500,32,8);
        Bourse newBourse2 = new Bourse(27,12,8);
        Button btnLogin = findViewById(R.id.btnLogin);


    btnLogin.setOnClickListener(v -> {
        EditText editUsername = (EditText) findViewById(R.id.txtUsername);
        EditText editPassword = (EditText) findViewById(R.id.txtPassword);

        String username = editUsername.getText().toString();
        String password = editPassword.getText().toString();

        api.login(username,password);
    });
    }
}
