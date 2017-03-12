/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden.planner.database.dao;

import garden.planner.dto.Vegetable;
import java.util.List;

/**
 *
 * @author Thomas De Praetere
 */
public interface VegetableDao {

    List<Vegetable> getVegetables();
}
