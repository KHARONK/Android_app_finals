package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_six.*

class Six : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)

        val northdata = intent

        // calling button and text view from xml file
        val pygmy = findViewById<View>(R.id.animal) as ImageView
        val ringtail = findViewById<View>(R.id.animal) as ImageView
        val polar = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val animalInfo = findViewById<View>(R.id.animalinfo) as TextView

        val pygybtn = findViewById<View>(R.id.Pygmy)
        //Button click to view text and image about the selected animal
        pygybtn.setOnClickListener {
            pygmy.setImageResource(R.drawable.pygmy)

            animalInfo.text =
                "Mini monkeys: High in the rainforest canopy of South America lives a tiny monkey. " +
                        "It dodges behind tree trunks and branches, freezing and dashing, just like a squirrel. It also has brown fur and a long tail like a squirrel—but it's a pygmy marmoset, the world's smallest monkey!\n" +
                        "Marmosets and their cousins, the tamarins, are some of the tiniest primates around." +
                        " A full-grown pygmy marmoset could fit in an adult human's hand, and it weighs about " +
                        "as much as a stick of butter. But there is nothing tiny about a pygmy marmoset's tail: " +
                        "it's longer than its body! The tail is not" + " prehensile, but it helps the little monkey keep its" +
                        " balance as it gallops through the treetops." +
                        "\n" + "\n" +
                        "More @https://animals.sandiegozoo.org/animals/pygmy-marmoset "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Pygmy.visibility = View.GONE
            Ringtail.visibility = View.GONE
            Bear.visibility = View.GONE
        }

        val ringtailbtn = findViewById<View>(R.id.Ringtail)
        //Button click to view text and image about the selected animal
        ringtailbtn.setOnClickListener {
            ringtail.setImageResource(R.drawable.ringtail)
            animalInfo.text =
                "Ringtails prefer habitats with rocky outcroppings, canyons, or talus slopes and can be found in semi-arid" +
                        " country, deserts, chaparral, oak woodlands, pinyon pine woodlands, juniper woodlands, and montane conifer forests.\n" +
                        "They are excellent climbers, with several behavioral and physical adaptations: ringtails can maneuver along cliffs and" +
                        " ledges by ricocheting from wall to wall. They can also climb in small crevices by pressing all four feet on one wall" +
                        " and their back against the other. Rapid, headfirst, vertical descents are accomplished by " +
                        "rotating the hind foot 180 degrees, allowing the pads of the feet and the claws to retain contact with the surface." +
                        "\n" + "\n" +
                        "More @https://animals.sandiegozoo.org/animals/ringtail "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Pygmy.visibility = View.GONE
            Ringtail.visibility = View.GONE
            Bear.visibility = View.GONE
        }

        val polarbtn = findViewById<View>(R.id.Bear)
        //Button click to view text and image about the selected animal
        polarbtn.setOnClickListener {
            polar.setImageResource(R.drawable.polar)
            animalinfo.text =
                "The largest bear in the world and the Arctic's top predator, polar bears are a powerful symbol of the strength " +
                        "and endurance of the Arctic. The polar bear's Latin name, Ursus maritimus," +
                        " means \"sea bear.\" It's an apt name for this majestic species, which spends much of its life in, " +
                        "around, or on the ocean–predominantly on the sea ice. In the United States, Alaska is home to two polar bear" +
                        " subpopulations." + "Considered talented swimmers, polar bears can sustain a pace of six miles per hour by paddling with their" +
                        " front paws and holding their hind legs flat like a rudder. They have a thick layer of body fat and a " +
                        "water-repellent coat that insulates them from the cold air and water." +
                        "\n" + "\n" +
                        "More @https://www.worldwildlife.org/species/polar-bear "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Pygmy.visibility = View.GONE
            Ringtail.visibility = View.GONE
            Bear.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        //Button click to take User back to previous activity (Activity before the current)
        backbtn.setOnClickListener {
            val Mainsix = Intent(applicationContext, Six::class.java)
            startActivity(Mainsix)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        //Button click to User back to the Continents activity
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }


    }

    //URL LINKS FOR TEXTVIEW (Animal information)
    //pygmy : https://animals.sandiegozoo.org/animals/pygmy-marmoset
    //Rintail: https://animals.sandiegozoo.org/animals/ringtail
    //Bear: https://www.worldwildlife.org/species/polar-bear

    //Animals use URL @
    //pygmy : https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.upr.org%2Fpost%2Fpygmy-rabbit-cryptic-resident-sagebrush&psig=AOvVaw1DW6JgYATUZKQ_pJY1A-Wp&ust=1636767364924000&source=images&cd=vfe&ved=0CAkQjhxqFwoTCIC-9t3XkfQCFQAAAAAdAAAAABAD
    //Rintail:https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.expressnews.com%2Flifestyle%2Fhome-garden%2Farticle%2FRingtails-a-catlike-creature-with-the-head-of-a-15882272.php&psig=AOvVaw3V9EZrG-oE9yMOfZocCodb&ust=1636767413901000&source=images&cd=vfe&ved=0CAkQjhxqFwoTCLC6qvXXkfQCFQAAAAAdAAAAABAD
    //Bear: https://media.gadventures.com/media-server/cache/5e/ad/5eada2981f6eb4f4d6bfbc8e654b8a03.png
}