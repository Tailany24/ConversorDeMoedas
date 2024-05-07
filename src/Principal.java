import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Principal {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/435c6a92d935c001b80b342f/latest/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========= SEJA BEM VINDO AO CONVERSOR DE MOEDAS =========");
        int opcao = 0;
        while (opcao != 7) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Dólar => Peso Argentino");
            System.out.println("2. Peso Argentino => Dólar");
            System.out.println("3. Dólar => Real Brasileiro");
            System.out.println("4. Real Brasileiro => Dólar");
            System.out.println("5. Dólar => Peso Colombiano");
            System.out.println("6. Peso Colombiano => Dólar");
            System.out.println("7. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    converterMoeda("USD", "ARS");
                    break;
                case 2:
                    converterMoeda("ARS", "USD");
                    break;
                case 3:
                    converterMoeda("USD", "BRL");
                    break;
                case 4:
                    converterMoeda("BRL", "USD");
                    break;
                case 5:
                    converterMoeda("USD", "COP");
                    break;
                case 6:
                    converterMoeda("COP", "USD");
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }
    }

    private static void converterMoeda(String moedaOrigem, String moedaDestino) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + moedaOrigem))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);

            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

            if (conversionRates.has(moedaDestino)) {
                double taxaCambio = conversionRates.get(moedaDestino).getAsDouble();
                System.out.println("Digite o valor a ser convertido: ");
                Scanner scanner = new Scanner(System.in);
                double valor = scanner.nextDouble();
                double valorConvertido = valor * taxaCambio;
                System.out.println(valor + " " + moedaOrigem + " equivalem a " + valorConvertido + " " + moedaDestino);
            } else {
                System.out.println("Moeda de destino não suportada!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
            System.out.println("Resposta da API: " + response.body());
        }
    }
}

