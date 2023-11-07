//Implementa una classe Inventario che tiene traccia dei giocattoli disponibili e che possa essere aggiornata da un o specifico admin.

public class Inventario{

    private Giocattolo[] giocattoli;
    private int numGiocattoli;

    public Inventario(int numGiocattoli){
        this.numGiocattoli = numGiocattoli;
        giocattoli = new Giocattolo[numGiocattoli];
    }

    public void aggiungiGiocattolo(Giocattolo giocattolo){
        for(int i = 0; i < numGiocattoli; i++){
            if(giocattoli[i] == null){
                giocattoli[i] = giocattolo;
                break;
            }
        }
    }

    public void rimuoviGiocattolo(int id){
        for(int i = 0; i < numGiocattoli; i++){
            if(giocattoli[i] != null && giocattoli[i].getId() == id){
                giocattoli[i] = null;
                break;
            }
        }
    }

    public void aggiornaGiocattolo(Giocattolo giocattolo){
        for(int i = 0; i < numGiocattoli; i++){
            if(giocattoli[i] != null && giocattoli[i].getId() == giocattolo.getId()){
                giocattoli[i] = giocattolo;
                break;
            }
        }
    }

    public Giocattolo[] getGiocattoli(){
        return giocattoli;
    }

    public int getNumGiocattoli(){
        return numGiocattoli;
    }

    @Override
    public String toString(){
        String result = "";
        for(int i = 0; i < numGiocattoli; i++){
            if(giocattoli[i] != null){
                result += giocattoli[i].toString() + "\n";
            }
        }
        return result;
    }
}