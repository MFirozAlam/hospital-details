package com.hospital.app.controller;

import com.hospital.app.model.Hospital;
import com.hospital.app.service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/hospitals")
@RequiredArgsConstructor  // Lombok annotation to generate constructor for final fields
public class HospitalController {

    private final HospitalService hospitalService;

    @GetMapping("/{location}")
    public List<Hospital> getHospitalsByLocation(@PathVariable String location) {
        return hospitalService.getHospitalsByLocation(location);
    }

    @PostMapping
    public Hospital addHospital(@RequestBody Hospital hospital) {
        return hospitalService.addHospital(hospital);
    }
}
