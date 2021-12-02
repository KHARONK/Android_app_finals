package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_three.*
import kotlinx.android.synthetic.main.activity_two.*

class Three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val antarcticaata = intent

        // calling button and text view from xml file
        val krill = findViewById<View>(R.id.animal) as ImageView
        val whale = findViewById<View>(R.id.animal) as ImageView
        val penguin = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val animalInfo = findViewById<View>(R.id.animalinfo) as TextView

        val Krillbtn = findViewById<View>(R.id.Krill)
        //Button click to view text and image about the selected animal
        Krillbtn.setOnClickListener {
            krill.setImageResource(R.drawable.krill)
            animalInfo.text = "rill look like smaller versions of familiar crustaceans such as prawns or lobsters." + "Krill are mostly transparent, although their shells have a bright red tinge from small pigment spots. Their digestive system is usually visible and is often a vivid green from the microscopic plants they have eaten. " +
                    "They have large black eyes." + "They range in size from small tropical species (of less than 1 cm in length), to 6 cm for the largest pelagic krill species in the Southern Ocean. There is one deep-sea benthic krill species that can reach 14 cm.\n" +
                    "Adult Antarctic krill are approximately 6 cm in length and weigh over 1 gm." +
                    " Krill can change from adults into juveniles. It is estimated that Antarctic krill live for 5 to" +
                    " 10 years, but determining the age of the animals presents quite a problem for scientists." +
                  "\n"   + "\n" +
                    "More @https://www.antarctica.gov.au/about-antarctica/animals/krill/ "

            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Krill.visibility = View.GONE
            Whale.visibility = View.GONE
            Penguin.visibility = View.GONE
        }

        val Whalebtn = findViewById<View>(R.id.Whale)
        //Button click to view text and image about the selected animal
        Whalebtn.setOnClickListener {
            whale.setImageResource(R.drawable.whale)
            animalInfo.text = "Whales come in different sizes, but they all have smooth skin, flippers, and flat tails " +
                    "(called flukes) that propel them through the water. They give birth and nurse their young in the water" +
                    "  and live their entire lives there. Their" +
                    "specialized nose and ears have adapted to life underwater. They have excellent vision," +
                    " large brains, and are highly intelligent." + "They use echolocation to find food. There are 13 baleen whale species, including the gray whale, blue whale, and humpback whale. Baleen is made up of tough, flexible strands of keratin that hang down from the top of the whale's enormous mouth." +
                    " Baleen whales are much larger than most toothed whales and have a double blowhole on top of the head." +
                    "\n" +  "\n" +
                    "More @https://animals.sandiegozoo.org/animals/whale "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Krill.visibility = View.GONE
            Whale.visibility = View.GONE
            Penguin.visibility = View.GONE
        }

        val Penguinebtn = findViewById<View>(R.id.Penguin)
        //Button click to view text and image about the selected animal
        Penguinebtn.setOnClickListener {
            penguin.setImageResource(R.drawable.penguin)
            animalInfo.text = "All 18 species of penguins live in the Southern Hemisphere. (See Appendix for information on distribution for each species.) Penguins are found on every continent in " +
                    "the Southern Hemisphere. They are abundant on many temperate and subantarctic islands." + "In general, flightless penguins have greater limits on foraging ranges and search capacities compared to birds that can fly. Thus to be successful, penguins must find predictable food sources within their limited foraging range. " +
                    "About 95% of Galápagos penguins, the most northernly of all penguin species, is found along the western coast of" +
                    "Isabela and around Fernandina Island by the most productive upswellings caused by the Equatorial Undercurrent " +
                    "(also called the Cromwell Current)." +  "\n" +  "\n" +
                    "More @https://seaworld.org/animals/all-about/penguins/habitat-and-distribution/ "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Krill.visibility = View.GONE
            Whale.visibility = View.GONE
            Penguin.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        //Button click to take User back to previous activity (Activity before the current)
        backbtn.setOnClickListener {
            val Mainthree = Intent(applicationContext, Three::class.java)
            startActivity(Mainthree)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        //Button click to User back to the Continents activity
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }

    }

    //URL LINKS FOR TEXTVIEW (Animal information)
    //Krill : https://www.antarctica.gov.au/about-antarctica/animals/krill/
    //Whale:https://animals.sandiegozoo.org/animals/whale
    //Penguin:https://seaworld.org/animals/all-about/penguins/habitat-and-distribution/

    //Animals use URL @
    //Krill : The Pew Charitable TrustsTiny Antarctic Krill Play Big Role in Climate Mitigation | The Pew  Charitable Trusts
    //Whale: Scuba DivingHow to Swim with Humpback Whales in Tonga | Scuba Diving
    //Penguin :Oceanwide ExpeditionsKing Penguin | Facts, pictures & more about King Penguin
}