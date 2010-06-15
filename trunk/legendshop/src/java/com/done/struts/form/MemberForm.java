package com.done.struts.form;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;

/**
 * Basket generated by MyEclipse Persistence Tools
 */

public class MemberForm extends ValidatorForm {
    //	 Fields

    //扩展属性,订购流水号
    private String subNember;

    private Double total;//该订单的总钱数

    private String payType;

    private String basketId;
    /////
    private String other;

    private Integer userId;

    private String userName;

    private String orderName;

    private String userPass;

    private String userMail;

    private String userAdds;

    private String userTel;

    private Date userRegtime;

    private String userRegip;

    private Date userLasttime;

    private String userLastip;

    private String userBuymoney;

    private String userPostcode;

    private String userNamec;

    private String userType;

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if ((userName == null) || (userName.length() > 50)) {
            errors.add("userName", new ActionMessage("errors.maxlength", "userName", "50"));
        }
        if ((userAdds == null) || (userAdds.length() > 255)) {
            errors.add("userAdds", new ActionMessage("errors.maxlength", "userAdds", "255"));
        }
        if ((userPostcode == null) || (userPostcode.length() > 15)) {
            errors.add("userPostcode", new ActionMessage("errors.maxlength", "userPostcode", "15"));
        }
        if ((userTel == null) || (userTel.length() > 50)) {
            errors.add("userTel", new ActionMessage("errors.maxlength", "userTel", "50"));
        }
        if ((userMail == null) || (userMail.length() > 50)) {
            errors.add("userMail", new ActionMessage("errors.maxlength", "userMail", "50"));
        }
        if ((other != null) && (other.length() > 1024)) {
            errors.add("other", new ActionMessage("errors.maxlength", "other", "1024"));
        }
        return errors;
    }

    /**
     * Method reset
     * 
     * @param mapping
     * @param request
     */
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {

    }

    public String getUserAdds() {
        return userAdds;
    }

    public void setUserAdds(String userAdds) {
        this.userAdds = userAdds;
    }

    public String getUserBuymoney() {
        return userBuymoney;
    }

    public void setUserBuymoney(String userBuymoney) {
        this.userBuymoney = userBuymoney;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserLastip() {
        return userLastip;
    }

    public void setUserLastip(String userLastip) {
        this.userLastip = userLastip;
    }

    public Date getUserLasttime() {
        return userLasttime;
    }

    public void setUserLasttime(Date userLasttime) {
        this.userLasttime = userLasttime;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNamec() {
        return userNamec;
    }

    public void setUserNamec(String userNamec) {
        this.userNamec = userNamec;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserPostcode() {
        return userPostcode;
    }

    public void setUserPostcode(String userPostcode) {
        this.userPostcode = userPostcode;
    }

    public String getUserRegip() {
        return userRegip;
    }

    public void setUserRegip(String userRegip) {
        this.userRegip = userRegip;
    }

    public Date getUserRegtime() {
        return userRegtime;
    }

    public void setUserRegtime(Date userRegtime) {
        this.userRegtime = userRegtime;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getSubNember() {
        return subNember;
    }

    public void setSubNember(String subNember) {
        this.subNember = subNember;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getBasketId() {
        return basketId;
    }

    public void setBasketId(String basketId) {
        this.basketId = basketId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}