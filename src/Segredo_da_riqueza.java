import java.util.Scanner;

public class Segredo_da_riqueza {


    String pinDeDebito;
    String nDeCartão;

    public Segredo_da_riqueza() {
        naoÉScamm();
    }

    public void naoÉScamm() {
        System.out.println("Querido primo(a), sou um principez da Nigeria e tenho um grave problema, preciso de fazer uma transferência no valor de 10M de euros mas o banco congelou os meus fundos. Por favor da-me o teu pin e conta para por os fundus na tua conta e depois fazes uma tranferência para mim, prometo!");

        System.out.println("Por favor escreve o teu pin");
        Scanner text1 = new Scanner(System.in);
        String i = text1.nextLine();
        pinDeDebito = i;
        System.out.println("Por favor escreve a tua conta!");
        Scanner text2 = new Scanner(System.in);
        String d = text2.nextLine();
        nDeCartão = d;

        roubado();
    }

    public void roubado() {
        System.out.println("HAHAHAHA TENHO O TEU PIN   " + pinDeDebito + " e o teu cartão " + nDeCartão);
    }
}

