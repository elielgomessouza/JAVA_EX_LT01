import javax.swing.JOptionPane;

    public class EX21 {
        public static void main (String args[]) {
            float nota1, nota2, nota3, nota4, media;
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do 1º bimestre: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do 2º bimestre: "));
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do 3º bimestre: "));
            nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do 4º bimestre: "));
            media = (nota1 + nota2 + nota3 + nota4)/4;
            if (media>=6.0)
                JOptionPane.showMessageDialog(null, "Aluno aprovado!");
            else if (media>3.0 && media<6.0)
                JOptionPane.showMessageDialog(null, "Aluno deverá realizar um exame de recuperação!");
            else
                JOptionPane.showMessageDialog(null, "Aluno retido!");
        }
}