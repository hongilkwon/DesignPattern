package creational.prototype

class Employee(
    name: String,
    gender: String,
    age: Int,
    private val address: String,
    private val salary: Int,
) : HongCompanyMember(name, gender, age, address, salary) {

    private var position: String = "developer"

    private constructor(employee: Employee) : this(
        employee.name,
        employee.gender,
        employee.age,
        employee.address,
        employee.salary
    ) {
        this.position = employee.position
    }

    override fun clone(): HongCompanyMember {
        return Employee(this)
    }

    override fun toString(): String {
        return "Employee(name = '${this.name}', gender = '${this.gender}', age = '${this.age}' address='$address', salary=$salary, position='$position')"
    }
}