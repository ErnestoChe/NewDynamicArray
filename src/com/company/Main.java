package com.company;


import java.lang.reflect.Array;

class DynArray<T>
{
    public T [] array;
    private T[] tmp;
    public int count;
    public int capacity;
    public Class clazz;

    public DynArray(Class clazz)
    {
        this.clazz = clazz;
        this.count = 0;
        this.capacity = 16;
        makeArray(16);
    }

    public void makeArray(int new_capacity) {
        array = (T[]) Array.newInstance(this.clazz, new_capacity);
    }

    public T getItem(int index) {
        if (index >= count || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);}
        else return array[index];
    }

    public void append(T element){
        if(count+1>capacity){
            incSize();
        }
        array[count++] = element;
    }
    public void incSize(){
        int current = count;
        int newSize = current * 2;
        tmp = array;
        makeArray(newSize);
        for(int i =0; i<tmp.length; i++){
            array[i] = tmp[i];
        }
        capacity = newSize;
    }
    public void insert(int i, T ins){
        if (i > count || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + count);}
        else{
            if(count+1>capacity){
                incSize();
            }
            for(int q = count; q > i; q--){
                array[q] = array[q-1];
            }
            array[i] = ins;
            count++;
        }
    }

    public void remove(int index){
        if (index > count || array[0] == null || index<0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);}
        else {
            count--;
            for(int q = index; q < count; q++){
                array[q] = array[q+1];
            }
            if (count * 2 < capacity) {
                capacity /=1.5;
                if(capacity<16){
                    capacity = 16;
                }
                tmp = array;
                makeArray(capacity);
                for(int i = 0; i<capacity; i++){
                    array[i] = tmp[i];
                }
            }
        }
    }
    public void log(){
        if(array[0] == null){
            System.out.println("empty array");
        }
        for(int i = 0; i<count; i++){
            System.out.print(getItem(i)+" ");
        }
        System.out.println();
    }
    public void statLog(){
        log();
        System.out.println(capacity+" capacity");
        System.out.println(count+ " count");
    }
}
