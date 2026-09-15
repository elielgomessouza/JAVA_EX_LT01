import javax.swing.JOptionPane;

    public class EX24 {
        public static void main (String args[]) {
            int x;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
            if (x%2==0 && x%3==0)
                JOptionPane.showMessageDialog(null, "O valor " + x + " é divísivel por 2 e 3");
            else if (x%2==0)
                JOptionPane.showMessageDialog(null, "O valor " + x + " é divísivel por 2");
            else if (x%3==0)
                JOptionPane.showMessageDialog(null, "O valor " + x + " é divísivel por 3");
        }
}
