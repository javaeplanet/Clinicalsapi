package com.javaeplanet.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaeplanet.clinicals.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
