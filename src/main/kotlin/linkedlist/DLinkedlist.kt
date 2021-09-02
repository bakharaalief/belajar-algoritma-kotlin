package linkedlist

class DLinkedlist {
    var head : DNode? = null

    fun insertAtBegin(number: Int){
        head = DNode(null, number, head)
    }

    fun insertAtEnd(number: Int){
        if(head == null) insertAtBegin(number)
        else{
            var data = head
            while (data?.nextNode != null){
                data = data.nextNode
            }

            data?.nextNode = DNode(data?.prevNode, number, null)
        }
    }

    fun inserAfter(number: Int, prevNode: DNode?){
        prevNode?.nextNode = DNode(prevNode, number, prevNode?.nextNode)
    }

    fun insertBefore(number: Int, nextNode: DNode?){
        val data = DNode(nextNode?.prevNode, number, nextNode)

        //if true the data is header
        if(nextNode?.prevNode == null){
            head = data
        }

        nextNode?.prevNode = data
    }

    fun searchNumber(number: Int){
        if(head == null) println("Maaf Kosong")
        else{
            var current = head
            var index = 0

            println(" ")
            print("position $number : ")
            while (current != null){
                if(current.number == number) print("[$index]")

                index++
                current = current.nextNode
            }
        }
    }

    fun delete(position : Int){
        when{
            head == null -> println("Kosong :)")
            position == 0 -> head = head?.nextNode
            else ->{
                var current = head
                var index = 0
                var prevDeleteNode = head
                var deleteNode = head

                while (current != null){
                    if(index == position - 1) prevDeleteNode = current
                    else if(index == position){
                        deleteNode = current
                        break
                    }

                    index++
                    current = current.nextNode
                }

                prevDeleteNode?.nextNode = deleteNode?.nextNode
            }
        }
    }

    fun sortLinked(){
        if(head == null) println("Maaf Kosong")
        else{
            var current = head
            while (current != null){
                var index = current.nextNode

                while (index != null){
                    if(current.number > index.number){
                        val temp = current.number
                        current.number = index.number
                        index.number = temp
                    }
                    index = index.nextNode
                }

                current = current.nextNode
            }
        }
    }

    fun printData(){
        if(head == null) println("Maaf Kosong")
        else{
            var current = head
            while (current != null){
                print("[ ${current.number} ] ")
                current = current.nextNode
            }
        }
    }
}

class DNode(var prevNode: DNode?, var number: Int, var nextNode: DNode?)