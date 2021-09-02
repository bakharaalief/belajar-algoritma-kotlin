package linkedlist

class Linkedlist{
    var head : Node? = null

    //insert at Begining
    fun insertAtBegining(number : Int){
        head = Node(number, head)
    }

    //insert after
    fun insertAfter(number: Int, prevNode: Node){
        prevNode.next = Node(number, prevNode.next)
    }

    //insert at the end
    fun insertAtEnd(number: Int){
        var current = head
        while (current?.next != null){
            current = current.next
        }

        current?.next = Node(number, null)
    }

    //search data
    fun search(number: Int) : Int{
        var index = 0
        var current = head

        while (current != null){

            if(current.number == number){
                break
            }

            index++
            current = current.next
        }

        return index
    }

    //delete data
    fun delete(position : Int){
        when{
            head == null -> println("Kosong Bapak :)")
            position == 0 -> head = head?.next
            else -> {
                var index = 0
                var data = head
                var prevNode = head
                var deleteNode = head

                while (data != null){
                    if(index == position - 1) {
                        prevNode = data
                    }
                    else if(index == position) {
                        deleteNode = data
                        break
                    }

                    index++
                    data = data.next
                }

                prevNode?.next = deleteNode?.next
            }
        }
    }

    //sort
    fun sortLinkedList(){
        var current : Node? = head

        if(head == null) println("Kosong Bapak :)")
        else{
            while (current != null){
                var index : Node? = current.next

                while (index != null){
                    if(current.number > index.number){
                        val temp = current.number
                        current.number = index.number
                        index.number = temp
                    }

                    index = index.next
                }

                current = current.next
            }
        }
    }

    //print data
    fun printData(){
        if(head == null) println("Kosong Bapak :)")
        else{
            var current = head
            while (current != null){
                print("[ ${current.number} ] ")
                current = current.next
            }
        }
    }
}

class Node(var number : Int, var next: Node?)