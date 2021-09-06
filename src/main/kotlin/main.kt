import Tree.CompleteBinaryTree
import Tree.FullBinaryTree
import Tree.PerfectBinaryTree
import Tree.TreeAlgoTranversal
import hash.Hash
import linkedlist.CDLinkedlist
import linkedlist.CLinkedlist
import linkedlist.DLinkedlist
import linkedlist.Linkedlist

fun main(args: Array<String>) {
//    printLinkedlist()
//    printDLinkedlist()
//    printCLinkedlist()
//    printCDLinkedList()

//    printHash()

//    printTransversalTree()
//    printFullBinaryTree()
//    printPerfectBinaryTree()
    printCompleteBinaryTree()
}

fun printLinkedlist(){
    println("Linkedlist")
    val linkedlist = Linkedlist()
    linkedlist.insertAtBegining(10)
    linkedlist.insertAtBegining(13)
    linkedlist.head?.let { linkedlist.insertAfter(12, it) }

    linkedlist.delete(0)

    linkedlist.printData()
    println("")

    linkedlist.delete(1)
    linkedlist.printData()
}

fun printDLinkedlist(){
    val dLinkedlist = DLinkedlist()

    dLinkedlist.insertAtBegin(0)
    dLinkedlist.insertAtBegin(1)

    dLinkedlist.inserAfter(4, dLinkedlist.head)
    dLinkedlist.inserAfter(5, dLinkedlist.head)

    dLinkedlist.insertAtEnd(10)
    dLinkedlist.insertAtEnd(20)

    dLinkedlist.insertBefore(10, dLinkedlist.head)

    dLinkedlist.sortLinked()

    dLinkedlist.printData()

    dLinkedlist.searchNumber(10)

    dLinkedlist.delete(4)

    println()
    dLinkedlist.printData()
}

fun printCLinkedlist(){
    val cLinkedlist = CLinkedlist()

    cLinkedlist.insertAtBegin(0)
    cLinkedlist.insertAtBegin(1)
    cLinkedlist.insertAtBegin(2)

    cLinkedlist.printData()

    cLinkedlist.insertAtEnd(10)
    cLinkedlist.insertAtEnd(12)

    println("")
    cLinkedlist.printData()

    cLinkedlist.last?.let { cLinkedlist.insertAfter(13, it) }
    cLinkedlist.last?.let { cLinkedlist.insertAfter(14, it) }

    println("")
    cLinkedlist.printData()

    println("")
    print("Posisi 14 ada di : ")
    cLinkedlist.search(14)

    println("")

    cLinkedlist.delete(0)
    cLinkedlist.printData()

    println("")

    cLinkedlist.delete(1)
    cLinkedlist.printData()
}

fun printCDLinkedList(){
    val cdLinkedlist = CDLinkedlist(4)

    cdLinkedlist.insertAtBegin(0)
    cdLinkedlist.insertAtBegin(1)

    cdLinkedlist.printData()

    cdLinkedlist.insertAtEnd(12)
    cdLinkedlist.insertAtEnd(20)

    println("")
    cdLinkedlist.printData()

    cdLinkedlist.insertAfter(13, cdLinkedlist.last)
    cdLinkedlist.insertAfter(14, cdLinkedlist.last)

    println("")
    cdLinkedlist.printData()

    cdLinkedlist.delete(4)

    println("")
    cdLinkedlist.printData()
}

fun printHash(){
    val hash = Hash()

    hash.runHash()

    hash.printDataAll()

    hash.printData("dua")
}

fun printTransversalTree(){
    val treeAlgoTranversal = TreeAlgoTranversal()

    treeAlgoTranversal.setTree()

    println("Algoritma in Order : ")
    treeAlgoTranversal.inOrder(treeAlgoTranversal.root)

    println("")
    println("Algoritma pre Order : ")
    treeAlgoTranversal.preOrder(treeAlgoTranversal.root)

    println("")
    println("Algoritma post Order :")
    treeAlgoTranversal.postOrder(treeAlgoTranversal.root)
}

fun printFullBinaryTree(){
    val fullBinaryTree = FullBinaryTree()
    fullBinaryTree.setTree()
    val isFullBinary = fullBinaryTree.isFullBinaryTree(fullBinaryTree.root)

    if(isFullBinary) println("Iya Ini benar")
    else println("Bukan Binary Tree Ini Mah")
}

fun printPerfectBinaryTree(){
    val perfectBinaryTree = PerfectBinaryTree()
    perfectBinaryTree.setTree()

    if(perfectBinaryTree.isPerfectTree(perfectBinaryTree.root)) println("Iya nih perfect binary")
    else println("Bukan Nih")
}

fun printCompleteBinaryTree() {
    val completeBinaryTree = CompleteBinaryTree()
    completeBinaryTree.setTree()

    if (completeBinaryTree.isComplete(completeBinaryTree.root)) println("Iya nih complete binary")
    else println("Bukan Nih")
}

