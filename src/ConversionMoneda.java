import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversionMoneda {
    public ValorCambio parametrosCambio(String divisaOrigen, String divisaDestino, Double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/77bf03e551eeb4d7bdb84b32/pair/"
                + divisaOrigen + "/" + divisaDestino + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ValorCambio.class);
        } catch (Exception e) {
            throw new RuntimeException("La opcion no corresponde al listado.");
        }
    }
}