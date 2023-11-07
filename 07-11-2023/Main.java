//Crea un'interfaccia utente semplice in console per interagire con l'utente, permettendo loro di acquistare giocattoli e visualizzare le vendite. 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario(10);
        RegistroVendite registroVendite = new RegistroVenditeConcreto(10);

        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("Benvenuto nel sistema di vendita di giocattoli");
            System.out.println("1. Aggiungi giocattolo all'inventario");
            System.out.println("2. Visualizza inventario");
            System.out.println("3. Effettua una vendita");
            System.out.println("4. Visualizza vendite");
            System.out.println("5. Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci i dettagli del giocattolo:");
                    System.out.print("ID: ");
                    int giocattoloId = scanner.nextInt();
                    System.out.print("Nome: ");
                    String nomeGiocattolo = scanner.next();
                    System.out.print("Prezzo: ");
                    double prezzoGiocattolo = scanner.nextDouble();
                    System.out.print("Età consigliata: ");
                    int etaConsigliata = scanner.nextInt();

                    Giocattolo nuovoGiocattolo = new Giocattolo(giocattoloId, nomeGiocattolo, prezzoGiocattolo, etaConsigliata);
                    inventario.aggiungiGiocattolo(nuovoGiocattolo);
                    break;

                case 2:
                    System.out.println("Inventario dei giocattoli:");
                    System.out.println(inventario.toString());
                    break;

                case 3:
                    System.out.println("Effettua una vendita:");
                    System.out.print("ID del giocattolo: ");
                    int giocattoloVenditaId = scanner.nextInt();
                    System.out.print("ID del cliente: ");
                    int clienteId = scanner.nextInt();
                    System.out.print("Quantità: ");
                    int quantita = scanner.nextInt();
                    System.out.print("Prezzo unitario: ");
                    double prezzoUnitario = scanner.nextDouble();
                    System.out.print("Data acquisto: ");
                    String dataAcquisto = scanner.next();

                    Cliente cliente = new Cliente(clienteId, "NomeCliente", "cliente@email.com");
                    Giocattolo giocattoloVendita = null;
                    for (Giocattolo giocattolo : inventario.getGiocattoli()) {
                        if (giocattolo != null && giocattolo.getId() == giocattoloVenditaId) {
                            giocattoloVendita = giocattolo;
                            break;
                        }
                    }

                    if (giocattoloVendita != null) {
                        Vendita nuovaVendita = new Vendita(giocattoloVendita, cliente, quantita, prezzoUnitario, dataAcquisto);
                        registroVendite.aggiungiVendita(nuovaVendita);
                        System.out.println("Vendita registrata con successo.");
                    } else {
                        System.out.println("Giocattolo non trovato nell'inventario.");
                    }
                    break;

                case 4:
                    System.out.println("Registro delle vendite:");
                    System.out.println(registroVendite.toString());
                    break;

                case 5:
                    continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }
        scanner.close();
    }
}

class RegistroVenditeConcreto extends RegistroVendite {
    public RegistroVenditeConcreto(int numVendite) {
        super(numVendite);
    }
}
