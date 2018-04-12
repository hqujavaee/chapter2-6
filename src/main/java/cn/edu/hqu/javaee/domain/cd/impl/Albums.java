package cn.edu.hqu.javaee.domain.cd.impl;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;

public class Albums implements CompactDisc {
	private String title;
	private String artist;
	
	public Albums(String title,String artist) {
		this.title=title;
		this.artist=artist;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("正在播放"+artist+"的专辑《"+title+"》");

	}

}
