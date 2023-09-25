import java.util.*;
import java.io.*;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int i =0;
        System.out.println(" enter the length of the list =");
        int n = sc.nextInt();
        System.out.println("enter the elements of the linked list = ");
        for(i = 0; i < n; i++)
        {
            list.input(sc.nextInt());
        }
        if(list.ispalindromoe())
        {
            System.out.println(" it's a palindrome ");
        }
        else
        {
            System.out.println(" it's not a palindrome ");
        }
    }
    public void input(int data)
    {
        node dsa = new node(data);
        
        if(head == null)
        {
            head = dsa;
            return;
        }
        node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = dsa;

        
    }
    public boolean ispalindromoe()
    {
          
        node current = head;
        List<Integer>list1 = new ArrayList<>();
        while(current != null)
        {
            list1.add(current.data);
            current = current.next;
        }
        int low = 0;
        int last = list1.size()-1;
        while(low < last)
        {
            if(! list1.get(low).equals (list1.get(last)))
            {
                return false;
            }
            low = low+1;
            last = last-1;
            
        }
        return true;

    }

}