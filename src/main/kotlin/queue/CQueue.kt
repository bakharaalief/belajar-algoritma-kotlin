package queue

class CQueue(private val size : Int){
    private var front : Int = -1
    private var rear : Int = -1
    private val arr : Array<String?> = arrayOfNulls(size)

    private fun isEmpty() : Boolean = front == -1 && rear == -1

    private fun isFull() : Boolean {
        return when{
            front == 0 && rear + 1 == size -> true
            rear + 1 == front -> true
            else -> false
        }
    }

    fun enQueue(kata : String){
        if(isFull()) println("Maaf Penuh")
        else{
            if(isEmpty()) front++
            rear = ( rear + 1 ) % size // handle paling belakang ketika size penuh
            arr[rear] = kata
        }
    }

    fun dequeue(){
        if(isEmpty()) println("Maaf Kosong")
        else{
            if(front == rear){
                front = -1
                rear = -1
            }
            front = ( front + 1 ) % size
        }
    }

    fun printData(){
        if(isEmpty()) println("Kosong")
        else{
            var index = front
            do {
                println(arr[index])
                index = ( index + 1 ) % size
            }
            while ( index != front)
        }
    }
}