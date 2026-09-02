import javax.swing.JOptionPane;

    public class _011 {
        public static void main (String args []) {
            double raio, comprimento;
            raio = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor do raio da circunferência: "));
            comprimento = 2*(3.14*raio);
            JOptionPane.showInputDialog(null, "O valor do comprimento da esfera é: " + comprimento);    
    }
}
