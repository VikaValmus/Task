package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FileApplianceDAOImpl implements ApplianceDAO {

    private static final String PATH = "/appliances_db.txt";

    private List<String> readingFile() throws DAOException {
        List<String> fileList = new ArrayList<>();
        try (BufferedReader buff = new BufferedReader(new InputStreamReader(Objects.requireNonNull(FileApplianceDAOImpl.class.getResourceAsStream(PATH))))) {
            String text;
            while ((text = buff.readLine()) != null) {
                fileList.add(text);
            }
        } catch (IOException exception) {
            throw new DAOException(exception);
        }
        return fileList;
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        List<String> foundedLines = new ArrayList<>();

        boolean lineFound;
        for (String line : readingFile()) {
            lineFound = true;
            for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
                String searchLine = entry.getKey().concat("=").concat(entry.getValue().toString());
                if (!line.contains(searchLine)) {
                    lineFound = false;
                    break;
                }
            }
            if (lineFound) {
                foundedLines.add(line);
            }
        }

        return createFromStrings(foundedLines);
    }

    private List<Appliance> createFromStrings(List<String> lines) {
        List<Appliance> appliances = new ArrayList<>();
        ApplianceCreation applianceCreation = new ApplianceCreation();

        for (String foundedLinesPars : lines) {
            if (foundedLinesPars.contains(Oven.class.getSimpleName())) {
                appliances.add(applianceCreation.createOven(foundedLinesPars));
            } else if (foundedLinesPars.contains(Laptop.class.getSimpleName())) {
                appliances.add(applianceCreation.createLaptop(foundedLinesPars));
            } else if (foundedLinesPars.contains(Refrigerator.class.getSimpleName())) {
                appliances.add(applianceCreation.createRefrigerator(foundedLinesPars));
            } else if (foundedLinesPars.contains(Speakers.class.getSimpleName())) {
                appliances.add(applianceCreation.createSpeakers(foundedLinesPars));
            } else if (foundedLinesPars.contains(TabletPC.class.getSimpleName())) {
                appliances.add(applianceCreation.createTabletPC(foundedLinesPars));
            } else if (foundedLinesPars.contains(VacuumCleaner.class.getSimpleName())) {
                appliances.add(applianceCreation.createVacuumCleaner(foundedLinesPars));
            }
        }
        return appliances;
    }


}

