//exercicio 8
import javax.swing.JOptionPane;
public class Eleitores {
    public static void main(String[] args) {
        double eleitores, vbrancos, vnulos, validos, perbrancos, pernulos, pervalidos;

        eleitores = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de eleitores"));
        vbrancos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos brancos:"));
        vnulos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos nulos"));
        validos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos validos"));

       perbrancos = (vbrancos/eleitores) * 100;

       pernulos = (vnulos/eleitores) * 100;
       
       pervalidos = (validos/eleitores) * 100;


       String s = String.format(
             "a porcentagem dos votos é: brancos: %.0f%%; nulos: %.0f%%; validos: %.0f%% ",
             perbrancos, pernulos, pervalidos
         );


         JOptionPane.showMessageDialog(null,s);

    }
}