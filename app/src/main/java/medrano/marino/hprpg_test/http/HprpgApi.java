package medrano.marino.hprpg_test.http;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Type;

import medrano.marino.hprpg_test.entity.Competence;
import medrano.marino.hprpg_test.entity.Maison;
import medrano.marino.hprpg_test.entity.Perso;
import medrano.marino.hprpg_test.entity.User;

public class HprpgApi {
    private String url = "https://hprpgapi.shymarogames.tk/";
    private Context context;

    public HprpgApi(Context context){ this.context = context;}

    public void getTest(){
        StringRequest jsonObjReq = new StringRequest(
                Request.Method.GET,
                url + "competences/perso/122819",
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try{
                            Log.d("Result", response);

                        } catch (Exception e){
                            Log.d("Exception:",e.getMessage());
                        }
                        /*catch (
                                JSONException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (
                                ExecutionException e) {
                            e.printStackTrace();
                        }*/
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error:", String.valueOf(error));
                    }
                }
        ) ;
        Volley.newRequestQueue(context).add(jsonObjReq);
    }

    /**
     * Methode pour que l'utilisateur puisse se connecter
     * et r??cup??rer les informations de base de son compte
     * et celle du personnage qui lui est assign?? s'il y en a un
     * @param username
     * @param password
     */
    public void login(String username, String password){
        StringRequest jsonObjReq = new StringRequest(
                Request.Method.POST,
                url + "login",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            Log.d("Result", response);
                            JSONObject jsonResponse = new JSONObject(response);

                            //Cr??e les types pour la conversion de l'object JSON re??u par la requ??te
                            Type userType = new TypeToken<User>(){}.getType();
                            Type persoType = new TypeToken<Perso>(){}.getType();
                            Type maisonType = new TypeToken<Maison>(){}.getType();

                            Gson gson = new Gson();
                            // Cr???? l'object utilisateur ?? partir des informations re??ues par la requ??te
                            User loggedUser = gson.fromJson(jsonResponse.getString("user"),userType);
                            // Remplit les informations de base du personnage assign?? au compte
                            loggedUser.setPerso(gson.fromJson(jsonResponse.getString("persos"),persoType));
                            // Remplit les informations de la maison du personnage
                            loggedUser.getPerso().setMaison(gson.fromJson(jsonResponse.getString("persos"),maisonType));

                            Log.d("User", String.valueOf(loggedUser));
                        } catch (Exception e){
                            Log.d("Exception:",e.getMessage());
                        }
                        /*catch (
                                JSONException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (
                                ExecutionException e) {
                            e.printStackTrace();
                        }*/
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error:", String.valueOf(error));
                    }
                }){
                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> params = new HashMap<>();
                        // envoie en parametre les informations saisient par l'utilisateur
                        params.put("username", username);
                        params.put("password", password);
                        return params;
                    }
                 };
        Volley.newRequestQueue(context).add(jsonObjReq);
    }

    /**
     * ?? l'aide d'une requiete GET r??cup??re la liste des comp??tences
     * selon l'id d'un personnage
     * @param perso_id
     */
    public void getPersoCompetences(int perso_id){
        ArrayList<Competence> listCompetences = new ArrayList<Competence>();
        if (perso_id > 0){
            StringRequest jsonObjReq = new StringRequest(
                    Request.Method.GET,
                    url + "competences/perso/" + perso_id,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try{
                                Log.d("Result", response);
                                JSONObject jsonResponse = new JSONObject(response);
                                Type competenceType = new TypeToken<ArrayList<Competence>>(){}.getType();

                                Gson gson = new Gson();
                                // Cr???? l'object utilisateur ?? partir des informations re??ues par la requ??te
                                ArrayList<Competence> listCompetences = gson.fromJson(jsonResponse.getString("data"),competenceType);

                                for(int i = 0; i < listCompetences.size();i++){
                                    Log.d("c",listCompetences.get(i).toString());
                                }

                            } catch (Exception e){
                                Log.d("Exception:",e.getMessage());
                            }
                        /*catch (
                                JSONException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (
                                ExecutionException e) {
                            e.printStackTrace();
                        }*/
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Log.d("Error:", String.valueOf(error));
                        }
                    }
            ) ;
            Volley.newRequestQueue(context).add(jsonObjReq);
        }
    }

    public void getJournals(){

    }

    public void getSorts(){

    }

    public void getPersoStats(){

    }

    public void getItems(){

    }




}
