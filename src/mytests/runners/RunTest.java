package mytests.runners;

import mytests.mytestclasses.*;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/16/2015.
 * Project: equals_hashcode_gen1
 * *******************************
 */
public class RunTest {
    public static void main(String[] args) {
        System.out.println("--------------Integer[][][]----------------");
        Integer[][][] arr1 = new Integer[][][]{new Integer[][]{new Integer[]{1,2,3}},new Integer[][]{new Integer[]{4,5,6}}};
        Integer[][][] arr2 = new Integer[][][]{new Integer[][]{new Integer[]{1,2,3}},new Integer[][]{new Integer[]{4,5,6}}};
        Integer[][][] arr3 = new Integer[][][]{new Integer[][]{new Integer[]{7,8,9}},new Integer[][]{new Integer[]{10,11,12}}};
        NestedArraysTest1 obj0 = new NestedArraysTest1(arr1);
        NestedArraysTest1 obj1 = new NestedArraysTest1(arr1);// same object used as contents
        NestedArraysTest1 obj2 = new NestedArraysTest1(arr2);// object with same contents used as contents
        NestedArraysTest1 obj3 = new NestedArraysTest1(arr3);// object with different contents
        System.out.println("obj0.equals(obj1): " + obj0.equals(obj1));
        System.out.println("obj0.hashCode()==obj1.hashCode()" + (obj0.hashCode()==obj1.hashCode()));
        System.out.println("obj0.equals(obj2): " + obj0.equals(obj2));
        System.out.println("obj0.hashCode()==obj2.hashCode()" + (obj0.hashCode()==obj2.hashCode()));
        System.out.println("obj0.equals(obj3): " + obj0.equals(obj3));
        System.out.println("obj0.hashCode()==obj3.hashCode()" + (obj0.hashCode()==obj3.hashCode()));
        //---------------------------------------------------------------------------------------------
        System.out.println("--------------int[][]----------------");
        int[][] a1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] a2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] a3 = new int[][]{{11,12,13},{14,15,16}};
        NestedArrayTest0 o0 = new NestedArrayTest0(a1);
        NestedArrayTest0 o1 = new NestedArrayTest0(a1);// same object used as contents
        NestedArrayTest0 o2 = new NestedArrayTest0(a2);// object with same contents used as contents
        NestedArrayTest0 o3 = new NestedArrayTest0(a3);// object with different contents
        System.out.println("o0.equals(o1): " + o0.equals(o1));
        System.out.println("o0.hashCode()==o1.hashCode(): " + (o0.hashCode()==o1.hashCode()));
        System.out.println("o0.equals(o2): " + o0.equals(o2));
        System.out.println("o0.hashCode()==o2.hashCode(): " + (o0.hashCode()==o2.hashCode()));
        System.out.println(o0.hashCode());
        System.out.println(o2.hashCode());
        System.out.println("o0.equals(o3): " + o0.equals(o3));
        System.out.println("o0.hashCode()==o3.hashCode(): " + (o0.hashCode()==o3.hashCode()));
        //----------------------------------------------------------------------------------------
        System.out.println("--------------List<Integer[][]>----------------");
        List<Integer[][]> l1 = new ArrayList<Integer[][]>();
        l1.add(new Integer[][]{new Integer[]{1,2,3,4},new Integer[]{5,6,7,8}});
        l1.add(new Integer[][]{new Integer[]{1,2,3,4},new Integer[]{5,6,7,8}});
        List<Integer[][]> l2 = new ArrayList<Integer[][]>(); // same content as l - considered to be different objects really...
        l2.add(new Integer[][]{new Integer[]{1,2,3,4},new Integer[]{5,6,7,8}});
        l2.add(new Integer[][]{new Integer[]{1,2,3,4},new Integer[]{5,6,7,8}});
        List<Integer[][]> l3 = new ArrayList<Integer[][]>();
        l3.add(new Integer[][]{new Integer[]{11,12,13,14},new Integer[]{15,16,17,18}});
        l3.add(new Integer[][]{new Integer[]{10,20,30,40},new Integer[]{50,60,70,80}});
        ListOfArraysTest1 ob0 = new ListOfArraysTest1(l1);
        ListOfArraysTest1 ob1 = new ListOfArraysTest1(l1);
        ListOfArraysTest1 ob2 = new ListOfArraysTest1(l2);
        ListOfArraysTest1 ob3 = new ListOfArraysTest1(l3);
        System.out.println("ob0.equals(ob1): " + ob0.equals(ob1));
        System.out.println("ob0.hashCode()==ob1.hashCode(): " + (ob0.hashCode()==ob1.hashCode()));
        System.out.println("ob0.equals(ob2): " + ob0.equals(ob2));
        System.out.println("ob0.hashCode()==ob2.hashCode(): " + (ob0.hashCode()==ob2.hashCode()));
        System.out.println("ob0.equals(ob3): " + ob0.equals(ob3));
        System.out.println("ob0.hashCode()==ob3.hashCode(): " + (ob0.hashCode()==ob3.hashCode()));
        //----------------------------------------------------------------------------------------
        System.out.println("--------------SomeClass[]----------------");
        UtilClass1 uobj1 = new UtilClass1();
        UtilClass1 uobj2 = uobj1;
        UtilClass1 uobj3 = new UtilClass1();
        UtilClass1[] utilClasses1 = new UtilClass1[]{uobj1,null};
        UtilClass1[] utilClasses2 = new UtilClass1[]{uobj2,null};
        UtilClass1[] utilClasses3 = new UtilClass1[]{uobj3,uobj1};
        ObjectArrayTest1 oa0 = new ObjectArrayTest1(utilClasses1);
        ObjectArrayTest1 oa1 = new ObjectArrayTest1(utilClasses1);
        ObjectArrayTest1 oa2 = new ObjectArrayTest1(utilClasses2);
        ObjectArrayTest1 oa3 = new ObjectArrayTest1(utilClasses3);
        System.out.println("oa0.equals(oa1): " + oa0.equals(oa1));
        System.out.println("oa0.hashCode()==oa1.hashCode(): " + (oa0.hashCode()==oa1.hashCode()));
        System.out.println("oa0.equals(oa2): " + oa0.equals(oa2));
        System.out.println("oa0.hashCode()==oa2.hashCode(): " + (oa0.hashCode()==oa2.hashCode()));
        System.out.println("oa0.equals(oa3): " + oa0.equals(oa3));
        System.out.println("oa0.hashCode()==oa3.hashCode(): " + (oa0.hashCode()==oa3.hashCode()));
    }
}
