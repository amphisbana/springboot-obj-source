package wang.sj.obj.entity.timeline;

import java.io.Serializable;

/*
 *
 * 描 述: 主要功能
 * 作 者: sj.wong
 * 创 建： 2018/5/10 16:05
 * 版 本：
 *
 * 历 史: (版本) 作者 时间 注释
 */
public class Timeline implements Serializable {
	private String id;
	/*时间*/
	private String time;
	/*标题*/
	private String title;
	/*类型*/
	private String type;
	/*内容*/
	private String contents;
	/*作者*/
	private String auther;
	/*图片*/
	private String imgRrl;
	/*视频*/
	private String vedioUrl;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getImgRrl() {
		return imgRrl;
	}

	public void setImgRrl(String imgRrl) {
		this.imgRrl = imgRrl;
	}

	public String getVedioUrl() {
		return vedioUrl;
	}

	public void setVedioUrl(String vedioUrl) {
		this.vedioUrl = vedioUrl;
	}
}
