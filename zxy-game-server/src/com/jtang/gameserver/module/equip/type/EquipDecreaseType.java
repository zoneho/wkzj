package com.jtang.gameserver.module.equip.type;

/**
 * 活力消耗类型
 * @author 0x737263
 *
 */
public enum EquipDecreaseType {
	
	/**
	 * 管理员删除
	 */
	ADMIN_DELETE(1),
	
	/**
	 * 出售
	 */
	SELL(2),
	
	/**
	 * 合成
	 */
	COMPOSE(3),
	
	/**
	 * 装备重置
	 */
	EQUIP_RESET(4),
	
	/**
	 * 神将来袭装备打造
	 */
	CRAFTSMAN_BUILD(5),
	
	/**
	 * 转换
	 */
	CONVERT(6),
	;
	
	
	private int id;
	
	private EquipDecreaseType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
}
