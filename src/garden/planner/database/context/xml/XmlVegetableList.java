/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden.planner.database.context.xml;

import garden.planner.dto.Vegetable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas De Praetere
 */
@XmlRootElement(name = "vegetables")
public class XmlVegetableList {

    private List<XmlVegetable> vegetables;

    public XmlVegetableList() {
        vegetables = new ArrayList<>();
    }

    public XmlVegetableList(List<Vegetable> l) {
        this();
        for (Vegetable v : l) {
            vegetables.add(new XmlVegetable(v));
        }
    }

    @XmlElement(name = "vegetable")
    public List<XmlVegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<XmlVegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public List<Vegetable> getVegetableDtoList() {
        List<Vegetable> l = new ArrayList<>();
        for (XmlVegetable v : vegetables) {
            l.add(v.getVegetableDto());
        }
        return l;
    }

}
