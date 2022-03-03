//exercicio 1

import javax.swing.JOptionPane;
public class Dolares{
    public static void main (String [] x){

        double  cotacao,valor,res;
        
        cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja converter:"));

        res = valor * cotacao;

        String s = String.format(
             "O valor em dólares é: %.2f",
             res
         );

         JOptionPane.showMessageDialog(null,s);
    }
}