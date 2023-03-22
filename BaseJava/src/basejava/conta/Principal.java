package basejava.conta;

public class Principal {
    public static void main(String[]args){
        Conta conta = new Conta(123, "Matheus", 100.0);
        System.out.println(conta.toString());
        conta.setNome("João");
        conta.deposito(50);
        System.out.println(conta.toString());
        conta.saque(110);
        System.out.println(conta.toString());
        
    }
    
}
