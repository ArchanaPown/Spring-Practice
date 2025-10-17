package EventEase;

public class Attendee extends ParticipantInfo{
    private String participantId;
    private String name;
    private String email;
    private long phoneNumber;
    private double walletBalance;


    public Attendee(String participantId, String name, String email, long phoneNumber, double walletBalance) {
        super( participantId,name,email,phoneNumber);
        this.walletBalance = walletBalance;
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

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }public double calculateBuyingCost(int ticketsToBuy,double pricePerTicket){
        double cost=ticketsToBuy*pricePerTicket;
        if(cost>getWalletBalance()){
            return -1;
        }return cost;
    }
}
