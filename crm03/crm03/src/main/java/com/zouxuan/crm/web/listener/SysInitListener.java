package com.zouxuan.crm.web.listener;

import com.zouxuan.crm.settings.domain.DicValue;
import com.zouxuan.crm.settings.service.DicService;
import com.zouxuan.crm.settings.service.impl.DicServiceImpl;
import com.zouxuan.crm.utils.ServiceFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.*;

public class SysInitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {

//        System.out.println("上下文域对象创建了");
        System.out.println("服务器缓存处理数据字典开始");

        ServletContext application = event.getServletContext();

        DicService ds = (DicService) ServiceFactory.getService(new DicServiceImpl());

        Map<String, List<DicValue>> map = ds.getAll();

        Set<String> set = map.keySet();
        for (String key:set
             ) {
            application.setAttribute(key,map.get(key));
        }

        System.out.println("服务器缓存处理数据字典结束");



    }
}
