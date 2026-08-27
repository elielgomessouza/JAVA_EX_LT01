import javax.swing.JOptionPane;
    public class EX02 {
        public static void main (String args[]) {
        double salario, reajuste, salariof;
        salario = Double.parseDouble (JOptionPane.showInputDialog ("Digite o salário do funcionário: "));
        reajuste = salario * 0.15;
        salariof = salario + reajuste;
        JOptionPane.showMessageDialog(null, "O salário final do funcionário é: " + salariof);
    }
}
