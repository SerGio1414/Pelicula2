package com.example.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        agregar_pelicula()

        val adaptador: AdaptadorPeliculas = AdaptadorPeliculas(this,peliculas)

        val listView:ListView = findViewById(R.id.listview)

        listView.adapter = adaptador
    }

    fun agregar_pelicula(){
        peliculas.add(Pelicula (1, "Tenet", "Armado con una única palabra, Tenet, y luchando por la supervivencia del mundo, el protagonista viaja por el oscuro mundo del espionaje internacional  en una misión  que irá más allá del tempo real",
            R.drawable.tenet
        ))
        peliculas.add(Pelicula (2,  "Origen",  "A ve ladrón que roba secretos corporativos a través del uso de la tecnología de compartir sueños, se le da la tarea de implantar  una idea de la mente  en un jefe  de una gran empresa",
            R.drawable.inception
        ))
                peliculas.add(Pelicula( 3,  "Interstellar",  "Un equipo de exploradores viaja a través de un agujero de gusano en el espacio en un intento de garantizar  la supervivencia de la humanidad",
            R.drawable.interstellar
        ))
        peliculas.add(Pelicula( 4,  "El prestigio",  "Tras un trágico accidente, dos magos profesionales empiezan una batalla para crear el mejor truco, sacrificando todo en sus vidas para superarse el uno al otro",
            R.drawable.theprestige
        ))
    }


}