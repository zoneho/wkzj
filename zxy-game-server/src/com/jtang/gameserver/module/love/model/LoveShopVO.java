package com.jtang.gameserver.module.love.model;

import com.jtang.core.protocol.IoBufferSerializer;
import com.jtang.core.utility.Splitable;
import com.jtang.core.utility.StringUtils;
import com.jtang.gameserver.dataconfig.model.LoveShopConfig;

public class LoveShopVO extends IoBufferSerializer {

	/**
	 * 商品id
	 */
	public int id;
	
	/**
	 * 物品id
	 */
	public int goodsId;
	
	/**
	 * 物品类型
	 */
	public int type;
	
	/**
	 * 物品数量
	 */
	public int num;
	
	/**
	 * 购买消耗的点券
	 */
	public int costTicket;
	
	/**
	 * 购买消耗的物品数量
	 */
	public int costGoods;
	
	public LoveShopVO(){
		
	}
	
	public LoveShopVO(LoveShopConfig loveShopConfig){
		this.id = loveShopConfig.id;
		this.goodsId = loveShopConfig.itemId;
		this.type = loveShopConfig.type;
		this.num = loveShopConfig.num;
		this.costTicket = loveShopConfig.costTicket;
		this.costGoods = loveShopConfig.costGoods;
	}
	
	public static LoveShopVO valueOf(String str[]){
		str = StringUtils.fillStringArray(str, 6, "0");
		LoveShopVO loveShopVO = new LoveShopVO();
		loveShopVO.id = Integer.valueOf(str[0]);
		loveShopVO.goodsId = Integer.valueOf(str[1]);
		loveShopVO.type = Integer.valueOf(str[2]);
		loveShopVO.num = Integer.valueOf(str[3]);
		loveShopVO.costTicket = Integer.valueOf(str[4]);
		loveShopVO.costGoods = Integer.valueOf(str[5]);
		return loveShopVO;
	}
	
	public String parser2String(){
		StringBuffer sb = new StringBuffer();
		sb.append(id).append(Splitable.ATTRIBUTE_SPLIT);
		sb.append(goodsId).append(Splitable.ATTRIBUTE_SPLIT);
		sb.append(type).append(Splitable.ATTRIBUTE_SPLIT);
		sb.append(num).append(Splitable.ATTRIBUTE_SPLIT);
		sb.append(costTicket).append(Splitable.ATTRIBUTE_SPLIT);
		sb.append(costGoods);
		return sb.toString();
	}
	
	@Override
	public void write() {
		writeInt(id);
		writeInt(goodsId);
		writeInt(type);
		writeInt(num);
		writeInt(costTicket);
		writeInt(costGoods);
	}
}
