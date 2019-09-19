package com.chang.config;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.config
 * @date 2019-09-12 17:36
 * @Copyright 北京木联能软件股份有限公司
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
    private Map<String,Object> ioc = new HashMap<String, Object>();
    public ClassPathXmlApplicationContext(String path) {
        try {

            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read("./src/main/resources/"+path);
        }catch (DocumentException e){

        }
    }

    public Object getBean(String id) {
        return null;
    }
}
