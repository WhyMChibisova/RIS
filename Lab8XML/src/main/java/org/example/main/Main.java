package org.example.main;

import org.example.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String CONFIGURATION_PATH = "context.xml";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(CONFIGURATION_PATH);
        SortService service = (SortService) context.getBean("sortService");
        List<String> strings = new ArrayList<String>();
        strings.add("bb");
        strings.add("ss");
        strings.add("aa");
        strings.add("dd");
        System.out.println("Strings: ");
        for (String s : strings) {
            System.out.println(s);
        }
        service.sortStrings(strings);
        System.out.println("Sort strings: ");
        for (String s : strings) {
            System.out.println(s);
        }
    }

}
