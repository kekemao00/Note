package cn.com.ltsy.trade.util;

import java.util.regex.Pattern;
/**
 *支付宝，微信付款码验证
 *<p>https://pay.weixin.qq.com/wiki/doc/api/micropay_sl.php?chapter=5_1</p>
 *<p>https://docs.open.alipay.com/api_1/alipay.trade.pay</p>
 *@author lt
 */
public class PatterUtil {
	
	//微信授权码，10-15开头的长度为18位的数字，实际字符串长度以开发者获取的付款码长度为准	
	public static final String WXPAY_AUTHCODE_PATTER = "^[1][0-5][0-9]{16}$";
	
	//支付授权码，25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准	
	public static final String ALIPAY_AUTHCODE_PATTER = "^(25|26|27|28|29|30)[0-9]{14,22}$";
	
	public boolean checkWxAuthCode(String authCode) {
		return Pattern.matches(WXPAY_AUTHCODE_PATTER, authCode);
	}
	
	public boolean checkAliAuthCode(String authCode) {
		return Pattern.matches(ALIPAY_AUTHCODE_PATTER, authCode);
	}
	
	public static void main(String[] args) {
		boolean isMatch = Pattern.matches(ALIPAY_AUTHCODE_PATTER, "252548965214523602584785");
	    System.out.println(isMatch);
	}

}
