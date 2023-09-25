import java.util.*;
class Linkedlist
{
    node head;
    
    class node
    {
        int data;
        node next;

        node(int c )
        {
            data = c;
            next = null;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        
        System.out.println(" enter the elements of the list = ");

        list.input(sc.nextInt());
        list.input(sc.nextInt());
        list.input(sc.nextInt());
        list.input(sc.nextInt());
        
        list.delete();

        list.display();

    }
    public void input(int data)
    {
        node elements = new node(data);

        if(head == null)
        {
            head = elements;
            return;
        }
        node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = elements;
    }
    public void display()
    {
        node current = head;
        
        while(current != null)
        {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }
    public void delete()// delete the  same elements ;
    {
        node current = head;
        
        while(current != null && current.next != null)
        {
            if(current.data == current.next.data)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
    }
}