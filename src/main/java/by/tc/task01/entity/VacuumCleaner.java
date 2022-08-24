package by.tc.task01.entity;

//VacuumCleaner : POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VacuumCleaner extends Appliance {

    private int powerConsumption;

    private int filterType;

    private int bagType;

    private int wandType;

    private double motorSpeedRegulation;

    private double cleaningWidth;

    public VacuumCleaner(int price, int powerConsumption, int filterType, int bagType, int wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getFilterType() {
        return filterType;
    }

    public void setFilterType(int filterType) {
        this.filterType = filterType;
    }

    public int getBagType() {
        return bagType;
    }

    public void setBagType(int bagType) {
        this.bagType = bagType;
    }

    public int getWandType() {
        return wandType;
    }

    public void setWandType(int wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption && filterType == that.filterType && bagType == that.bagType && wandType == that.wandType && Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0 && Double.compare(that.cleaningWidth, cleaningWidth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner {" +
                "powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType=" + bagType +
                ", wandType=" + wandType +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                ", " + super.toString();
    }
}
