import javax.swing.JOptionPane;

    public class _013 {
        public static void main (String args []) {
            int alimentokg, dias;
            alimentokg = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de alimento em quilos: "));
            alimentokg = alimentokg*1000;
            dias = alimentokg/50;
            JOptionPane.showInputDialog(null, "Esse alimento durará" + dias + "dias");
        }
}
