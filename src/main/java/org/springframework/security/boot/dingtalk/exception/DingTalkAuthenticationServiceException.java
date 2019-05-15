/*
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.springframework.security.boot.dingtalk.exception;

import org.springframework.security.boot.biz.exception.ExternalAuthenticationServiceException;

/**
 * DingTalk 服务端认证异常
 * @author 		： <a href="https://github.com/vindell">wandl</a>
 */
@SuppressWarnings("serial")
public class DingTalkAuthenticationServiceException extends ExternalAuthenticationServiceException {

	public DingTalkAuthenticationServiceException( String msg) {
		super(msg);
	}
	
	public DingTalkAuthenticationServiceException( String msg, Throwable t) {
		super(msg, t);
	}
	
}
