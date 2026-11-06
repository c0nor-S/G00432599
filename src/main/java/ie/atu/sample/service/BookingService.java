package ie.atu.sample.service;

import ie.atu.sample.dto.BookingRequest;
import ie.atu.sample.dto.BookingResponse;
import ie.atu.sample.repository.BookingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookingService {

   private final BookingRepository bookings;
   public BookingService(BookingRepository bookings) {
      this.bookings = bookings;
   }
   public List<BookingResponse> findAllById(Long id) {
       return List.of();
   }

   public BookingResponse create(BookingRequest bookingRequest) {
      if(!bookings.countBookingModelByAttendeeCountGreaterThan(30)) {
         throw new ResponseStatusException(HttpStatus.CONTENT_TOO_LARGE, "Attendees Exceeded");
      }
       else {

      }
   }

   public


}
