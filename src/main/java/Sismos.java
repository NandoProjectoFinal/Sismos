import java.util.Scanner;

public class Sismos {
    public static void main(String[] args) {
        eleccion();
    }

    public static void menu() {
        System.out.println("[1] Mostrar sismo mas Intenso");
        System.out.println("[2] Mostrar Sismos >= 4.0 Grados Richter");
        System.out.println("[3] Reiniciar arreglo con nuevos valores");
        System.out.println("[4] Salir");
    }

    public static String ingresoeleccion() {
        System.out.println("A que quiere acceder");
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    public static void eleccion() {
        boolean x = false;
        do {
            menu();
            String a = ingresoeleccion();
            System.out.println(a);
            switch (a) {
                case "1":
                    //mostrarSismoIntenso();
                    System.out.println("Sismo Intenso");
                    x=false;
                    break;
                case "2":
                    //sismosMayoresde4();
                    System.out.println("Sismos Mayores de 4");
                    x=false;
                    break;
                case "3":
                    //reiniciarArreglos();
                    System.out.println("Reinicio");
                    x=false;
                    break;
                case "4":
                    //salir();
                    System.out.println("Saliendo");
                    x= true;
                    break;
                default: x=false;
            }
        }while (x==false);
    }

    private static void salir() {
    }

    private static void reiniciarArreglos() {
    }

    private static void sismosMayoresde4() {
        revisarmatriz();
    }

    private static int revisarmatriz() {
    }

    private static void mostrarSismoIntenso() {
    }

}
