package com.tnsif.demo.day17.Annotations;

public class Main {
public static void main(String[] args) throws Exception {

   Demo d = new Demo();
   Test t = d.getClass().getMethod("show").getAnnotation(Test.class);

   System.out.println(t.value());
   d.show();
}
}
