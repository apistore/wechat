/**
 * 
 */
package com.github.apistore;


import com.github.apistore.util.CommonUtil;

import net.sf.json.JSONObject;

/**  
* @ClassName: 获取用户基本信息  
* @author 极酷
* @date 2018年2月25日 下午11:39:14  
* @url www.jcold.com 
*  
*/
public class UserInfo {
	
	/**
	 * 获取用户信息
	 */
	public static JSONObject getUserInfo(String accessToken, String openId) {
		// 拼接请求地址
		String requestUrl = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID";
		requestUrl = requestUrl.replace("ACCESS_TOKEN", accessToken).replace("OPENID", openId);
		// 获取用户信息
		JSONObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);
		return jsonObject;
	}
	
	public static void main(String[] args) {
		String accessToken = "ACCESS_TOKEN";
		String openId="OPENID";
		System.out.println(getUserInfo(accessToken, openId));
		
	}
}
