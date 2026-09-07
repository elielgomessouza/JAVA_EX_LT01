import javax.swing.JOptionPane;

    public class EX18 {
        public static void main (String args[]) {
            int x, y, z;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
            if (x>y)
                z = x-y;
            if (x<y)
                z = y-x;
            else
                z = x-y;
            JOptionPane.showMessageDialog(null, "A diferença entre os valores é: " + z);
        }
}
