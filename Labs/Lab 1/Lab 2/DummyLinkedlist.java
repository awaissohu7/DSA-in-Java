

public class DummyLinkedlist {
    char [] arr=new char[5];
    int noe=0;
    int size=arr.length;
    char push(char data){
        if(size>noe){
            arr[noe]=data;
        }
        else {
            System.out.println("Array is Full");
        }
        noe++;
        return 0;
    }
    char pop(){
        return arr[--noe];
    }
    char top(){
        return arr[noe];
    }
    boolean isempty(){
        if(noe<size){
            return true;
        }
        return false;
    }
    char print(){
        for(int i=0;i<noe;i++){
        System.out.println(arr[i]);
    }return arr[--noe];
    }
}
class Main{

    public static void main(String[] args) {
        DummyLinkedlist s = new DummyLinkedlist {
        s.push('b');
        s.push('a');
        s.push('c');
        s.push('d');
        s.push('c');
        s.push('c');
s.print();
    }


}
}
