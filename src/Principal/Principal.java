package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        String apikey = System.getenv("Exchange-api-key");
        Scanner scanner = new Scanner(System.in);

        int decision;
        do {
            String cambio = "";
            String destino = "";
            double cantidad = 0;

            MenuPresentacion menu = new MenuPresentacion();
            System.out.println(menu.obtenerMenu());

            System.out.println("Ingrese la opcion deseada \n ");

            while (true){
                try {
                    decision = scanner.nextInt();
                    break;
                } catch (InputMismatchException e){
                    System.out.println("Error: Ingrese un numereo valido");
                    scanner.next();
                }
            }

            if (decision >=1 && decision <=8){
               switch (decision){
                   case 1 -> {cambio = "USD"; destino = "ARS";}
                   case 2 -> {cambio = "USD"; destino = "ARS";}
                   case 3 -> {cambio = "USD"; destino = "ARS";}
                   case 4 -> {cambio = "USD"; destino = "ARS";}
                   case 5 -> {cambio = "USD"; destino = "ARS";}
                   case 6 -> {cambio = "USD"; destino = "ARS";}
                   case 7 -> {cambio = "USD"; destino = "MXN";}
                   case 8 -> {System.out.println("Ingrese su moneda a cotizar");
                       cambio = scanner.next();
                       System.out.println("Ingrese su moneda destino");
                       destino = scanner.next();
                   }
               }

            }

            else {
                System.out.println("Ingrese un valor valido");
                continue;
            }

            System.out.println("Ingrese la cantidad de dinero que desea cambiar");
            cantidad = scanner.nextDouble();

            TiposCambio tipos = ExchangeApiClient.obtenerTasaCambio(cambio, destino, cantidad);

            if (tipos != null && tipos.conversion_rate() !=null) {
                System.out.println("Tipo de Cambio: " + tipos.conversion_rate());
                System.out.println("Moneda base: " + tipos.base_code());
                System.out.println("Moneda destino: " + destino
                        + "=" + tipos.conversion_result());
            } else {
                System.out.println("Error: No se puede obtener el resultado");
            }

            System.out.println("Desea seguir utilizando la aplicacion? (1=Si, 0=No)" );
            decision = scanner.nextInt();



        }

        while (decision == 1);
        System.out.println("Gracias por usar la aplicacion.");
        scanner.close();


    }
}
