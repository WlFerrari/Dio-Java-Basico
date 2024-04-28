package Exercícios.Banco;
// Banco.java
public class Banco {
    double saldo = 1000.0;

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
    } 

    public void depositar(double valor) { 
        saldo += valor;
    }
}
