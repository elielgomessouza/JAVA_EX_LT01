import javax.swing.JOptionPane;

    public class EX10 {
        public static void main (String args []) {
            int x,y,diferença;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
            diferença = x-y;
            JOptionPane.showInputDialog(null, "A diferença entre os valores é: " + diferença);
        }
}
