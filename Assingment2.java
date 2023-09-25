import java.util.*;
class Linkedlist
{
    node head;
    
    class node 
    {
        int data;
        node next;

        node (int c)
        {
            data = c;
            next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        list.input(sc.nextInt());
        list.input(sc.nextInt());
        list.input(sc.nextInt());
        list.input(sc.nextInt());
        
        System.out.println(" enter the data and the position = ");
        list.newinput(sc.nextInt(),sc.nextInt());

        System.out.println(" the updated list is =");
        list.display();
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
    public void newinput(int data,int position)
    {
        node daat = new node(data);

        node current = head;
         
        if(position == 0)
        {
            newdata.next = head;
            head = newdata;
            return;
        }

        int i=0;
        while(current != null && i < position-1)
        {
            daat = newdata.next;
            i++;
        }

        newdata.next = current.next;
        current.next = newdata;
    }
    public void display()
    {
        node current = head;
        while( current != null)
        {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }
}