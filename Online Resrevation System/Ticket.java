public class Ticket {
    String pnr;
    String trainNumber;
    String trainName;
    String from;
    String to;

    public Ticket(String pnr, String trainNumber, String trainName, String from, String to) {
        this.pnr = pnr;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "PNR: " + pnr + ", Train: " + trainNumber + " - " + trainName + ", From: " + from + ", To: " + to;
    }

    // Main method for testing the Ticket class
    public static void main(String[] args) {
        // Create a sample ticket and print its details
        Ticket ticket = new Ticket("1234567890", "12345", "Express Train", "Mumbai", "Delhi");
        System.out.println(ticket);
    }
}
