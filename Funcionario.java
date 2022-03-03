//exercicio 9
import javax.swing.JOptionPane;
public class Funcionario {
    public static void main(String[] args) {
        double salario,reajuste,resultado,salarioreajuste;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o reajuste:"));


         resultado = (salario * reajuste) / 100;

         salarioreajuste = salario - resultado;

         String s = String.format(
             "O salário com o reajuste é de: %.2f ",
             salarioreajuste
         );

         JOptionPane.showMessageDialog(null,s);

    }
}