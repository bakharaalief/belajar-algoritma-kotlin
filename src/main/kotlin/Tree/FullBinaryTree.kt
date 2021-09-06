package Tree

class FullBinaryTree {
    var root : TreeNode? = null

    fun setTree(){
        root = TreeNode(1)

        root?.left = TreeNode(10)
        root?.right = TreeNode(5)

        root?.left?.left = TreeNode(7)
        root?.left?.right = TreeNode(8)
    }

    fun isFullBinaryTree(node: TreeNode?) : Boolean{
        return when{
            node == null -> true
            node.left == null && node.right == null -> true
            node.left != null && node.right != null -> isFullBinaryTree(node.left) && isFullBinaryTree(node.right)
            else -> false
        }
    }
}