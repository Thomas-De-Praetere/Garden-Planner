/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden.planner.database.context;

import garden.planner.database.dao.VegetableDao;

/**
 *
 * @author Thomas De Praetere
 */
public interface Context {

    VegetableDao getVegetableDao();
}
