package com.siit.oraseanu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person {
    private String name;
    private String surName;
    private String cnp;

    private boolean insured = false;
    private Date insuranceDate = null;
    private Integer cid = 0;

    public Person(String name, String surName, String cnp) {
        this.name = name;
        this.surName = surName;
        this.cnp = cnp;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getCnp() {
        return cnp;
    }
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    public boolean isInsured() {
        return insured;
    }
    protected void setInsured(boolean insured) {
        this.insured = insured;
    }
    public Date getInsuranceDate() {
        return insuranceDate;
    }
    protected void setInsuranceDate(Date insuranceDate) {
        this.insuranceDate = insuranceDate;
    }
    public Integer getCid() {return cid;}
    protected void setCid(Integer cid) {this.cid = cid;}



    private String getCidAsString(Integer cid){
        if (cid == 0){
            return "CID Inexistent";
        } else {
            return cid.toString();
        }
    }

    private String getInsuranceDateAsString(Person person){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        if (insuranceDate == null){
            return "Data Inexistenta";
        } else {
            return formatter.format(person.getInsuranceDate());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return insured == person.insured &&
                Objects.equals(name, person.name) &&
                Objects.equals(surName, person.surName) &&
                Objects.equals(cnp, person.cnp) &&
                Objects.equals(insuranceDate, person.insuranceDate) &&
                Objects.equals(cid, person.cid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surName, cnp, insured, insuranceDate, cid);
    }

    @Override
    public String toString(){
        return  "\n>Person" +
                "\n Name: " + this.getName() +
                ".\n Surname: " + this.getSurName() +
                ".\n CNP: " + this.getCnp() +
                ".\n CID: " + this.getCidAsString(this.cid) +
                ".\n Asigurat: " + (isInsured() ? "Da.": "Nu.") +
                "\n Data: " + getInsuranceDateAsString(this) + ".";
    }
}
