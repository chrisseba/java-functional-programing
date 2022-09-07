package functional_programing.clean_hands_interfaces;


@FunctionalInterface
interface VoidToVoid {
    void imprimir();
}

public class VoidToVoidExample {

    public static void main(String[] args){

        saludar.imprimir();
        despedir.imprimir();
        saludarDespedir.imprimir();
    }

    private static VoidToVoid saludar = () -> {System.out.println("Buenos dias...");};
    private static VoidToVoid despedir = () -> System.out.println("Hasta luego...");
    private static VoidToVoid saludarDespedir = () -> {
                                    System.out.println("Buenos dias...");
                                    System.out.println("Buenos dias...");};

    private void imprimirMensaje(){
        System.out.println("Hola mundo...");
    }

}
