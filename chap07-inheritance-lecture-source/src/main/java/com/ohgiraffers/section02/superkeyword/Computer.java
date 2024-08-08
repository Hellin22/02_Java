package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operatingSystem;

    public Computer() {
        super();
    }

    public Computer(String cpu, int hdd, int ram, String operatingSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public Computer(String code, String board, String name, int price, Date manufaturingDate, String cpu, int hdd, int ram, String operatingSystem) {
        super(code, board, manufaturingDate);
//        super.setCode(code);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
        public String toString() {
    //        return "Computer{" +
    //                "code=" + this.getCode() +
    //                ", brand=" + getBoard() +
    //                ", name=" + super.getName() +
    //                ", price=" + super.getPrice() +
    //                ", manufaturingDate=" + super.getManufaturingDate() +
    //                ", cpu='" + cpu + '\'' +
    //                ", hdd=" + hdd +
    //                ", ram=" + ram +
    //                ", operatingSystem='" + operatingSystem + '\'' +
    //                '}';
            return super.toString() +
                    "Computer{" +
                    "cpu='" + cpu + '\'' +
                    ", hdd=" + hdd +
                    ", ram=" + ram +
                    ", operatingSystem='" + operatingSystem + '\'' +
                    '}';
        }
    }
