# SortColumns

NAME: Michelle Quach

DATE OF COMPLETION: September 11, 2020

PURPOSE OF LAB: Learn how to implement Delete Columns to Make Sorted interview question. 

METHOD USED: We used two for loops to get the first letter of a string and check it with the first letter of the next string. When we check the two letters we check to see if they are sorted (if it is in alphabetical order). If they are not sorted we return the index of the string the unsorted letter was in. For example, if we were given {"cba", "daf", "ghi"} then the output would be {1} because if we keep "daf" then we would have {"b", "a", "h"} and this is not in sorted order. If the strings are not the same length then we return -1. If all of the strings are sorted when checked by column then we return nothing. 

RUNTIME / SPACE COMPLEXITY:
Runtime: O(n^2) because there is a nested for loop and each for loop is ran n times. 
Space Complexity: O(n) because the array and arraylist in the program are not constant and depends on what is inputed. 

OUTSIDE SOURCES / HELP: Eran Young

MESSAGE FOR GRADER: Output returns in square brackets instead of curly brackets. *USING JAVA 13*
