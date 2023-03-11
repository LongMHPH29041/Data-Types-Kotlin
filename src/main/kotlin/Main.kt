fun main(args: Array<String>) {

//   val a = 10
//    var b = 100;
//    val d = 'a'+2
//    // chuỗi ('') cộng với số sẽ ra kết quả ký tự
//    // val là không thay đổi giá trị của biến (nên dùng val)
//    // var là có thể thay đổi giá trị của biến
//    val c = ""+ b
//    println(d)
//
//
//    fun getDellChiuDuoc(a:Int, c:Char)= c+a
//    print(getDellChiuDuoc(2,'a') +"\n")
//
//
//    fun getDellChiuDuoc1(a : Int ): Any{
//     if (a<10) return "Hello body "
//
//        return "helloWord"
//
//    }
//    print(getDellChiuDuoc1(2))
//
//    val heloo : String = a.toString()
//    print(heloo)
//
    // cách dùng if
//    val a = 1
//    val b = if (a>1) "Số này lớn hơn 1" else "Số này nhỏ hơn 1"
//    print(b)

//    fun heloo(a: Int): String{
//        return if (a>1) "Số lớn hỏn 1"
//        else "số này nhỏ hơn 1"
//    }
//    print(heloo(2))



    // cách dùng when
//    val  a = 11
//    when{
//        a>10 ->{
//            print("hello word +$a")
//        }
//        a<10 ->{
//            print("Số nhỏ hơn +$a")
//        }
//    }

    //Cách viết SQLite Kotlin
//    val sql = """
//        Create table duAnMot(
//
//
//
//        )
//
//        """

    //Cách viết vòng for
//    val s = "10000"
//    for (i in s.indices){
//        print(i)
//    }
//    // in ra lần lượt indices
//    for (i in 1..100){
//        print("$i \n")
//    }
    // chỉ đến 99 for( i in 1 until 100)

//    for (i in 100 downTo 1 step 2){
//        print("$i \n")
//    }

//    val a = "helooo word"
//    print("h" in a)
//
//    val list : List<String> = listOf("a","b","c")
//    print(list)
    //listOf ko suaer đc

    //val list2: MutableList<Int> = mutableListOf()
    //list2 có thể thay đổi đc giá trị
    // list2.add


    // kiểm tra số nguyên tố
//    fun ktSoNguyenTo(e : Int): Boolean {
//        var check = true
//        for (i in 2 until  e){
//            if (e%i==0) check == false
//            break
//
//        }
//        return check
//    }
//    print(ktSoNguyenTo(11 ))
//
//
//    fun inThongTin(s : String = "Chưa biết tên"){
//        println("Tên của bạn là : $s")
//    }
//    inThongTin()

}