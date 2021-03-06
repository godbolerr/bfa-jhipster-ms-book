package com.bfa.bookms.service.impl;

import com.bfa.bookms.service.BookingRecordService;
import com.bfa.bookms.domain.BookingRecord;
import com.bfa.bookms.repository.BookingRecordRepository;
import com.bfa.bookms.service.dto.BookingRecordDTO;
import com.bfa.bookms.service.mapper.BookingRecordMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing BookingRecord.
 */
@Service
@Transactional
public class BookingRecordServiceImpl implements BookingRecordService{

    private final Logger log = LoggerFactory.getLogger(BookingRecordServiceImpl.class);
    
    @Inject
    private BookingRecordRepository bookingRecordRepository;

    @Inject
    private BookingRecordMapper bookingRecordMapper;

    /**
     * Save a bookingRecord.
     *
     * @param bookingRecordDTO the entity to save
     * @return the persisted entity
     */
    public BookingRecordDTO save(BookingRecordDTO bookingRecordDTO) {
        log.debug("Request to save BookingRecord : {}", bookingRecordDTO);
        BookingRecord bookingRecord = bookingRecordMapper.bookingRecordDTOToBookingRecord(bookingRecordDTO);
        bookingRecord = bookingRecordRepository.save(bookingRecord);
        BookingRecordDTO result = bookingRecordMapper.bookingRecordToBookingRecordDTO(bookingRecord);
        return result;
    }

    /**
     *  Get all the bookingRecords.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    @Transactional(readOnly = true) 
    public Page<BookingRecordDTO> findAll(Pageable pageable) {
        log.debug("Request to get all BookingRecords");
        Page<BookingRecord> result = bookingRecordRepository.findAll(pageable);
        return result.map(bookingRecord -> bookingRecordMapper.bookingRecordToBookingRecordDTO(bookingRecord));
    }

    /**
     *  Get one bookingRecord by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Transactional(readOnly = true) 
    public BookingRecordDTO findOne(Long id) {
        log.debug("Request to get BookingRecord : {}", id);
        BookingRecord bookingRecord = bookingRecordRepository.findOne(id);
        BookingRecordDTO bookingRecordDTO = bookingRecordMapper.bookingRecordToBookingRecordDTO(bookingRecord);
        return bookingRecordDTO;
    }

    /**
     *  Delete the  bookingRecord by id.
     *
     *  @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete BookingRecord : {}", id);
        bookingRecordRepository.delete(id);
    }
}
