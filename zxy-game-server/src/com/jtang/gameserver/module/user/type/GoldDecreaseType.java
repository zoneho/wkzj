package com.jtang.gameserver.module.user.type;

/**
 * 金币扣除类型
 * @author 0x737263
 *
 */
public enum GoldDecreaseType {
	
	/**
	 * 世界聊天
	 */
	CHAT(1),
	
	/**
	 * 潜修
	 */
	DELVE(2),
	
	/**
	 * 吸灵
	 */
	VAMPIIR(3),
	
	/**
	 * 强化
	 */
	ENHANCED(4),
	
	/**
	 * 精炼
	 */
	REFINE(5),
	
	/**
	 * 试炼洞升级
	 */
	TRIALCAV_UPGRADE(6),

	/**
	 * 抢夺失败
	 */
	SNATCH_FAIL(7),
	/**
	 * gap删除
	 */
	MAINTAIN(8), 
	/**
	 * 设置主力仙人消耗
	 */
	MAIN_HERO(9),
	/**
	 * 活动扣除
	 */
	APP(10),
	/**
	 * 聚仙
	 */
	RECRUIT(11),
	/**
	 * 云游仙商购买
	 */
	SHOP_BUY(12), 
	/**
	 * 天梯刷新对手
	 */
	LADDER(13), 
	/**
	 * 云游仙人购买
	 */
	TRADER(14),
	/**
	 * 工会捐献
	 */
	UNION_DEVOTE(15),
	/**
	 * 工会捐献
	 */
	UNION_CREATE(16);
	
	private int id;
	
	private GoldDecreaseType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
