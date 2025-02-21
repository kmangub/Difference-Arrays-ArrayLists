# Java Arrays and ArrayLists
Array and ArrayLists are data structures that can be used to hold multiple elements. Each element can be referenced by an index, and for each index, it will hold a value. 

The starting index for arrays and arraylists is always 0, so we need to have to keep that in mind if we want to find the correct value in the array. For example, if we want to find the 5th element in the array, the index will be 4. 

The key differences between the arrays and arrayList is shown below. 

## Arrays
Arrays have a fixed size and cannot be changed. If we want to add to the array, we would need to initialize a new array and copy the old array to the new array, which can be a hassle.

 To initialize arrays, we would have to specify the size and type. Arrays can store primitive types, so we can simply assign a value to the index. Arrays can also store objects.

As far as performance goes, arrays resolve faster due to its fixed memory allocation. Arrays are lacking in the ability to manipulate the data structure, so we can't perform methods like adding or removing elements.


## ArrayLists
ArrayLists are dynamic in size, meaning that we can add new elements and the size will change. It can only hold objects, so if we want to store primitives, such as integers or doubles, we would need to wrap them to their respective datatype wrappers. For example, if we want to create an arrayList with the wrapper class `Integer`. It has built-in methods to change or reference data. Some of the methods include `add()`, `remove()`, and `get()`. As far as data processing goes, arrayLists are slower due to the constant re-sizing of the arrayList. 