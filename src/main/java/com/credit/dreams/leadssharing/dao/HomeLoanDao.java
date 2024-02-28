package com.credit.dreams.leadssharing.dao;

import com.credit.dreams.leadssharing.model.LeadSharingHomeLoans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeLoanDao {

    @Autowired
    private HomeLoanRepository homeLoanRepository;


    public void saveHomeLoanLead(LeadSharingHomeLoans leadSharingHomeLoans) {
        homeLoanRepository.save(leadSharingHomeLoans);

    }
}
