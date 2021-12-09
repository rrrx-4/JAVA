import java.util.*;

public class myarraylist{
    public static class MyArrayList
 {
        int size;
        int[] data;
    

    static final int  DEFAULT_CAPACITY = 5;

     MyArrayList()
    {
        this(DEFAULT_CAPACITY);
    }

     MyArrayList(int val)
    {
        size = 0;
        data = new int[val];
    }

    void set(int idx, int d){
        if(idx<0 || idx>=size){
        System.out.println("Invalid argument");
        return;}
        data[idx] = d;

    }

    int size(){
        return size;
    }

    int get(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid argument");
            return -1;}
        return data[idx];
    }

    void display(){
        for(int i=0; i<size; i++)
        {
            System.out.print(data[i]+" ");
        }
        System.out.println(" .");
    }

    void add(int idx, int d){

        if(idx<0 || idx>size){
            System.out.println("Invalid argument");
            return ;}

        if(size==data.length){
            int[] nd = new int[2 * data.length];

            System.out.println("Resizing up");
            for(int i=0; i<size; i++)
            {
                nd[i] = data[i];
            }
            data = nd;
        }

        for(int i=size; i>idx; i--)
        {
            data[i] = data[i-1];
        }
        data[idx] = d;
        size++;
    }

    void remove(int idx){

        for(int i=idx; i<size-1; i++)
        {
            data[idx] = data[idx+1];
        }
        data[size-1] = 0;
        size--;

        if(size==data.length/4)
        {
            int[] nd = new int[data.length/2];

            for(int i=0; i<size; i++)
            {
                nd[i] = data[i];
            }
            data = nd;
        }
    }
 }

    public static void main(String[] args) {
        // Write your code here
        MyArrayList list = new MyArrayList(4);
        list.add(0, 10);
        list.display();
        list.add(1, 20);
        list.display();
        list.add(2, 30);
        list.display();
        list.add(3, 40);
        list.display();
        list.add(4, 50);
        list.display();
    
        list.set(2, 300);
        list.display();
    
        list.add(2, 3000);
        list.display();
    
        list.add(4, 88);
        list.display();
    
        list.add(6, 34);
        list.display();
    
        list.add(2, 77);
        list.display();
    
        list.remove(1);
        list.display();
    
        list.remove(1);
        list.display();
    
        list.remove(1);
        list.display();
    
        list.remove(1);
        list.display();
    
        list.remove(1);
        list.display();
    
        list.remove(1);
        list.display();
    
        list.remove(1);
        list.display();
    
        list.add(1, 100);
        list.display();
    
        list.add(2, 200);
        list.display();
    
        list.add(0, 50);
        list.display();
      
    
      }
}