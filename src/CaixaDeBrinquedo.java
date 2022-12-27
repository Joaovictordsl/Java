import java.text.DecimalFormat;
import java.util.ArrayList;

public class CaixaDeBrinquedo {
    DecimalFormat deci = new DecimalFormat("0.00");

    public ArrayList caixa = new ArrayList<>();

    public CaixaDeBrinquedo(){
        this.caixa = new ArrayList<>();

    }

    public void adcFigura (Forma brinquedos){
        caixa.add(brinquedos);
    }

    public void mostrarFigura(){
        for(Object brinquedos : caixa){
            if(brinquedos instanceof Bidimensional){
                System.out.println("eu sou um " + ((Bidimensional) brinquedos).getNome() +
                        " e minha area é " + deci.format(((Forma) brinquedos).obterArea()));

            }
        }

        for(Object brinquedos : caixa){
            if(brinquedos instanceof Tridimensional){
                System.out.println("eu sou um " + ((Tridimensional) brinquedos).getNome() +
                        ", minha area é " + deci.format(((Forma) brinquedos).obterArea()) +
                        " e meu Volume é " + deci.format(((Tridimensional) brinquedos).obterVolume()));
            }
        }
    }
}
