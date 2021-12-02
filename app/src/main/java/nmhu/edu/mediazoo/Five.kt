package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_five.*

class Five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        val europedata = intent


        // calling button and text view from xml file
        val elk = findViewById<View>(R.id.animal) as ImageView
        val hare = findViewById<View>(R.id.animal) as ImageView
        val squirrel = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val animalInfo = findViewById<View>(R.id.animalinfo) as TextView

        val elkbnt = findViewById<View>(R.id.Elk)
        //Button click to view text and image about the selected animal
        elkbnt.setOnClickListener {
            elk.setImageResource(R.drawable.elk)
            animalInfo.text = "The word elk is derived from the ancient Germanic root word meaning “stag” or “hart.” " +
                    "In Europe, elk is the common name for the moose. In 16th-century Virginia the name was applied by" +
                    " English settlers to the native subspecies of the red deer, and that name also came into popular use " +
                    "in New England. An alternate name, wapiti (“white deer” in Shawnee), comes from the light-coloured coat " +
                    "of the bull elk. Although less ambiguous than elk, wapiti never became popular, and in North America today " +
                    "elk is the firmly established proper name. " + "In Asia the elk, along with the red deer of Persia, is called by " +
                    "the Mongolian name maral."+"Exceeded in size only by the moose, large male elk from Alberta average 380 kg (840 pounds) " +
                    "in early winter. Body mass varies considerably within and between populations and increases from south to north. " +
                   "\n" +  "\n" +
                    "More @https://www.britannica.com/animal/elk-mammal "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Elk.visibility = View.GONE
            Hare.visibility = View.GONE
            Squirrel.visibility = View.GONE
        }

        val harebtn = findViewById<View>(R.id.Hare)
        //Button click to view text and image about the selected animal
        harebtn.setOnClickListener {
            hare.setImageResource(R.drawable.hare)
            animalInfo.text = "Hares are the largest lagomorphs. Depending on the species, the body is about 40–70 cm (16–28 inches) long, " +
                    "with feet up to 15 cm (5.9 inches) long and ears up to 20 cm (7.9 inches) that apparently help dissipate excess body heat." +
                    " Although usually gray-brown throughout the year, hares living in northern latitudes may turn white in winter " +
                    "(in the far north some remain white all year). One such “varying hare” is the smallest member of genus Lepus, " +
                    "the snowshoe hare (L. americanus) of North America. Most Lepus species have very high rates of reproduction," +
                    " with multiple large litters being produced each year. Young hares (leverets) " + "are typically born fully " +
                    "furred and with their eyes open and are able to hop a few minutes after birth."+ "" +
                    "\n" +  "\n" +
                    "More @https://www.britannica.com/animal/hare-mammal"
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Elk.visibility = View.GONE
            Hare.visibility = View.GONE
            Squirrel.visibility = View.GONE
        }

        val squirrelbtn = findViewById<View>(R.id.Squirrel)
        //Button click to view text and image about the selected animal
        squirrelbtn.setOnClickListener {
            squirrel.setImageResource(R.drawable.squi)
            animalInfo.text ="Tree squirrels have slender, lanky bodies, long, muscular limbs, and furred feet." +
                    " The forefeet have four long digits plus a short, stubby thumb, and the five-toed hind feet are narrow or " +
                    "moderately wide. The bald soles of the feet take the form of prominent, fleshy pads. Because the ankle joints " +
                    "are flexible and can be rotated, squirrels can rapidly descend trees headfirst with the hind feet splayed flat " +
                    "against the trunk. Their large, bright eyes convey an alert demeanour, and the broad, short head tapers to a blunt " +
                    "muzzle adorned with long whiskers. The rounded ears, small in relation to body size, are densely covered with short," +
                    " fine hairs, which form a " + "long tuft at the tips of the ears in some species. " +
                    "The tail is about as long as head and body or appreciably longer. " +
                    "\n" +  "\n" +
                    "More @https://www.britannica.com/animal/squirrel"
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Elk.visibility = View.GONE
            Hare.visibility = View.GONE
            Squirrel.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        //Button click to take User back to previous activity (Activity before the current)
        backbtn.setOnClickListener {
            val Mainfive = Intent(applicationContext, Five::class.java)
            startActivity(Mainfive)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        //Button click to User back to the Continents activity
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }
    }

    //URL LINKS FOR TEXTVIEW (Animal information)
    //Elk : https://www.britannica.com/animal/elk-mammal
    //Hare: https://www.britannica.com/animal/hare-mammal
    //Squirrel: https://www.britannica.com/animal/squirrel

    //Animals use URL @
    //Elk : Fox NewsOregon archery hunter gored, killed by charging elk, police say | Fox News
    //Hare:https://www.nationalgeographic.com/animals/article/140717-snowshoe-hares-climate-change-environment-animals-science
    //Squirrel:https://static.independent.co.uk/2021/01/27/12/newFile-4.jpg?width=990&auto=webp&quality=75&crop=982:726,smart
}