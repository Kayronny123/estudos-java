package src.animais;

public class Passaro extends Animais {

    static int numeroDePassaros;
    public Passaro(String nome, String cor, double peso){
        super(nome, cor ,peso);
    }
    @Override
    public void soar(){
        System.out.println("piu piu");
    }
 
}
