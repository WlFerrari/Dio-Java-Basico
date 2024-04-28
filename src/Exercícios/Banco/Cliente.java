package Exercícios.Banco;
public class Cliente {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        banco.sacar(12);

        banco.depositar(200);
        System.out.println("Novo saldo no banco de: " + banco.saldo);
    }
}