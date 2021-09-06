package Tree

class PerfectBinaryTree {
    var root : TreeNode? = null

    fun setTree(){
        root = TreeNode(1)

        root?.left = TreeNode(6)
        root?.right = TreeNode(5)

//        root?.left?.left = TreeNode(10)
//        root?.left?.right = TreeNode(10)
    }

    private fun depth(node: TreeNode?) : Int{
        var depth = -1
        var current = node
        while (current != null){
            depth++
            current = current.left
        }

        return depth
    }

    private fun isPerfectBinaryTree(node: TreeNode?, depth : Int, level : Int) : Boolean{
        return when{
            node == null -> true
            node.left == null && node.right == null -> depth == level + 1
            node.left == null || node.right == null -> false
            else -> isPerfectBinaryTree(node.left, depth, level+1) && isPerfectBinaryTree(node.right, depth, level+1)
        }
    }


    fun isPerfectTree(node: TreeNode?) : Boolean{
        val depth = depth(node)
        return isPerfectBinaryTree(node, depth, -1)
    }
}