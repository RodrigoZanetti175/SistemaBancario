public class Teste {
    public static void main(String[] args) {
        ContaPoupanca cPoupanca = new ContaPoupanca(11,10, "Poupança", 1000.00, "Rodrigo");
        System.out.println("Primeira quantidade de contas: " + Conta.getQuantidadeContas());
        ContaCorrente cCorrente = new ContaCorrente(11,12, "Corrente", 750.00, "Rodrigo");
        System.out.println("Segunda quantidade de contas: " + Conta.getQuantidadeContas());
        System.out.println("-----------------\nInformações das contas:\n");
        System.out.println("Conta Corrente");
        System.out.println("Numero da Conta: "+cCorrente.getNumeroConta());
        System.out.println("Numero da Agencia: "+cCorrente.getNumeroAgencia());
        System.out.println("Tipo da Conta: "+cCorrente.getTipoConta());
        System.out.println("Saldo da Conta: R$"+cCorrente.getSaldo());
        System.out.println("Nome do Titular: "+cCorrente.getNomeTitular());
        System.out.println("\nConta Poupança");
        System.out.println("Numero da Conta: "+cPoupanca.getNumeroConta());
        System.out.println("Numero da Agencia: "+cPoupanca.getNumeroAgencia());
        System.out.println("Tipo da Conta: "+cPoupanca.getTipoConta());
        System.out.println("Saldo da Conta: R$"+cPoupanca.getSaldo());
        System.out.println("Nome do Titular: "+cPoupanca.getNomeTitular());
        System.out.println("\n--------------------");

        //Sacar

        System.out.println("\nSaldo da Conta Corrente antes do saque de R$100: R$" +cCorrente.getSaldo());
        cCorrente.sacar(100);
        System.out.println("Saldo da Conta Corrente após o saque: R$" +cCorrente.getSaldo());
        System.out.println("\nSaldo da Conta Poupança antes de um saque maior que o valor disponível na conta: R$" +cPoupanca.getSaldo());
        if(cPoupanca.sacar(1100))
            System.out.println("Saque realizado com sucesso!");
        else
            System.out.println("Saque inválido");
        System.out.println("Saldo da Conta Poupança depois de um saque maior que o valor disponível na conta: R$" +cPoupanca.getSaldo());
        System.out.println("\n--------------------");

        //Depositar

        System.out.println("\nSaldo da Conta Corrente antes de depositar um valor inválido: R$" +cCorrente.getSaldo());
        cCorrente.depositar(-120);
        System.out.println("Saldo da Conta Corrente após depositar um valor inválido: R$" + cCorrente.getSaldo());
        System.out.println("\nSaldo da Conta Poupança antes de depositar R$200: R$" + cPoupanca.getSaldo());
        cPoupanca.depositar(200);
        System.out.println("Saldo da Conta Poupança depois de depositar R$200: R$" + cPoupanca.getSaldo());
        System.out.println("\n--------------------");

        //Transferir
        System.out.println("\nSaldo da Conta Corrente antes de uma transferência de R$49.8 para a Conta Poupança");
        cCorrente.transferir(49.8, cPoupanca);
        System.out.println("\nSaldo da Conta Poupança antes de uma transferência inválida para a Conta Corrente");
        if(cPoupanca.transferir(1500, cCorrente))
            System.out.println("Transferência realizada com sucesso!");
        else
            System.out.println("Transferência falhou");
        System.out.println("\n--------------------");

        //Saldos Finais

        System.out.println("\nSaldos Finais");
        System.out.println("Conta Corrente: R$" + cCorrente.getSaldo());
        System.out.println("Conta Poupança: R$" + cPoupanca.getSaldo());

        //Teste Tributável

        CalculadorImposto calc = new CalculadorImposto();
        SeguroDeVida seguro = new SeguroDeVida(1000, "Rodrigo", 123);
        System.out.println("\nValor do imposto do seguro de vida: R$" + seguro.getValorImposto());
        System.out.println("Valor do imposto da conta corrente: R$" + cCorrente.getValorImposto());
        calc.registraImposto(cCorrente);
        calc.registraImposto(seguro);
        System.out.println("Valor total de impostos arrecadados: R$" + calc.getTotalImposto());



    }
}
