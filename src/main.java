import agregacion.AggregationExample;
import asociacion.AssociationExample;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Relaciones POO");
        System.out.println("1). Asociacion");
        System.out.println("2). Agregacion");
        System.out.println("3). Composicion");
        System.out.print("Elige una opcion: ");

        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Opcion invalida");
            return;
        }

        switch (scanner.nextInt()) {
            case 1:
                AssociationExample.main(args);
                break;
            case 2:
                AggregationExample.main(args);
                break;
            case 3:
                System.out.println("Opcion aun no implementada");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
