package com.tao.utils;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ReadXml {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String dirPath=System.getProperty("user.dir");
		System.out.println(dirPath);
		
		String path=ReadXml.class.getClassLoader().getResource("").getPath();
		System.out.println(path);
		
		SAXReader reader=new SAXReader();
		try {
			Document doc=reader.read(path+"/map.xml");
			Element root=doc.getRootElement();
			System.out.println(root.getName());
			List<Element> child=root.elements();
			for (Element el : child) {
				System.out.println(el.attributeValue("path"));
				System.out.println(el.attributeValue("type"));
				List<Element> list=el.elements();
				for (Element e : list) {
					System.out.println(e.attributeValue("name"));
					System.out.println(e.getText());
					
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
