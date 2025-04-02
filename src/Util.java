// Classe Util
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Util {
    private Estacionamento estacionamento = new Estacionamento();
    public void menu() {
        String aux = "Escolha uma opção\n";
        aux += "1. Entrada de veículo\n";
        aux += "2. Saída de veículo\n";
        aux += "3. Finalizar\n";
        int opcao;

        while (true) {
            opcao = parseInt(showInputDialog(aux));
            if (opcao == 3) {
                break;
            }
            if (opcao < 1 || opcao > 3) {
                showMessageDialog(null, "Opção inválida!");
            } else {
                switch (opcao) {
                    case 1:
                        adicionarVeiculo();
                        break;
                    case 2:
                        removerVeiculo();
                        break;
                }
            }
        }
    }

    private void adicionarVeiculo() {
        String placa = showInputDialog("Digite a placa do veículo:");
        String modelo = showInputDialog("Digite o modelo do veículo:");
        int horaEntrada = parseInt(showInputDialog("Digite a hora de entrada:"));

        Veiculo v = new Veiculo(placa, modelo, horaEntrada);
        estacionamento.adicionarVeiculo(v);
        showMessageDialog(null, "🚗 Veículo adicionado com sucesso!");
    }

    private void removerVeiculo() {
        String placa = showInputDialog("Digite a placa do veículo para saída:");
        int horaEntrada = parseInt(showInputDialog("Digite a hora de entrada:"));
        int horaSaida = parseInt(showInputDialog("Digite a hora de saída:"));

        boolean removido = estacionamento.removerCarro(placa, horaEntrada, horaSaida);
        if (!removido) {
            showMessageDialog(null, "❌ Veículo não encontrado!");
        }
    }
}