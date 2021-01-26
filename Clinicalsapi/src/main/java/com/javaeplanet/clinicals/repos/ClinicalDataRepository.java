package com.javaeplanet.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaeplanet.clinicals.model.ClinicalData;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {

}
