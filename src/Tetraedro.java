import java.lang.Math;

public class Tetraedro extends Tridimensional implements Forma{
    private double aresta;

    public Tetraedro(String nome, double aresta){
        super(nome);
        this.aresta = aresta;

    }


    public double obterArea(){
        return Math.pow(aresta,2)*Math.sqrt(3);
    }


    public double obterVolume(){
        return (Math.pow(aresta,3)*Math.sqrt(2))/12;
    }

}
