package src.animais;
// classe do objeto
public class Cachorro extends Animais {

    static int numeroDeDogs;

    // constructor
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoEspirito){
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoEspirito = estadoEspirito;
        numeroDeDogs ++;
    }
// getters e setters "pegar propriedades da classe do objeto e passar propriedade da classe do objeto (respectivamente)" esse método é usado para classes private, para evitar manipulação e proteção das propriedades.
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }
    public String getEstadoEspirito() {
        return estadoEspirito;
    }
    public void setEstadoEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }

    public static int getNumeroDeDogs() {
        return numeroDeDogs;
    }
    public static void setNumeroDeDogs(int numeroDeDogs) {
        Cachorro.numeroDeDogs = numeroDeDogs;
    }
    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + ", cor=" + cor + "]";
    }    
    @Override
    public void soar(){
        System.out.println("au au");
    }

    // metodos criados em geral para entender como funcionam e também para entender manipular um objeto de acordo com condicionais e como retornar esses eventos
   
    public String pegarBolinha(){
        return "Bolinha";
    }
    public String interagir(String acao){
        switch(acao){
            case "carinho" : this.estadoEspirito = "lambeijos";
            break;
            case "vai dormir" : this.estadoEspirito = "triste";
            break;
            case "chute" : this.estadoEspirito = "mordeu";
            break;
            case "comida" : this.estadoEspirito = "feliz";
            default: this.estadoEspirito = "deboa";
        }
        return estadoEspirito;
    }

}
