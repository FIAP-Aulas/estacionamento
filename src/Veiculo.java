public class Veiculo {

    private String placa;
    private String modelo;
    private int horaEntrada;
    private int horaSaida;

    public Veiculo (String placa, String modelo, int horaEntrada){
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return this.placa;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }
}
