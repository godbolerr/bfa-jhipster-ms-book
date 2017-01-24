package com.bfa.bookms.repository;

import com.bfa.bookms.domain.BookingRecord;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the BookingRecord entity.
 */
@SuppressWarnings("unused")
public interface BookingRecordRepository extends JpaRepository<BookingRecord,Long> {

}
