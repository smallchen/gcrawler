package com.greedchina.gcrawler.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class DonghuaItemWriter<T> implements ItemWriter<T>{

	@Override
	public void write(List<? extends T> arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===========Writer==============");
	}

}
