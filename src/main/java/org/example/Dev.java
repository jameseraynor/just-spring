package org.example;

public class Dev {

    private Computer computer;

    public Dev() {
        System.out.println("Dev is created");
    }

    public Dev(Computer Computer) {
        System.out.println("Dev is created with Computer");
        this.computer = Computer;
    }

    public void working(){
        System.out.println("Dev is working");
        computer.compile();
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer Computer) {
        this.computer = Computer;
    }
}
