package src;
// import java.time.LocalDate;
// import java.time.format.TextStyle;
// import java.util.Locale;
// import java.time.LocalDateTime;

import src.animais.Animais;
import src.animais.Cachorro;
import src.animais.Gato;
import src.animais.Passaro;
import src.lojas.Petshop;

public class Main {
    public static void main(String[] args) {
        
        // chamando meu constructor e atribuindo suas propriedades ao objeto
        Cachorro cachorro1 = new Cachorro("Luly", "Preto", 25, 7.5, 12, "" );
        Cachorro cachorro2 = new Cachorro("Pandora", "Marron", 40, 10.5, 16, "" );
        Gato gato1 = new Gato("Buxim", "Preto", 1.5);
        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);
        Petshop petshop = new Petshop();
        Animais gato2 = new Gato("Bless", "Preto", 2);

        // exibindo informações inseridas atravês dos metodos em geral, metodos criado com condicionais e exibindo informações do meu constructor criado 
        System.out.println(cachorro1.getNome());
        gato2.soar();
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoEspirito());
        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoEspirito());
        petshop.tosar(cachorro2);
        System.out.println(cachorro2.getEstadoEspirito());
        // exercicio 1
        //     int nota = 70;
    //     String graduacao;

    //     if (nota >= 80) {
    //         graduacao = "A";
    //     } else if (nota < 80 && nota >= 70) {
    //         graduacao = "A";
    //     } else if (nota < 70 && nota >= 60) {
    //         graduacao = "C";
    //     } else if (nota < 60 && nota >= 0) {
    //         graduacao = "D";
    //     } else {
    //         graduacao = "";
    //     }
    //     switch (graduacao) {
    //         case "A":
    //         case "B":
    //             System.out.println("Aluno aprovado");
    //             break;
    //         case "C":
    //         case "D":
    //             System.out.println("Aluno reprovado");
    //             break;
    //         default:
    //             System.out.println("Graduação invalida");
    //     }
  

    //  exercicio 2
//     String nome = "Kayronny";

//     LocalDate hoje = LocalDate.now();
//     Locale brasil = new Locale("pt", "BR");

//     System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
//     String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
//     String saudacao;
//     LocalDateTime agora = LocalDateTime.now();
//     if ( agora.getHour() >= 0 && agora.getHour() < 12){
//         saudacao = "Bom dia";
//     } else if (agora.getHour() >= 12 && agora.getHour() < 18){
//         saudacao = "Boa tarde";
//     } else if (agora.getHour() >= 18 && agora.getHour() < 24){
//         saudacao = "Boa noite";
//     }else {
//         saudacao = "Olá";
//     }
// System.out.printf("Olá, %s. Hoje é %s. %s.%n", nome, diaSemana, saudacao.toUpperCase());
}
};