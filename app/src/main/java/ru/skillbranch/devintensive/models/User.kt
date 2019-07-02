package ru.skillbranch.devintensive.models

import java.util.*

data class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    var lastVisit: Date? = Date(),
    var isOnline: Boolean = false
) {
    constructor(id: String, firstName: String?, lastName: String?) : this(id, firstName, lastName, null)

    init {
        println(
            """
        id : $id
        firstName : $firstName
        lastName : $lastName
        avatar : $avatar
        rating : $rating
        respect : $respect
        lastVisit : $lastVisit
        isOnline   : $isOnline
        """
        )
    }

    companion object Factory {
        var lastId: Int = -1
        fun makeUser(fullName: String?): User {
            if (fullName.equals(null)) {
                return makeUser("")
            }
            lastId++
            val parts: List<String>? = fullName?.split(" ")

            val firstName = parts?.getOrElse(0) { "" }
            val secondName = parts?.getOrElse(1) { "" }

            return User(
                lastId.toString(),
                firstName,
                secondName
            )

        }
    }
}