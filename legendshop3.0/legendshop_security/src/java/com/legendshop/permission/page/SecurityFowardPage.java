/*
 * 
 * LegendShop 多用户商城系统
 * 
 *  版权所有,并保留所有权利。
 * 
 */
package com.legendshop.permission.page;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.legendshop.core.constant.PageDefinition;
import com.legendshop.core.constant.PagePathCalculator;
import com.legendshop.util.AppUtils;

/**
 * The Enum FowardPage.
 */
public enum SecurityFowardPage implements PageDefinition{
	/** The VARIABLE. 可变路径 */
	VARIABLE(""),
	
	/** The FUNCTIO n_ lis t_ query. */
	FUNCTION_LIST_QUERY("/member/right/listFunction"),

	/** The FIN d_ functio n_ b y_ role. */
	FIND_FUNCTION_BY_ROLE("/member/role/functions"),

	/** The FIN d_ al l_ role. */
	FIND_ALL_ROLE("/member/right/findAllRole"), 
	
	/** The FIN d_ rol e_ b y_ user. */
	FIND_ROLE_BY_USER("/member/user/findRoleByUser"),

	/** The FIN d_ use r_ roles. */
	FIND_USER_ROLES("/member/user/roles"),

	/** The AL l_ role. */
	ALL_ROLE("/member/role/query"),
	
	/** The USER s_ list. */
	USERS_LIST("/member/user/query")
	;
	
	
	/** The value. */
	private final String value;
	
	private List<String> templates;

	private SecurityFowardPage(String value, String... template) {
		this.value = value;
		if (AppUtils.isNotBlank(template)) {
			this.templates = new ArrayList<String>();
			for (String temp : template) {
				templates.add(temp);
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.legendshop.core.constant.PageDefinition#getValue(javax.servlet.http.HttpServletRequest)
	 */
	public String getValue(HttpServletRequest request) {
		return getValue(request,value,templates);
	}
	
	public String getValue(HttpServletRequest request, String path, List<String> templates) {
		return PagePathCalculator.calculateActionPath("forward:", path);
	}

	
	public String getValue() {
		return value;
	}



}
