package EventEase;

public class Organizer extends ParticipantInfo{
    private String participantId;
    private String name;
    private String email;
    private long phoneNumber;
    private int ticketsAvailable;
    public Organizer(String participantId, String name, String email, long phoneNumber, int ticketsAvailable){
        super(participantId,name,email,phoneNumber);
        this.ticketsAvailable=ticketsAvailable;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }
    public double calculateSellingRevenue(int ticketsToSell,double pricePerTicket){
        if(ticketsToSell>getTicketsAvailable()){
            return -1;
        }
        double revenue=ticketsToSell*pricePerTicket;
        return revenue;
    }
}
