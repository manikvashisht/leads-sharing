package com.credit.dreams.leadssharing.service;

import com.credit.dreams.leadssharing.dao.HomeLoanDao;
import com.credit.dreams.leadssharing.dao.HomeLoanRepository;
import com.credit.dreams.leadssharing.model.LeadSharingHomeLoans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadSharingHomeLoanServiceImpl {

    private HomeLoanDao homeLoanDao;

    public LeadSharingHomeLoanServiceImpl(@Autowired HomeLoanDao homeLoanDao) {
        this.homeLoanDao=homeLoanDao;
    }

    public LeadSharingHomeLoans saveLeadToDatabase(LeadSharingHomeLoans leadSharingHomeLoans) {
        //Validate the request

        //Save to Database
        homeLoanDao.saveHomeLoanLead(leadSharingHomeLoans);

        return leadSharingHomeLoans;

    }
}
