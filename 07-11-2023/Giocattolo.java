//Crea una classe Giocattolo con campi come id, nome, prezzo e età consigliata.

public class Giocattolo {
    private int id;
    private String nome;
    private double prezzo;
    private int eta;

    public Giocattolo(int id, String nome, double prezzo, int eta) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.eta = eta;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public String toString() {
        return "Giocattolo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", eta=" + eta +
                '}';
    }
}