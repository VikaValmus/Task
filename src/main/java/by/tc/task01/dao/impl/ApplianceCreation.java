package by.tc.task01.dao.impl;

import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ApplianceCreation {
    private static final Pattern powerConsumptionPattern = Pattern.compile("POWER_CONSUMPTION=(\\d+)");
    private static final Pattern weightPattern = Pattern.compile("WEIGHT=(\\d+)");
    private static final Pattern capacityPattern = Pattern.compile("CAPACITY=(\\d+)");
    private static final Pattern depthPattern = Pattern.compile("DEPTH=(\\d+)");
    private static final Pattern heightPattern = Pattern.compile("HEIGHT=(\\d+)");
    private static final Pattern widthPattern = Pattern.compile("WIDTH=(\\d+)");
    private static final Pattern pricePattern = Pattern.compile("PRICE=(\\d+)");
    private static final Pattern batteryCapacityPattern = Pattern.compile("BATTERY_CAPACITY=(\\d+)");
    private static final Pattern osPattern = Pattern.compile("OS=(\\d+)");
    private static final Pattern memoryRomPattern = Pattern.compile("MEMORY_ROM=(\\d+)");
    private static final Pattern systemMemoryPattern = Pattern.compile("SYSTEM_MEMORY=(\\d+)");
    private static final Pattern cpuPattern = Pattern.compile("CPU=(\\d+)");
    private static final Pattern displayInchesPattern = Pattern.compile("DISPLAY_INCHES=(\\d+)");
    private static final Pattern freezerCapacityPattern = Pattern.compile("FREEZER_CAPACITY=(\\d+)");
    private static final Pattern overallCapacityPattern = Pattern.compile("OVERALL_CAPACITY=(\\d+)");
    private static final Pattern numberOfSpeakersPattern = Pattern.compile("NUMBER_OF_SPEAKERS=(\\d+)");
    private static final Pattern frequencyRangPattern = Pattern.compile("FREQUENCY_RANGY=(\\d+)");
    private static final Pattern cordLengthPattern = Pattern.compile("CORD_LENGTH=(\\d+)");
    private static final Pattern flashMemoryCapacityPattern = Pattern.compile("FLASH_MEMORY_CAPACITY=(\\d+)");
    private static final Pattern colorPattern = Pattern.compile("COLOR=([a-zA-z]+)");
    private static final Pattern filterTypePattern = Pattern.compile("FILTER_TYPE=(\\d+)");
    private static final Pattern bagTypePattern = Pattern.compile("BAG_TYPE=(\\d+)");
    private static final Pattern wandTypePattern = Pattern.compile("WAND_TYPE=(\\d+)");
    private static final Pattern motorSpeedRegulationPattern = Pattern.compile("MOTOR_SPEED_REGULATION=(\\d+)");
    private static final Pattern cleaningWidthPattern = Pattern.compile("CLEANING_WIDT=(\\d+)");

    public Oven createOven(String strOven) {
        return new Oven(parseInt(parseValue(strOven, pricePattern)),
                parseInt(parseValue(strOven, powerConsumptionPattern)),
                parseInt(parseValue(strOven, weightPattern)),
                parseInt(parseValue(strOven, capacityPattern)),
                parseInt(parseValue(strOven, depthPattern)),
                parseDouble(parseValue(strOven, heightPattern)),
                parseDouble(parseValue(strOven, widthPattern))
        );
    }

    public Laptop createLaptop(String strLaptop) {
        return new Laptop(parseInt(parseValue(strLaptop, pricePattern)),
                parseInt(parseValue(strLaptop, batteryCapacityPattern)),
                parseInt(parseValue(strLaptop, osPattern)),
                parseInt(parseValue(strLaptop, memoryRomPattern)),
                parseInt(parseValue(strLaptop, systemMemoryPattern)),
                parseDouble(parseValue(strLaptop, cpuPattern)),
                parseDouble(parseValue(strLaptop, displayInchesPattern))
        );
    }

    public Refrigerator createRefrigerator(String strRefrigerator) {
        return new Refrigerator(parseInt(parseValue(strRefrigerator, pricePattern)),
                parseInt(parseValue(strRefrigerator, powerConsumptionPattern)),
                parseInt(parseValue(strRefrigerator, weightPattern)),
                parseInt(parseValue(strRefrigerator, freezerCapacityPattern)),
                parseInt(parseValue(strRefrigerator, overallCapacityPattern)),
                parseInt(parseValue(strRefrigerator, heightPattern)),
                parseInt(parseValue(strRefrigerator, widthPattern))
        );
    }

    public Speakers createSpeakers(String strSpeakers) {
        return new Speakers(parseInt(parseValue(strSpeakers, pricePattern)),
                parseInt(parseValue(strSpeakers, powerConsumptionPattern)),
                parseInt(parseValue(strSpeakers, numberOfSpeakersPattern)),
                parseInt(parseValue(strSpeakers, frequencyRangPattern)),
                parseInt(parseValue(strSpeakers, cordLengthPattern))
        );
    }

    public TabletPC createTabletPC(String strTabletPC) {
        return new TabletPC(parseInt(parseValue(strTabletPC, pricePattern)),
                parseInt(parseValue(strTabletPC, batteryCapacityPattern)),
                parseInt(parseValue(strTabletPC, displayInchesPattern)),
                parseInt(parseValue(strTabletPC, memoryRomPattern)),
                parseInt(parseValue(strTabletPC, flashMemoryCapacityPattern)),
                parseValue(strTabletPC, colorPattern)
        );
    }

    public VacuumCleaner createVacuumCleaner(String strVacuumCleaner) {
        return new VacuumCleaner(parseInt(parseValue(strVacuumCleaner, pricePattern)),
                parseInt(parseValue(strVacuumCleaner, powerConsumptionPattern)),
                parseInt(parseValue(strVacuumCleaner, filterTypePattern)),
                parseInt(parseValue(strVacuumCleaner, bagTypePattern)),
                parseInt(parseValue(strVacuumCleaner, wandTypePattern)),
                parseInt(parseValue(strVacuumCleaner, motorSpeedRegulationPattern)),
                parseInt(parseValue(strVacuumCleaner, cleaningWidthPattern))
        );
    }

    private String parseValue(String parseStr, Pattern pattern) {
        Matcher m = pattern.matcher(parseStr);
        if (m.find()) {
            return m.group(1);
        }
        return "";
    }
}

