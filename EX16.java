import javax.swing.JOptionPane;

    public class EX16 {
        public static void main (String args[]) {
            int horasT, valorH, percentualD, desconto, Ndep, SB, SL, ST;
            horasT = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
            valorH = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora do trabalho: "));
            percentualD = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
            Ndep = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes: "));
            SB = horasT*valorH;
            desconto = (percentualD*SB)/100;
            SL = SB - desconto;
            ST = SL + (Ndep*100);
            JOptionPane.showMessageDialog(null, "Salário a receber: " + ST);
        }
}
