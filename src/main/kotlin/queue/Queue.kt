package queue

class Queue(private val size:Int) {
    private var front = -1
    private var rear = -1
    private val arr = arrayOfNulls<String>(size)

    // condition ketika kosong
    private fun isEmpty() = ( front == -1 && rear == -1 )

    //condition ketika full
    private fun isFull() = ( front == 0 && rear + 1 == size )

    fun enQueue(kata : String){
        if(isFull()) println("Maaf data penuh Nih :)")
        else{
            if(isEmpty()) front++
            rear++
            arr[rear + 1] = kata
        }
    }

    fun deQueue() {
        if(isEmpty()) println("Maaf data Kosong Nih :)")
        else{
            if(front >= rear){
                front = -1
                rear = -1
            }
            else front++
        }
    }

    fun printData(){
        if(isEmpty()) println("Maaf Kosong")
        else{
            for(i in front..rear){
                println(arr[i])
            }
        }
    }
}