package edu.bo.ucb.guias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import java.util.*

class SwipeActivity : AppCompatActivity() {

    companion object {
        val TAG : String = MainActivity::class.java.simpleName
    }
    lateinit var swipeToRefresLayout : SwipeRefreshLayout
    lateinit var message : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe)
        swipeToRefresLayout = findViewById(R.id.swipeToRefresLayout)
        message = findViewById(R.id.message_text_view)
        swipeToRefresLayout.setOnRefreshListener {
            message.text = Random().nextInt(100).toString()
            swipeToRefresLayout.isRefreshing = false
            Log.d(TAG, message.text.toString())
        }

    }
}