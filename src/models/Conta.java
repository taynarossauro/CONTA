package models;

/* Essa classe calcula a média artmetica 
 * baseado nos 3 numeros que ela receber. 
 * 
 * @author taynara
 * @version 1.0
 */
public class Conta {
    // Atributos da conta.
    private double saldo = 0.00;
    private int quantidadeConsultas = 0;

    // Método para consultar o saldo
    public String consultarSaldo() {
        quantidadeConsultas++;

        // Cobra taxa de R$0,10 a cada 5 consultas.
        if (quantidadeConsultas % 5 == 0) {
            saldo -= 0.10;
        }

        // Retorna o saldo formatado
        return String.format("Saldo em conta: R$%,.2f", saldo);
    }

    // Método que deposita um valor.
    public void depositar(double valor) {
        // Verifica se o valor é positivo.
        if (valor > 0) {
            saldo += valor * 0.99; // Cobrança de taxa de 1%.
        }
    }

    // Método que saca um valor.
    public void sacar(double valor) {
        // Verifica se o valor é positivo.
        if (valor > 0) {
            saldo -= valor * 1.005; // Cobrança de taxa de 0.5%.
        }
    }
}
