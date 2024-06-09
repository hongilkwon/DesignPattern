package creational.prototype

class Executives(
    name: String,
    gender: String,
    age: Int,
    private val address: String,
    private val salary: Int,
) : HongCompanyMember(name, gender, age, address, salary) {

    private var delegatedAuthority: String = "CTO"

    private constructor(executives: Executives) : this(
        executives.name,
        executives.gender,
        executives.age,
        executives.address,
        executives.salary
    ) {
        this.delegatedAuthority = executives.delegatedAuthority
    }

    override fun clone(): HongCompanyMember {
        return Executives(this)
    }
}