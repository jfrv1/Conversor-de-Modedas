package Principal;


public class MenuPresentacion extends Principal {
    private final String adorno = "****************************************";
    private final String saludo = "Hola bienvenido al conversor de monedas " +
            "su aplicacion de confianza para tipos de cambio actualizado";
    private final String [] menuOpciones = {
            "1) Dolar → Peso Argentino",
            "2) Peso Argentino → Dolar",
            "3) Dolar → Real Brasileño",
            "4) Real Brasileño → Dolar",
            "5) Dolar → Peso Colombiano",
            "6) Peso Colombiano → Dolar",
            "7) Otro (Coloque el tipo de cambio abreviado en mayusculas, ej: MXN = USD)",
            "8) Salir",

    };
    public String obtenerMenu(){
        StringBuilder salida = new StringBuilder();
        salida.append(adorno).append("\n")
                .append(saludo).append("\n")
                .append(adorno).append("\n");

        for (String opcion : menuOpciones) {
            salida.append(opcion).append("\n");
        }
        salida.append(adorno);
        return salida.toString();
    }
}
