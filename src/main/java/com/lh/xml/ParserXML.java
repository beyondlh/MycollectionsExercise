package com.lh.xml;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.nio.file.Paths;
import java.util.List;

/**
 * Created by lh on 2016/11/1.
 */
public class ParserXML {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(Paths.get("F:\\IntelljWorkSpace\\MycollectionsExercise\\src\\main\\java\\xmltest.xml").toFile());
        Element element = document.getRootElement();
        List<Attribute> nodeList = element.attributes();
        for (Attribute attr : nodeList) {
            System.out.println(attr.getText() + "-----" + attr.getName()
                    + "---" + attr.getValue());
        }
        System.out.println(element.getData());
        System.out.println(element.getName());
    }
}
