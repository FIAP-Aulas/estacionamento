import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    static final long TARIFA_HORA = 10;

    public boolean adicionarVeiculo(Veiculo v) {
        veiculos.add(v);
        return true;
    }

    public boolean removerCarro(String placa, int horaEntrada, int horaSaida) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                double horas = Math.max(horaSaida - horaEntrada, 1);
                double valorTotal = horas * TARIFA_HORA;
                veiculos.remove(v);
                System.out.println("🚗 Carro removido! Valor a pagar: R$" + valorTotal);
                return true;
            }
        }
        System.out.println("❌ Veículo não encontrado!");
        return false;
    }
}