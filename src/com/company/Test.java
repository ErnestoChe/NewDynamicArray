package com.company;

public class Test {
}
class Main{
    public static void main(String[] args){
        DynArray<Integer> a = new DynArray<Integer>(Integer.class);
        //a.remove(0);
        a.log();
        System.out.println(a.capacity);
        System.out.println(a.count);
        a.insert(0, 123);
        a.statLog();
        for(int i = 0; i<35;i++){
            a.append(i);
        }
        a.statLog();
        a.insert(0, 123);
        a.statLog();
        a.remove(0);
        a.statLog();
    }
}
