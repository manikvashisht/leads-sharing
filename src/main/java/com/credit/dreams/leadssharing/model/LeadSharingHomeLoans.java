package com.credit.dreams.leadssharing.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class LeadSharingHomeLoans {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String occupation;
    private String loanPurpose;
    private BigDecimal loanAmountRequired;
    private BigDecimal monthlyIncome;
    private BigDecimal totalRunningMonthlyEMI;
    private String city;
    private boolean propertyIdentified;
    private boolean isGramPanchayat;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public BigDecimal getLoanAmountRequired() {
        return loanAmountRequired;
    }

    public void setLoanAmountRequired(BigDecimal loanAmountRequired) {
        this.loanAmountRequired = loanAmountRequired;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public BigDecimal getTotalRunningMonthlyEMI() {
        return totalRunningMonthlyEMI;
    }

    public void setTotalRunningMonthlyEMI(BigDecimal totalRunningMonthlyEMI) {
        this.totalRunningMonthlyEMI = totalRunningMonthlyEMI;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPropertyIdentified() {
        return propertyIdentified;
    }

    public void setPropertyIdentified(boolean propertyIdentified) {
        this.propertyIdentified = propertyIdentified;
    }

    public boolean isGramPanchayat() {
        return isGramPanchayat;
    }

    public void setGramPanchayat(boolean gramPanchayat) {
        isGramPanchayat = gramPanchayat;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LeadSharingHomeLoans that)) return false;
        return isPropertyIdentified() == that.isPropertyIdentified() && isGramPanchayat() == that.isGramPanchayat() && Objects.equals(getOccupation(), that.getOccupation()) && Objects.equals(getLoanPurpose(), that.getLoanPurpose()) && Objects.equals(getLoanAmountRequired(), that.getLoanAmountRequired()) && Objects.equals(getMonthlyIncome(), that.getMonthlyIncome()) && Objects.equals(getTotalRunningMonthlyEMI(), that.getTotalRunningMonthlyEMI()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getMobileNumber(), that.getMobileNumber()) && Objects.equals(getEmailId(), that.getEmailId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOccupation(), getLoanPurpose(), getLoanAmountRequired(), getMonthlyIncome(), getTotalRunningMonthlyEMI(), getCity(), isPropertyIdentified(), isGramPanchayat(), getFirstName(), getLastName(), getMobileNumber(), getEmailId());
    }
}
