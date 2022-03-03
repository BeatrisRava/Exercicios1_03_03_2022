//exercicio 7
import javax.swing.JOptionPane;
public class IdadeMesesDias {
    public static void main(String[] args) {
        Integer idade, meses, dias, calculo, res;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade (em anos):"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Meses:"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Dias:"));

        calculo = (idade * 365) + (meses * 30);

        res = calculo + dias;
 
        String s = String.format(
             "Sua idade em dias corresponde a: %d dias ",
             res
         );

         JOptionPane.showMessageDialog(null,s);

    }
}