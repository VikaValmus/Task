package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class ApplianceValidator {

    public static boolean criteriaValidator(Criteria criteria) {


        for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {

            if (entry.getKey().toString().equals(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
                if (entry.getValue().getClass() != Integer.class) {
                    return false;
                }
            }

            if (entry.getKey().toString().equals(SearchCriteria.Oven.DEPTH.toString())) {
                if (entry.getValue().getClass() != Integer.class) {
                    return false;
                }
            }

            if (entry.getKey().toString().equals(SearchCriteria.Oven.HEIGHT.toString())) {
                if (entry.getValue().getClass() != Integer.class) {
                    return false;
                }
            }

            if (entry.getKey().toString().equals(SearchCriteria.TabletPC.COLOR.toString())) {
                if (entry.getValue().getClass() != String.class) {
                    return false;
                }
            }
        }

        return true;
    }

}

