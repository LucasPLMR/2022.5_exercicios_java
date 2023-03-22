package basejava.Pessoa;

public class Principal {

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Rafael", 16, 77, 170);
        System.out.println(pessoa.toString());
        pessoa.engordar(5);
        System.out.println(pessoa.toString());
        pessoa.emagrecer(10);
        System.out.println(pessoa.toString());
        pessoa.crescer(0);
        System.out.println(pessoa.toString());
        pessoa.envelhecer(1);
        System.out.println(pessoa);

    }

}