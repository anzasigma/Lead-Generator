package com.example;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, Long> {
// @Query("SELECT s FROM SALESPERSONS s WHERE s.company = :company")
 List<SalesPerson> findByCompany( String company);
//	Collection<SalesPerson> findCustomersWithCompanyName();
	    List<SalesPerson> findAll();
}