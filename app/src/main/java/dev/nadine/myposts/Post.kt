package dev.nadine.myposts

import android.provider.ContactsContract


data class Post(
    var userId: Int,
    var id :Int,
    var title : String,
    var body : String
)

data class Comments(
    var userId: Int,
    var id :Int,
    var title : String,
    var email: String,
    var body : String
)

//fun <T> compareIds(item1:T, item2: T): T{
//    var output = (item1.toString() + item2.toString())
//    println(output)
//    return  item1
//}
//fun stage (){
//    var post1 = Post (1,2,"abc", "def")
//    var post2 = Post (1,3, "def", "ghi")
//    compareIds(post1,post2)
//    var comment1 = Comments(1,2,"abc","def", "ghi")
//    var comment2 = Comments(1,4,"abc", "def", "ghi")
//    compareIds(comment1, comment2)
//}






















