package com.zgwei.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Avenger on 2017/7/24.
 */
public class CollectionTest {

    List<Long> list = new ArrayList<Long>();

    public void javaStream(){

        list.stream().collect(Collectors.<Long>toList());
        Stream stream = list.stream();
        Collectors.toMap()
    }


}

