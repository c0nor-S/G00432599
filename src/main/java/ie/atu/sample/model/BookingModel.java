package ie.atu.sample.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String organiserName;
    private int attendeeCount;
    private Long id;
    private boolean status;

}
