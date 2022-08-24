package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.ApplianceValidator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    //	@Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {

        if (!ApplianceValidator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliances;
        try {
            appliances = applianceDAO.find(criteria);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return appliances;
    }

}

