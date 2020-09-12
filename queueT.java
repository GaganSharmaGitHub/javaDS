import java.*;
class linkNode<T>{
     public T value;
    public linkNode next;
   linkNode(T val){
     value=val;
    }
   Boolean isLast(){
      return next==null;
     }
}
class Queue<T>{
    public linkNode<T> head; 
    public linkNode<T> tail; 
//constructor
  Queue(T[] args){
   for(T i : args){
        this.enqueue(i);
        }
  }
// enqueue
 public void enqueue(T  val){
linkNode<T> nn= new linkNode(val);
if(tail==null || head==null){
head=nn;
tail=nn;
}else{
tail.next=nn;
tail=nn;
}
}
// enqueue
 public T dequeue(){
T toSend=head.value;
head=head.next;
        System.out.println("dequeued"+toSend);
return toSend;
}
//print
public void show(){
    System.out.println("\n =============");
    linkNode<T> current=head;
    while(current!=null){
        System.out.println(current.value);
        current=current.next;
    }
    System.out.println("\n =============");
  }

}

class queueT{
public static void main(String[] args) {
    Queue<String> li= new Queue(args);
    li.show();
   li.dequeue();
   li.dequeue();
   li.dequeue();
    li.enqueue("something");
 li.show();
    }
}