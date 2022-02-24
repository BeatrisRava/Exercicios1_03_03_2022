//exercicio 2
import javax.swing.JOptionPane;
public class Quadrado {
    public static void main(String[] args) {
        double n1,n2,n3,n4,res;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número:"));

 
        res = n1 * n1 + n2 * n2 + n3 * n3 + n4 * n4;

        String s = String.format(
             "A soma de todos os quadrados é: %.2f ",
             res
         );

         JOptionPane.showMessageDialog(null,s);



    }
}
