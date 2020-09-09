package com.viktor;

import org.junit.Assert;

import java.util.*;
import java.util.stream.Collectors;

class One {
    One (){};
    public void print() {
        System.out.println("1");
    }
}

class Two extends One {
    Two (){};
    @Override
    public void print() {
        System.out.println("2");
    }
}

public class Main {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    public static void main(String[] args) {

        Dog dog = new Dog("Мухтар");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + dog.isCollarPutOn + "\r\n Поводок надет? "
                    + dog.isLeashPutOn + "\r\n Намордник надет? " + dog.isMuzzlePutOn);
        }

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Murzik", 4, "Red");
        cat1.setAge(6);
        cat1.setColor("White");
        cat1.setName("Bim");
        System.out.println(cat2.getColor());

        String str = "Mississippi";
        System.out.println(str); // prints Mississippi

        str = str.replace("i", "!");
        System.out.println(str); // prints M!ss!ss!pp!

        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");
        myHashMap.forEach((k,v)-> System.out.println("Key : " + k + " Value : " + v));
        myHashMap.forEach((k,v)-> {
            if(k.equals("Lena")){
                System.out.println(v);
            }
        });


        List<Integer> myList = Arrays.asList(7,4,3,9,5,6,7,4);
        HashSet<Integer> hashSet = new HashSet<>(myList);
        TreeSet<Integer> treeSet = new TreeSet<>(myList);

        hashSet.forEach(x -> System.out.print(x + " "));
        System.out.println();
        treeSet.forEach(x -> System.out.print(x + " "));

        One one = new One();
        Two two = new Two();
        one.print();
        two.print();

        myStaticMethod();
        Methods methods = new Methods();

        methods.factorial(7);
        methods.printString("Mapa", 5);
        methods.isNumberEquals(756);

        Integer[] array = new Integer[9];
        for (Integer i: array) {
            System.out.print(i);
        }

        List<Integer> list = Arrays.asList(array);
//        list.forEach(System.out::println);

        int arr[] = {2,4,6,8,10};

        ArrayMethods arrayMethods = new ArrayMethods();
        arrayMethods.summKr(arr,2);

        List<Integer> arrays = Arrays.asList(2, 5, 7, 8, 9);
//        Integer sum = arrays.stream().filter(x->x%2==0).mapToInt(i -> Integer.valueOf(i)).sum();
        Integer sum = arrays.stream().filter(x->x%2==0).mapToInt(Integer::valueOf).sum();
        List<Integer> arrayFiltered = arrays.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("FilteredArray: " + arrayFiltered);

        String[] arrayy = {"1","2"};
        int[] intArray = Arrays.stream(arrayy).mapToInt(i -> Integer.parseInt(i)).toArray();

        int arr1[] = {-2,4,-6,2,6};
        arrayMethods.summKr(arr1);

        int size = arrayMethods.summKr2(arr1).length;
        System.out.println("Value is: " + size);
        System.out.println("Sum is: "+ sum);

        System.out.println(Arrays.toString(arrayMethods.count(arr1)));

        int arr2[] = {2,4,6,8};
        System.out.println(Arrays.toString(arrayMethods.changeArray(arr2)));

        methods.getDistance(1,1,2,2);
        methods.index(3.0,0.0);
//        Assert.assertFalse(methods.isTriangle(-1,2.5,4.5));
        Assert.assertTrue("Not True", methods.isTriangle(7,10,5));

        Assert.assertEquals("Expected doesn't equal Actual", 120, methods.factorial(5));
        Assert.assertNotEquals("Expected doesn't equal Actual", 123, methods.factorial(5));

//        System.out.println(methods.isTriangle(0,10,5));

//        Triangle triangle = new Triangle("Triangle", 7,10,5);
//        System.out.println("Square is: " + triangle.getSquare());
//
//        Rectangular rectangular = new Rectangular("Rectangular", 10,5);
//        System.out.println("Square is: " + rectangular.getSquare());




    }
}
