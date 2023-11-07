//Crea una classe Vendita che registra gli acquisti dei clienti.

public class Vendita{
    private Giocattolo giocattolo;
    private Cliente cliente;
    private int quantita;
    private double prezzoUnitario;
    private String dataAcquisto;

    public Vendita(Giocattolo giocattolo, Cliente cliente, int quantita, double prezzoUnitario, String dataAcquisto){
            this.giocattolo = giocattolo;
            this.cliente = cliente;
            this.quantita = quantita;
            this.prezzoUnitario = prezzoUnitario;
            this.dataAcquisto = dataAcquisto;
    }

    public Giocattolo getGiocattolo(){
        return giocattolo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public int getQuantita(){
        return quantita;
    }

    public double getPrezzoUnitario(){
        return prezzoUnitario;
    }

    public String getDataAcquisto(){
        return dataAcquisto;
    }

    @Override
    public String toString(){
        return "Vendita{" +
                "giocattolo=" + giocattolo +
                ", cliente=" + cliente +
                ", quantita=" + quantita +
                ", prezzoUnitario=" + prezzoUnitario +
                ", dataAcquisto='" + dataAcquisto + '\'' +
                '}';
    }
}