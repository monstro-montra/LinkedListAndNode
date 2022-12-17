public class LinkedList<T> {
    //for a linked list, the topmost value is null.
    Node head;

    public void add(T data){ //add method to add to linked list
        Node newNode = new Node(); //create new node object which will contain data.
        newNode.setData(data);  //sets data to the container, newNode.
        newNode.setNext(null); //set next node to null

        if(head == null){ //if the head is null, aka if it is first object. aka there currently aren't any nodes in the list.
            head = newNode; // the head is = to newNode.
        } else { //otherwise
            //traverse until program reaches last node, then add new node
            Node last = head; //last = head.
            while (last.getNext() != null){ //while last @ next != null. //travel until you get a null value.
                last = last.getNext(); //set last = to last @ next. jump to next node continuously until you get a null value.
            }
            last.setNext(newNode); //set last.next = node
        }

    }

    public void show(){
        Node node = head;
        while(node.getNext() != null){
            System.out.println(node.getData()); //print data in node for each iteration.
            node = node.getNext(); //go to next node. continuously
        }
        System.out.println(node.getData()); //print data in the last node in the list.

    }

    public int howManyNodesRecursive(Node node){
        //base case in recursive method
        if(node == null){
            return 0;
        }
        //add one for every method call. each time it finds that node != null, add one.
        return 1 + howManyNodesRecursive(node.getNext());
    }

    public int count(){ //return the total count from the recursive method.
        return howManyNodesRecursive(head);
    }


}
