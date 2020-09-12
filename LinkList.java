import java.*;
class linkNode<T>{
     public T value;
    public linkNode<T> next;
   linkNode(T val){
     value=val;
    }
   Boolean isLast(){
      return next==null;
     }
}
class LinkedList<T>{
    public linkNode<T> head; 
//constructor
   LinkedList(T[] args){
   for(T i : args){
        this.add(i);
        }
  }
    private linkNode<T> tail(){
   if(head==null){
    return null;
   }
    linkNode<T> current=head;
    while(current.next!=null){
     current=current.next;
     }
   return current;
   }
//add
  public void add(T ini){
   linkNode<T>  temp=new linkNode(ini);
    linkNode<T> tail=tail();
   if(tail==null){
   head=temp;    
   }else{
    tail.next=temp;
 }
       }
//at index
  public T atIndex(int index){
    linkNode<T> current=head;
    int i=0;
    while(current!=null && i<=index){
    if(index==i){
    return current.value;
    }
        current=current.next;
     i++;
    } 
return null;
  }
///replace at index
  public Boolean replaceAtIndex(int index,T v){
    linkNode<T> current=head;
    int i=0;
    while(current!=null && i<=index){
    if(index==i){
    current.value=v;
   return true;
    }
        current=current.next;
     i++;
    } 
return false;
  }

///remove at index
  public Boolean removeAtIndex(int index){
if(index==0){
head=head.next;
return true;
}
    linkNode current=head;
    int i=0;
    while(current!=null && i<=index){
    if(index==i+1){
        System.out.println(current.value);
          linkNode prev=current;
          linkNode curr=current.next;
          linkNode next=curr.next;
          prev.next=next;
   return true;
    }
        current=current.next;
     i++;
    } 
return false;
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

class LinkList{
public static void main(String[] args) {
    LinkedList<String> li= new LinkedList(args);
    li.removeAtIndex(6);
      li.show();
    }
}