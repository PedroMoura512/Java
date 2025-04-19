import java.time.Year;

public class Idade {

    public static void main(String[] args) {
        int anoatual = Year.now().getValue();
        int nasceu = 2007;
                int idade = anoatual - nasceu;
            System.out.println(String.format("Você tem %d ou faz %d esse ano.", idade, idade));

    }

}
