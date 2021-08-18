# Stacks and Queues

A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does not reference its previous. follow these concepts:

- **FILO**:First In Last Out.
- **LIFO**: Last In First Out.

A Queue is a linear structure which follows a particular order in which the operations are performed. follow these concepts:

- **FIFO** First In First Out.
- **LILO** Last In Last Out.

## Challenge

### **Stack**

Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.

### **Queue**

Create a Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.

## Approach & Efficiency

- Space: O(1).
- Time: O(1).

## API

**Stack Methods:**

- `push()`:adds a new node with that value to the top of the stack with an O(1) Time performance.

- `pop()`: Removes the node from the top of the stack Should raise exception when called on empty stack
  peek, Returns the value from node from the top of the stack.

- `peek()`: Returns Value of the node located at the top of the stack. Should raise exception when called on empty stack.

- `is empty()`: Returns Boolean indicating whether or not the stack is empty.

**Queue Methods:**

- `enqueue()`:adds a new node with that value to the back of the queue with an O(1) Time performance.

- `dequeue()`: Removes the node from the front of the queue. Should raise exception when called on empty queue. Returns: the value from node from the front of the queue.

- `peek()`: Returns Value of the node located at the top of the queue. Should raise exception when called on empty queue.

- `is empty()`: Returns Boolean indicating whether or not the queue is empty.