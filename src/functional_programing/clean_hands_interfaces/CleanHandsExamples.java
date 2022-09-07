package functional_programing.clean_hands_interfaces;

public class CleanHandsExamples {

    public static void main(String[] args){
        paintMessage("hola mundo");
    }

    public static void paintMessage(String message){
        System.out.println("#################################");
        System.out.println("/");
        System.out.println("/");
        System.out.println("/      "  + message);
        System.out.println("/");
        System.out.println("/");
        System.out.println("#################################");
    }
}
