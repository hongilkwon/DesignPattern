import creational.prototype.Employee
import creational.prototype.HongCompanyMember

fun main() {
    val member1 = Employee(
        name = "코틀린",
        gender = "남자",
        age = 14,
        address = "서울시",
        salary = 100
    )

    val member2 = member1.clone()
    println(member2)
}




