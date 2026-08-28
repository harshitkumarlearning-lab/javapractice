package linkedlist1;
import java.util.Scanner;
class node {
    int val;
    node next;
    node(int val){
        this.val= val;
        this.next=null;
    }
}
class hk {
    int size;
    node head;
    node tail;
    void insertend(int val){
        node temp = new node(val);
        if(head==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertstart(int val){
        node temp = new node(val);
        if(head==null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int idx,int val){
        node x = new node(val);
        node temp = head;
        if(idx==0){
            insertstart(val);
            return;
        }
        if(idx==size-1){
            insertend(val);
            return;
        }
        if(idx<0||idx>=size){
            System.out.println("Error");
        }
        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
        x.next = temp.next;
        temp.next= x;
        size++;
    }
    void display(){
        node temp = head;
        while(temp!=null){
            System.out.print("->"+temp.val);
            temp = temp.next;
        }
    }
}
public class sll2 {
    public static void main(String[] args) {
    hk list = new hk();
    int n;
    int idx;
    int l;
    Scanner sc = new Scanner(System.in);
    do{
        System.out.print("1->Insert at end\n2->Insert at start\n3->insert at ith pos\n4->access the value\n5->Change the value\n6->display the value");
        int ch = sc.nextInt();
        switch(ch){
            case 1: 
                System.out.print("Enter element : ");
                n = sc.nextInt();
                list.insertend(n);
                break;
            case 2:
                System.out.print("Enter element : ");
                n = sc.nextInt();
                list.insertstart(n);
                break;
            case 3:
                System.out.print("enter the index");
                idx = sc.nextInt();
                System.out.print("Enter element : ");
                n = sc.nextInt();
                list.insert(idx,n);
                break;
            // case 4:
            //     System.out.print("enter the index of element : ");
            //     idx = sc.nextInt();
            //     //int ans = list.get(idx);
            //     //System.out.println(ans);
            //     break;
            // case 5:
            //     System.out.print("enter the index");
            //     idx = sc.nextInt();
            //     System.out.print("Enter element : ");
            //     n = sc.nextInt();
            //     //list.set(idx,n);
            //     break;
            case 6:
                System.out.println("Your answer is");
                list.display();
                break;
            default: 
                break;
        }
        System.out.print("Do you want to continue(1): ");
        l = sc.nextInt();
    }
        while(l==1);
    }
}
