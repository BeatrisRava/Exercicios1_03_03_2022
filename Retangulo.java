//exercicio 5
import javax.swing.JOptionPane;
public class Retangulo {
    public static void main(String[] args) {
        double base,altura,area;
 
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
 
        area = base * altura;
 
        String s = String.format(
              "A area do retangulo é: %.2f ",
              area
          );
 
          JOptionPane.showMessageDialog(null,s);
 
    }
 }
 

