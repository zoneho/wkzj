package com.jtang.gameserver.module.goods.type;

/**
 * 活力增加类型
 * @author 0x737263
 *
 */
public enum GoodsAddType {
	
	/**
	 * 管理员后台添加
	 */
	ADMIN_ADD(1),
	
	/**
	 * 充值vip赠送
	 */
	VIP_GIVE(2),
	
	/**
	 * 送礼奖励
	 */
	ACCEPT_GIFT(3),
	
	/**
	 * 角色升级奖励
	 */
	ACTOR_UPGRADE(4),
	
	/**
	 * 云游仙商购买
	 */
	SHOP_BUY(5),
	
	/**
	 * 城战奖励
	 */
	CITY_WAR_AWARD(6),
	
	/**
	 * 试炼洞奖励
	 */
	TRAIL_AWARD(7),
	
	/**
	 * 故事奖励
	 */
	STORY_AWARD(8),
	
	/**
	 * 故事掉落物品
	 */
	STORY_DROP(9),
	
	/**
	 * 抢夺合成
	 */
	SNATCH_COMPOSE(10),
	
	/**
	 * 抢夺积分兑换
	 */
	SNATCH_EXCHANGE(11),
	
	/**
	 * vip抢夺另外附赠
	 * 气势+100。而且每天前3次抢夺等级不低于自己的对手大胜，必得聚仙符
	 */
	SNATCH_VIP_ADD(12),
	
	/**
	 * 抢夺达成兑换
	 */
	SNATCH_ACHIEVE(13),
	
	/**
	 * 登天塔兑换
	 */
	BABLE_EXCHANGE(14),
	
	/**
	 * 登天塔战斗奖励
	 */
	BABLE_AWARD(15),
	
	/**
	 * 上古洞府奖励
	 */
	HOLE_AWARD(16),
	
	/**
	 * 任务达成奖励
	 */
	TASK_AWARD(17),
	
	/**
	 * 授仙录达成奖励
	 */
	ACHIEVE_AWARD(18),
	
	/**
	 * 每日签到奖励
	 */
	SIGN_AWARD(19),
	
	/**
	 * 收取礼物
	 */
	OPEN_GIFT(20),
	
	/**
	 * 登陆赠送
	 */
	LOGIN_GIVE(21),

	/**
	 * 游戏活动赠送
	 */
	ACTIVITY_GIVE(22),
	
	/**
	 * 开宝箱获取某物品
	 */
	OPEN_TREASURE_BOX(23),
	
	/**
	 * 合成碎片
	 */
	COMPOSITE_PIECE(24),
	
	/**
	 * 打开礼包
	 */
	VIP_GIFT_BAG(25),

	/*
	 * 被盟友拉着打试炼洞，通知中领取的奖励
	 */
	TRAIL_ALLY_AWARD(26),

	/**
	 * 被盟友拉着打故事合作关卡，通知中领取的奖励
	 */
	STORY_ALLY_AWARD(27),
	
	/**
	 * 最强势力奖励物品
	 */
	POWER_AWARD(28),
	/**
	 * 合成装备失败
	 */
	COMPOSE_EQUIP_FAIL(29),
	
	/**
	 * cdkey赠送
	 */
	CDKEY(30),
	
	/**
	 * 角色重生
	 */
	ACTOR_RESET(31),
	
	/**
	 * 合成英雄失败
	 */
	COMPOSE_HERO_FAIL(32), 
	
	/**
	 * 活动添加
	 */
	APP_REWARD(33),
	
	/**
	 * 抢夺随机奖励
	 */
	SNATCH_RAND_REWARD(34),
	
	/**
	 * 抢夺增加碎片
	 */
	SNATCH_PIEIE(35),
	
	/**
	 * 重置仙人返还
	 */
	HERO_RESET(36),
	
	/**
	 * 重置装备返还
	 */
	EQUIP_RESET(37),
	/**
	 * 集众降魔
	 */
	DEMON_EXCHANGE(38),
	
	/**
	 * 系统邮件赠送
	 */
	SYSMAIL_REWARD(39),
	
	/**
	 * 补给
	 */
	SUPPLY(40), 
	/**
	 * 好评
	 */
	PRAISE(41), 
	
	/**
	 * 幸运星
	 */
	LUCK_STAR(42),
	
	/**
	 * 迷宫寻宝
	 */
	MAZE_TREASURE(43),
	
	/**
	 * 跨服战
	 */
	CROSS_BATTLE(44),
	
	/**
	 * 种植
	 */
	PLANT(45), 
	/**
	 * 聚仙产出
	 */
	RECRUIT(46),
	
	/**
	 * 吸灵室兑换
	 */
	VAMPIIR_EXCHANGE(47), 
	
	/**
	 * 月卡
	 */
	MONTH_CARD(50),
	/**
	 * 冲级礼包
	 */
	SPRINT_GIFT(51),
	/**
	 * 主界面购买金币
	 */
	GOLD_BUY(52), 
	
	/**
	 * 购买扫荡符
	 */
	BUY_FIGHT(53),
	
	/**
	 * 最强势力排行榜兑换
	 */
	POWER(54), 
	
	/**
	 * 主界面小人随机奖励
	 */
	RANDOM_REWARD(55), 
	
	/**
	 * 轮回熔炉
	 */
	SMELT(56), 
	
	/**
	 * vip商店
	 */
	VIP_SHOP(57), 
	
	/**
	 * 天梯
	 */
	LADDER(58),
	
	/**
	 * 邀请好友
	 */
	INVITE_FRIEND(59), 
	
	/**
	 * 云游商人购买
	 */
	TRADER(60),
	
	/**
	 * 迷宫寻宝兑换
	 */

	MAZE_TREASURE_EXCHANGE(61), 
	
	/**
	 * 答题奖励
	 */
	QUESTIONS(62), 
	
	/**
	 * 聚宝盆活动
	 */
	BASIN(63),
	/**
	 * 仙履奇缘礼物
	 */
	LOVE_GIFT(64),

	/**
	 * 天神下凡奖励
	 */
	DEITY_DESCEND(65),
	
	/**
	 * 神匠来袭
	 */
	CRAFTSMAN_BUILD(66),
	
	/**
	 * 首冲奖励
	 */
	FIRST_RECHARGE(67), 
	
	/**
	 * 在线礼包
	 */
	ONLINE_GIFTS(68),
	
	/**
	 * 快乐摇奖
	 */
	ERNIE(69),
	
	/**
	 * 仙侣合作
	 */
	LOVE_MONSTER(70), 
	
	/**
	 * 仙侣商城
	 */
	LOVE_SHOP(71),
	
	/**
	 * 年兽
	 */
	BEAST(72), 
	
	/**
	 * vip箱子
	 */
	VIP_BOX(73),
	
	/**
	 * 装备、装备碎片提炼
	 */
	EQUIP_CONVERT(74),
	
	;

	private int id;
	
	private GoodsAddType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
}