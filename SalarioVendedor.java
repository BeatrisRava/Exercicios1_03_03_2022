//exercicio 11
import javax.swing.JOptionPane;
public class SalarioVendedor {
    public static void main(String[] args) {
       double salariofixo,qtdvendida,valorporvenda,vendatotal,comissao, salariofinal;

       salariofixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario fixo do vendedor:"));
       valorporvenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em cima de cada carro vendido:"));
       qtdvendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de carros vendidos:"));
       vendatotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o total da venda:"));

    comissao = valorporvenda * qtdvendida;

    comissao = comissao + (vendatotal * 5/100);

    salariofinal = salariofixo + comissao;

    String s = String.format(
            "O salário final do vendedor será de: %.2f",
            salariofinal
        );

        JOptionPane.showMessageDialog(null,s);

    }
}
