import javax.swing.JOptionPane;

    public class EX23 {
        public static void main (String args[]) {
            float v1, v2, v3, v4;
            v1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 1º valor: "));
            v2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 2º valor: "));
            v3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 3º valor: "));
            v4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 4º valor: "));
            if (v3<v4)
                JOptionPane.showMessageDialog(null, "A ordem crescente é: " + v1 + "," + v2 + "," + v3 + "," + v4);
            else if (v1>v4)
                JOptionPane.showMessageDialog(null, "A ordem crescente é: " + v4 + "," + v1 + "," + v2 + "," + v3);
            else if (v2>v4)
                JOptionPane.showMessageDialog(null, "A ordem crescente é: " + v1 + "," + v4 + "," + v2 + "," + v3);
            else if (v3>v4)
                JOptionPane.showMessageDialog(null, "A ordem crescente é: " + v1 + "," + v2 + "," + v4 + "," + v3);
        }
}