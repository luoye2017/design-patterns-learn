package com.dahua.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ZuLiao {

    private static Map<String, AbstractWaitress> pool = new HashMap<String, AbstractWaitress>();

    static {
        BeautifulWaitress waitress = new BeautifulWaitress(UUID.randomUUID().toString(), "小王");
        BeautifulWaitress waitress1 = new BeautifulWaitress(UUID.randomUUID().toString(), "小李");
        addWaitress(waitress.getId(), waitress);
        addWaitress(waitress1.getId(), waitress1);
    }

    public static void addWaitress(String id, AbstractWaitress waitress) {
        pool.put(id, waitress);
    }

    public static AbstractWaitress getWaitress(String id) {
        AbstractWaitress waitress = pool.getOrDefault(id, null);
        if (waitress == null) {
            for (AbstractWaitress value : pool.values()) {
                if (value.enableService) {
                    return value;
                }
            }
        }
        return waitress;
    }
}
