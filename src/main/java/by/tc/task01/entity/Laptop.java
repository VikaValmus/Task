package by.tc.task01.entity;

import java.util.Objects;

//Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHES=18
public class Laptop extends Appliance {
    private int batteryCapacity;

    private int os;

    private int memoryRom;

    private int systemMemory;

    private double cpu;

    private double displayInches;

    public Laptop(int price, int batteryCapacity, int os, int memoryRom, int systemMemory, double cpu, double displayInches) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getOs() {
        return os;
    }

    public void setOs(int os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryCapacity == laptop.batteryCapacity && os == laptop.os && memoryRom == laptop.memoryRom && systemMemory == laptop.systemMemory && Double.compare(laptop.cpu, cpu) == 0 && Double.compare(laptop.displayInches, displayInches) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "batteryCapacity=" + batteryCapacity +
                ", os=" + os +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                ", " + super.toString();
    }
}