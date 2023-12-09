package edu.neu.mgen.bloodpressuremonitor.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "blood_pressure")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class BloodPressure {

    @Id
    private int id;


    private LocalDate date;
    private LocalTime time;
    private int systolic_pressure;
    private int diastolic_pressure;
    private int heart_beats;
    private double avg_SP;
    private double  avg_DP;
    private double avg_HB;
    public BloodPressure() {
    }


    public BloodPressure(LocalDate date, LocalTime time, int systolicPressure, int diastolicPressure, int heartBeats, double avgSP, double avgDP, double avgHB) {
        this.date = date;
        this.time = time;
        this.systolic_pressure = systolicPressure;
        this.diastolic_pressure = diastolicPressure;
        this.heart_beats = heartBeats;
        this.avg_SP = avgSP;
        this.avg_DP = avgDP;
        this.avg_HB = avgHB;
    }
}
