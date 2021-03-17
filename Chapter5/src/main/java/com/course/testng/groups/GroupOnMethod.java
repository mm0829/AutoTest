package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端组的测试方法111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端组的测试方法222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端组的测试方法333");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端组运行之前的运行方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务端组运行之后的运行方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("客户端组运行之前的运行方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("客户端组运行之后的运行方法");
    }
}
