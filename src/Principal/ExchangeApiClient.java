package Principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeApiClient {
    public static final String API_KEY = System.getenv("EXCHANGE_API_KEY");
    private static final HttpClient client = HttpClient.newHttpClient();

    public static TiposCambio obtenerTasaCambio(String cambio, String destino, double cantidad) {
        String url = "https://v6.exchangerate-api.com/v6/" + "/eaaf1d7ca64e59d56f27ccd6/" + "/pair/" + cambio + "/" + destino + "/" + cantidad;
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.fromJson(response.body(), TiposCambio.class);
        }   catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error en la conexion con la api: " + e.getMessage());
        }

    }
}
