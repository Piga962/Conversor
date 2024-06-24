import com.google.gson.Gson;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpCookie;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/4beb7bd6292285da1691646f/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        HttpResponse<String> response = null;
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new Gson();
        CurrencyJson Xd = gson.fromJson(json, CurrencyJson.class);
        Currency converter = new Currency(Xd);

        while (true){
            System.out.println("""
                    1. USD to MXN
                    2. USD to ARS
                    3. USD to BRL
                    4. USD to BOB
                    5. USD to CLP
                    6. USD to COP
                    7. MXN to USD
                    8. ARS to USD
                    9. BRL to USD
                    10. BOB to USD
                    11. CLP to USD
                    12. COP to USD
                    """);
            System.out.println("Choose an option to convert:");
            var option = lectura.nextInt();

            System.out.println("Insert the amount of value to convert: ");
            var amount = lectura.nextDouble();

            if (option == 1){
                System.out.println(converter.USDtoMXN(amount));
            } else if (option == 2) {
                System.out.println(converter.USDtoARS(amount));
            }else if (option == 3) {
                System.out.println(converter.USDtoBRL(amount));
            }else if (option == 4) {
                System.out.println(converter.USDtoBOB(amount));
            }else if (option == 5) {
                System.out.println(converter.USDtoCLP(amount));
            }else if (option == 6) {
                System.out.println(converter.USDtoCOP(amount));
            }else if (option == 7) {
                System.out.println(converter.MXNtoUSD(amount));
            }else if (option == 8) {
                System.out.println(converter.ARStoUSD(amount));
            }else if (option == 9) {
                System.out.println(converter.BRLtoUSD(amount));
            }else if (option == 10) {
                System.out.println(converter.BOBtoUSD(amount));
            }else if (option == 11) {
                System.out.println(converter.CLPtoUSD(amount));
            }else if (option == 12) {
                System.out.println(converter.COPtoUSD(amount));
            }
            System.out.println("1 to continue, 2 to exit:");
            option = lectura.nextInt();
            if (option == 2){
                break;
            }
        }
    }
}
