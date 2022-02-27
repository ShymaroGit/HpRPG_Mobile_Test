package medrano.marino.hprpg_test.http;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

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

    public void login(String username, String password){
        StringRequest jsonObjReq = new StringRequest(
                Request.Method.POST,
                url + "login",
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
                }){
                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> params = new HashMap<>();
                        // envoie en parametre l'email et le password rentré par le client
                        params.put("username", username);
                        params.put("password", password);
                        return params;
                    }
                 };
        Volley.newRequestQueue(context).add(jsonObjReq);

    }

}
