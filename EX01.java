import javax.swing.JOptionPane;

public class EX01 {
    public static void main (String args[]) {
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog ("DIgite o valor do lado do quadrado: "));
        area = lado*lado;
        JOptionPane.showMessageDialog(null,"A área do quadrado é: " + area);
    }
}
