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

    good khopadi;
    class good
    {   
        int tata;
        good text;
        good(int x)
        {
            tata = x;
            text = null;
        }
    }

    last_node  last_head;
    class last_node
    {
            int last_data;
            last_node last_next;
            last_node(int t)
            {
                last_data = t;
                last_next = null;
            }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();
        
        System.out.println(" enter the length of both of the linked list = ");
        int arr1 = sc.nextInt();
        int i=0;

        System.out.println("enter the values for list 1=");
        for(i = 0; i < arr1 ; i++)
        {
            list1.input(sc.nextInt());
        }
        
        System.out.println(" enter  the values for list 2=");
        for(i = 0; i < arr1 ; i++)
        {
            list2.input2(sc.nextInt());
        }
        int n = list1.convert1();
        int m = list2.convert2();

        int xy = m + n;
        System.out.println(" the sum is "+ (n+m));
        int p,q=0;

        int arr [] = new int[254];
        int j = 0;
        while(xy != 0)
        {
            p = xy % 10;
            arr[j] = arr[j] * 10 + p;
            xy = xy / 10;
            j++;
            
        }
       // Arrays.reverse(arr);
        for(i = 0; i < j; i++)
        {
            list3.input_last(arr[i]);
        }

        System.out.println(" the last linkedlist is = ");
        list3.display();
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
    public void input2(int tata)
    {
        good dta = new good(tata);
        if(khopadi == null)
        {
            khopadi = dta;
            return;
        }

        good tens = khopadi;
        while(tens.text != null)
        {
            tens = tens.text;
        }
        tens.text = dta;
    }
    public int convert1()
    {
        node current = head;
        int sum = 0;
        int tep = 0;

        while(current != null)
        {
            tep = current.data % 10;
            sum = sum * 10 + tep;
            current.data = current.data / 10;
            current = current.next;
        }
        return sum;       
    }
    public int convert2()
    {
        good laga = khopadi;
        int rep = 0;
        int num = 0;
        
        while(laga != null)
        {
            rep = laga.tata % 10;
            num = num * 10 + rep;
            laga.tata = laga.tata / 10;
            laga = laga.text;
        }
        
        return num;

    }
    public void input_last(int last_data)
    {
        last_node you = new last_node(last_data);
        /*(last_head == null)
        {
            last_head = you;
            return;
        }
        last_node tempo = last_head;
        while(tempo.last_next != null)
        {
            tempo = tempo.last_next;
        }
        tempo.last_next = you;*/
        you.last_next = last_head;
        last_head = you;
    }

    
    public void display()
    {
        last_node  last_current = last_head;
        while(last_current != null)
        {
            System.out.println(last_current.last_data + " ");
            last_current = last_current.last_next;
        }

    }

    
}