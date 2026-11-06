package ie.atu.sample.model;


import jakarta.persistence.*;
@Entity

public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String organiserName;
    private int attendeeCount;
    private Long id;

    public String getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }

    public int getAttendeeCount() {
        return attendeeCount;
    }

    public void setAttendeeCount(int attendeeCount) {
        this.attendeeCount = attendeeCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
