public class Esercizio3 {
    public static void main(String[] args) {

        int ticket_available = 400;
        int ticket_sold;
        int ticket_cost = 12;

        System.out.println("Calcolo il numero di biglietti disponibili e l'incasso totale dei biglietti venduti...");

        ticket_sold = 231;
        int ticket_gain = ticket_sold * ticket_cost;
        int ticket_remain = ticket_available - ticket_sold;

        System.out.println("Il numero di biglietti disponibili è: " + ticket_remain);
        System.out.println("L'incasso totale dei biglietti venduti è: " + ticket_gain + "$");

    }
}
