import javax.swing.JOptionPane;

    public class EX14 {
        public static void main (String args[]) {
            int angulo1, angulo2, angulo3;
            angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º ângulo do triângulo: "));
            angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º ângulo do triângulo: "));
            angulo3 = 180 - (angulo1 + angulo2);
            System.out.println("O valor do 3 angulo do triangulo e: " + angulo3);
        }
}
