package hash

class Hash {
    val hashMap = HashMap<String, Int>()

    fun runHash(){
        hashMap["satu"] = 1
        hashMap["dua"] = 2
        hashMap["tigas"] = 3
    }

    fun printDataAll(){
        println(hashMap)
    }

    fun printData(kata : String){
        println(hashMap[kata])
    }
}