package com.example.kotlinappassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Button
import android.widget.TextView
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.util.concurrent.TimeUnit
import android.widget.ImageView
import com.bumptech.glide.Glide


class `MainActivity-copy` : AppCompatActivity() {
//    private val client: OkHttpClient = OkHttpClient()
//    public var image_url1:String = "";
//    public var image_author1:String = "";
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
////        Thread {
////            exec("https://picsum.photos/v2/list?limit=10")
////        }.start()
//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            exec("https://picsum.photos/v2/list?limit=10")
//        }
//    }
//
//    private fun exec(url: String) {
//        val request = Request.Builder()
//            .url(url)
//            .build()
//
//        client.newCall(request).enqueue(object : Callback {
//            override fun onFailure(call: okhttp3.Call, e: IOException) {
//                runOnUiThread {
//                    val textView: TextView = findViewById(R.id.display) as TextView
//                    textView.text = "Failed to retrieve data"
//                }
//            }
//
//            override fun onResponse(call: okhttp3.Call, response: Response) {
//                val strResponse = response.body?.string()
//                if (strResponse != null) {
//                    runOnUiThread {
//                        val jsonArray = JSONArray(strResponse)
//
//                        val stringBuilder = StringBuilder()
////                        for (i in 0 until jsonArray.length()) {
////                            val jsonObject = jsonArray.getJSONObject(i)
////                            val id = jsonObject.getString("id")
////                            val author = jsonObject.getString("author")
////                            val image_url = jsonObject.getString("download_url")
////
////                            stringBuilder.append("Image ID: $id\n")
////                            stringBuilder.append("Image url: $image_url\n")
////                            stringBuilder.append("Author: $author\n\n")
////                        }
//                            // to display all data comming from for loop
////                        val textView: TextView = findViewById(R.id.display) as TextView
////                        textView.text = stringBuilder.toString()
//
//                        val jsonObject = jsonArray.getJSONObject(0)
//                        image_author1 = jsonObject.getString("author")
//                        image_url1 = jsonObject.getString("download_url")
//
//                        val textView: TextView = findViewById(R.id.display) as TextView
//                        textView.text = "Author Name: \n"+image_author1
//
//                        Glide.with(this@`MainActivity-copy`)
//                            .load(image_url1)
//                            .into(findViewById(R.id.author_image))
//                    }
//                } else {
//                    onFailure(call, IOException("Empty response body"))
//                }
//            }
//
//        })
//
//
//        client.dispatcher.executorService.shutdown()
//    }
}
