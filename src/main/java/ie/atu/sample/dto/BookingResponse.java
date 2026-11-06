package ie.atu.sample.dto;

import ie.atu.sample.model.BookingModel;

public record BookingResponse(String organiserName, int attendeeCount, Long id) {
    public static BookingResponse from(BookingRequest bookingRequest) {
        return new BookingResponse(bookingRequest.getOrganiserName(),  bookingRequest.getAttendeeCount(), bookingRequest.getId());
    }
}
