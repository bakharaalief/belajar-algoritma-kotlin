package Tree

class CompleteBinaryTree {
    var root : TreeNode? = null

    fun setTree(){
        root = TreeNode(1)

        root?.left = TreeNode(10)
        root?.right = TreeNode(5)

//        root?.left?.left = TreeNode(7)
//        root?.left?.right = TreeNode(8)
    }

    private fun countNodes(node : TreeNode?) : Int {
         return if(node == null) 0 else{
             1 + countNodes(node.right) + countNodes(node.left)
         }
    }

    private fun isCompleteTree(node: TreeNode?, index : Int, nodesSum : Int) : Boolean{
        return when{
            node == null -> true
            index >= nodesSum -> false
            else -> isCompleteTree(node.left, 2*index + 1, nodesSum) && isCompleteTree(node.right, 2*index + 2, nodesSum)
        }
    }

    fun isComplete(node: TreeNode?) : Boolean{
        val nodeSum = countNodes(node)
        return isCompleteTree(node, 0, nodeSum)
    }
}