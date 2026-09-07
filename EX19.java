import javax.swing.JOptionPane;

    public class EX19 {
        public static void main (String args[]) {
            int x, y;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
            if (x>y) {
                JOptionPane.showMessageDialog(null, "O maior valor entre os dois é o de X: " + x);
            } else if (x<y) {
                JOptionPane.showMessageDialog(null, "O maior valor entre os dois é o de Y: " + y);
            } else {
                JOptionPane.showMessageDialog(null, "Ambos os valores são iguais");
        }
    }
}