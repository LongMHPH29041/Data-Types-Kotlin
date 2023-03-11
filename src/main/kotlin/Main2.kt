fun main(){
    // Phần quan trọng của kotlin

    // kotlin mọi biến phải để được gắn giá trị

    val a : String? = null
    // ? bắt buộc phải check rỗng
//    if (a != null) {
//        println(a.length)
//    }else{
//        println("Nhập chữ")
//    }

    println(a?.length)
//    val dongVat:DongVat? = null

//    var b=a?.length?:0
//    if (a!=null){
//         b = a.length
//    }else  b=0

    a?.let {
        println("Strong let "+it.length)
    }
}