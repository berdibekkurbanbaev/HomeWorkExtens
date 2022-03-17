package com.company;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;

    }

    public Programmer(String name, String designation) {
        super(name, designation);

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void doing(){
        System.out.println("He is coding");
    }

    @Override
    public String toString() {
        return " " +super.getName()+" is "+super.getDesignation()+" He work in "+
                " " + companyName +
                " ";
    }
}
