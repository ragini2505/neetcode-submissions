class MyHashMap {

    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

     Node[] table;

    public MyHashMap() {
        table = new Node[1000];
    }
    
        public void put(int key, int value) {
        int index = key % 1000;

        Node current = table[index];

        // Key already exists → update value
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Key doesn't exist → add new node
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }
        public int get(int key) {
        int index = key % 1000;

        Node current = table[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = key % 1000;

        Node current = table[index];
        Node previous = null;

        while (current != null) {

            if (current.key == key) {

                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                return;
            }

            previous = current;
            current = current.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */