package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.content.res.Configuration
import android.media.MediaPlayer
import android.widget.ImageView
import java.io.IOException
import android.media.AudioManager
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.widget.Button
import kotlin.math.max
import kotlin.math.min

class MainActivity : AppCompatActivity() {
    private lateinit var scaleGestureDetector: ScaleGestureDetector

    private var scaleFactor = 1.0f
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.wlcmImage)
        scaleGestureDetector = ScaleGestureDetector(this, ScaleListener())


        var mediaPlayer: MediaPlayer? //will hold mediaPlayer
        val strtbtn = findViewById<View>(R.id.go) as Button
        //Button click to open continents activity
        strtbtn.setOnClickListener {
            //to play audio on button click on the continents activity
            playAudio()
            val continentsintent = Intent(applicationContext, Continents::class.java)
            startActivity(continentsintent)
        }

    }
    override fun onTouchEvent(motionEvent: MotionEvent): Boolean {
        scaleGestureDetector.onTouchEvent(motionEvent)
        return true
    }

    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(scaleGestureDetector: ScaleGestureDetector): Boolean {
            scaleFactor *= scaleGestureDetector.scaleFactor
            //code to scale size of image zoom
            scaleFactor = max(0.1f, min(scaleFactor, 10.0f))
            imageView.scaleX = scaleFactor
            imageView.scaleY = scaleFactor
            return true
        }
    }

    private fun playAudio() {
        val audioUrl = "https://www.videvo.net/sound-effect/lion-growl-angry-gene-pe931903/249943/"
        // initializing media player
        var mediaPlayer = MediaPlayer()
        // code to stream media player (audio).
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)

        // url to media player (audio).
        try {
            mediaPlayer.setDataSource(audioUrl)
            // code to prepare start media player.
            mediaPlayer.prepare()
            mediaPlayer.start()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
        //image source: https://www.themoviedb.org/t/p/original/p0EBWE757Rzmgo4XkNOjCeDPFGn.jpg

    }




