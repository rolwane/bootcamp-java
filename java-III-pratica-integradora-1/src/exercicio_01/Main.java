package exercicio_01;

import exercicio_01.classes.Basic;
import exercicio_01.classes.Collector;
import exercicio_01.classes.Executive;

public class Main {
    public static void main(String[] args) {
        // criando os tipos de clientes
        Executive executive = new Executive();
        Basic basic = new Basic();
        Collector collector = new Collector();

        System.out.println("---------- Executivo ----------");
        executive.makeDeposit(550.00);

        // simulando que a transação deu certo
        executive.transactionOk("Depósito");

        System.out.println("\n \n");

        System.out.println("---------- Básico ----------");
        basic.makePayment("Conta de luz");

        // simulando que a transação não deu certo
        basic.transactionNotOk("Pagamento");

        System.out.println("\n \n");

        System.out.println("---------- Cobrador ----------");
        collector.seeBalance();

        // simulando que a transação deu certo
        collector.transactionOk("Consultar saldo");
    }
}
