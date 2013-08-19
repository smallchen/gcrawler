package com.greedchina.gcrawler.batch.reader;



import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class DonghuaItemReader<T> implements ItemReader<T> {
	
	public boolean readDetail(String url){
		Document doc;
		try {
			doc = Jsoup.connect(url).get();
			Elements els = doc.select("div#chapterList.chapterList ul li a");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}


	public void readByUrl(String url){
		//获取目标链接的Document 
        try {
			Document doc = Jsoup.connect(url).get();
			Elements els = doc.select("div#chapterList.chapterList ul li a");
			for(Element el:els){
				String name = el.attr("title");
				
				String src = el.attr("href");
				Pattern pattern = Pattern.compile("(\\d+).shtml");
				Matcher matcher = pattern.matcher(src);
				String jishu = "";
				if(matcher.find()){
					jishu = matcher.group(1);
				}
				
				
				System.out.println("name :"+ name + " jishu :" + jishu + " src :" +src);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public T read() throws Exception, UnexpectedInputException, ParseException,
			NonTransientResourceException {
		String url = "http://www.imanhua.com/comic/54/";
		
		// TODO Auto-generated method stub
		System.out.println("===========Reader==============");
		readByUrl(url);
		return null;
	}

}
