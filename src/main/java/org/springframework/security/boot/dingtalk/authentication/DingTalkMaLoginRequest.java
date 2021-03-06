package org.springframework.security.boot.dingtalk.authentication;

import com.dingtalk.api.response.OapiUserGetResponse;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DingTalkMaLoginRequest {
	
	/**
	 * 	应用的唯一标识key
	 */
	protected String key;
	/**
	 * 临时登录凭证code
	 */
	protected String code;
	/**
	 * 用户ID
	 */
	protected String userid;
	/**
	 * 第三方平台UnionID（通常指第三方账号体系下用户的唯一ID）
	 */
	protected String unionid;
	/**
	 * 第三方平台OpenID（通常指第三方账号体系下某应用中用户的唯一ID）
	 */
	protected String openid;
	/**
	 * 用户信息
	 */
	protected OapiUserGetResponse userInfo;
	/**
	 * 绑定的账号
	 */
	protected String username;
	/**
	 * 绑定的账号密码
	 */
	protected String password;
	
	@JsonIgnoreProperties(ignoreUnknown = true)
    @JsonCreator
    public DingTalkMaLoginRequest(@JsonProperty("key") String key,
    		@JsonProperty("code") String code, 
    		@JsonProperty("userid") String userid,
    		@JsonProperty("unionid") String unionid,
			@JsonProperty("openid") String openid , 
			@JsonProperty("username") String username ,
			@JsonProperty("password") String password,
			@JsonProperty("userInfo") OapiUserGetResponse userInfo) {
        this.key = key;
        this.code = code;
        this.userid = userid;
        this.unionid = unionid;
		this.openid = openid;
		this.username = username;
		this.password = password;
		this.userInfo = userInfo;
    }

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public OapiUserGetResponse getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(OapiUserGetResponse userInfo) {
		this.userInfo = userInfo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
