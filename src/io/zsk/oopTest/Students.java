package io.zsk.oopTest;

/**
 * Created by shaokaizheng on 16/4/17.
 */
public class Students {
    private String name;
    private int id;
    private int age;
    private String gender;
    private int weight;

    public void study(){
        System.out.println(name + "在学习!");
    }

    public void sayHello(String sname){
        System.out.println(name + " say hello to " + sname);
    }

    public static void main(String[] args){
        Students s1 = new Students();
        s1.name = "zsk";
        s1.study();
        s1.sayHello("baibai");


        Students s2 = new Students();
        s2.name = "wang";
        s2.study();
        s2.sayHello("kaigege");
    }

}
