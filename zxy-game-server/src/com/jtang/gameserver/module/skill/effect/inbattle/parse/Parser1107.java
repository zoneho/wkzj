package com.jtang.gameserver.module.skill.effect.inbattle.parse;

import org.springframework.stereotype.Component;

import com.jtang.gameserver.dataconfig.model.InbattleEffectConfig;
import com.jtang.gameserver.module.battle.model.Context;
import com.jtang.gameserver.module.battle.model.Fighter;
import com.jtang.gameserver.module.skill.effect.InbattleParserKey;
import com.jtang.gameserver.module.skill.effect.inbattle.AbstractInBattleEffectParser;
import com.jtang.gameserver.module.skill.model.TargetReport;

/**
 * 根据目标的血量计算伤害值，例如秒杀
 * @author vinceruan
 *
 */
@Component
public class Parser1107 extends AbstractInBattleEffectParser {
	@Override
	public boolean castSkill(Fighter caster, Fighter target, TargetReport report, InbattleEffectConfig effect, Context context) {
		int hp = target.getHp();
		return addHurtComputedByOneArg(caster, target, report, hp, effect, context);
	}

	@Override
	protected int getParserId() {
		return InbattleParserKey.Parser1107;
	}
}
