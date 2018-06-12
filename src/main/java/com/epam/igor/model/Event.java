package com.epam.igor.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "EVENTS")
public class Event extends BaseEntity {

    @Column(name = "NAME")
    private String        name;
    @Column(name = "RATE")
    @Convert(converter = RateConverter.class)
    private Rate          rate;
    @Column(name = "PRICE")
    private double        basePrice;
    @Column(name = "TIME")
    @Convert(converter = DateTimeConverter.class)
    private LocalDateTime dateTime;
    @ManyToOne
    @JoinColumn(name = "AUDITORIUM_ID", insertable = false, updatable = false, nullable = false)
    private Auditorium    auditorium;

    @Column(name = "AUDITORIUM_ID")
    private long          auditoriumId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public long getAuditoriumId() {
        return auditoriumId;
    }

    public void setAuditoriumId(long auditoriumId) {
        this.auditoriumId = auditoriumId;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Event))
            return false;

        Event event = (Event) o;

        if (Double.compare(event.basePrice, basePrice) != 0)
            return false;
        if (name != null ? !name.equals(event.name) : event.name != null)
            return false;
        if (rate != event.rate)
            return false;
        if (dateTime != null ? !dateTime.equals(event.dateTime) : event.dateTime != null)
            return false;
        return auditorium != null ? auditorium.equals(event.auditorium) : event.auditorium == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (getId() ^ (getId() >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        temp = Double.doubleToLongBits(basePrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        result = 31 * result + (auditorium != null ? auditorium.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Event{" +
               "id=" + getId() +
               ", name='" + name + '\'' +
               ", rate=" + rate +
               ", basePrice=" + basePrice +
               ", dateTime=" + dateTime +
               ", auditorium=" + auditorium +
               '}';
    }
}
