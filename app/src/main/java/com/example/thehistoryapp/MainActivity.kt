package com.example.thehistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Array of Dead People Declarations. It must tell you who the person was and must give the cause of death, death age and year.
    var infOfDeadPeople = arrayOf(                                                                  //(IIE, 2024)
        "Steve Biko - Steve Biko, a fearless leader in the anti-apartheid movement, inspired millions with his courage and dedication to equality. Though tragically taken from us on the 12th of September 1977, his legacy continues to inspire generations worldwide.", //(R.Martin, 2010)
        "Shanthivathie Naidoo - Shanthivathie Naidoo, a tireless advocate for justice and equality, left an indelible mark on South Africa's anti-apartheid struggle. Her memory lives on as a beacon of hope and resilience.", //(E.S. Reddy, 2012)
        "Desmond Tutu - Desmond Tutu, a champion of peace and reconciliation, touched the lives of countless individuals with his unwavering compassion and commitment to social justice. Though he may have left us, his teachings and spirit continue to guide us towards a brighter future.", //(MELDRUM, 2021)
        "Joan Of Arc - Joan Of Arc, a courageous and visionary leader, defied all odds to fight for her beliefs and her country. Her bravery and determination in the face of adversity inspire us to pursue our dreams with unwavering courage.", //(History.Com Editors, 2023).
        "Nelson Mandela - Nelson Mandela, an icon of freedom and democracy, dedicated his life to the pursuit of justice and equality for all. Though he may have passed away on the 5th of December 2013, his legacy of forgiveness and reconciliation will endure for generations to come.", //(History.Com Editors, 2023).
        "Isaac Newton - Isaac Newton's groundbreaking contributions to science and mathematics continue to shape our understanding of the universe. His insatiable curiosity and relentless pursuit of knowledge serve as an inspiration to scholars and thinkers around the world.", //(Britanica.com, 2011)
        "Mahatma Gandhi - Mahatma Gandhi, the father of nonviolent resistance, led India to independence through peaceful protest and civil disobedience. His teachings of love and compassion continue to resonate with people of all backgrounds and cultures.", //(History.Com Editors, 2023).
        "Martin Luther King Jr. - Martin Luther King Jr., a visionary leader in the civil rights movement, inspired millions with his message of hope and equality. Though his life was tragically cut short, his dream of a more just and equitable society lives on in our hearts and minds.", //(nationalarchives.gov, 1997)
        "Fredrick John Harris - Fredrick John Harris, a fearless activist in the fight against apartheid, gave his life in pursuit of a better future for all South Africans. His sacrifice will never be forgotten, and his legacy continues to inspire us to stand up for what is right.",//(H.Lewin, 1974)
        "Harriet Tubman - Harriet Tubman, a trailblazer in the abolitionist movement, risked her life to lead hundreds of enslaved individuals to freedom. Her courage and selflessness serve as a reminder of the power of one person to make a difference in the world.",//(nps.gov, 2022)
        "Marie Curie - Marie Curie, a pioneering scientist and the first woman to win a Nobel Prize, revolutionized our understanding of radioactivity. Her legacy continues to inspire women in STEM fields around the globe.", //(Britannica.com, 2011)
        "Leonardo da Vinci - Leonardo da Vinci, a true Renaissance man, was a painter, sculptor, architect, inventor, and more. His genius and creativity have left an indelible mark on art, science, and innovation for centuries to come.", //(History.Com Editors, 2023).
        "Amelia Earhart - Amelia Earhart, a pioneering aviator and women's rights advocate, shattered stereotypes and pushed the boundaries of what was thought possible. Her courage and determination continue to inspire adventurers and dreamers everywhere.", //(nationalarchives.gov, 1997)
        "Frida Kahlo - Frida Kahlo, a celebrated Mexican artist, captured the complexities of the human experience through her vibrant and emotive paintings. Her resilience in the face of adversity continues to resonate with audiences worldwide." //(H.Lewin, 1974)

    )

    //List of the Death ages which the array will collect information from.
    var ages = arrayOf(                                                                             //(IIE, 2024)
        30, //steve biko
        58, //Shanthivathie Naidoo
        90, //desmond tutu
        19, //joan of arc
        95, //nelson mandela
        84, //isaac newton
        78, //mahatma ghandi
        39, //martin luther king jr.
        27, //fredrick john harris
        91, //harriet tubman
        66, //marie curie
        67, //leonardo da vinci
        39, //amelia earhart
        47 //frida kahlo


    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // UI Button Declarations:
        val clearAge = findViewById<Button>(R.id.clearAgeBtn)                                       //(IIE, 2024)
        val generateAge = findViewById<Button>(R.id.genAgeBtn)                                      //(IIE, 2024)

        // Text Declarations:
        val entAge = findViewById<EditText>(R.id.nameTxt)                                           //(IIE, 2024)
        val txtOutput = findViewById<TextView>(R.id.txtView)                                        //(IIE, 2024)

        //Generate Button Instructions:
        generateAge.setOnClickListener {                                                     //(IIE, 2024)
            val enteredAge = entAge.text.toString().toIntOrNull()                                   //(IIE, 2024)
            if (enteredAge != null) {
                val index = ages.indexOf(enteredAge)
                if (index != -1 && index < infOfDeadPeople.size) {
                    val name = infOfDeadPeople[index]
                    txtOutput.text = "The person who died at age $enteredAge, is $name."            //(openAI, 2024)

                    //Error handling
                } else {
                    txtOutput.text = "No one in history was recorded to have passed away at the age of $enteredAge." //(IIE, 2024)
                }
            }
            // Error handling:
            else {
                txtOutput.text = "The age you've entered is invalid. Please enter a valid age(eg.37)." //(IIE, 2024)
            }
        }

        //Clear Button Instructions:
        clearAge.setOnClickListener {
            entAge.text.clear()
            txtOutput.text = ""                                                                     //(IIE, 2024)
        }
    }
}

/* Referencing list:
- History.Com Editors, 2023. South African president Nelson Mandela dies at 95, April 3 2023[ONLINE]. available at https://www.history.com/this-day-in-history[Accessed 03 april 2024]
- Roland Martin, 2010. Black Consiousness Movement, February 9 2010[ONLINE]. available at https://www.britanica.com/topic/Black-Consciousness-movement[Accessed 03 april 2024]
- E.s. Reddy, 2012. Truth and Reconciliation Commision(1997), June 30 2013[ONLINE]. available at https://www.sahistory.org.za/people/shanthivathie-naidoo[Accessed 03 april 2024]
- Lewin, H. (1974) Bandiet: Seven Years in a South African Prison, p.37|Karis, T.G. & Gerhart, G.M. (1997).| Gail M. Gerhart, Teresa Barnes, Antony Bugg-Levine, Thomas Karis, Nimrod Mkele .From Protest to Challenge 4-Political Profiles (1882-1990) http://www.jacana.co.za/component/virtuemart/?keyword=from+protest+to+ch (last accessed 03 April 2024)
- National Archieves, 1997. The Story of Martin Luther King Jr., 4 November 1997[online]. available at https://www.nationalarchieves.com[accessed on 03 April 2024]
- OpenAI. (n.d.). ChatGPT. In a conversation with Bobby Chepi on 03 April 2024. Retrieved from https://www.openai.com/chatgpt
- IIE, 2024. INTRODUCTION TO MOBILE APPLICATION DEVELOPMENT, accessed on 03 April 2024
 */