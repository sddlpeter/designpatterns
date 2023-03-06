package com.atguigu.flyweight;

import java.util.HashMap;

public class WebsiteFactory {
    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    public Website getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return (Website)pool.get(type);
    }

    public int getWebsiteCount() {
        return pool.size();
    }
}
