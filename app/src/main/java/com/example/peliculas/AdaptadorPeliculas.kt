package com.example.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class  AdaptadorPeliculas: BaseAdapter {
    lateinit var context: Context
    var peliculas: ArrayList<Pelicula> = ArrayList()

    constructor (context: Context, peliculas: ArrayList<Pelicula>) {
        this.context = context
        this.peliculas = peliculas
    }
    override fun getCount(): Int {
        return peliculas.size
    }
    override fun getItem(p0: Int): Any {

        return  peliculas[p0]
    }
    override fun getItemId(p0: Int): Long {
        return  peliculas[p0].id.toLong()
        TODO( "Not yet implemented")
    }
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflador = LayoutInflater.from(context)
        val vista = inflador.inflate(R.layout.pelicula_view,null)



        val tv_nombre: TextView = vista.findViewById(R.id.tv_nombre)
        val tv_desc: TextView = vista.findViewById(R.id.tv_desc)
        val img: ImageView = vista.findViewById(R.id.image_peli)

        var pelicula:Pelicula = peliculas[p0]
        tv_nombre.setText(pelicula.nombre)
        tv_desc.setText(pelicula.desc)
        img.setImageResource(pelicula.img)


        vista.setOnClickListener{
         val intent = Intent(context,DetallePelicula::class.java)
            intent.putExtra("nombre",pelicula.nombre)
            intent.putExtra("desc",pelicula.desc)
            intent.putExtra("img",pelicula.img)


            context.startActivity(intent)
        }
        return vista
        TODO( "Not yet implemented")
    }
}



