package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class Continents : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continents)


        //intent to open next activity
        val maindata = intent

        // Button click to open all continents activity
        // button views by ID's from xml file
        val asibtn = findViewById<View>(R.id.asia)
        //Button click to open Asia activity
        asibtn.setOnClickListener {
            val asiaintent = Intent(applicationContext, Asia::class.java)
            startActivity(asiaintent)
        }

        val africatn = findViewById<View>(R.id.africa)
        //Button click to open Africa activity
        africatn.setOnClickListener {
            val africaintent = Intent(applicationContext, Two::class.java)
            startActivity(africaintent)
        }

        val antarcticabtn = findViewById<View>(R.id.antarctica)
        //Button click to open Antarctica activity
        antarcticabtn.setOnClickListener {
            val antarcticaintent = Intent(applicationContext, Three::class.java)
            startActivity(antarcticaintent)
        }

        val australiabtn = findViewById<View>(R.id.australia)
        //Button click to open Australia activity
        australiabtn.setOnClickListener {
            val australiaintent = Intent(applicationContext, Four::class.java)
            startActivity(australiaintent)
        }

        val europebtn = findViewById<View>(R.id.europe)
        //Button click to open Europe activity
        europebtn.setOnClickListener {
            val europeintent = Intent(applicationContext, Five::class.java)
            startActivity(europeintent)
        }

        val northbtn = findViewById<View>(R.id.north)
        //Button click to open North America activity
        northbtn.setOnClickListener {
            val northintent = Intent(applicationContext, Six::class.java)
            startActivity(northintent)
        }

        val southbtn = findViewById<View>(R.id.south)
        //Button click to open South America activity
        southbtn.setOnClickListener {
            val southintent = Intent(applicationContext, Seven::class.java)
            startActivity(southintent)
        }

        val lifebtn = findViewById<View>(R.id.life)
        //Button click to open VideoView activity
        lifebtn.setOnClickListener {
            val videointent = Intent(applicationContext, ContinentsVideo::class.java)
            startActivity(videointent)
        }

        val homebtn = findViewById<View>(R.id.Home)
        //Button click to take User back to home activity (MainActivity)
        homebtn.setOnClickListener {
            val homeintent = Intent(applicationContext, MainActivity::class.java)
            startActivity(homeintent)
        }


}
}




