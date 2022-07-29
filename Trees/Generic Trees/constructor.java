import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class constructor
{
     static class Node{
            int data;
            ArrayList<Node>children=new ArrayList<>();
            
        }

        public static void display(Node node){
                String str=node.data+"-->";
                for(Node child:node.children){
                    str+=child.data+",";
                }
                
                System.out.println(str);
                for(Node child:node.children){
                    display(child);
                }
        }


	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        
       Node root=null;
       Stack<Node>st=new Stack<>();
       for(int i=0;i<arr.length;i++){
           int num=arr[i];
           if(num==-1){
               st.pop();
           }
           else{
               Node t=new Node();
               t.data=num;
               if(st.size()>0){
                   st.peek().children.add(t);
               }
               else{
                   root=t;
               }
               st.push(t);
           }
       }

              display(root);

        
	}
}