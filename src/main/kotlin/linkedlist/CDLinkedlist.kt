package linkedlist

class CDLinkedlist(private val size : Int) {
    private val arr = arrayOfNulls<String>(size)
    private var last : CDNode? = null

    fun insertAtBegin(number: Int){
        if(last == null){
            val newNode = CDNode(null, number, null)
            last = newNode
            newNode.prevNode = last
            newNode.nextNode = last
        }
        else{
            last?.nextNode = CDNode(last, number, last?.nextNode)
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