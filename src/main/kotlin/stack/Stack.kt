package stack

class Stack(private val size : Int){
    private val arr = arrayOfNulls<String>(size)
    private var top = -1

    private fun isFull() : Boolean = top + 1 == size

    private fun isEmpty() : Boolean = top == -1

    fun push(kata : String){
        if(isFull()) println("Maaf Penuh :)")
        else{
            top++
            arr[top] = kata
        }
    }

    fun pop(){
        if(isEmpty()) println("Kosong Nih")
        else{
            top--
        }
    }

    fun printData(){
        if(isEmpty()) println("Kosong Nih :)")
        else{
            for(i in 0..top){
                println(arr[i])
            }
        }
    }
}