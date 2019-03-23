package com.tester.utils;

import com.tester.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;


//拼接url   需要测试的接口通过这个工具类进行拼接
public class ConfigFile {

//    加载配置文件的
   private static ResourceBundle bundle= ResourceBundle.getBundle("application", Locale.CHINA);;

    public static String getUrl(InterfaceName name){
        String address = bundle.getString("test.url");
        String uri = "";
        String testUrl;
        if(name == InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");

        }

        if(name == InterfaceName.LOGIN){
            uri = bundle.getString("login.uri");
        }

        if(name == InterfaceName.UPDATEUSERINFO){
            uri = bundle.getString("updateUserInfo.uri");
        }

        if(name == InterfaceName.GETUSERINFO){
            uri = bundle.getString("getUserInfo.uri");
        }

        if(name == InterfaceName.ADDUSERINFO){
            uri = bundle.getString("addUser.uri");
        }
        testUrl = address + uri;
        return testUrl;
    }
}
