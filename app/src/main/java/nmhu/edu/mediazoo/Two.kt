package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_two.*

class Two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val africaintent = intent

        // calling button and text view from xml file
        val zebra = findViewById<View>(R.id.animal) as ImageView
        val impala = findViewById<View>(R.id.animal) as ImageView
        val wolf = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val animalInfo = findViewById<View>(R.id.animalinfo) as TextView

        val Zebrabtn = findViewById<View>(R.id.Zebra)
        //Button click to view text and image about the selected animal
        Zebrabtn.setOnClickListener {
            zebra.setImageResource(R.drawable.zebra)
            animalInfo.text = "Zebras are single-hoofed animals that are native to Africa. Zebras are very closely related to horses and donkeys; in fact, " +
                    "they are in the same genus, Equus. The most prominent feature of zebras is the bold patterns on their coats. \n" +
                    "Zebras have white stripes next to black or brown stripes, with the stripes ending at their bellies and the inner " +
                    "side of the legs, which are white, according to the San Diego Zoo. However, zebras have black skin under their  coats." +
                    "Each species of zebra has a different general pattern of stripes. The Grevy's zebra has very thin stripes." +
                    " The mountain zebra has vertical stripes on its neck and torso, but horizontal stripes on its haunches. Some subspecies of plains zebras have brownish " +
                    "\"shadow\" stripes between the black stripes, according to the San Diego Zoo." +
                    "\n" + "\n" +
                    "More @https://www.livescience.com/27443-zebras.html "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Zebra.visibility = View.GONE
            Impala.visibility = View.GONE
            Wolf.visibility = View.GONE
        }

        val Impalabtn = findViewById<View>(R.id.Impala)
        //Button click to view text and image about the selected animal
        Impalabtn.setOnClickListener {
            impala.setImageResource(R.drawable.imapala)
            animalInfo.text = "Impalas are medium-sized antelopes that look like a mix between a goat and a deer. They have long legs and necks and black, twisted horns. As members of " +
                    "the Bovidae family, they are related to goats, cattle and sheep. \n" +
                    "Impalas weigh around the same amount as a large dog at 88 to 165 lbs. (40 to 75 kilograms). They grow to " +
                    "33 to 39 inches (84 to 99 centimeters) long by adulthood and typically come up to the chest of an average-sized adult man, " +
                    "according to National Geographic. The male’s horns grow to 18 to 37 inches (46 to 94 cm) long." +
                    "\n"+ "\n" +
                    "More @https://www.livescience.com/52557-impalas.html "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Zebra.visibility = View.GONE
            Impala.visibility = View.GONE
            Wolf.visibility = View.GONE
        }

        val Wolfbtn = findViewById<View>(R.id.Wolf)
        //Button click to view text and image about the selected animal
        Wolfbtn.setOnClickListener {
            wolf.setImageResource(R.drawable.ewolf)
            animalInfo.text = "Native to Ethiopia, these long-limbed, slender canids are some of the most endangered animals in Africa." +
                    " They have a black, bushy tail that can reach up to 40 centimeters in length, pointed ears, and a slender snout." +
                    " They are tawny red with a white underbelly and blaze on their chests, and also have white fur on their throats," +
                    " which sweeps up and covers the underside " +
                    "of their muzzle. The female wolves tend to be paler in color than males and are smaller overall." +
                    "\n" + "\n" +
                    "More @https://www.awf.org/wildlife-conservation/ethiopian-wolf "
            //making the unwanted view visible to use the same activity for different views
            text.visibility = View.GONE
            Zebra.visibility = View.GONE
            Impala.visibility = View.GONE
            Wolf.visibility = View.GONE
        }

        val backbtn = findViewById<View>(R.id.Back)
        //Button click to take User back to previous activity (Activity before the current)
        backbtn.setOnClickListener {
            val Maintwo = Intent(applicationContext, Two::class.java)
            startActivity(Maintwo)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        //Button click to User back to the Continents activity
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }


    }

    //URL LINKS FOR TEXTVIEW (Animal information)
    //Zeebra : https://www.livescience.com/27443-zebras.html
    //Impala:https://www.livescience.com/52557-impalas.html
    //Wolf:https://www.awf.org/wildlife-conservation/ethiopian-wolf

    //Animals use URL @
    //Zeebra : PinterestThe Zeebra (6400 + views) | Zebras, Zebra, Animals
    //Impala:https://www.awf.org/sites/default/files/styles/horizontal_image/public/2020-04/Website_SpeciesPage_Impala03_02_Solutions.jpg?h=05d4a2d9&itok=8qMnWBVp
    //Wolf:https://www.awf.org/wildlife-conservation/ethiopian-wolf
}


