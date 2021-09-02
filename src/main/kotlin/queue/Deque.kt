package queue

class Deque(private val size : Int) {
    private val arr = arrayOfNulls<String>(size)
    private var front = -1
    private var rear = -1

    private fun isEmpty() : Boolean = (front == -1 && rear == -1)

    private fun isFull() : Boolean{
        return when{
            front == 0 && rear == size - 1 -> true
            rear + 1 == front -> true
            else -> false
        }
    }

    //insert rear
    fun insertRear(kata : String){
        if(isFull()) println("Maaf Penuh")
        else{
            if(isEmpty())front++
            rear = ( rear + 1 ) % size

            arr[rear] = kata
        }
    }

    //insert front
    fun insertFront(kata: String){
        if(isFull()) println("Maaf Penuh")
        else{
            when{
                isEmpty() -> {
                    front = size - 1
                    rear = size - 1
                }
                front == 0 -> {
                    front = size - 1
                }
                else -> front--
            }

            arr[front] = kata
        }
    }

    //remove rear
    fun removeRear(){
        if(isEmpty()) println("Maaf Kosong")
        else{
            when{
                front == rear -> {
                    front = -1
                    rear = -1
                }
                rear == 0 -> {
                    rear = size - 1
                }
                else -> rear--
            }
        }
    }

    //remove front
    fun removeFront(){
        if(isEmpty()) println("Maaf Kosong")
        else{
            when{
                front == rear -> {
                    front = -1
                    rear = -1
                }
                else -> front = ( front + 1 ) % size
            }
        }
    }

    //get front
    fun getFront() : String{
        return if(isEmpty() || front < 0) "Maaf Kosong" else arr[front].toString()
    }

    //get rear
    fun getRear() : String{
        return if(isEmpty() || rear < 0) "Maaf Kosong" else arr[rear].toString()
    }
}