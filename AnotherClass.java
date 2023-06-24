package org.example.package1;

public class AnotherClass {
    public static void main(String[] args)
    {
        Class obj=new Class();
        // PUBLIC VARIABLES

        System.out.println(obj.publicdatatype);
        System.out.print(obj.publicdatatype2);

        // PRIVATE VARIBLES

//        System.out.println(obj.age);
//        System.out.print(obj.name);

        //default members
        System.out.println(obj.defaultage);
        System.out.print(obj.defaultString);

        //protected members
        System.out.println(obj.AGE2);
        System.out.print(obj.NAME2);
    }
}
