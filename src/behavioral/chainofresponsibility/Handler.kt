package behavioral.chainofresponsibility

interface Handler {
    fun handle(userInfo: UserInfo): Boolean
}