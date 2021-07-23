package edu.nidotim.exercise.amazon;

import edu.nidotim.exercise.util.datastructure.Node;

import java.util.*;

import static edu.nidotim.exercise.util.datastructure.NodeUtil.insertBinarySearchTree;

public class ReassignedPriorities {

    public List<Integer> reassignedPriorities(List<Integer> priorities) {
        Set<Integer> prioritySet = new HashSet();
        List<Integer> result = new ArrayList();
        Node root = null;
        // traverse the list and create a binary search tree
        for(Integer priority : priorities) {
            if(prioritySet.contains(priority)) {
                continue;
            }
            prioritySet.add(priority);
            root = insertBinarySearchTree(root, priority);
        }
        // in order traverse the tree and return a map of key-> priority, value -> index
        Map<Integer, Integer> mapping = inOrderTraverse(root, 1);
        for(Integer priority : priorities) {
            Integer minimizedPriority = mapping.get(priority);
            result.add(minimizedPriority);
        }
        for(Integer key : mapping.keySet()) {
            System.out.println(key + " => " + mapping.get(key));
        }

        return result;
    }


    public Map<Integer, Integer> inOrderTraverse(Node root, int index) {
        if(root == null) {
            return new HashMap();
        }
        System.out.println("traverse: " + root.data + ", "+ index);
        Map<Integer, Integer> result = new HashMap();
        Node left = root.left;
        Node right = root.right;
        if(left == null && right == null) {
            result.put(root.data, index);
            return result;
        } else if(left != null && right == null) {
            result.putAll(inOrderTraverse(left, index));
            index += result.size();
            result.put(root.data, index);
        } else if(left == null && right != null) {
            result.put(root.data, index);
            result.putAll(inOrderTraverse(right, index + 1));
        } else if(left != null && right != null) {
            result.putAll(inOrderTraverse(left, index));
            index += result.size();
            result.put(root.data, index);
            result.putAll(inOrderTraverse(right, index + 1));
        }
        return result;
    }
}
