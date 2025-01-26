import java.util.*;

public class AddAtBottom{
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static  void push(int data){
        list.add(data);
        }
        //pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void AddBottom(int data,Stack<Integer> s){
        
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top=s.pop();
        AddBottom(data,s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(45);


        AddBottom(45,s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
           
            
        }
            
    }
    
}