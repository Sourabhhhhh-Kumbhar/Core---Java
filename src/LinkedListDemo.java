//Node: one box in the list, holds data and a link to the next box
class Node
{
    int data; //the value stored
    Node next; //reference to the next node(null if last)

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList
{
    Node head; //first node of the list(null if list is empty)

    //And at the beginning
    void addFirst(int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;    //New node points to the old first node
        head = newNode;         //New node becomes the head
    }

    //Add at the End
    void addLast(int value)
    {
        Node newNode = new Node(value);
        if(head == null)        //empty list new node is the head
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)    //Walk till the last node
        {
            temp = temp.next;
        }
        temp.next = newNode;        //Attach at the End
    }

    //Delete The First Node
    void deleteFirst()
    {
        if(head != null)
        {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    //Delete the first node that has this value
    void delete(int value)
    {
        if(head == null) return;

        if(head.data == value)  //Value is in the end
        {
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.data != value)
        {
            temp = temp.next;
        }
        if(temp.next != null)
        {
            temp.next = temp.next.next;     //Skip the node we want to remove
        }
        else
        {
            System.out.println(value + "Not found");
        }
    }

    //Check if value exists
    boolean search(int value)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == value) return true;
            temp = temp.next;
        }
        return false;
    }

    //Print the whole list
    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.display();             // 5 -> 10 -> 20 -> 30 -> null;

        list.delete(20);
        list.display();            // 5 -> 10 -> 30 -> null;

        list.deleteFirst();
        list.display();         // 10 -> 30 -> null;

        System.out.println("Has 30? " + list.search(30));   //true
        System.out.println("Has 99? " + list.search(99));   //false
    }
}