package com.fc.springbootpractice.logic;

import java.util.List;

/**
 * fileName : Sort
 * author :  KimSangHoon
 * date : 2022/04/21
 */
public interface Sort<T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
