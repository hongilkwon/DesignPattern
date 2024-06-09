package creational.prototype

class MemberCache {

    private val cache = mutableMapOf<String, HongCompanyMember>()

    init {
        val newRecruits = Employee(
            name = "홍길동",
            gender = "남자",
            age = 28,
            address = "서울시",
            salary = 100
        )

        val newExecutive = Executives(
            name = "김철수",
            gender = "남자",
            age = 50,
            address = "서울시",
            salary = 200
        )
        cache["newRecruits"] = newRecruits
        cache["newExecutive"] = newExecutive
    }

    fun get(type: String) = cache.get(type)?.clone()
}