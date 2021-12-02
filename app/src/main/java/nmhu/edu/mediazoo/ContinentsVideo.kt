package nmhu.edu.mediazoo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_continents_video.*
import android.view.View

import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

import android.media.MediaPlayer
import android.media.MediaPlayer.OnPreparedListener
import android.os.Handler
import android.widget.SeekBar.OnSeekBarChangeListener
import android.os.CountDownTimer
import java.lang.Exception

class ContinentsVideo : AppCompatActivity() {

    private var vid:VideoView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continents_video)

        val videoView = findViewById<VideoView>(R.id.vidview)
        //video from raw file
        val url = "android.resource://" + packageName.toString() + "/" + R.raw.zoo
        val video = Uri.parse(url)
        videoView.setVideoURI(video)

        //calling buttons by id to next activity.
        val playBtn = findViewById<View>(R.id.playbtn) as Button
        playBtn.setOnClickListener{
            //Button click to play video
            videoView.start()
            //initialiseSeekBar()
        }

        val stopBtn = findViewById<View>(R.id.stopbtn) as Button
        stopBtn.setOnClickListener{
            //Button click to stop video
            videoView.pause()
        }

        val backbtn = findViewById<View>(R.id.Back)
        //Button to take User back to previous activity (activity before the current).
        backbtn.setOnClickListener {
            val Mainone = Intent(applicationContext, MainActivity::class.java)
            startActivity(Mainone)

        }

        val continentbtn = findViewById<View>(R.id.Continent)
        //Button click to open continents activity
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }

        val seekBr= findViewById<View>(R.id.seekbr) as SeekBar
        seekbr.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean)
            {
                if (fromUser) vid?.seekTo(progress)
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?)
            {

            }
            override fun onStopTrackingTouch(seekBar: SeekBar?)
            {

            }
        })
    }

    // Initialize seekbar
    private fun initialiseSeekBar(){
        seekbr.max = vid!!.duration

        val handler = Handler()
        handler.postDelayed(object: Runnable{
            override fun run() {
                try {
                    seekbr.progress = vid!!.currentPosition
                    handler.postDelayed(this,1000)
                }
                catch (e:Exception){
                    seekbr.progress = 0
                }
            }
        },0)
    }
}

