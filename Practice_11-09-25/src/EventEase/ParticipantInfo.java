package EventEase;

public class ParticipantInfo {
    protected String participantId;
    protected String name;
    protected String email;
    protected long phoneNumber;

    public ParticipantInfo(String participantId, String name, String email, long phoneNumber) {
        this.participantId = participantId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
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
}
