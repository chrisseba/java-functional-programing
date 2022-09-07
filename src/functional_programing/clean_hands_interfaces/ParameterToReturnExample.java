package functional_programing.clean_hands_interfaces;

@FunctionalInterface
interface ParamToReturn {
    String imprimir(String message, String nombre);
}

public class ParameterToReturnExample {
    private final static String SALUDAR = "Buenos dias";
    private final static String DESPEDIR = "Hasta luego";

    public static void main(String[] args){
        System.out.println(concatena.imprimir(SALUDAR, "Carlos"));
        System.out.println(concatenaDosPuntos.imprimir(DESPEDIR,"Anita"));
        System.out.println(concatenaGuion.imprimir(DESPEDIR,"Anita"));

    }

    private static ParamToReturn concatena = (mensaje, nombre) -> mensaje + " " + nombre;
    private static ParamToReturn concatenaDosPuntos =
            (mensaje, nombre) -> { return mensaje + " : " + nombre;};

    private static ParamToReturn concatenaGuion =
            (mensaje, nombre) -> {
                String retorno = mensaje + " - ";
                retorno += nombre;
                return retorno;};

    private static String imprimirMensaje(String mensaje, String nombre){
        return mensaje + " " + nombre;
    }

}
