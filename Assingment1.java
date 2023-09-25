import java.util.*;
class LinkedList
{
    node head;
    class node
    {
        int data;
        node next;
        node(int c)
        {
            data = c;
            next = null;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("enter the linkedlist = ");
        list.input(sc.nextInt());
        list.input(sc.nextInt());
        list.input(sc.nextInt());
        list.input(sc.nextInt());
        int k = sc.nextInt();
        list.display(k);
    }
    public void input(int data)
    {
        node element = new node(data);
        if(head == null)
        {
            head = element;
            return;
        }
        node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = element;
    }
    public void display(int k)
    {
        int x = 0;
        node current = head;
        while(current != null)
        {
            if(current.data == k)
            {
                x++;
            }
            current = current.next;
        }
        if(x == 1)
        {
            System.out.println(" the element is present ");
        }
        else
        {
            System.out.println(" not ");
        }
    }
}