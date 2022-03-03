//exercicio 10
import javax.swing.JOptionPane;
public class CustoCarro {
    public static void main(String[] args) {
        double custofabrica,perdistribuidor,perimpostos,valordistribuidor, valorimpostos, custofinal;

        custofabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fabrica:"));
        perdistribuidor = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do distribuidor:"));
        perimpostos = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem dos impostos"));

        valordistribuidor = custofabrica + (custofabrica * perdistribuidor/100);

        valorimpostos = custofabrica + (custofabrica * perimpostos/100);

        custofinal = custofabrica + valordistribuidor + valorimpostos;
        

        String s = String.format(
            "O custo final do carro será de: %.2f ",
           custofinal
        );

        JOptionPane.showMessageDialog(null,s);

    }
}
