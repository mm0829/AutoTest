package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotion {

    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("在测试用例之前运行");
    }

    @AfterMethod
    public void afterMethond(){
        System.out.println("在测试方法之后运行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("类运行之前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("类之后运行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }


}

