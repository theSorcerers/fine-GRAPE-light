package org.sorcerers.data;

import java.io.Serializable;

public class JavaMethodInvocation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6731000636657849167L;
	private String methodName;
	private String memberClassName;

	public JavaMethodInvocation(String methodName, String memberClassName) {
		this.methodName = methodName;
		this.memberClassName = memberClassName;
	}

	public String getMethodName() {
		return methodName;
	}

	public String getMemberClassName() {
		return memberClassName;
	}
	
	public String toString() {
		return memberClassName + " " + methodName;
	}

}