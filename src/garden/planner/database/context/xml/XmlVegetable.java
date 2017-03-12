/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden.planner.database.context.xml;

import garden.planner.dto.Vegetable;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Thomas De Praetere
 */
public class XmlVegetable {

    private String name;

    public XmlVegetable() {
    }

    public XmlVegetable(Vegetable v) {
        this();
        name = v.name;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vegetable getVegetableDto() {
        return new Vegetable(name);
    }

}
