package exercicio_01.classes;

import exercicio_01.interfaces.Deposit;
import exercicio_01.interfaces.Transference;

public class Executive implements Deposit, Transference {
    @Override
    public void makeDeposit(double value) {
        System.out.println("Fazendo deposito de: " + value);
    }

    @Override
    public void makeTransference(double value) {
        System.out.println("Fazendo transferência de: " + value);
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
