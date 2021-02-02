package com.ruoyi.common.utils;

import java.util.List;

/**
 * @author xw
 * @version 1.0
 * @date 2020/12/16 9:26
 */
public class ListUtils {

    public static boolean isEmpty(List list){
        return list==null||list.size()==0;
    }

    public static boolean isNotEmpty(List list){
        return !isEmpty(list);
    }
}
