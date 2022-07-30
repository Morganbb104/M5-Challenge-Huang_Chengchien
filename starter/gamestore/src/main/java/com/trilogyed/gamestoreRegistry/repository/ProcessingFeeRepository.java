package com.trilogyed.gamestoreRegistry.repository;

import com.trilogyed.gamestoreRegistry.model.ProcessingFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessingFeeRepository extends JpaRepository<ProcessingFee, String> {
}
