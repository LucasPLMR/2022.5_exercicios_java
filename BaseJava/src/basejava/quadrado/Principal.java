package basejava.quadrado;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado();
        quadrado.setValor(5);
        
        JOptionPane.showMessageDialog(null, ""
            + "Valor dos lados: " + quadrado.getValor() + "\n"
            + "Valor da Area é: " + quadrado.Area() + "\n");
    }
}