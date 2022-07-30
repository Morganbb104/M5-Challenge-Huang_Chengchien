package com.trilogyed.gamestoreRegistry.repository;

import com.trilogyed.gamestoreRegistry.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<Tax, String> {
}
