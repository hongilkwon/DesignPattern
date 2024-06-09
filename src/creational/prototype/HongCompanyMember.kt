package creational.prototype

abstract class HongCompanyMember(
    val name: String,
    val gender: String,
    val age: Int,
    private val address: String,
    private val salary: Int
) : PrototypeHongCompanyMember {

    protected constructor(member: HongCompanyMember) : this(
        member.name,
        member.gender,
        member.age,
        member.address,
        member.salary
    )
}



