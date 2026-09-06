import javax.swing.JOptionPane;

    public class EX08 {
        public static void main (String args[]) {
            double deposito, rendimento, valorf;
            deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
            rendimento = deposito * 0.013;
            valorf = deposito + rendimento;
            JOptionPane.showMessageDialog(null, "O valor final do investimento foi de: " + valorf);
    }
}
