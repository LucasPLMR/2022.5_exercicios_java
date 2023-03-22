package basejava.conta;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    
    public Conta(int numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    public Conta(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0.0;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void deposito(double valor){
        this.saldo += valor;
    }
    public void saque(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
    
    }
    public String toString() {
        return "Conta [numero=" +numero+ ", nome=" +nome+ ", saldo=" +saldo+ "]";
    
    }






}
