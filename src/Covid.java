public class Covid {


    private String nome;
    private int idade;

    public Covid(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String esLinda(String a){
        if ( a.equals("Joana Antunes")){
            return "És Linda!";
        } else {
            return "Volta para o útero e sai de novo!";
        }
    }
}

