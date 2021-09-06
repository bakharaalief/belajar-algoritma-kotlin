package linkedlist

class CDLinkedlist(private val size : Int) {
    private val arr = arrayOfNulls<String>(size)
    var last : CDNode? = null

    fun insertAtBegin(number: Int){
        if(last == null){
            val newNode = CDNode(null, number, null)
            last = newNode
            newNode.prevNode = last
            newNode.nextNode = last
        }
        else last?.nextNode = CDNode(last, number, last?.nextNode)
    }

    fun insertAtEnd(number: Int){
        if(last == null) insertAtBegin(number)
        else{
            val newNode = CDNode(last, number, last?.nextNode)
            last?.nextNode = newNode
            last = newNode
        }
    }

    fun insertAfter(number: Int, prevNode: CDNode?){
        prevNode?.nextNode = CDNode(prevNode, number, prevNode?.nextNode)
    }

    fun delete(position : Int){
        when{
            last == null -> println("Maaf Kosong")
            position == 0 ->{
                last?.nextNode = last?.nextNode?.nextNode
                last?.nextNode?.prevNode = last
            }
            else ->{
                var index = 0
                var current = last?.nextNode
                var prevNode = current
                var deleteNode = current

                do {
                    if(index == position - 1) prevNode = current
                    else if(index == position ){
                        deleteNode = current
                        break
                    }

                    current = current?.nextNode
                    index++
                }
                while (current != last?.nextNode)

                prevNode?.nextNode = deleteNode?.nextNode
                deleteNode?.nextNode?.prevNode = prevNode
            }
        }
    }

    fun printData(){
        if(last == null) println("Maaf Kosong")
        else{
            var current = last?.nextNode
            do{
                print("[ ${current?.number} ] ")
                current = current?.nextNode
            }
            while (current != last?.nextNode)
        }
    }
}

class CDNode(var prevNode: CDNode?, val number: Int, var nextNode : CDNode?)