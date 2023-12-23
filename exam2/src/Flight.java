public class Flight {
    private int number;
    private String destination;

    // Default constructor
    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    // Parameterized constructor
    public Flight(int number, String destination) {
        if (number > 0) {
            this.number = number;
            this.destination = destination;
        } else {
            // Assume a safe empty state
            this.number = 0;
            this.destination = "";
        }
    }

    // Getter for destination
    public String getDestination() {
        return destination;
    }

    // Getter for flight number
    public int getNumber() {
        return number;
    }

    // Display method
    public void display() {
        System.out.println(number + ", " + destination);
    }

    // Sample program to test Flight class
    public static void main(String[] args) {
        // Create an instance of the Flight class
        Flight flight = new Flight(857, "Toronto");

        // Display flight information
        flight.display();
    }
}
