package com.hospital.app.repository;

import com.hospital.app.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    List<Hospital> findByLocation(String location);
}
