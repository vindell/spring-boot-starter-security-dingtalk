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
package org.springframework.security.boot.dingtalk.authentication;

public class DingTalkKeySecret {
	
	private String accessKey;
	private String accessSecret;

	public DingTalkKeySecret(String accessKey, String accessSecret) {
		this.accessKey = accessKey;
		this.accessSecret = accessSecret;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getAccessSecret() {
		return accessSecret;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public void setAccessSecret(String accessSecret) {
		this.accessSecret = accessSecret;
	}
}