package com.example.peliculas.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.peliculas.AdaptadorPeliculas
import com.example.peliculas.Pelicula
import com.example.peliculas.R
import com.example.peliculas.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    var peliculas:ArrayList<Pelicula> = ArrayList();
    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        agregar_pelicula()

        val lv_series: ListView = root.findViewById(R.id.listView_Series)

        val adaptador= AdaptadorPeliculas(root.context,peliculas)

        lv_series.adapter = adaptador

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun agregar_pelicula(){
        peliculas.add(
            Pelicula (1, "Tenet", "Armado con una única palabra, Tenet, y luchando por la supervivencia del mundo, el protagonista viaja por el oscuro mundo del espionaje internacional  en una misión  que irá más allá del tempo real",
                R.drawable.tenet
            )
        )
        peliculas.add(
            Pelicula (2,  "Origen",  "A ve ladrón que roba secretos corporativos a través del uso de la tecnología de compartir sueños, se le da la tarea de implantar  una idea de la mente  en un jefe  de una gran empresa",
                R.drawable.inception
            )
        )
        peliculas.add(
            Pelicula( 3,  "Interstellar",  "Un equipo de exploradores viaja a través de un agujero de gusano en el espacio en un intento de garantizar  la supervivencia de la humanidad",
                R.drawable.interstellar
            )
        )
        peliculas.add(
            Pelicula( 4,  "El prestigio",  "Tras un trágico accidente, dos magos profesionales empiezan una batalla para crear el mejor truco, sacrificando todo en sus vidas para superarse el uno al otro",
                R.drawable.theprestige
            )
        )
    }
}