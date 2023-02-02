fun main() {
    var names = arrayOf("Juliet", "Margy", "Marry")
    var age = arrayOf( 23, 24,25)
    var phoneNumber = arrayOf( 718492299, 720485918, 723469938)
    var weight = arrayOf(56, 65, 67)
val citizenship = true
    var student = arrayOf("studentList",names[0],age[0],phoneNumber[0],weight[0],!citizenship)
    println(student.contentToString())
    var student2 = arrayOf("studentList2",names[1],age[1],phoneNumber[1],weight[1],citizenship)
    println(student2.contentToString())
    var student3 = arrayOf("studentList3",names[2],age[2],phoneNumber[2],weight[2],!citizenship)
    println(student3.contentToString())
}