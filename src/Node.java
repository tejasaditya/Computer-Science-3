public class Node {
        Node prev; //#This is a node
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        Node getPrev(){
            return this.prev;
        }

        Node getNext(){
            return this.next;
        }

        int getValue(){
            return this.value;
        }

        void setValue(int value){
            this.value = value;
        }

        void setNext(Node node){
            this.next = node;
        }

        void setPrev(Node node){
            this.prev = node;
        }
}
