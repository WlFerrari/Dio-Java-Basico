public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private int capacidadeArmazenamento;
    private String cor;
    private boolean ligado;

    public IPhone(String modelo, int capacidadeArmazenamento, String cor) {
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.cor = cor;
        this.ligado = false; 
    }

    
    public void ligar() {
        this.ligado = true;
        System.out.println("iPhone ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("iPhone desligado");
    }

    @Override
    public void tocar() {
       
    }

    @Override
    public void pausar() {
    
    }

    @Override
    public void selecionarMusica(String musica) {
        
    }

    @Override
    public void ligar(String numero) {
       
    }

    @Override
    public void atender() {
       
    }

    @Override
    public void iniciarCorreioVoz() {
       
    }

    @Override
    public void exibirPagina(String url) {
      
    }

    @Override
    public void adicionarNovaAba(String url) {
       
    }

    @Override
    public void atualizarPagina() {
        
    }
}