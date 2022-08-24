package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

public class Main {

    public static void main(String[] args) throws ServiceException {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        ////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"

        criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 1000);
        criteriaOven.add(Oven.HEIGHT.toString(), 45);
        criteriaOven.add(Oven.DEPTH.toString(), 60);

        appliances = service.find(criteriaOven);

        PrintApplianceInfo.print(appliances);

        ////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.HEIGHT.toString(), 200);
        criteriaOven.add(Oven.DEPTH.toString(), 300);

        appliances = service.find(criteriaOven);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8);

        appliances = service.find(criteriaTabletPC);

        PrintApplianceInfo.print(appliances);


    }

}
