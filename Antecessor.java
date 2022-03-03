//exercicio 4
import javax.swing.JOptionPane;
public class Antecessor {
    public static void main(String[] args) {
        int num, antecessor;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja ver o antecessor:"));

        antecessor = num - 1;
        
        String s = String.format(
            "O antecessor é: %d",
            antecessor
        );

        JOptionPane.showMessageDialog(null,s);


    }
    
}
