package creational.singleton


/*
   Singleton pattern
*/


//class Singleton private constructor(val data: String) {
//
//    companion object {
//        @Volatile
//        private var instance: Singleton? = null
//
//        fun getInstance(data: String): Singleton {
//            var result = instance
//            if (result == null) {
//                synchronized(this) {
//                    if (result == null) {
//                        result = Singleton(data)
//                        instance = result
//                    }
//                }
//            }
//            return result!!
//        }
//    }
//}

