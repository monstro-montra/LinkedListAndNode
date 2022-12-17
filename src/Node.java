public class Node<T>
{
    private T data; //data that goes ino
    private Node next;

    public Node(){ //no ars constructor

    }

    //getters and setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
