/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden.planner.database.dao;

import garden.planner.database.context.XmlContext;
import garden.planner.dto.Vegetable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas De Praetere
 */
public class XmlVegetableDao extends BaseXmlDao implements VegetableDao {

    public XmlVegetableDao(XmlContext context) {
        super(context);
    }

    @Override
    public List<Vegetable> getVegetables() {
        return new ArrayList<>(vegetables);
    }

}
