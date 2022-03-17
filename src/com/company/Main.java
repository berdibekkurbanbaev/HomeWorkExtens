package com.company;

public class Main {

    public static void main(String[] args) {
	Person person = new Person();
    Programmer programmer = new Programmer("Kein","programmer","Peaksoft");
        System.out.println(programmer);
        programmer.doing();
        Singer  singer = new Singer("Kail","soloist","Rocky");
        System.out.println(singer);
        singer.doing();
        Dancer dancer = new Dancer("Jo","break dancer","freestyler");
        System.out.println(dancer);
        dancer.doing();
    }
}
