
package basejava.numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
          //  int valor = 3;
          //  if (valor % 2 == 0) {
          //      System.out.print("PAR");
         //   }else{
         //       System.out.print("IMPAR");  
         //   };
            Scanner scan = new Scanner(System.in);
            Numero numero = new Numero();
            
            // System.out.print("Digite um número: ");
            // numero.valor = scan.nextInt();
            // System.out.println(numero.parImpar());

            // System.out.print("Digite o primeiro valor: ");
            // int valor1 = scan.nextInt();
            // System.out.print("Digite o segundo valor: ");
            // int valor2 = scan.nextInt();
            // System.out.println(numero.maiormenor(valor1,valor2));
        
            // System.out.print("Digite o primeiro valor: ");
            // int v1 = scan.nextInt();
            // System.out.print("Digite o segundo valor: ");
            // int v2 = scan.nextInt();
            // System.out.print("Digite o terceiro valor: ");
            // int v3 = scan.nextInt();
            // System.out.println(numero.ordenarCrescente(v1,v2,v3));

            try{
                    numero.valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
                    JOptionPane.showMessageDialog(null, "O Número é "+ numero.parImpar());
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null,"Digite apenas número!");
                }
    }

}
