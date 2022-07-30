package com.trilogyed.gamestoreInvoicing.repository;

import com.trilogyed.gamestoreInvoicing.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<Tax, String> {
}
