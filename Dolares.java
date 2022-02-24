//exercicio 1

import javax.swing.JOptionPane;
public class Dolares{
    public static void main (String [] x){

        System.out.println("1 dólar = 5,10 reais");

        double  valor,res;
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja converter:"));

        res = valor * 5.10;

        String s = String.format(
             "O valor em dólares é: %.2f",
             res
         );

         JOptionPane.showMessageDialog(null,s);
    }
}