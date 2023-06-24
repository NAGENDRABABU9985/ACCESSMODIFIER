package org.example.package1;

public class Class {
    public int publicdatatype;   //it can access same class another class sub class
    public String publicdatatype2;//other package class and other package sub class
    private int age; //private data member can access same class NOT OTHER CLASS,SUB CLASS
    private String name; //NOT IN OTHER PACKAGE CLASS AND SUB CLASS;
        int defaultage=24; // not in other package   IT IS DEFAULT
        String defaultString="Anusha";


    protected int AGE2=23;                    // SAME ASA DEFAULT BUT EXTRA IN OTHER PACKAGE SUBCLASS
    protected String NAME2="Rajeswari";
    public static void main(String[] args)
    {

        Class obj=new Class();
        //public attributes/variables

        System.out.println(obj.publicdatatype);
        System.out.print(obj.publicdatatype2);


        //peivate variables

        obj.age=24;
        obj.name="nagendra";
        System.out.println(obj.age);
        System.out.print(obj.name);

        //default members
        System.out.println(obj.defaultage);
        System.out.print(obj.defaultString);

        //protected members
        System.out.println(obj.AGE2);
        System.out.print(obj.NAME2);


    }

}
