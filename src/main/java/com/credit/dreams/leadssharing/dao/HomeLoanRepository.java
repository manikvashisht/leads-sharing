package com.credit.dreams.leadssharing.dao;

import com.credit.dreams.leadssharing.model.LeadSharingHomeLoans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeLoanRepository extends JpaRepository<LeadSharingHomeLoans, Long> {
}

