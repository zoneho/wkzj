package com.jtang.gameserver.dataconfig.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jtang.core.dataconfig.ModelAdapter;
import com.jtang.core.dataconfig.annotation.DataFile;
import com.jtang.core.dataconfig.annotation.FieldIgnore;
import com.jtang.core.utility.Splitable;
import com.jtang.core.utility.StringUtils;

/**
 * 通天塔怪堆配置
 * @author 0x737263
 *
 */
@DataFile(fileName = "bableMonsterConfig")
public class BableMonsterConfig implements ModelAdapter {
	
	/**
	 * 登天塔id
	 */
	public int bableType;
	
	/**
	 * 层数
	 */
	public int floor;
	
	/**
	 * 血量加成
	 */
    public String hpExpr;
    
    /**
     * 防御加成
     */
    public String defenseExpr;
    
    /**
     * 攻击加成
     */
    public String attackExpr;
    
    /**
     * 气势
     */
    public String morale;
    
    /**
	 * 怪物阵容
	 */
	public String monster;
	
	@FieldIgnore
	private Map<Integer, Integer> monsterMap = new HashMap<Integer, Integer>();// 怪物列表map
	
	@Override
	public void initialize() {
		List<String> list = StringUtils.delimiterString2List(monster, Splitable.ELEMENT_SPLIT);
		for (String item : list) {
			List<String> attrs = StringUtils.delimiterString2List(item, Splitable.ATTRIBUTE_SPLIT);
			// 怪物id
			int heroId = Integer.valueOf(attrs.get(0));
			// 怪物在阵型中的位置
			int gridIndex = Integer.valueOf(attrs.get(1));
			monsterMap.put(gridIndex,heroId);
		}
		
		this.monster = null;
	}
	
	public Map<Integer,Integer> getMonster(){
		return monsterMap;
	}
	
}
