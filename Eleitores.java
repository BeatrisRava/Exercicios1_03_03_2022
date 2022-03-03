//exercicio 8
import javax.swing.JOptionPane;
public class Eleitores {
    public static void main(String[] args) {
        double eleitores, vbrancos, vnulos, validos, perbrancos, pernulos, pervalidos;

        eleitores = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de eleitores"));
        vbrancos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos brancos:"));
        vnulos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos nulos"));
        validos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos validos"));

       perbrancos = (eleitores * vbrancos) / 100;

       pernulos = (eleitores * vnulos) / 100;
       
       pervalidos = (eleitores * validos) / 100;


       String s = String.format(
             "a porcentagem dos votos é: brancos: %.0f%%; nulos: %.0f%%; validos: %.0f%% ",
             perbrancos, pernulos, pervalidos
         );


         JOptionPane.showMessageDialog(null,s);

    }
}