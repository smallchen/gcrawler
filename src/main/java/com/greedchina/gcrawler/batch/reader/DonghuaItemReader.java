package com.greedchina.gcrawler.batch.reader;



import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class DonghuaItemReader<T> implements ItemReader<T> {



	@Override
	public T read() throws Exception, UnexpectedInputException, ParseException,
			NonTransientResourceException {
		// TODO Auto-generated method stub
		System.out.println("===========Reader==============");
		return null;
	}

}
