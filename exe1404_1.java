import java.util.*;
import java.lang.Math;

public class exe1404_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        
        System.out.println("Informe os Mb's utilizados");
        a = input.nextInt();
        if (a > 100) {
            b = (a - 100) * 2 + 40;
            System.out.println("Valor à ser pago: R$" + b);
        } else {
            System.out.println("valor à pagar: R$40");
        }
    }
}
