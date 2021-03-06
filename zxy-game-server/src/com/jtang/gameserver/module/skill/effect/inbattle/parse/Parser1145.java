package com.jtang.gameserver.module.skill.effect.inbattle.parse;

import org.springframework.stereotype.Component;

import com.jiatang.common.model.AttackerAttributeKey;
import com.jtang.core.rhino.FormulaHelper;
import com.jtang.gameserver.dataconfig.model.InbattleEffectConfig;
import com.jtang.gameserver.module.battle.model.Context;
import com.jtang.gameserver.module.battle.model.Fighter;
import com.jtang.gameserver.module.buffer.type.BufferType;
import com.jtang.gameserver.module.skill.effect.InbattleParserKey;
import com.jtang.gameserver.module.skill.effect.inbattle.AbstractInBattleEffectParser;
import com.jtang.gameserver.module.skill.model.TargetReport;

/**
 * 
 * @author vinceruan
 *
 */
@Component
public class Parser1145 extends AbstractInBattleEffectParser {

	@Override
	public boolean castSkill(Fighter caster, Fighter target, TargetReport report, InbattleEffectConfig effect, Context context) {
		if (target.isDead()) {
			report.valid = false;
			return false;
		}
		
		//加攻击力
		int atk = target.getBaseAtk();
		int x2 = 1;
		int addAtk = FormulaHelper.executeCeilInt(effect.getEffectExpr(), atk, x2);
		addAtk = ensureAddValidAtk(addAtk);
		
		addBuffer(caster, target, report, AttackerAttributeKey.ATK, effect, context, addAtk, true, BufferType.ATTR_BUFFER);
		
		//加防御力
		int def = target.getBaseDefense();
		x2 = 2;
		int addDef = FormulaHelper.executeCeilInt(effect.getEffectExpr(), def, x2);
		addDef = ensureAddValidDef(addDef);
		
		addBuffer(caster, target, report, AttackerAttributeKey.DEFENSE, effect, context, addDef, true, BufferType.ATTR_BUFFER);
		
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("[{}]释放技能[{}],对[{}]增加了攻击力值[{}]和防御力[{}]", caster.getName(), effect.getSkillName(), target.getName(), addAtk, addDef);
		}
		
		return true;
	}

	@Override
	protected int getParserId() {
		return InbattleParserKey.Parser1145;
	}
}
