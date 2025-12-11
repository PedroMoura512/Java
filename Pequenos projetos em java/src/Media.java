import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Collections.addAll(notas, 5.0, 6.5, 2.0, 7.8);
        double soma = 0;
        for(Double numeros : notas){
            soma += numeros;
        }
        double media = soma / notas.size();
                System.out.printf("A média dos valores é %.1f\n", media);
    }
}