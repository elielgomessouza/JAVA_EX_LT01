import javax.swing.JOptionPane;

    public class EX12 {
        public static void main (String args []) {
            int anonascimento, anoatual, idade, idade17;
            anonascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento: "));
            anoatual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
            idade = anoatual - anonascimento;
            idade17 = idade + 17;
            JOptionPane.showInputDialog(null, "A idade do usuário daqui a 17 anos será de: " + idade17);
        }
}
