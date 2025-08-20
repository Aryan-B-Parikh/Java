class EventHandeling {
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

        System.out.println("For Code Fest");
        r1.registerParticipant("Aryan Parikh");
        r1.registerParticipant("Kalp Patel");
        r1.registerParticipant("Heet Metha");

        System.out.println("For Robo Fest");
        r2.registerParticipant("Akshar Patel");
        r2.registerParticipant("Om Mistry");
        r2.registerParticipant("Vedant Bhatt");

        System.out.println("For  WIT Hackathon");
        r3.registerParticipant("Soham Solanki");
        r3.registerParticipant("Arth Jain");
        r3.registerParticipant("Krish Patel");


        System.out.println("For Code Fest");
        r1.showParticipants();

        System.out.println("For Robo Fest");
        r2.showParticipants();

        System.out.println("For  WIT Hackathon");
        r3.showParticipants();
                  
    }
}