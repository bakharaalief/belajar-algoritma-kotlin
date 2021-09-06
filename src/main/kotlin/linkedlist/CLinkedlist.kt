package linkedlist

class CLinkedlist {
    var last : CNode? = null

    //insert at begin
    fun insertAtBegin(number : Int){
        if(last == null){
            val newNode = CNode(number, null)
            last = newNode
            newNode.nextNode = last
        }
        else last?.nextNode = CNode(number, last?.nextNode)
    }

    //insert at the end
    fun insertAtEnd(number : Int){
        if(last == null) insertAtBegin(number)
        else{
            val newNode = CNode(number, last?.nextNode)
            last?.nextNode = newNode
            last = newNode
        }
    }

    //insert after
    fun insertAfter(number: Int, prevNode: CNode){
        if(last == null) println("Maaf Kosong")
        else{
            prevNode.nextNode = CNode(number, prevNode.nextNode)
        }
    }

    //search data
    fun search(number: Int){
        if(last == null) println("Maaf Kosong")
        else{
            var position = 0
            var current = last?.nextNode
            do{
                if(current?.number == number)  print("[ $position ] ")

                position++
                current = current?.nextNode
            }
            while (current != last?.nextNode)
        }
    }

    //delete
    fun delete(position: Int){
        when{
            last == null -> println("Maaf Data Kosong")
            position == 0 -> last?.nextNode = last?.nextNode?.nextNode
            else -> {
                var current = last?.nextNode
                var index = 0
                var prevNode = current
                var deleteNode = current
                do{
                    if(index == position - 1)  prevNode = current
                    else if(index == position) {
                        deleteNode = current
                        break
                    }

                    current = current?.nextNode
                    index++
                }
                while (current != last?.nextNode)

                prevNode?.nextNode = deleteNode?.nextNode
            }
        }
    }

    //print data
    fun printData(){
        if(last == null) println("Maaf Data Kosong")
        else{
            var current = last?.nextNode
            do {
                print("[ ${current?.number} ] ")
                current = current?.nextNode
            }
            while (current != last?.nextNode)
        }
    }
}

class CNode(var number: Int, var nextNode: CNode?)