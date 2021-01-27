package com.zouxuan.settings.test;

import com.zouxuan.crm.utils.DateTimeUtil;

public class Test1 {

    public static void main(String[] args) {

//        String expireTime = "2020-10-10 10:10:10";
//
//        String currentTime = DateTimeUtil.getSysTime();
//        int count = expireTime.compareTo(currentTime);
//        System.out.println(count);

        /*String lockState = "0";
        if ("0".equals(lockState)){
            System.out.println("账号已锁定");
        }*/

        /*String ip = "192.168.1.3";
        String allowIps = "192.168.1.1,192.168.1.2";

        if(allowIps.contains(ip)){

            System.out.println("有效的ip地址，允许访问系统");

        }else {

            System.out.println("ip地址受限，请联系管理员");

        }*/

 /*       String pwd =  "1998020zxhs";
        pwd = MD5Util.getMD5(pwd);
        System.out.println(pwd);*/
detail(1,1);

    }

    private static void detail(int i, int i1) {
        System.out.println("2");
    }
}
