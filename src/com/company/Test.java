package com.company;

public class Test {
}
class Main{
    public static void main(String[] args){
        DynArray<Integer> a = new DynArray<Integer>(Integer.class);
        System.out.println(a.capacity);
        System.out.println(a.count);
        for(int i = 0; i< 8; i++){
            a.append(i);
        }
        a.statLog();
        if(a.capacity == 16 && a.count == 8){
            System.out.println("passed");
        }
        a.insert(111, 0);
        if(a.array[0] == 111 && a.count == 9 && a.capacity == 16){
            System.out.println("passed ins in [0]");
        }else System.out.println("MISTAKE!!!11!!1(111)");
        a.insert(222, a.count);
        if(a.array[a.count-1] == 222 && a.count == 10 && a.capacity == 16){
            System.out.println("passed ins in [last]");
        }else System.out.println("MISTAKE!!!11!!1(222)");
        a.insert(333, 5);
        if(a.array[5] == 333 && a.count == 11 && a.capacity == 16){
            System.out.println("passed ins in [mid]");
        }else System.out.println("MISTAKE!!!11!!1(333)");
        for(int i = 0; i<5; i++){
            a.append(i);
        }
        if(a.capacity == a.count && a.capacity == 16){
            System.out.println("passed with balance in all things");
        }else System.out.println("BALANCE MISTAKE!!11!! REBOOTING SYSTEM...");

        a.append(2);
        if(a.capacity == 32 && a.count == 17){
            System.out.println("passed capacity x2");
        }else System.out.println("CAPACITY  X2 MISTAKE !!!!");

        a.remove(2);
        if(a.count * 2 == a.capacity){
            System.out.println("passed with balance in all things... again?");
        }else System.out.println("BALANCE MISTAKE!!11!! REBOOTING SYSTEM...");
        a.remove(2);
        if(a.count == 15 && a.capacity == 21){
            System.out.println("passed capacity / 1.5");
        }else System.out.println("failure");

        for(int i =0;i<5; i++){
            a.remove(2);
        }
        if(a.capacity == 16 && a.count == 10){
            System.out.println("passed MINIMUM CAPACITY  = 16, KAK VI NE ZAPOMNITE????");
        }else System.out.println("ili ne 16??");

        for(int i =0;i<6; i++){
            a.append(i);
            //a.statLog();
        }
        a.insert(444, 5);
        if(a.count == 17 && a.capacity ==32){
            System.out.println("test 2.1  passed");
        }else System.out.println("test 2.1 failed");
        a.remove(2);
        a.remove(2);
        a.statLog();
        for(int i = 0; i<6; i++){
            a.append(i);
        }
        a.statLog();
        a.append(555);
        if(a.count == 22 && a.capacity == 42){
            System.out.println("test 2.2 passed");
        }else System.out.println("test 2.2 failure");
        a.statLog();
        for(int i = 0; i<10; i++){
            a.append(i*111);
        }
        a.statLog();
        a.remove(5);
        if(a.capacity == 42 && a.count == 31){
            System.out.println("test 4.1 passed");
        }else System.out.println("test 4.1 failure");
        for(int i = 0; i<10; i++){
            a.remove(i);
            //a.statLog();
        }
        a.remove(2);
        a.statLog();
        if(a.capacity == 28){
            System.out.println("test 5.1 passed");
        }else System.out.println("test 5.1 failure");
        a.remove(2);
        a.remove(2);
        a.statLog();
        a.remove(2);
        a.remove(2);
        a.statLog();
        a.remove(2);
        a.remove(2);
        a.statLog();
        a.remove(2);
        if(a.capacity == 18 && a.count == 13){
            System.out.println("test 5.2 passed");
        }else System.out.println("test 5.2 failure");
        a.remove(2);
        a.statLog();
        a.remove(2);
        a.statLog();
        a.remove(2);
        a.statLog();
        a.remove(2);
        a.statLog();
        a.remove(2);
        a.statLog();
        if(a.capacity == 16 && a.count == 8){
            System.out.println("test 5.3 passed");
        }else System.out.println("test 5.3 failure");

        //a.remove(-5);
        DynArray<Integer> b = new DynArray<Integer>(Integer.class);
        b.remove(0);
    }
}
