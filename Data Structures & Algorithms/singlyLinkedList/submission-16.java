class ListNode {
    private int value;
    private ListNode next;

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1, null);
        this.tail = this.head;
    }

    public int get(int index) {
        int i = 0;
        ListNode current = head.next;
        while(current != null) {
            if(i == index) {
                return current.value;
            }
            i++;
            current = current.next;
        }

        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val, null);
        newNode.next = head.next;
        head.next = newNode;
        if(newNode.next == null) {
            this.tail = newNode;
        }

    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val, null);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        int i =0;
        ListNode current = this.head;
        while(i<index && current != null) {
            i++;
            current = current.next;
        }

        if(current != null && current.next != null) {
            if(current.next == this.tail) {
                this.tail = current;
            }

            current.next = current.next.next;
            return true;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = this.head.next;
        while(current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list;
    }
}
