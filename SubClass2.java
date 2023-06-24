package org.example.package2;

import org.example.package1.Class;

public class SubClass2 extends Class {
    public static void main(String[] args)
    {
        SubClass2 obj=new SubClass2();
        Class obj1=new Class();
        System.out.println(obj.publicdatatype);
        System.out.print(obj.publicdatatype2);
        //PRIVATE MEMBERS
//        System.out.println(obj.age);
//        System.out.print(obj.name);
//
//        //default members
//        System.out.println(obj.defaultage);
//        System.out.print(obj.defaultString);

        //protected members
        System.out.println(obj.AGE2);
        System.out.print(obj.NAME2);

    }



}
