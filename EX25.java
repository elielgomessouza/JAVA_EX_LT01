import javax.swing.JOptionPane;

    public class EX25 {
        public static void main (String args[]) {
            int horainicial, minutoinicial, horafinal, minutofinal, tempojogo, tempohoras, tempominutos;
            horainicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo: "));
            minutoinicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do jogo: "));
            horafinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo: "));
            minutofinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do jogo: "));
            horainicial = (horainicial*60) + minutoinicial;
            horafinal = (horafinal*60) + minutofinal;
            if (horafinal<horainicial)
                horafinal = horafinal + (24*60);
            tempojogo = horafinal - horainicial;
            tempohoras = tempojogo/60;
            tempominutos = tempojogo%60;
            JOptionPane.showMessageDialog(null, "O tempo total do jogo foi de: " + tempohoras + " horas e " + tempominutos + " minutos");
        }
}