/*
 * 
 * LegendShop 多用户商城系统
 * 
 *  版权所有,并保留所有权利。
 * 
 */
package com.legendshop.business.dao;

import com.legendshop.central.license.LSResponse;
import com.legendshop.core.dao.BaseDao;
import com.legendshop.model.entity.Myleague;
import com.legendshop.model.entity.Product;
import com.legendshop.model.entity.ShopDetail;
import com.legendshop.model.entity.ShopDetailView;

/**
 * The Interface ShopDetailDao.
 */
public interface ShopDetailDao extends BaseDao{

	/**
	 * Checks if is shop exists.
	 * 
	 * @param storeName
	 *            the store name
	 * @return the boolean
	 */
	public abstract Boolean isShopExists(final String storeName);

	/**
	 * Gets the shop detail for update.
	 * 
	 * @param storeName
	 *            the store name
	 * @return the shop detail for update
	 */
	public abstract ShopDetail getShopDetailForUpdate(final String storeName);

	/**
	 * Gets the shop detail view.
	 * 
	 * @param storeName
	 *            the store name
	 * @return the shop detail view
	 */
	public abstract ShopDetailView getShopDetailView(final String storeName);

	/**
	 * Gets the simple info shop detail.
	 * 
	 * @param storeName
	 *            the store name
	 * @return the simple info shop detail
	 */
	public abstract ShopDetailView getSimpleInfoShopDetail(final String storeName);

	/**
	 * Gets the shop detail.
	 * 
	 * @param storeName
	 *            the store name
	 * @return the shop detail
	 */
	public abstract ShopDetail getShopDetail(final String storeName);

	/**
	 * Checks if is league shop exists.
	 * 
	 * @param storeName
	 *            the store name
	 * @return the boolean
	 */
	public abstract Boolean isLeagueShopExists(final String storeName);

	/**
	 * Canbe league shop.
	 * 
	 * @param isShopExists
	 *            the is shop exists
	 * @param userName
	 *            the user name
	 * @param storeName
	 *            the store name
	 * @return the boolean
	 */
	public abstract Boolean isBeLeagueShop(final boolean isShopExists, final String userName, final String storeName);

	/**
	 * Find myleague by user name and shop name.
	 * 
	 * @param userName
	 *            the user name
	 * @param shopName
	 *            the shop name
	 * @return the myleague
	 */
	public abstract Myleague getMyleague(String userName, String shopName);

	/**
	 * Save myleague.
	 * 
	 * @param myleague
	 *            the myleague
	 * @return the long
	 */
	public abstract Long saveMyleague(Myleague myleague);

	/**
	 * Inits the color type options.
	 */
	public abstract void getColorTypeOptions();

	/**
	 * Gets the product num.
	 * 
	 * @param userName
	 *            the user name
	 * @return the product num
	 */
	public abstract Integer getProductNum(String userName);

	/**
	 * Gets the off product num.
	 * 
	 * @param userName
	 *            the user name
	 * @return the off product num
	 */
	public abstract Integer getOffProductNum(String userName);

	/**
	 * Can add shop detail.
	 * 
	 * @param lsResponse
	 *            the ls response
	 * @return true, if successful
	 */
	public abstract boolean isCanAddShopDetail(LSResponse lsResponse);

	/**
	 * 更新产品.
	 * 
	 * @param shopdetail
	 *            the shopdetail
	 */
	public abstract void updateShopDetail(ShopDetail shopdetail);

	/**
	 * 更新产品时更新商城所拥有的产品数.
	 * 
	 * @param product
	 *            the product
	 */
	public abstract void updateShopDetailWhenProductChange(Product product);

}