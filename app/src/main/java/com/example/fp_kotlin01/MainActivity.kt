package com.example.fp_kotlin01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data class User(val id: Int, val name: String, val active: Boolean)

        val users = listOf(
            User(0, "Zarai", true),
            User(1, "Bruce", false),
            User(2, "Rachel", false),
            User(3, "Brian", true),
            User(4, "Susan", false),
            User(5, "Loise", true),
            User(6, "Debora", false),
            User(7, "Jennifer", true),
            User(8, "Joyse", false),
            User(9, "Julie", true),
            User(10, "Llilian", false),
            User(11, "Wanda", true),
            User(12, "Phyllis", false),
            User(13, "Justin", true),
            User(14, "Critopher", false),
            User(15, "Martha", true),
            User(16, "Rachel", false),
            User(17, "Shirley", true),
            User(18, "Arthur", false),
            User(19, "Stepen", true),
            User(20, "Todd", true)
        )

        fun storeActiveUserNames(users: List<User>): List<String> {
            return users.filter { it.active }
                .sortedBy { it.name }
                .map { it.name }
        }

        println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * *")
        println(storeActiveUserNames(users))
        println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * *")
    }
}