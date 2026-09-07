import javax.swing.JOptionPane;

    public class EX17 {
        public static void main (String args[]) {
            int TP, VM, KML, LG, distancia;
            TP = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de percurso: ")); //Tempo de percurso em horas
            VM = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média do automóvel: ")); //Velocidade média em KM/h
            KML = 12; //Quilômetros por litro
            distancia = TP*VM;
            LG = distancia/KML;
            JOptionPane.showMessageDialog(null, "O carro gastou um total de " + LG + " litros ao decorrer da viagem");
    }
}