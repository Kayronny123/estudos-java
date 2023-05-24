package src.lojas;

import src.animais.Animais;
import src.animais.Cachorro;

public class Petshop {
    
    public void darBanho(Animais animais){
        animais.setEstadoEspirito("Limpo");
    }
    public void tosar(Cachorro cachorro){
        cachorro.setEstadoEspirito("Tosado");
    }
    public void deixarNoHotel(Animais animais) {
        animais.setEstadoEspirito("Saudades");
    }
}
