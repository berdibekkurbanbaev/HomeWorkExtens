package com.company;

public class Singer extends  Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String name, String designation) {
        super(name, designation);

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    @Override
    public void doing(){
        System.out.println("singing,play gitar");
    }

    @Override
    public String toString() {
        return "Singer " +super.getName()+" is  "+super.getDesignation()+
                " band Name is " + bandName  +
                "";
    }
}
