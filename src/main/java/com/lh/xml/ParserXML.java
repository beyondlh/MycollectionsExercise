package com.lh.xml;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by lh on 2016/11/1.
 */
public class ParserXML {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        File file = Paths.get("F:" + File.separator + "IntelljWorkSpace\\MycollectionsExercise\\src\\main\\java\\xmltest.xml").toFile();
        File targetFile = new File("D:\\4.xml");
        file.renameTo(targetFile);
        Document document = reader.read(targetFile);
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
