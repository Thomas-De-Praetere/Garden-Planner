/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garden.planner.database.provider;

import garden.planner.database.context.Context;
import garden.planner.database.context.XmlContext;

/**
 *
 * @author Thomas De Praetere
 */
public class XmlProvider implements Provider {

    private final String location;

    public XmlProvider(String location) {
        this.location = location;
    }

    @Override
    public Context getContext() {
        return new XmlContext(location);
    }

}
