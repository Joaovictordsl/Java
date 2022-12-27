public abstract class Tridimensional {
    private String nome;

    public Tridimensional(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public abstract double obterVolume();

}
