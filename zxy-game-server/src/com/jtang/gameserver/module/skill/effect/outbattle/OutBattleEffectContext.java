package com.jtang.gameserver.module.skill.effect.outbattle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * 技能效果解析上下文
 * 
 * @author vinceruan
 */
@Component
public class OutBattleEffectContext {

	/**
	 * 根据技能状态类型注册的解析器集合
	 */
	private final Map<Integer, OutBattleEffectParser> parsers = new HashMap<Integer, OutBattleEffectParser>(10);

	/**
	 * 获取已注册的道具效果处理器
	 * 
	 * @param  type 						技能状态类型
	 * @return {@code SkillEffectParser}	技能效果处理解析器
	 */
	public OutBattleEffectParser getParser(Integer type) {
		return parsers.get(type);
	}

	/**
	 * 注册技能解析器
	 * 
	 * @param type 					技能类型
	 * @param parser 				效果处理器
	 */
	public void putParser(Integer type, OutBattleEffectParser parser) {
		parsers.put(type, parser);
	}

}
