//exercicio 4
import javax.swing.JOptionPane;
public class Antecessor {
    public static void main(String[] args) {
        int num, antecessor;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço por unidade:"));

        antecessor = num - 1;
        
        String s = String.format(
            "O antecessor é: %.2f",
            antecessor
        );
        
        JOptionPane.showMessageDialog(null,s);


    }
    
}
