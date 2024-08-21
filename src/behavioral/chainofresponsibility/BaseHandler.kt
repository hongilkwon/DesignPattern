package behavioral.chainofresponsibility

abstract class BaseHandler : Handler {

    private lateinit var next: Handler

    fun setNextHandler(handler: Handler): Handler {
        next = handler
        return next
    }

    protected fun handleNext(userInfo: UserInfo): Boolean {
        if (::next.isInitialized) {
            return true
        }
        return next.handle(userInfo)
    }
}