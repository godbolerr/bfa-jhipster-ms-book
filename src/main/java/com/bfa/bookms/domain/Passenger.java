package com.bfa.bookms.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Passenger.
 */
@Entity
@Table(name = "passenger")
public class Passenger implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    private BookingRecord bookingRecord;

    @ManyToOne
    private BookingRecord psrBook;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Passenger firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Passenger lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public Passenger gender(String gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BookingRecord getBookingRecord() {
        return bookingRecord;
    }

    public Passenger bookingRecord(BookingRecord bookingRecord) {
        this.bookingRecord = bookingRecord;
        return this;
    }

    public void setBookingRecord(BookingRecord bookingRecord) {
        this.bookingRecord = bookingRecord;
    }

    public BookingRecord getPsrBook() {
        return psrBook;
    }

    public Passenger psrBook(BookingRecord bookingRecord) {
        this.psrBook = bookingRecord;
        return this;
    }

    public void setPsrBook(BookingRecord bookingRecord) {
        this.psrBook = bookingRecord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Passenger passenger = (Passenger) o;
        if (passenger.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, passenger.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Passenger{" +
            "id=" + id +
            ", firstName='" + firstName + "'" +
            ", lastName='" + lastName + "'" +
            ", gender='" + gender + "'" +
            '}';
    }
}
