import javax.swing.JOptionPane;

    public class EX15 {
        public static void main (String args[]) {
            int cateto1, cateto2, hipotenusa;
            cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º cateto: "));
            cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º cateto: "));
            hipotenusa = (int) Math.sqrt((int) Math.pow(cateto1, 2) + (int) Math.pow(cateto2, 2));
            JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);
        }
}
