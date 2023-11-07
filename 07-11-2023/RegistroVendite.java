//Implementa una classe  ASTRATTA RegistroVendite che gestisce le vendite dei giocattoli ai clienti e che deve contenere SOLO metodi.

public abstract class RegistroVendite{
    private Vendita[] vendite;
    private int numVendite;

    public RegistroVendite(int numVendite){
        this.numVendite = numVendite;
        vendite = new Vendita[numVendite];
    }

    public void aggiungiVendita(Vendita vendita){
        for(int i = 0; i < numVendite; i++){
            if(vendite[i] == null){
                vendite[i] = vendita;
                break;
            }
        }
    }

    public void rimuoviVendita(int id){
        for(int i = 0; i < numVendite; i++){
            if(vendite[i] != null && vendite[i].getGiocattolo().getId() == id){
                vendite[i] = null;
                break;
            }
        }
    }

    public void aggiornaVendita(Vendita vendita){
        for(int i = 0; i < numVendite; i++){
            if(vendite[i] != null && vendite[i].getGiocattolo().getId() == vendita.getGiocattolo().getId()){
                vendite[i] = vendita;
            }
        }
    }

    public Vendita[] getVendite(){
        return vendite;
    }

    public int getNumVendite(){
        return numVendite;
    }

    @Override
    public String toString(){
        String result = "";
        for(int i = 0; i < numVendite; i++){
            if(vendite[i] != null){
                result += vendite[i].toString() + "\n";
            }
        }
        return result;
    }
}