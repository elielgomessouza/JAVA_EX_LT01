import javax.swing.JOptionPane;

    public class EX07 {
        public static void main (String args[]) {
            double altura, base, comprimento, area;
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paralelepípedo: "));
            base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do paralelepípedo: "));
            comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo: "));
            area = (altura * base)*2 + (base * comprimento)*2 + (altura * comprimento)*2;
            JOptionPane.showMessageDialog(null,"A área do paralelepípedo é: " + area);
        }
}
