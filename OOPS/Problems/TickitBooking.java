public class TickitBooking {
    private String departureCity;
    private String arrivalCity;
    private String flightNumber;
    private String seatAssignment; 

    public TickitBooking(String departureCity, String arrivalCity, String flightNumber, String seatAssignment) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.flightNumber = flightNumber;
        this.seatAssignment = seatAssignment;
    }


    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSeatAssignment() {
        return seatAssignment;
    }


    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSeatAssignment(String seatAssignment) {
        this.seatAssignment = seatAssignment;
    }

    public static void main(String[] args) {
        
        TickitBooking ticket1 = new TickitBooking("New York", "Los Angeles", "UA123", "10B");


        TickitBooking ticket2 = new TickitBooking("London", "Paris", "AF456", "15F");

        // Example output
        System.out.println("Ticket 1:");
        System.out.println("Departure City: " + ticket1.getDepartureCity());
        System.out.println("Arrival City: " + ticket1.getArrivalCity());
        System.out.println("Flight Number: " + ticket1.getFlightNumber());
        System.out.println("Seat Assignment: " + ticket1.getSeatAssignment());
        System.out.println();

        System.out.println("Ticket 2:");
        System.out.println("Departure City: " + ticket2.getDepartureCity());
        System.out.println("Arrival City: " + ticket2.getArrivalCity());
        System.out.println("Flight Number: " + ticket2.getFlightNumber());
        System.out.println("Seat Assignment: " + ticket2.getSeatAssignment());
    }
}