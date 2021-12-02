package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_four.*
import kotlinx.android.synthetic.main.activity_three.*

class Four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        val australiadata = intent

        // calling button and text view from xml file
        val deer = findViewById<View>(R.id.animal) as ImageView
        val dolphine = findViewById<View>(R.id.animal) as ImageView
        val kangaroo = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val animalInfo = findViewById<View>(R.id.animalinfo) as TextView


        val Deerbtn = findViewById<View>(R.id.Deer)
        //Button click to view text and image about the selected animal
        Deerbtn.setOnClickListener {
            deer.setImageResource(R.drawable.deer)
            animalInfo.text = "deer, (family Cervidae), any of 43 species of hoofed ruminants in the order Artiodactyla, " +
                    "notable for having two large and two small hooves on each foot and also for having antlers in the males of most " +
                    "species and in the females of one species. Deer are native to all continents except Australia and Antarctica, and" +
                    " many species have been widely introduced beyond their original habitats as game animals. One species, the reindeer" +
                    " (also known as the caribou), has been domesticated. Some swamp and island species are endangered, but most continental " +
                    "species are flourishing under protection and good management. Deer, when granted some protection, readily exploit man-" +
                    "made disturbances caused by agriculture, forestry, and urbanization." +
                    "\n" + "\n" +
                    "More @https://www.britannica.com/animal/deer "

            //making the unwanted view visible to use the same activity for different views
            Deer.visibility = View.GONE
            Dolphine.visibility = View.GONE
            Kangaroo.visibility = View.GONE
        }

        val Dolphinebtn = findViewById<View>(R.id.Dolphine)
        //Button click to view text and image about the selected animal
        Dolphinebtn.setOnClickListener {
            dolphine.setImageResource(R.drawable.dolphine)
            animalInfo.text = "The scientific order, called Cetacea, includes dolphins, whales, and porpoises. " +
                    "The dolphin family Delphinidae has 36 species in all. It can get confusing at times, because some members of " +
                    "the dolphin family have the word whale in their common name. In fact, the largest dolphin is the killer whale! Depending " +
                    "" + "on the species, dolphins range in color from white, pearl, and pink to darker shades of brown, gray, " +
                    "blue, and black." + "Dolphins have smooth skin, flippers, and a dorsal fin. They have a long, slender snout with about 100 teeth, and a streamlined body. " +
                    "The single blowhole on top of their head has a flat that opens to reveal a pair of nostrils, which dolphins use for breathing when they surface." +
                    "\n" + "\n" +
                    "More @https://animals.sandiegozoo.org/animals/dolphin "

            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Deer.visibility = View.GONE
            Dolphine.visibility = View.GONE
            Kangaroo.visibility = View.GONE
        }

        val Kangaroobtn = findViewById<View>(R.id.Kangaroo)
        //Button click to view text and image about the selected animal
        Kangaroobtn.setOnClickListener {
            kangaroo.setImageResource(R.drawable.kangaroo)
            animalInfo.text = "The word kangaroo derives from 'Gangurru', the name given to Eastern Grey Kangaroos by the" +
                    " Guuga Yimithirr people of Far North Queensland. Kangaroos are of cultural and spiritual significance " +
                    "to Aboriginal people across Australia. Plus, their meat was, and continues to be, a staple protein source; " +
                    "pelts were used for clothing and rugs; and their skin crafted into water bags." + "All kangaroos have short hair, powerful hind legs, " +
                    "small forelimbs, big feet and a long tail. They have excellent hearing and keen eyesight. Depending on the species, their fur coat can be red, grey or light to dark brown.\n" +
                      "Kangaroos are famous for their means of locomotion: hopping! They can reach speeds of 60kph, " +
                    "clearing more than 8m with a single hop!" +
                    "\n" + "\n" +
                    "More @https://www.bushheritage.org.au/species/kangaroos "

            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Deer.visibility = View.GONE
            Dolphine.visibility = View.GONE
            Kangaroo.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        //Button click to take User back to previous activity (Activity before the current)
        backbtn.setOnClickListener {
            val Mainfour = Intent(applicationContext, Four::class.java)
            startActivity(Mainfour)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        //Button click to User back to the Continents activity
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }
    }

    //URL LINKS FOR TEXTVIEW (Animal information)
    //Deer : https://www.britannica.com/animal/deer
    //Dolphine:https://animals.sandiegozoo.org/animals/dolphin
    //Kangaroo:https://www.bushheritage.org.au/species/kangaroos

    //Animals use URL @
    //Deer : https://www.google.com/url?sa=i&url=https%3A%2F%2Fanimals-are-cool.fandom.com%2Fwiki%2FFallow_Deer&psig=AOvVaw06NAjoHXUSN7Ou2-r5Q1ft&ust=1636766453132000&source=images&cd=vfe&ved=0CAkQjhxqFwoTCICRvKvUkfQCFQAAAAAdAAAAABAD
    //Dolphine:https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.fisheries.noaa.gov%2Ffeature-story%2Fsix-reasons-why-you-should-not-swim-wild-spinner-dolphins&psig=AOvVaw3I8JC05J0vjaxDrv3To1OY&ust=1636766502564000&source=images&cd=vfe&ved=0CAkQjhxqFwoTCOjO4sLUkfQCFQAAAAAdAAAAABAD
    //Kangaroo:National GeographicThe Mystery of Kangaroo Adoptions
}