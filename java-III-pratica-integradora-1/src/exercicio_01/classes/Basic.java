package exercicio_01.classes;

import exercicio_01.interfaces.SeeBalance;
import exercicio_01.interfaces.ServicePayment;
import exercicio_01.interfaces.Withdrawal;

public class Basic implements SeeBalance, ServicePayment, Withdrawal {
    @Override
    public void seeBalance() {
        System.out.println("Consultando saldo...");
    }

    @Override
    public void makePayment(String service) {
        System.out.println("Realizando pagamento de: " + service);
    }

    @Override
    public void makeWithdrawal(double value) {
        System.out.println("Realizando saque no valor de R$ " + value);
    }

    @Override
    public void transactionOk(String transaction) {
        System.out.println(transaction + " realizada com sucesso.");
    }

    @Override
    public void transactionNotOk(String transaction) {
        System.out.println("Ocorreu um erro ao realizar a transação: " + transaction);
    }
}
