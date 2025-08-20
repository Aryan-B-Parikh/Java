class CodingEvent extends Events implements Registrable
{
    private  int maxParticipants;
    private float EventDuration;
    private String EventTheme;
    private String participantName[];
    private int countparticipants=0;
    public CodingEvent(int eventID,String eventName,String eventDate,String eventVenue, int maxParticipants, float EventDuration, String EventTheme) 
    {
        super(eventID,eventName,eventDate,eventVenue);
        this.maxParticipants=maxParticipants;
        this.EventDuration=EventDuration;
        this.EventTheme=EventTheme;
        this.participantName =new String[maxParticipants];
    }
    @Override
    public void displayEventDetails()
    {
        super.displayEventDetails();
        System.out.println("Maximium Participants: "+maxParticipants);
        System.out.println("Event Duration: "+EventDuration+" hours");
        System.out.println("Event Theme: "+EventTheme);
    }
    @Override
    public void registerParticipant(String name)
    {
        if(countparticipants<maxParticipants)
        {
            participantName[countparticipants]=name;
            System.out.println("Registration Successful!");
            countparticipants++;
        }
        else
        {
            System.out.println("Maximum Participants Reached!");
        }
    }
    @Override
    public void showParticipants()
    {
        System.out.println("Registered Participants are :");
        for (int i = 0; i < countparticipants; i++) 
        {
            System.out.println(participantName[i]);
        }
    }
}