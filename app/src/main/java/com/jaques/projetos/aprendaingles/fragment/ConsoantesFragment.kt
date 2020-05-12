package com.jaques.projetos.aprendaingles.fragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast

import com.jaques.projetos.aprendaingles.R
import com.jaques.projetos.aprendaingles.modelo.ButtonModel

/**
 * A simple [Fragment] subclass.
 */
class ConsoantesFragment : Fragment() {

    val alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".map { letter -> letter.toString()}
//    val alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//    val alfaInterator = listOf(alfabeto).iterator()

    var underr = "_"
    var lista = listOf("a", "b", "c").joinToString(underr)




    var consoante =
        alfabeto.filter { alfaFiltro -> alfaFiltro != "A" && alfaFiltro != "E" && alfaFiltro != "I" && alfaFiltro != "O" && alfaFiltro !="U" }

    private lateinit var button: ImageButton

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var list = consoante.map{x ->  ButtonModel("@+id/imageButton_$x", "@drawable/$x","imagemletra$x") }
            println(list)

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_consoantes, container, false)

//        buttonB = view.findViewById(R.id.imageButton_b)

//
//        buttonB.setOnClickListener(listener)


        return view
    }

    val listener = View.OnClickListener { v ->
        when (v.id) {
            R.id.imageButton_b -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.b)
                Toast.makeText(context, "PRONUNCIATION OF B", Toast.LENGTH_LONG).show()
                tocarSom()
            }
        }
    }

    fun tocarSom() {
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener {
            mediaPlayer.release()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }

}

