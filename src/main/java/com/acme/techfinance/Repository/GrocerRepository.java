package com.acme.techfinance.Repository;

import com.acme.techfinance.Model.Grocer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrocerRepository  extends JpaRepository<Grocer, Long> {
}
