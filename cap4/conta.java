class Conta {
    String titular;
    Data dataAbertura = new Data();
    String agencia;
    int numero;
    double saldo;

    void saca(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    double calculaRendimento() {
        return saldo * 0.1;
    }

    void recuperaDadosParaImpressao() {
        System.out.println("Titular: " + this.titular);
        System.out.println(dataAbertura.formatada());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}