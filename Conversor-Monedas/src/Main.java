import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        String menu = """
                        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        Sea Bienvenido al Conversor de moneda:
                        Escribe la opcion deseada:
                        1.- Dolar ==> Peso Argentino
                        2.-Peso Argentino ==> Dolar
                        3.-Dolar ==> Real Brasileño
                        4.-Real Brasileño ==> Dolar
                        5.-Dolar ==> Peso Colombiano
                        6.-Peso Colimbiano ==> Dolar
                        7.-Salir
                        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        Por favor elige la opcion deseada: """;
        int opcion = 0;
        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Por favor selecciona la cantidad a convertir");
                    double cantidadAconvertir = teclado.nextDouble();
                    Moneda moneda = consulta.busquedaMoneda("USD","ARS",cantidadAconvertir);
                    System.out.println("La cantidad: "+cantidadAconvertir+" Equivale a "+moneda.conversion_result()+" ARS.");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 2:
                    System.out.println("Por favor selecciona la cantidad a convertir");
                    double cantidadAconvertir1 = teclado.nextDouble();
                    Moneda moneda1 = consulta.busquedaMoneda("ARS","USD",cantidadAconvertir1);
                    System.out.println("La cantidad: "+cantidadAconvertir1+" Equivale a "+moneda1.conversion_result()+" USD.");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 3:
                    System.out.println("Por favor selecciona la cantidad a convertir");
                    double cantidadAconvertir2 = teclado.nextDouble();
                    Moneda moneda2 = consulta.busquedaMoneda("USD","BRL",cantidadAconvertir2);
                    System.out.println("La cantidad: "+cantidadAconvertir2+" Equivale a "+moneda2.conversion_result()+" BRL.");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 4:
                    System.out.println("Por favor selecciona la cantidad a convertir");
                    double cantidadAconvertir4 = teclado.nextDouble();
                    Moneda moneda4 = consulta.busquedaMoneda("BRL","USD",cantidadAconvertir4);
                    System.out.println("La cantidad: "+cantidadAconvertir4+" Equivale a "+moneda4.conversion_result()+" USD.");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 5:
                    System.out.println("Por favor selecciona la cantidad a convertir");
                    double cantidadAconvertir5 = teclado.nextDouble();
                    Moneda moneda5 = consulta.busquedaMoneda("USD","COP",cantidadAconvertir5);
                    System.out.println("La cantidad: "+cantidadAconvertir5+" Equivale a "+moneda5.conversion_result()+" COP.");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 6:
                    System.out.println("Por favor selecciona la cantidad a convertir");
                    double cantidadAconvertir6 = teclado.nextDouble();
                    Moneda moneda6 = consulta.busquedaMoneda("COP","USD",cantidadAconvertir6);
                    System.out.println("La cantidad: "+cantidadAconvertir6+" Equivale a "+moneda6.conversion_result()+" USD.");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                default:
                    System.out.println("Esta opcion no se encuentra en el menu");
            }

        }
        System.out.println("Nos vemos :)");
    }
}