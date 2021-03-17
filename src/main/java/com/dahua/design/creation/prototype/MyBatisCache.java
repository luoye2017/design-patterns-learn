package com.dahua.design.creation.prototype;

import java.util.HashMap;
import java.util.Map;

public class MyBatisCache {

    //缓存user.序列化和反序列化-深克隆
    private Map<String, User> userCache = new HashMap<>();

    /**
     * 从数据库查数据
     * @return
     */
    public User selectUser(String userName) throws CloneNotSupportedException {
        User user = null;
        //缓存中没有
        if (!userCache.containsKey(userName)) {
            //查询数据库
            user = getUserFromDb(userName);
        } else {
            //从缓存中直接拿，脏缓存问题
            //原型已经拿到，但是不能直接给。（本人）
            user = userCache.get(userName);
            System.out.println("从缓存中拿到的是：" + user);
            //从这个对象快速得到一个克隆体（克隆人）==原型模式
            user = (User) user.clone();
        }

        return user;
    }


    private User getUserFromDb(String userName) throws CloneNotSupportedException {
        System.out.println("从数据库查到：" + userName);
        User user = new User();
        user.setAge(10);
        user.setName(userName);
        //给缓存中放一个clone
        userCache.put(userName, (User) user.clone());
        return user;
    }
}
