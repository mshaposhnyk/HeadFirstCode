package com.headFirst_OOAD.chapter5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {
    private final Map<String, Object> properties;


    public InstrumentSpec(Map<String, Object> map) {
        properties = new HashMap<>(map);
    }

    public Object getProperty(String propertyName){
        return properties.get(propertyName);
    }

    public Map<String, Object> getProperties(){
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec){
        for(Iterator<String> i = otherSpec.getProperties().keySet().iterator(); i.hasNext();){
            String propertyName = i.next();
            if(properties.get(propertyName) != null &&
                    !properties.get(propertyName).equals(otherSpec.getProperty(propertyName))){
                return false;
            }
        }
        return true;
    }
}
