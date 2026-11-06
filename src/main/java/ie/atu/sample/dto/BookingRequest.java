package ie.atu.sample.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record BookingRequest(@NotBlank(message="Organiser Name Is required") String organiserName, @NotNull@Positive(message="Attendee Count Must Be Positive")int attendeeCount, @NotNull(message="Booking ID Is required")Long id) {

}
