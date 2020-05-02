package com.jaques.projetos.aprendaingles.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.jaques.projetos.aprendaingles.R

/**
 * A simple [Fragment] subclass.
 */
class NumerosFragment : Fragment() {

    private lateinit var buttonUm: ImageView
    private lateinit var buttonDois: ImageView
    private lateinit var buttonTres: ImageView
    private lateinit var buttonQuatro: ImageView
    private lateinit var buttonCinco: ImageView
    private lateinit var buttonSeis: ImageView
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_numeros, container, false)

        buttonUm = view.findViewById(R.id.imageButton_um)
        buttonDois = view.findViewById(R.id.imageButton_dois)
        buttonTres = view.findViewById(R.id.imageButton_tres)
        buttonQuatro = view.findViewById(R.id.imageButton_quatro)
        buttonCinco = view.findViewById(R.id.imageButton_cinco)
        buttonSeis = view.findViewById(R.id.imageButton_seis)


        buttonUm.setOnClickListener(listener)
        buttonDois.setOnClickListener(listener)
        buttonTres.setOnClickListener(listener)
        buttonQuatro.setOnClickListener(listener)
        buttonCinco.setOnClickListener(listener)
        buttonSeis.setOnClickListener(listener)

        return view
    }

    val listener = View.OnClickListener { v ->
        when (v.id) {
            R.id.imageButton_um -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.one)
                tocarSom()
            }

            R.id.imageButton_dois -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.two)
                tocarSom()
            }

            R.id.imageButton_tres -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.three)
                tocarSom()
            }

            R.id.imageButton_quatro -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.four)
                tocarSom()
            }

            R.id.imageButton_cinco -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.five)
                tocarSom()
            }

            R.id.imageButton_seis -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.six)
                tocarSom()
            }
        }
    }
    fun tocarSom(): Unit {
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
