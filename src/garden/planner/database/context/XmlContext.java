/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden.planner.database.context;

import garden.planner.database.dao.VegetableDao;
import garden.planner.database.dao.XmlVegetableDao;
import java.io.File;

/**
 *
 * @author Thomas De Praetere
 */
public class XmlContext implements Context {

    private final String location;

    private final File vegetableFile;

    public XmlContext(String location) {
        this.location = location;
        vegetableFile = new File(location + "vegetables.xml");
    }

    public String getLocation() {
        return location;
    }

    public File getVegetableFile() {
        return vegetableFile;
    }

    @Override
    public VegetableDao getVegetableDao() {
        return new XmlVegetableDao(this);
    }

}
