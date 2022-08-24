package by.tc.task01.entity;

//Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Speakers extends Appliance {

    private int powerConsumption;

    private int numberOfSpeakers;

    private int frequencyRange;

    private int cordLength;

    public Speakers(int price, int powerConsumption, int numberOfSpeakers, int frequencyRange, int cordLength) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(int frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption && numberOfSpeakers == speakers.numberOfSpeakers && frequencyRange == speakers.frequencyRange && cordLength == speakers.cordLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers {" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength +
                ", " + super.toString();
    }
}
