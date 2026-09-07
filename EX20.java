import javax.swing.JOptionPane;

    public class EX20 {
        public static void main (String args[]) {
            double a, b, c, delta, raiz1, raiz2;
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente A: "));
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente B: "));
            c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente C: "));          
            delta = (double) Math.pow(b, 2) - 4*a*c;
            if (delta>0) {
                raiz1 = (-b - (double) Math.sqrt(delta))/(2*a);
                raiz2 = (-b + (double) Math.sqrt(delta))/(2*a);
                JOptionPane.showMessageDialog(null, "Primeira raíz real: " + raiz1 + " Segunda raíz real: " + raiz2 );
            } else if (delta==0) {
                raiz1 = -b /(2*a);
                JOptionPane.showMessageDialog(null, "A equação possui apenas uma raíz real: " + raiz1);
            } else {
                JOptionPane.showMessageDialog(null, "A equação não possui nenhuma raíz real");
            }
        }
    }