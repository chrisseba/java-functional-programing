package functional_programing.clean_hands_interfaces;


@FunctionalInterface
interface OneParamToVoid {
    void imprimir(String message);
}
@FunctionalInterface
interface TwoParamToVoid {
    void imprimir(String a, String b);
}

public class ParameterToVoidExample {
    private final static String SALUDAR = "Buenos dias...";
    private final static String DESPEDIR = "Hasta luego...";

    public static void main(String[] args){
        imprimirMensaje(SALUDAR);
        saludar.imprimir(SALUDAR);
        saludar.imprimir(DESPEDIR);
        saludarDespedir.imprimir(SALUDAR,DESPEDIR);
    }

    private static OneParamToVoid saludar =
            message -> System.out.println(message);
    private static TwoParamToVoid saludarDespedir =
            (saludarMsg, despedirMsg) -> {
                                            System.out.println(saludarMsg);
                                            System.out.println(despedirMsg);
                                        };

    private static void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
