package com.liyuchao.util;

import java.util.regex.Matcher;

import org.junit.Test;

/**
 * 字符串工具类
 * @author zhaoming.li
 *
 */
public class StringUtil {
	
	private static final String String = null;

	private StringUtil() {
		
	}
	
	/**
	 * 判断源字符中是否有值
	 * @param src
	 * @return
	 */
	public static boolean hasLength(String src) {
		return src != null && src.length()>0;
	}
	
	/**
	 * 判断传入的源自符串是否为非空
	 * @param src
	 * @return
	 */
	public static boolean isNotEmpty(String src) {
		boolean result = false;
		
		// 1、判断src是否为null，或者是否为空串，如果是则返回false;
		result = StringUtil.hasLength(src);
		if (!result) return result;
		else {
			// 2、判断src中所有字符是否全部为空格，如果是则返回false
			// （1）将字符串转换成字符数组
			// （2）遍历这个字符数组，如果发现一个非空格字符，则将result设置true,然后退出循环
			
			// 重新初始化返回结果
			result = false;
			
			char[] temp = src.toCharArray();
			
			for (int i=0; i<temp.length; i++) {
				if (temp[i] != ' ') {
					result = true;
					break;
				}
			}
			
		}
		
		return result;
	}
	
	
	
	/**
	 * 判断输入的源字符中是否都英文字母
	 * @param src
	 * @return
	 */
	public static boolean isAllAlphabetic(String src) {
		boolean result = false;
		
		if(!StringUtil.isNotEmpty(src)) return result;
		
		char[] temp = src.toCharArray();
		
		for (char c : temp) {
			if (!Character.isAlphabetic(c)) {
				result = false;
				break;
			}
			result = true;
		}
		
		return result;
	}
	
	public static String genRandomString(int n) {
		StringBuffer buffer = new StringBuffer();
		
		for (int i=0; i<n; i++) {
			char randomChar = (char)((Math.random()*58)+65);
			randomChar = randomChar > 90 && randomChar < 97 ? (char)(randomChar + 8) : randomChar;
			buffer.append(randomChar);
		}
		
		return buffer.toString();
	}
	
	/**
	 * 
	 * @param in
	 * @return
	 */
	public static String genChineseString(int n) {
		StringBuffer buffer = new StringBuffer();
		
		int start = Integer.valueOf("4e00", 16);
		int end = Integer.valueOf("9fa5", 16);
		

		// 生成中文字符的算法如下：
		for (int i=0; i < n; i++) {
			char randomChar = (char)((Math.random()*(end-start+1))+start);
			buffer.append(randomChar);
		}
		
		return buffer.toString();
	}
	
	public static  String toHtml(String text){
		
		
		return null;
	}
	/**
	 * 判断传入的字符串是否为手机号码
	 * @param mobile
	 * @return
	 */
	@Test
	public static boolean isPhone(String mobile) {
		mobile.matches("^1[3|4|5|7|8][0-9]\\d{4,8}$");
		if(mobile.matches(String)){
			
			return true;
		}else {
			return false;
		}
		
		
		
	}
	
}
