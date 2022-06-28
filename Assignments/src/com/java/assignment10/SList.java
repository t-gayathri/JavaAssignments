package com.java.assignment10;

public class SList<T> {
    Node<T> head;
    Node<T> tail;

    public void insert(T data)
    {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;

        if(head == null)
        {
            head = node;
            tail = head;
        }
        else
        {
            Node<T> temp = head;
            while (temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = node;
            tail = node;
        }
    }

    public void showData()
    {
        try
        {
            Node<T> temp2 = head;
            while(temp2.next!=null)
            {
                System.out.println(temp2.data);
                temp2 = temp2.next;
            }
            System.out.println(temp2.data);
        }
        catch (NullPointerException e)
        {
            System.out.println("Sorry an Empty list ");
        }
    }

    public void removeData(T data)
    {
        if (head == null)
        {
            System.out.println("Empty List cannot be deleted");
            return;
        }
        else if ((head.data).equals(data))
        {
            head = head.next;
            if (head == null)
                tail = null;
        }
        else
        {
            Node<T> prev = head;
            Node<T> temp3 = head.next;
            while (temp3 != null)
            {
                if ((temp3.data).equals(data))
                    break;
                prev = prev.next;
                temp3 = temp3.next;
            }
            if (temp3 == null)
            {
                System.out.println("No element Found");

            }
            else if (temp3 == tail)
            {
                tail = prev;
                tail.next = null;
            }
            else
                prev.next = temp3.next;
        }
    }
}
