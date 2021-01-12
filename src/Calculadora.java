public class Calculadora {

    private int numero1;
    private int numero2;

    public int soma(int numero1, int numero2){

        return numero1+numero2;

    }

    public static void main(String[] args) {




        Calculadora calculadora = new Calculadora();
        calculadora.soma(1,2);
    }

}
