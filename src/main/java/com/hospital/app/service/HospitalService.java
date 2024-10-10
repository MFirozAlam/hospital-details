package com.hospital.app.service;

import com.hospital.app.model.Hospital;
import com.hospital.app.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor  // Lombok annotation to generate constructor with required arguments (final fields)
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    public List<Hospital> getHospitalsByLocation(String location) {
        return hospitalRepository.findByLocation(location);
    }

    public Hospital addHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }
}
