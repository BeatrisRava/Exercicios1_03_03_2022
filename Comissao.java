//exercicio 3
import javax.swing.JOptionPane;
public class Comissao {
    public static void main(String[] args) {
       double qtdvendida,precounidade,comissao,res,pagamento;

       precounidade = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por unidade:"));
       qtdvendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida:"));

       res = precounidade * qtdvendida;

       comissao = res * 5/100;

       pagamento = res + comissao;

       String s = String.format(
             "O pagamento do funcionário será de: %.2f",
             pagamento
         );

         JOptionPane.showMessageDialog(null,s);
    }


    
    
}
