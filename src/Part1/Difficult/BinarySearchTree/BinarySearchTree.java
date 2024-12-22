package Part1.Difficult.BinarySearchTree;

class BinaryTree {

    Node root;

    public void add(int data) {

        Node nodeToAdd = new Node(data);

        //if there is no elements in the tree
        if (root == null) {
            root = nodeToAdd;
        }

        traverseAndAddNode(root, nodeToAdd);
    }

    private void traverseAndAddNode(Node node, Node nodeToAdd) {

        if (nodeToAdd.data < node.data) {
            if (node.leftChild == null) {
                nodeToAdd.parent = node;
                node.leftChild = nodeToAdd;
            } else {
                traverseAndAddNode(node.leftChild, nodeToAdd);
            }
        } else if (nodeToAdd.data > node.data) {
            if (node.rightChild == null) {
                nodeToAdd.parent = node;
                node.rightChild = nodeToAdd;
            } else {
                traverseAndAddNode(node.rightChild, nodeToAdd);
            }
        }
    }

    public void traverse() {
        if (root != null) {

            Node nodeToTraverse = root;

            if (nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null) {
                System.out.println(nodeToTraverse.data);
            } else {
                inOrderTraversal(nodeToTraverse);
            }
        }
    }

    private void inOrderTraversal(Node node) {
        if (node.leftChild != null) {
            inOrderTraversal(node.leftChild);
        }

        System.out.println(node.data);

        if (node.rightChild != null) {
            inOrderTraversal(node.rightChild);

        }
    }

    public boolean delete(int value) {

        Node nodeToBeDeleted = find(value);

        if (nodeToBeDeleted != null) {

            //case1: node has no children
            if (nodeToBeDeleted.leftChild == null && nodeToBeDeleted.rightChild == null) {
                deleteCase1(nodeToBeDeleted);
            } else if (nodeToBeDeleted.leftChild != null && nodeToBeDeleted.rightChild != null) {
                //case 3: node has two children
                deleteCase3(nodeToBeDeleted);
            }
            //case2: node has one child
            else if (nodeToBeDeleted.leftChild != null) {
                //left child should be deleted
                deleteCase2(nodeToBeDeleted);
            } else if (nodeToBeDeleted.rightChild != null) {
                //right child should be deleted
                deleteCase2(nodeToBeDeleted);
            }
        }

        return false;
    }

    private void deleteCase3(Node nodeToBeDeleted) {

        Node minNode = minLeftTraversal(nodeToBeDeleted.rightChild);
        deleteCase2(minNode);

        minNode.parent = nodeToBeDeleted.parent;
        minNode.leftChild = nodeToBeDeleted.leftChild;
        minNode.rightChild = nodeToBeDeleted.rightChild;

        if (nodeToBeDeleted.parent == null) {
            root = minNode;
        } else {
            if (nodeToBeDeleted.parent.leftChild == nodeToBeDeleted) {

                nodeToBeDeleted.parent.leftChild = minNode;

            } else if (nodeToBeDeleted.parent.rightChild == nodeToBeDeleted) {

                nodeToBeDeleted.parent.rightChild = minNode;
            }
        }
    }

    private Node minLeftTraversal(Node node) {

        if (node.leftChild == null) {
            return node;
        }

        return minLeftTraversal(node.leftChild);
    }

    private void deleteCase2(Node nodeToBeDeleted) {

        if (nodeToBeDeleted.parent.leftChild == nodeToBeDeleted) {
            if (nodeToBeDeleted.leftChild != null) {
                nodeToBeDeleted.parent.leftChild = nodeToBeDeleted.leftChild;
            } else if (nodeToBeDeleted.rightChild != null) {
                nodeToBeDeleted.parent.leftChild = nodeToBeDeleted.rightChild;
            }
        } else if (nodeToBeDeleted.parent.rightChild == nodeToBeDeleted) {
            if (nodeToBeDeleted.leftChild != null) {
                nodeToBeDeleted.parent.rightChild = nodeToBeDeleted.leftChild;
            } else if (nodeToBeDeleted.rightChild != null) {
                nodeToBeDeleted.parent.rightChild = nodeToBeDeleted.rightChild;
            }
        }
    }

    //case1: node has no children
    private void deleteCase1(Node nodeToBeDeleted) {
        if (nodeToBeDeleted.parent.leftChild == nodeToBeDeleted) {
            nodeToBeDeleted.parent.leftChild = null;
        } else if (nodeToBeDeleted.rightChild.parent == nodeToBeDeleted) {
            nodeToBeDeleted.parent.rightChild = null;
        }

    }

    public Node find(int value) {
        if (root != null) {
            return findNode(root, new Node(value));
        }
        return null;
    }

    public Node findNode(Node search, Node node) {

        if (search == null) {
            return null;
        }

        if (search.data == node.data) {
            return search;
        } else {

            Node returnNode = findNode(search.leftChild, node);

            if (returnNode == null) {
                returnNode = findNode(search.rightChild, node);
            }
            return returnNode;
        }
    }
}



