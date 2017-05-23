package com.light.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 数组工具
 * @author lushaoqing
 * @since 1.0.0
 */
public final class ArrayUtil {
	
	/**
	 * 判断数组是否非空 
	 */
	public static boolean isNotEmpty(Object[] array){
		return !ArrayUtil.isEmpty(array);
	}
	
	/**
	 * 判断数组是否为空 
	 */
	public static boolean isEmpty(Object[] array){
		return ArrayUtils.isEmpty(array);
	}
	
}
