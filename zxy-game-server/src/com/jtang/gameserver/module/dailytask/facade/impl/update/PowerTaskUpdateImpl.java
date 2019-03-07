package com.jtang.gameserver.module.dailytask.facade.impl.update;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.jtang.gameserver.component.event.EventKey;
import com.jtang.gameserver.module.dailytask.facade.impl.BaseTaskUpdate;
import com.jtang.gameserver.module.dailytask.type.DailyTaskType;

/**
 * 最强势力排行榜每日任务实现
 * @author ludd
 *
 */
@Component
public class PowerTaskUpdateImpl extends BaseTaskUpdate{
	@PostConstruct
	private void init() {
		eventBus.register(EventKey.POWER_BATTLE_RESULT, this);
	}
	
	@Override
	protected DailyTaskType getDailyTaskType() {
		return DailyTaskType.POWER;
	}
	
}
