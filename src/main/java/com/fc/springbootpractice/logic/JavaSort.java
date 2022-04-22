package com.fc.springbootpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * fileName : JavaSort
 * author :  KimSangHoon
 * date : 2022/04/21
 */
@Component
public class JavaSort<T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        Collections.sort(output);
        return output;
    }
}
