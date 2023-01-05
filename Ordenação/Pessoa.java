public class Pessoa {
    private String nome;
    private int matricula;
    private float nota;

    //construtor
    public Pessoa(String nome, int matricula, float nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //getter
    public String getNome(){
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public float getNota(){
        return nota;
    }



}
