class Events {
    private int eventID;
    private String eventName;
    private String eventDate;
    private String eventVenue;

    Events(int eventID, String eventName, String eventDate, String eventVenue) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventVenue = eventVenue;
    }

    public void displayEventDetails() {
        System.out.println("Event ID: " + eventID);
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Venue: " + eventVenue);
    }
}