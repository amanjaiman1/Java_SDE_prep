package Day14_June12;

public class queueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }

            rear--;
            return front;
        }
    }
    public static void main(String[] args) {

    }
}
