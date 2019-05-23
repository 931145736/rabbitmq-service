package com.example.demo.pojo;

import com.example.demo.annomation.AnnomationDefined;

import java.lang.reflect.Field;

public class Apple {

    @AnnomationDefined("apple")
    private static String fruitName;

    public static void main(String[] args){
        Apple apple = new Apple();
        apple.getInfomation(Apple.class);
       
    }

    public void getInfomation(Class<?> clazz){
        Field[] fields = clazz.getDeclaredFields();
        for(Field filed:fields){
            if(filed.isAnnotationPresent(AnnomationDefined.class)){
                AnnomationDefined annomationDefined = filed.getAnnotation(AnnomationDefined.class);
                System.out.println("水果的名字"+annomationDefined.value());
            }
        }


    }

}
