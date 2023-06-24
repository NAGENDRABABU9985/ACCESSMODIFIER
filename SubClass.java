package org.example.package1;

public class SubClass extends Class {
    public static void main(String[] args)
    {
        SubClass obj1=new SubClass();
        Class obj=new Class();
//        //public datamember
//
        System.out.println(obj.publicdatatype);
        System.out.print(obj.publicdatatype2);
//
//        //private datamember
//
////        System.out.println(obj.age);
////        System.out.print(obj.name);
//
//        //default members
        System.out.println(obj.defaultage);
        System.out.print(obj.defaultString);

        //protected members
        System.out.println(obj1.AGE2);
        System.out.print(obj.NAME2);
    }
}
