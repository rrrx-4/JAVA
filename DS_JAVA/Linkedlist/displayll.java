import java.io.*;
import java.util.*;

public class displayll {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size(){
      // write code here
      //return size variable
      return size;
    }

    public void display(){
      // write code here
      //for display ll we use loop first creating node object and it points to head i.e first node of ll and then we print data value of that node and update node by node.next.. till last node and last node have null in his next value so then we node is equal to null we stop the loop
      for(Node temp=head; temp!=null; temp=temp.next)
      {
          System.out.print(temp.data+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      }
      str = br.readLine();
    }
  }
}