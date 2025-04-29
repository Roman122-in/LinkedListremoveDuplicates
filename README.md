# LinkedListRemoveDuplicates

This program removes consecutive duplicates from a singly linked list. It follows these steps:

1. Converts the linked list into an `ArrayList`.
2. Removes consecutive duplicate elements from the `ArrayList`.
3. Rebuilds a new linked list from the modified `ArrayList`.

The linked list is traversed, and each element is added to an `ArrayList`. Consecutive duplicates are then removed by comparing adjacent elements in the list. Finally, a new linked list is created from the updated `ArrayList` and returned.

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/YourUsername/LinkedListRemoveDuplicates.git
    ```

2. Open the project in your IDE (e.g., IntelliJ IDEA).

3. Run `Main.java` to see the result.

## Example

**Input:**  
`1 -> 2 -> 2 -> 3`

**Output:**  
`1 -> 2 -> 3`

## License

This project is licensed under the MIT License.

