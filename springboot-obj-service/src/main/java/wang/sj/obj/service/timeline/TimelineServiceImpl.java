package wang.sj.obj.service.timeline;

/*
 *
 * 描 述: 主要功能
 * 作 者: sj.wong
 * 创 建： 2018/5/10 14:59
 * 版 本：
 *
 * 历 史: (版本) 作者 时间 注释
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.sj.obj.entity.timeline.Timeline;
import wang.sj.obj.mapper.timeline.TimelineMapper;

import java.util.List;
@Service
public class TimelineServiceImpl implements TimelineService {

	@Autowired
	private TimelineMapper mapper;

	@Override
	public List<Timeline> getAll() {
		return mapper.getAll();
	}
}
