/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden.planner.database.dao;

import garden.planner.database.context.XmlContext;
import garden.planner.database.context.xml.XmlGeneral;
import garden.planner.database.context.xml.XmlVegetableList;
import garden.planner.dto.Vegetable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas De Praetere
 */
public abstract class BaseXmlDao {

    private XmlContext context;

    protected List<Vegetable> vegetables;

    public BaseXmlDao(XmlContext context) {
        this.context = context;
        init();
    }

    private void init() {
        XmlGeneral<XmlVegetableList> gen = new XmlGeneral(XmlVegetableList.class);
        XmlVegetableList list = gen.unmarshal(context.getVegetableFile());
        vegetables = list.getVegetableDtoList();
    }
}
