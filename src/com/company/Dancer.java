package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer(String name, String designation) {
        super(name, designation);

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void doing(){
        System.out.println("dancing");
    }
    @Override
    public String toString() {
        return "Dancer " +super.getName()+" is "+super.getDesignation()+
                " groupName is " + groupName  +
                "";
    }
}
