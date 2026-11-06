package ie.atu.sample.repository;

import feign.Param;
import ie.atu.sample.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingModel, Long> {
    List<BookingModel> findById(long id);

    boolean countBookingModelByAttendeeCountGreaterThan(int attendeeCountIsGreaterThan);
}
