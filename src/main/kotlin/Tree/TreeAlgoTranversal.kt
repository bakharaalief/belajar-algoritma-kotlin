package Tree

class TreeAlgoTranversal {
    var root : TreeNode? = null

    fun setTree(){
        root = TreeNode(1)

        root?.left = TreeNode(10)
        root?.right = TreeNode(5)

        root?.left?.left = TreeNode(7)
        root?.left?.right = TreeNode(8)
    }

    fun inOrder(node: TreeNode?){
        if(node != null){
            inOrder(node.left)

            print("${node.number} ->")

            inOrder(node.right)
        }
    }

    fun preOrder(node: TreeNode?){
        if(node != null){
            print("${node.number} ->")

            preOrder(node.left)

            preOrder(node.right)
        }
    }

    fun postOrder(node: TreeNode?){
        if(node != null){
            postOrder(node.left)

            postOrder(node.right)

            print("${node.number} ->")
        }
    }
}

