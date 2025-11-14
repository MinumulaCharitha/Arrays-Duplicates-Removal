This program removes duplicate elements from a sorted array using the "two-pointer approach" in Java.  
It modifies the array in-place and returns the new array after duplicate removal.

 How It Works
- The array must be "sorted".
- Two pointers ('p1' and 'p2') are used:
  - 'p1' tracks the position of the last unique element.
  - 'p2' scans the array.
- When a new unique element is found, it is placed at the next position of 'p1'.
