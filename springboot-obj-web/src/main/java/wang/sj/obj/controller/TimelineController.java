package wang.sj.obj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wang.sj.obj.service.timeline.TimelineService;

/*
 *
 * 描 述: 主要功能
 * 作 者: sj.wong
 * 创 建： 2018/5/10 15:00
 * 版 本：
 *
 * 历 史: (版本) 作者 时间 注释
 */
@Controller
@RequestMapping("timeline")
public class TimelineController {
	@Autowired
	private TimelineService timelineService;


	@RequestMapping("")
	public String index(Model model){
		model.addAttribute("msg",timelineService.getAll());
		return "timeline/index";
	}
}
