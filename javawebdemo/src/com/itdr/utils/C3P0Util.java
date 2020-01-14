package com.itdr.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * ClassName: C3P0Util
 * 日期: 2020/1/14 15:39
 *
 * @author Air张
 * @since JDK 1.8
 */
public class C3P0Util {

    private static ComboPooledDataSource com = new ComboPooledDataSource();

    public static ComboPooledDataSource getCom(){
        return com;
    }
}
