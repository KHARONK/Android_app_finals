package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_seven.*

class Seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        val outhdata = intent

        // calling button and text view from xml file
        val iguana = findViewById<View>(R.id.animal) as ImageView
        val jaguar = findViewById<View>(R.id.animal) as ImageView
        val toucan = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val animalInfo = findViewById<View>(R.id.animalinfo) as TextView

        val iguanabtn = findViewById<View>(R.id.Iguana)
        //Button click to view text and image about the selected animal
        iguanabtn.setOnClickListener {
            iguana.setImageResource(R.drawable.iguana)
            animalInfo.text = " Green iguanas are not native to Florida and are considered an invasive species due to their impacts " +
                    "to native wildlife. Like all nonnative reptile species, green iguanas are not protected in Florida except by " +
                    "anti-cruelty law and can be humanely killed on private property with landowner permission. This species can be " +
                    "captured and humanely killed year-round and without a permit or hunting license on 25 public lands in south Florida." +
                    "+ Green iguanas are large, typically green lizards, though they can sometimes be brown or almost black in color." + " Some adults can take on an orange or pink coloration during certain times of the year. " +
                      "Hatchling and young green iguanas usually have bright green coloration." +
                      "\n" +  "\n" +
                      "More @https://myfwc.com/wildlifehabitats/profiles/reptiles/green-iguana/ "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Iguana.visibility = View.GONE
            Jaguar.visibility = View.GONE
            Toucan.visibility = View.GONE
        }

        val jaguarbtn = findViewById<View>(R.id.Jaguar)
        //Button click to view text and image about the selected animal
        jaguarbtn.setOnClickListener {
            jaguar.setImageResource(R.drawable.jaguar)
            animalInfo.text = " Jaguars are the largest of South America's big cats and the third largest cats in the world. " +
                    "Their fur is usually tan or orange with black spots, called " + "\"rosettes\" because they are shaped like roses. " +
                    "Some jaguars are so dark they don't seem to have spots." + "Unlike many other cats, jaguars do not avoid water; in fact, " +
                    "they are quite good swimmers. Rivers provide prey in the form of fish, turtles, or caimans—small, alligatorlike animals. " +
                    "Jaguars also eat larger animals such as deer, peccaries, capybaras,and tapirs. " +
                    "They sometimes climb trees to prepare an ambush, killing their prey with one powerful bite." +
                    "\n" +  "\n" +
                    "More @https://kids.nationalgeographic.com/animals/mammals/facts/jaguar"
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Iguana.visibility = View.GONE
            Jaguar.visibility = View.GONE
            Toucan.visibility = View.GONE
        }

        val toucanbtn = findViewById<View>(R.id.Toucan)
        //Button click to view text and image about the selected animal
        toucanbtn.setOnClickListener {
            toucan.setImageResource(R.drawable.toucan)
            animalInfo.text = "toucan, (family Ramphastidae), the common name given to numerous species of tropical " +
                    "American forest birds known for their large and strikingly coloured bills. The term toucan—derived from tucano, " +
                    "a native Brazilian term for the bird—is used in the common name of about 15 species (Ramphastos and Andigena), " +
                    "and the aracaris and toucanets are " + "very similar smaller birds of the same family that are also considered " +
                    "toucans, bringing the total number of " + "species to about 35." + "The largest toucans, up to 60 cm (24 inches) long, are Ramphastos species. An example common in zoos is the red-breasted (also called green-billed) toucan (R. dicolorus) of " +
                    "Amazonia. Another common zoo resident is the keel-billed toucan (R. sulfuratus), which is about 50 cm (20 inches) long."+
                    "\n" +  "\n" +
                    "More @https://www.britannica.com/animal/toucan"

            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Iguana.visibility = View.GONE
            Jaguar.visibility = View.GONE
            Toucan.visibility = View.GONE
        }

        val backbtn = findViewById<View>(R.id.Back)
        //Button click to take User back to previous activity (Activity before the current)
        backbtn.setOnClickListener {
            val Mainseven = Intent(applicationContext, Seven::class.java)
            startActivity(Mainseven)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        //Button click to User back to the Continents activity
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }


    }

    //URL LINKS FOR TEXTVIEW (Animal information)
    //Iguana : https://myfwc.com/wildlifehabitats/profiles/reptiles/green-iguana/
    //Jaguar : https://kids.nationalgeographic.com/animals/mammals/facts/jaguar
    //Toucan :https://www.britannica.com/animal/toucan

    //Animals use URL @
    //Iguana : https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.britannica.com%2Fanimal%2Fjaguar-mammal&psig=AOvVaw3z-u2Rz_BZZkLxnQgT6ylU&ust=1636767147813000&source=images&cd=vfe&ved=0CAkQjhxqFwoTCKizzPfWkfQCFQAAAAAdAAAAABAJ
    //Jaguar: https://cdn.newsapi.com.au/image/v1/e78009013ca2434b6cc358a5d116029c
    //Toucan :https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.europosters.eu%2Fposters%2Fbirds-toucan-v70954&psig=AOvVaw3E-R8Uh9Xj1MwTO-wYqGDF&ust=1636767270967000&source=images&cd=vfe&ved=0CAkQjhxqFwoTCJDnsLPXkfQCFQAAAAAdAAAAABAe
}