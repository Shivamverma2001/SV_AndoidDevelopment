package com.example.basic

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView.FindListener
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import org.json.JSONObject
import java.net.URL
import java.text.SimpleDateFormat
import java.util.*

class ca2Weather1 : AppCompatActivity() {
    val city:String="dhaka,bd"
    val API:String="337d7ac9737b1ef4b4faf57281898449"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca2_weather1)
        weatherTask().execute()
    }
    inner class weatherTask(): AsyncTask<String, Void, String>(){
        override fun onPreExecute() {
            super.onPreExecute()
            findViewById<ProgressBar>(R.id.loader).visibility= View.VISIBLE
            findViewById<RelativeLayout>(R.id.mainC).visibility= View.GONE
            findViewById<TextView>(R.id.eroortext).visibility=View.GONE
        }

        override fun doInBackground(vararg p0: String?): String? {
            var response:String?
            try{
                response= URL("https://api.openweather.org/data/2.5/weather?q=$city&units=metric&appid=$API")
                        .readText(Charsets.UTF_8)
            }
            catch (e: Exception){
                response=null
            }
            return response
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
                try{
                    val jsonObj=JSONObject(result)
                    val main=jsonObj.getJSONObject("main")
                    val sys=jsonObj.getJSONObject("sys")
                    val wind=jsonObj.getJSONObject("wind")
                    val weather=jsonObj.getJSONArray("weather").getJSONObject(0)
                    val upadatedAt:Long=jsonObj.getLong("dt")
                    val updatedAtText="Updated at: "+SimpleDateFormat("dd/MM/yyyy hh:mm a",Locale.ENGLISH).format(
                        Date(upadatedAt*1000))
                    val temp=main.getString("temp")+"°C"
                    val tempMin="Min Temp: "+main.getString("temp_min")+"°C"
                    val tempMax="Max Temp: "+main.getString("temp_max")+"°C"
                    val pressure=main.getString("pressure")
                    val humidity=main.getString("humidity")
                    val sunrise:Long=main.getLong("sunrise")
                    val sunset:Long=main.getLong("sunset")
                    val windSpeed=main.getString("speed")
                    val weatherDescription=main.getString("description")
                    val address=jsonObj.getString("name")+", "+sys.getString("country")
                    findViewById<TextView>(R.id.add).text=address
                    findViewById<TextView>(R.id.upd).text=updatedAtText
                    findViewById<TextView>(R.id.status).text=weatherDescription
                    findViewById<TextView>(R.id.temp).text=temp
                    findViewById<TextView>(R.id.temp_min).text=tempMin
                    findViewById<TextView>(R.id.temp_max).text=tempMax
                    findViewById<TextView>(R.id.sunrise).text=SimpleDateFormat("hh:mm a",Locale.ENGLISH).format(
                        Date(sunrise*1000)
                    )
                    findViewById<TextView>(R.id.sunset).text=SimpleDateFormat("hh:mm a",Locale.ENGLISH).format(Date(sunset*1000))
                    findViewById<TextView>(R.id.wind).text=windSpeed
                    findViewById<TextView>(R.id.pressure).text=pressure
                    findViewById<TextView>(R.id.humidity).text=humidity
                    findViewById<ProgressBar>(R.id.loader).visibility=View.GONE
                    findViewById<RelativeLayout>(R.id.mainC).visibility=View.VISIBLE
                }
                catch (e: Exception){
                    findViewById<ProgressBar>(R.id.loader).visibility=View.GONE
                    findViewById<RelativeLayout>(R.id.mainC).visibility=View.VISIBLE
                }
            }
        }
    }