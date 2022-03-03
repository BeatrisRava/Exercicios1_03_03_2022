//exercicio 6
import javax.swing.JOptionPane;
public class IdadeDias{
    public static void main(String[] args) {
        Integer idade,resultado;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));

        resultado = idade * 365;

        String s = String.format(
            "A idade em dias equivale a: %d dias",
            resultado 
        );

        JOptionPane.showMessageDialog(null,s);

    }
}