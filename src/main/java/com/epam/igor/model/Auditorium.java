package com.epam.igor.model;

import com.epam.igor.util.CsvUtil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "AUDITORIUMS")
public class Auditorium extends BaseEntity {

    @Column(name = "NAME")
    private String name;
    @Column(name = "SEATS")
    private int    seatsNumber;
    @Column(name = "VIP")
    private String vipSeats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getVipSeats() {
        return vipSeats;
    }

    public List<Integer> getVipSeatsList() {
        return CsvUtil.fromCsvToList(vipSeats, Integer:: valueOf);
    }

    public void setVipSeatsList(List<Integer> vipSeats) {
        this.vipSeats = CsvUtil.fromListToCsv(vipSeats);
    }

    public void setVipSeats(String vipSeats) {
        this.vipSeats = vipSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Auditorium))
            return false;

        Auditorium that = (Auditorium) o;

        if (getId() != that.getId())
            return false;
        if (seatsNumber != that.seatsNumber)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        return vipSeats != null ? vipSeats.equals(that.vipSeats) : that.vipSeats == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + seatsNumber;
        result = 31 * result + (vipSeats != null ? vipSeats.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Auditorium{" +
               "id=" + getId() +
               ", name='" + name + '\'' +
               ", seatsNumber=" + seatsNumber +
               ", vipSeats=" + vipSeats +
               '}';
    }
}
