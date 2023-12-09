package edu.neu.mgen.bloodpressuremonitor.DAO;

import edu.neu.mgen.bloodpressuremonitor.Entity.BloodPressure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BloodPressureDAO extends JpaRepository<BloodPressure,Integer> {

    @Query("SELECT new BloodPressure(b.date, b.time, b.systolic_pressure, b.diastolic_pressure, b.heart_beats, b.avg_SP, b.avg_DP, b.avg_HB) FROM BloodPressure b WHERE b.date BETWEEN :startTime AND :endTime")
    List<BloodPressure> findByDateBetween(@Param("startTime")LocalDate startTime,@Param("endTime") LocalDate endTime);
    @Query("SELECT new  BloodPressure(b.date, b.time, b.systolic_pressure, b.diastolic_pressure, b.heart_beats, b.avg_SP, b.avg_DP, b.avg_HB) FROM BloodPressure b")
    List<BloodPressure> findAll();
}
