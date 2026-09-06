import javax.swing.JOptionPane;

    public class EX07 {
        public static void main (String args[]) {
            int altura, largura, comprimento, area;
            altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do paralelepípedo: "));
            largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura do paralelepípedo: "));
            comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo: "));
            area = 2*((altura*largura) + (altura*comprimento) + (largura*comprimento));
            System.out.println("A área do paralelepípedo é: " + area);
        }
}
