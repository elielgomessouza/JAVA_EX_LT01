import javax.swing.JOptionPane;

    public class EX22 {
        public static void main (String args[]) {
            int x, y;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
            if (x>y)
                JOptionPane.showMessageDialog(null, "A ordem crescente dos valores é: " + x + " e " + y);
            else if (x==y)
                JOptionPane.showMessageDialog(null, "Ambos os valores são iguais!");
            else
                JOptionPane.showMessageDialog(null, "A ordem crescente dos valores é: " + y + " e " + x);
        }
}