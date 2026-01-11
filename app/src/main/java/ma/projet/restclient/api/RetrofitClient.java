package ma.projet.restclient.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class RetrofitClient {
    private static final String BASE_URL = "http://10.0.2.2:8080/api/";
    private static Retrofit retrofitJson = null;
    private static Retrofit retrofitXml = null;

    public static Retrofit getClient(String format) {
        if (format.equals("JSON")) {
            if (retrofitJson == null) {
                retrofitJson = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofitJson;
        } else {
            if (retrofitXml == null) {
                retrofitXml = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(SimpleXmlConverterFactory.create())
                        .build();
            }
            return retrofitXml;
        }
    }
}