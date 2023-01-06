public class Pessoa {
    private int matricula;
    private String nome;
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
    public void setNome(String name){
        nome = name;
    }
    public void setMatricula(int m){
        matricula = m;
    }

    public void setNota(float n){
        nota = n;
    }




}
