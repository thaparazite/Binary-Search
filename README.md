# Binary-Search

## Project Overview:
The Binary Search Algorithm Implementation is a Java program for searching a key in a sorted collection using the binary search algorithm. It provides both an iterative and a recursive implementation of the binary search algorithm. The program includes a `main` method that demonstrates the functionality of the binary search algorithm by performing searches on sorted and unsorted arrays.

## Implementation Details:
### Binary Search Algorithm:
- **Description:** The binary search algorithm efficiently searches for a key in a sorted collection by repeatedly dividing the search interval in half.
- **Approach:** It compares the key with the middle element of the collection. If the key matches the middle element, the search is successful. If the key is less than the middle element, the search continues in the lower half of the collection; otherwise, it continues in the upper half.
- **Complexity:** Binary search has a time complexity of O(log n), making it significantly faster than linear search for large collections.

### Recursive Binary Search Method:
- **Description:** The program provides a recursive implementation of the binary search algorithm.
- **Functionality:** The `recursiveBinarySearch` method recursively searches for a key in a sorted collection within a specified range.
- **Parameters:** It takes an array, key, low index, and high index as input parameters.
- **Output:** Returns the index of the key if found; otherwise, returns -1.

### Main Method:
- **Functionality:** The `main` method demonstrates the binary search algorithm by performing searches on two scenarios: a sorted array and an unsorted array.
- **Scenarios:** 
  1. Searching for a key in an unsorted array to demonstrate the failure scenario.
  2. Searching for a key in a sorted array to demonstrate the success scenario.
- **Output:** Prints the result of each search operation, indicating whether the key was found and its index in the collection.

## Getting Started:
### Note:
Ensure that Java Development Kit (JDK) is installed on your system before proceeding with the installation.

#### Installation Steps:
|**Step**|**Description**|
|----|-----------|
| 1  | Clone the repository to your local machine.|
| 2  | Compile the Java files using `javac` command or your preferred IDE.|
| 3  | Execute the `BinarySearch` class to run the program and perform binary search operations.|

## Support and Assistance:
If you encounter any issues or have questions about the project, feel free to open an issue on GitHub or reach out to the project maintainer via email x22195092@student.ncirl.ie.

## Project Maintenance and Contributors:
This project is maintained and contributed to by [Flaviu Vanca](https://github.com/thaparazite). Contributions are welcome via pull requests, and all contributors are encouraged to follow the project's contribution guidelines outlined in the CONTRIBUTING.md file.

## License:
This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).

## Disclaimer:
This project is for educational and informational purposes only. It is not intended for commercial use or deployment in critical environments without proper validation and testing. Use at your own risk.
