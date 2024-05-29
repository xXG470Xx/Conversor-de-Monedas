import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.PublicKey;

public class ConsultaMoneda {
    public Moneda busquedaMoneda(String monedaBase , String monedaConversion, double cantidadAConvertir){
        String apiKey = "7769460f040535129cb988d8";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+monedaBase+"/"+monedaConversion+"/"+cantidadAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No Encontre esta moneda");
        }
    }

}
