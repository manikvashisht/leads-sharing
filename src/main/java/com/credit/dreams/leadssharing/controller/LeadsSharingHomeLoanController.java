package com.credit.dreams.leadssharing.controller;

import com.credit.dreams.leadssharing.model.LeadSharingHomeLoans;
import com.credit.dreams.leadssharing.service.LeadSharingHomeLoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeadsSharingHomeLoanController {

    private LeadSharingHomeLoanServiceImpl leadSharingHomeLoanService;

    public LeadsSharingHomeLoanController(@Autowired LeadSharingHomeLoanServiceImpl leadSharingHomeLoanService) {
        this.leadSharingHomeLoanService=leadSharingHomeLoanService;
    }

    @PostMapping("/send-leads-sharing-data")
    public ResponseEntity<LeadSharingHomeLoans> sendLeadsSharingData(@RequestBody LeadSharingHomeLoans leadSharingHomeLoans) {
       return new ResponseEntity<>(leadSharingHomeLoanService.saveLeadToDatabase(leadSharingHomeLoans), HttpStatus.OK);

    }
}
