import javax.swing.JOptionPane;

    public class EX06 {
        public static void main (String args[]) {
            int x, y;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
            JOptionPane.showMessageDialog(null,"O valor de X agora é: " + y + "e o valor de Y agora é: " + x);
    }       
}
