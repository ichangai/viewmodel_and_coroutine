package model

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun getUsers() : List<User> {
        delay(8000)
        val users : List<User> = listOf(
            User(1, "Mike"),
            User(2, "Ann"),
            User(3, "Andrew"),
            User(4, "Sue")
        )
        return users
    }
}