package com.design.patterns.prototypeRegistry;

public class Client {
    public static void main(String[] args) {
        //store all prototype into the prototype-registry
        DocumentRegistry documentRegistry = new DocumentRegistry();
        documentRegistry.register("article", new Article(0,"Article Prototype"));
        documentRegistry.register("report", new Report(0,"Report Prototype"));

        //create multiple copies from the prototypes
        Document a1 = documentRegistry.get("article");
        a1.setId(1);
        a1.setName("Data Science");
        Document a2 = documentRegistry.get("article");
        a2.setId(2);
        a2.setName("Black Hole");
        Document r1 = documentRegistry.get("report");
        r1.setId(1);
        r1.setName("School News");

        System.out.println("-------------");
        System.out.println(a1);
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println(a2);
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println(r1);
        System.out.println("-------------");
    }
}
