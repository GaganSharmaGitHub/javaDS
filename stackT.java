import java.*;
class stackNode<T>{
public T value;
public stackNode below;
}
class stack<T>{
public stackNode<T> head;
stack(T[] args){
   for(T i : args){
        this.push(i);
        }
  }
public void push(T ini){
 stackNode<T>  temp=new stackNode();
   temp.value=ini;
  temp.below=head;
  head=temp;
   }
public T pop(){
if(head==null){
return null;
}
stackNode<T> temp= head.below;
T val=head.value;
head= temp;
return val;
}
public void show(){
stackNode<T> current=head;
while(current!=null){
System.out.println(current.value);
current=current.below;
}
System.out.println("\n =============");
  }
}

class stackT{
public static void main(String[] args) {
stack<String> st= new stack(args);
st.show();
    }
}