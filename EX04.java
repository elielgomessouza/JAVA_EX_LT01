import javax.swing.JOptionPane;

    public class EX04 {
        public static void main (String args[]) {
            double celsius, fahrenheit;
            celsius = Double.parseDouble (JOptionPane.showInputDialog ("Digite a temperatura em graus Celsius: "));
            fahrenheit = (9*celsius+160)/5;
            JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit);
        }
}
