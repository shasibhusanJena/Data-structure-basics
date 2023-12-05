## Data-structure-basics
 
 Array is good if we know the index of the element for search , if we don’t know then it is not best option.

- O(1) means constant
- O(logn) means Logarithmic
- O(n) means Linear
- O(nlogn) means nlog -star n
- O(n sq2) means Quadratic

 then time complexity of an array is  N means linear.
  for example find index of 10 in array ? worst case is N.
  find index of 10000 in array ? worst case is N. 

in Bubble shot as we have 2 loops and n*n , as two loops the time complexity is Quadratic.
In Selection sort as we have 2 loops this is also Quadratic with time complexity if n*n;

#LIST

- list is a abstract class.
	
	List<Integer> list = new List<Integer>();
- this cannot be instantiated as List is a abstract class. so to instantiate it we can do using ArrayList. as shown below.

	List<Integer> list = new ArrayList<Integer>();

- similarly like array , adding and deleting an item is going to more time because of shifting and resize.

	ArrayList()
	Constructs an empty list with an initial capacity of ten.
	ArrayList(Collection<? extends E> c)
	Constructs a list containing the elements of the specified collection, in the order they are returned 	by the collection's iterator.

- by default it assign 10 no , we have 3 element to insert then theres is a waste of 7 capacity , so better to add capacity as per requirement, as shown in 

	ArrayList(Collection<? extends E> c) method.

#VECTOR

- Vector is synchronized and If a thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector
- Each Item in the list is called a node.
- The first item in the list is head of the list.
- last element in the list is Null.
- The time complexity will be O(1), as we are adding value to the start of the linked list, so it does not matter, how much more elements we are adding time complexity going to be O(1) always.