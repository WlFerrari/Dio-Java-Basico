package Exercícios.SmartTV;
public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 50; 

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o Volume: " + volume);
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o Volume: " + volume);
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
