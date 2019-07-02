package ru.skillbranch.devintensive.extensions

class Utils {
    companion object {
        fun parseFullName(fullName: String?): Pair<String?, String?> {
            var pair: Pair<String?, String?>
            when (fullName) {
                null -> {
                    pair = Pair(null, null)
                    return pair
                }
                "" -> {
                    pair = Pair(null, null)
                    return pair
                }
                " " -> {
                    pair = Pair(null, null)
                    return pair
                }
                else -> {
                    val parsed = fullName?.split(" ")
                    if (parsed.size < 2) {
                        pair = Pair(parsed[0], null)
                    } else {
                        pair = Pair(parsed?.get(0), parsed?.get(1))
                    }
                    return pair
                }
            }

        }

        fun toInitials(firstName: String?, lastName: String?): String? {
            if (firstName.isNullOrBlank() && lastName.isNullOrBlank()) {
                return null
            }
            if (lastName.isNullOrBlank() && !firstName.isNullOrBlank()) {
                return firstName?.get(0)?.toUpperCase().toString()
            }
            if (!lastName.isNullOrBlank() && firstName.isNullOrBlank()) {
                return lastName?.get(0)?.toUpperCase().toString()
            }


            return firstName?.get(0)?.toUpperCase().toString() + lastName?.get(0)?.toUpperCase()
        }

        fun transliteration(input: String?, divider: String = " "): String? {
            if (input.isNullOrBlank()) {
                return null
            }
            input.replace("а", "a")
            input.replace("б", "b")
            input.replace("в", "v")
            input.replace("г", "g")
            input.replace("д", "d")
            input.replace("е", "e")
            input.replace("ё", "e")
            input.replace("ж", "zh")
            input.replace("з", "z")
            input.replace("и", "i")
            input.replace("й", "i")
            input.replace("к", "k")
            input.replace("л", "l")
            input.replace("м", "m")
            input.replace("н", "n")
            input.replace("о", "o")
            input.replace("п", "p")
            input.replace("р", "r")
            input.replace("с", "s")
            input.replace("т", "t")
            input.replace("у", "u")
            input.replace("ф", "f")
            input.replace("х", "h")
            input.replace("ц", "c")
            input.replace("ч", "ch")
            input.replace("ш", "sh")
            input.replace("щ", "sh'")
            input.replace("ъ", "")
            input.replace("ы", "i")
            input.replace("ь", "")
            input.replace("э", "e")
            input.replace("ю", "yu")
            input.replace("я", "ya")
            input.replace(" ", divider)
            return input
        }
    }
}