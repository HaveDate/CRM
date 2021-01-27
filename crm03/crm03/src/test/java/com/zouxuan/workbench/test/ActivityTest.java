package com.zouxuan.workbench.test;

import com.zouxuan.crm.utils.ServiceFactory;
import com.zouxuan.crm.utils.UUIDUtil;
import com.zouxuan.crm.workbench.domain.Activity;
import com.zouxuan.crm.workbench.service.ActivityService;
import com.zouxuan.crm.workbench.service.impl.ActivityServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class ActivityTest {

    @Test
    public void testSave(){

//        System.out.println("123");
        Activity a = new Activity();
        a.setId(UUIDUtil.getUUID());
        a.setName("宣传推广会");

        ActivityService as = (ActivityService) ServiceFactory.getService(new ActivityServiceImpl());

        boolean flag = as.save(a);

        Assert.assertEquals(flag,true);
        Assert.assertEquals(flag,true);

//        System.out.println(flag);

    }

/*    @Test
    public void testUpdate(){

        String str = null;

        str.length();

        System.out.println("234");

    }*/

}
