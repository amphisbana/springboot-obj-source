package wang.sj.obj.mapper.timeline;

import org.springframework.stereotype.Component;
import wang.sj.obj.entity.timeline.Timeline;

import java.util.List;

/*
 *
 * 描 述: 主要功能
 * 作 者: sj.wong
 * 创 建： 2018/5/10 16:29
 * 版 本：
 *
 * 历 史: (版本) 作者 时间 注释
 */
public interface TimelineMapper {
	public List<Timeline> getAll();
}
