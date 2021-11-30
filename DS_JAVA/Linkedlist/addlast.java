import java.io.*;
import java.util.*;

public class addlast {
    //creating node object
  public static class Node {
    int data;
    Node next;
  }
  //creating linklist class it has variables and method..
  public static class LinkedList {
    Node head;
    Node tail;
    int size;
//add method
    void addLast(int val) {
      // Write your code here
      //creating node instance
      Node node = new Node();
      //putting values in new node
      node.data = val;
      node.next = null;
        //this condition if the size of ll is zero 
      if(size==0)
      {
          //if in ll there is only one node then head and tail both are points to that node only...
          head = tail = node;
      }
      else{
        //  if in ll nodes are greater than one then tail will update..
      tail.next = node ;
      tail = node ;
    }
    //by adding the node we have update size...
      size++;
    }
  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
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
      } 
      str = br.readLine();
    }

    testList(list);
  }
}