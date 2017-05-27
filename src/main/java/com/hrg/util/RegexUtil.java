package com.hrg.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * 类说明：正则表达式工具类
 */
public class RegexUtil {

	/**
	 * 验证任意正、负整数或者负数
	 */
	public static final String REGEX_MONEY = "^(-)?(([1-9][0-9]*)|([0]\\.\\d{1,2}|[1-9][0-9]*\\.\\d{1,2}))$";

	/**
	 * 验证数字
	 */
	public static final String REGEX_NUM = "^[0-9]*$";
	
	/**
	 * 验证n位的数字
	 */
	public static final String REGEX_N_NUM = "^\\d{n}$";
	
	/**
	 * 验证至少n位的数字
	 */
	public static final String REGEX_LEAST_N_NUM = "^\\d{n,}$";
	
	/**
	 * 验证m-n位的数字
	 */
	public static final String REGEX_M_N_NUM = "^\\d{m,n}$";
	
	/**
	 * 验证零和非零开头的数字
	 */
	public static final String REGEX_ZERO_BLAME_ZERO_NUM = "^(0|[1-9][0-9]*)$";
	
	/**
	 * 验证有两位小数的正实数
	 */
	public static final String REGEX_TWO_DECIMALS_ARITHMETIC_NUM = "^[0-9]+(.[0-9]{2})?$";
	
	/**
	 * 验证有1-3位小数的正实数
	 */
	public static final String REGEX_ONE_THREE_ARITHMETIC_NUM = "^[0-9]+(.[0-9]{1,3})?$";
	
	/**
	 * 验证非零的正整数
	 */
	public static final String REGEX_BLAME_ZERO_POSITIVE_NUM = "^\\+?[1-9][0-9]*$";
	
	/**
	 * 验证邮箱
	 */
	public static final String REGEX_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
	
	/**
	 * 验证手机
	 */
	public static final String REGEX_PHONE = "^(13[0-9]|14[0-9]|15[0-9]|16[0-9]|17[0-9]|18[0-9]|19[0-9])\\d{8}$";
	
	/**
	 * 验证固定电话
	 */
	public static final String REGEX_TEL = "^(010|02\\d{1}|0[3-9]\\d{2})-\\d{7,9}(-\\d+)?$";
	
	/**
	 * 验证400电话
	 */
	public static final String REGEX_400 = "^400(-\\d{3,4}){2}$";
	
	/**
	 * 
	 * 方法说明：正则表达式验证
	 * @param str : 验证的字符串
	 * @param regex : 验证的规则
	 * @return 返回验证的结果
	 */
	public static boolean verify(String str, String regex) {
		return str.matches(regex);
	}
	
	/**
	 * 验证密码强度是否是强
	 * 
	 * @return true
	 */
	public static boolean verificationPassword(String password) {
		if (password.matches("[0-9a-zA-z]{6,15}") && !password.matches("[0-9]*")&& !password.matches("[a-zA-z]*")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 方法说明：验证是否有特殊字符
	 * @param str
	 * @return
	 * @throws PatternSyntaxException
	 */
	public static boolean checkSpecialChar(String str) throws PatternSyntaxException {
		String regEx = ".*[`~!@^&*+=|{}':;',\\[\\]<>/?~！@……&——+|{}【】‘；：”“’。，、？\\\\]+.*";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.matches();
	}
	
	/**
	 *	方法说明：清除掉所有特殊字符
	 * 	@param str
	 * 	@return
	 * 	@throws PatternSyntaxException
	 */
	public static String filterString(String str) throws PatternSyntaxException {
		String regEx = "[`~!@^&*+=|{}':;',\\[\\]<>/?~！@……&——+|{}【】‘；：”“’。，、？\\\\]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll(" ");
	}
		
	/**
	 * 
	 * 方法说明: 特殊字符转义处理
	 * @param input
	 * @return
	 * @return: String
	 */
	public static String transformSolrMetacharactor(String input){
        StringBuffer sb = new StringBuffer();
        String regex = "[+\\-&|!(){}\\[\\]^\"~*?:(\\)]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){  
            matcher.appendReplacement(sb, "\\\\"+matcher.group());  
        }  
        matcher.appendTail(sb);  
        return sb.toString();   
    }
}