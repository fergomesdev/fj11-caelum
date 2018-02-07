class TestaConta {
    public static void main(String[] args) {
        // Primeiro Teste
        Conta c1 = new Conta();
        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        c1.dataAbertura.dia = 4;
        c1.dataAbertura.mes = 6;
        c1.dataAbertura.ano = 2015;

        c1.deposita(10.0);
        c1.saca(20.0);
        c1.recuperaDadosParaImpressao();

        // Segundo Teste
        Conta c2 = new Conta();
        c2.titular = "Danilo";
        c2.saldo = 100;

        Conta c3 = new Conta();
        c3.titular = "Danilo";
        c3.saldo = 100;

        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}