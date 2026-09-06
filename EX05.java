import javax.swing.JOptionPane;

    public class EX05 {
        public static void main (String args[]) {
            int a, b, c, delta, raiz1, raiz2;
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente A: "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente B: "));
            c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente C: "));
            delta = (int) Math.pow(b,2) - 4*a*c;
            raiz1 = (-b + (int) Math.sqrt(delta))/(2*a); 
            raiz2 = (-b - (int) Math.sqrt(delta))/(2*a);
            System.out.println("As duas raizes reais sao: " + raiz1 + raiz2);
        }
}
