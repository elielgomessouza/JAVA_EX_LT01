import javax.swing.JOptionPane;

    public class EX09 {
        public static void main (String args[]) {
            int x, y, z;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
            z = (int) Math.pow(x, 2) + (int) Math.pow(y, 2);
            System.out.println("O valor dos quadrados são: " + z);
        }
}
