package com.jtang.gameserver.dataconfig.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jtang.core.dataconfig.ModelAdapter;
import com.jtang.core.dataconfig.annotation.DataFile;
import com.jtang.core.dataconfig.annotation.FieldIgnore;
import com.jtang.core.rhino.FormulaHelper;
import com.jtang.core.utility.Splitable;
import com.jtang.core.utility.StringUtils;

@DataFile(fileName = "loveMonsterConfig")
public class LoveMonsterConfig implements ModelAdapter {

	/**
	 * 配置id
	 */
	private int id;
	/**
	 * 怪物
	 */
	private String monster;
	/**
	 * 攻击力表达式
	 */
	private String monsterAttack;
	/**
	 * 防御力表达式
	 */
	private String monsterDeffends;
	/**
	 * 血值表达式
	 */
	private String monsterHp;
	
	/**
	 * 气势
	 */
	private int morale;
	
	/**
	 * 附加血系数（格式:攻击次数最小值_攻击次数最大值_系数|…)
	 */
	private String extraArgs;
	
	@FieldIgnore
	private Map<Integer, Integer> monsterList = new HashMap<Integer, Integer>();
	
	@FieldIgnore
	private Map<Integer,String> attackMap = new HashMap<>();
	
	@FieldIgnore
	private Map<Integer,String> defMap = new HashMap<>();
	
	@FieldIgnore
	private Map<Integer,String> hpMap = new HashMap<>();
	
	@FieldIgnore
	private List<String> args = new ArrayList<>();
	
	
	@Override
	public void initialize() {
		monsterList.clear();
		List<String> list = StringUtils.delimiterString2List(monster, Splitable.ELEMENT_SPLIT);
		for (String item : list) {
			List<String> attrs = StringUtils.delimiterString2List(item, Splitable.ATTRIBUTE_SPLIT);
			int monsterId = Integer.valueOf(attrs.get(0));
			int gridIndex = Integer.valueOf(attrs.get(1));
			monsterList.put(gridIndex, monsterId);
		}
		args.clear();
		String[] arg = StringUtils.split(extraArgs, Splitable.ELEMENT_SPLIT);
		for (String string : arg) {
			args.add(string);
		}
		
		List<String[]> atkList = StringUtils.delimiterString2Array(monsterAttack);
		for(String[] str:atkList){
			attackMap.put(Integer.valueOf(str[0]), str[1]);
		}
		
		List<String[]> defList = StringUtils.delimiterString2Array(monsterDeffends);
		for(String[] str:defList){
			defMap.put(Integer.valueOf(str[0]), str[1]);
		}
		
		List<String[]> hpList = StringUtils.delimiterString2Array(monsterHp);
		for(String[] str:hpList){
			hpMap.put(Integer.valueOf(str[0]), str[1]);
		}
		
		
		this.monsterAttack = null;
		this.monsterDeffends = null;
		this.monsterHp = null;
		this.monster = null;
		this.extraArgs = null;
	}
	
	public int getMonsterAttack(int totalLevel,int monsterId) {
		return FormulaHelper.executeInt(attackMap.get(monsterId), totalLevel);
	}
	
	public int getMonsterDeffends(int totalLevel,int monsterId) {
		return FormulaHelper.executeInt(defMap.get(monsterId), totalLevel);
	}
	
	public int getMonsterHp(int totalLevel,int monsterId) {
		return FormulaHelper.executeInt(hpMap.get(monsterId), totalLevel);
	}
	
	public int getId() {
		return id;
	}
	
	public Map<Integer, Integer> getMonsterList() {
		return monsterList;
	}
	
	public int getMorale() {
		return morale;
	}
	
	/**
	 * 获取本次Boss血
	 * @param totalHert 上次总伤害
	 * @param num 上次杀死boss消耗次数
	 * @return
	 */
	public int getExtraHp(int totalHert, int num) {
		Double i = 0.0;
		for (String arg : args) {
			String[] strs = StringUtils.split(arg, Splitable.ATTRIBUTE_SPLIT);
			strs = StringUtils.fillStringArray(strs, 3, "0");
			int start = Integer.valueOf(strs[0]);
			int end = Integer.valueOf(strs[1]);
			if (start <= num && num <= end) {
				i = Double.valueOf(strs[2]);
				break;
			}
		}
		Double result = i * totalHert;
		return result.intValue();
	}
	

}
