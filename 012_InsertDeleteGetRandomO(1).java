/*
 * --------------------------------------------------------
 * Title      : LeetCode Top Interview 150 - Problem #380
 * Problem    : Insert Delete GetRandom O(1)
 * Link       : https://leetcode.com/problems/insert-delete-getrandom-o1/
 * Solved On  : [Add your solve date here]
 * Language   : Java
 * 
 * Problem Statement:
 * Implement the RandomizedSet class:
 *   - `bool insert(int val)` Inserts an item val into the set if not present.
 *   - `bool remove(int val)` Removes an item val from the set if present.
 *   - `int getRandom()` Returns a random element from the current set of elements.
 * 
 * Each function should run in average O(1) time.
 * 
 * Approach:
 * 1. Use a HashMap to store the value and its index in the list.
 * 2. Use an ArrayList to store the values for constant-time random access.
 * 3. For `insert(val)`:
 *      - If value exists in the map, return false.
 *      - Else, add it to the end of the list and map its index.
 * 4. For `remove(val)`:
 *      - If value doesn't exist, return false.
 *      - Else, swap it with the last element and remove the last element.
 *      - Update the map accordingly.
 * 5. For `getRandom()`:
 *      - Return a random element from the list using Random.
 * 
 * Time Complexity  : O(1) for all operations (average case).
 * Space Complexity : O(n), where n is the number of elements stored.
 * --------------------------------------------------------
 */

class RandomizedSet {
    private HashMap<Integer, Integer> hm;
    private ArrayList<Integer> a;
    private Random rand;

    public RandomizedSet() {
        hm = new HashMap<>();
        a = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (hm.containsKey(val)) {
            return false;
        }
        hm.put(val, a.size());
        a.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!hm.containsKey(val)) {
            return false;
        }
        int indx = hm.get(val);
        int lastElement = a.get(a.size() - 1);
        a.set(indx, lastElement);
        hm.put(lastElement, indx);
        a.remove(a.size() - 1);
        hm.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndx = rand.nextInt(a.size());
        return a.get(randomIndx);
    }
}
