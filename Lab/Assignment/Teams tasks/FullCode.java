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

interface Registrable {
    public void registerParticipant(String name);
    public void showParticipants();
}

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
        System.out.println("Maximum Participants: "+maxParticipants);
        System.out.println("Event Duration: "+EventDuration);
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

class RoboticsEvent extends Events implements Registrable{
    private  int maxParticipants;
    private float EventDuration;
    private String EventTheme;
    private String participantName[];
    private int countparticipants=0;
    public RoboticsEvent(int eventID,String eventName,String eventDate,String eventVenue, int maxParticipants, float EventDuration, String EventTheme) 
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
        System.out.println("Event Duration: "+EventDuration);
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

class HackathonEvent extends Events implements Registrable{
    private  int maxParticipants;
    private float EventDuration;
    private String EventTheme;
    private String participantName[];
    private int countparticipants=0;
    public HackathonEvent(int eventID,String eventName,String eventDate,String eventVenue, int maxParticipants, float EventDuration, String EventTheme) 
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
        System.out.println("Maximum Participants: "+maxParticipants);
        System.out.println("Event Duration: "+EventDuration);
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

public class FullCode {
    public static void main(String args[]) {
        Events e1 = new CodingEvent(001,"Code fest","11/10/2025","CSPIT",30,2.5f,"Code Rush");
        Events e2 = new RoboticsEvent(002,"Robo fest","12/10/2025","DEPSTAR",2,3.0f,"Robo Contest");
        Events e3 = new HackathonEvent(003,"WIT Hackathon","13/10/2025","CMPICA",50,6.5f,"HackersMeet");

       
        Registrable r1 = (Registrable) e1;
        Registrable r2 = (Registrable) e2;
        Registrable r3 = (Registrable) e3;
      
        e1.displayEventDetails();
        e2.displayEventDetails();
        e3.displayEventDetails();

        r1.registerParticipant("Aryan Parikh");
        r1.registerParticipant("Kalp Patel");
        r1.registerParticipant("Heet Metha");

        r2.registerParticipant("Akshar Patel");
        r2.registerParticipant("Om Mistry");
        r2.registerParticipant("Vedant Bhatt");

        r3.registerParticipant("Soham Solanki");
        r3.registerParticipant("Arth Jain");
        r3.registerParticipant("Krish Patel");

        r1.showParticipants();
        r2.showParticipants();
        r3.showParticipants();
                  
    }
}