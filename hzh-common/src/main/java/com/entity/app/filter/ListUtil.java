package com.entity.app.filter;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 * @ProjectName:
 * @Package:
 * @ClassName:
 * @Author: ZUHUA.HUANG
 * @Description: ${description}
 * @Date: 2020/
 * @Version: 1.0
 * @Description: TODO()
 */
public class ListUtil {


    public ListUtil() {
    }

    public static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean isNotEmpty(List<?> list) {
        return list != null && !list.isEmpty();
    }

    public static <T> T getFirst(List<T> list) {
        return isEmpty(list) ? null : list.get(0);
    }

    public static <T> T getLast(List<T> list) {
        return isEmpty(list) ? null : list.get(list.size() - 1);
    }

    public static <T> List<T> getEmptyList() {
        return Collections.emptyList();
    }

    public static <T> void cleanNullFromList(List<T> list) {
        if (!isEmpty(list)) {
            Iterator iterator = list.iterator();

            while(iterator.hasNext()) {
                T obj = (T) iterator.next();
                if (obj == null) {
                    list.remove(obj);
                }
            }

        }
    }

    public static <T> ArrayList<T> newArrayList(T... e) {
        return Lists.newArrayList(e);
    }

    public static <T> List<List<T>> partion(List<T> list, int size) {
        return isEmpty(list) ? null : Lists.partition(list, size);
    }

    public static <T> List<T> reverse(List<T> list) {
        return isEmpty(list) ? null : Lists.reverse(list);
    }

    public static <E> List<E> union(List<? extends E> firstList, List<? extends E> secondList) {
        List<E> unionResult = new ArrayList(firstList.size() + secondList.size());
        unionResult.addAll(firstList);
        unionResult.addAll(secondList);
        return unionResult;
    }

    public static <E> List<E> intersection(List<? extends E> firstList, List<? extends E> secondList) {
        List<? extends E> smallList = firstList;
        List<? extends E> largerList = secondList;
        if (firstList.size() > secondList.size()) {
            smallList = secondList;
            largerList = firstList;
        }

        List<E> newList = new ArrayList(smallList);
        List<E> destList = new ArrayList(smallList.size());
        Iterator var6 = largerList.iterator();

        while(var6.hasNext()) {
            E e = (E) var6.next();
            if (newList.contains(e)) {
                destList.add(e);
                newList.remove(e);
            }
        }

        return destList;
    }

    public static <T> List<T> difference(List<? extends T> list1, List<? extends T> list2) {
        List<T> result = new ArrayList(list1);
        Iterator iterator = list2.iterator();

        while(iterator.hasNext()) {
            result.remove(iterator.next());
        }

        return result;
    }

    public static final <T> List<T> emptyList() {
        return Collections.emptyList();
    }
}
