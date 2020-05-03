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

    private lateinit var buttonZero: ImageView
    private lateinit var buttonUm: ImageView
    private lateinit var buttonDois: ImageView
    private lateinit var buttonTres: ImageView
    private lateinit var buttonQuatro: ImageView
    private lateinit var buttonCinco: ImageView
    private lateinit var buttonSeis: ImageView
    private lateinit var buttonSete: ImageView
    private lateinit var buttonOito: ImageView
    private lateinit var buttonNove: ImageView
    private lateinit var buttonDez: ImageView

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_numeros, container, false)

        buttonZero = view.findViewById(R.id.imageButton_zero)
        buttonUm = view.findViewById(R.id.imageButton_um)
        buttonDois = view.findViewById(R.id.imageButton_dois)
        buttonTres = view.findViewById(R.id.imageButton_tres)
        buttonQuatro = view.findViewById(R.id.imageButton_quatro)
        buttonCinco = view.findViewById(R.id.imageButton_cinco)
        buttonSeis = view.findViewById(R.id.imageButton_seis)
        buttonSete = view.findViewById(R.id.imageButton_sete)
        buttonOito = view.findViewById(R.id.imageButton_oito)
        buttonNove = view.findViewById(R.id.imageButton_nove)
        buttonDez = view.findViewById(R.id.imageButton_dez)


        buttonZero.setOnClickListener(listener)
        buttonUm.setOnClickListener(listener)
        buttonDois.setOnClickListener(listener)
        buttonTres.setOnClickListener(listener)
        buttonQuatro.setOnClickListener(listener)
        buttonCinco.setOnClickListener(listener)
        buttonSeis.setOnClickListener(listener)
        buttonSete.setOnClickListener(listener)
        buttonOito.setOnClickListener(listener)
        buttonNove.setOnClickListener(listener)
        buttonDez.setOnClickListener(listener)

        return view
    }

    val listener = View.OnClickListener { v ->
        when (v.id) {
            R.id.imageButton_zero -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_0)
                tocarSom()
            }

            R.id.imageButton_um -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_1)
                tocarSom()
            }

            R.id.imageButton_dois -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_2)
                tocarSom()
            }

            R.id.imageButton_tres -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_3)
                tocarSom()
            }

            R.id.imageButton_quatro -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_4)
                tocarSom()
            }

            R.id.imageButton_cinco -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_5)
                tocarSom()
            }

            R.id.imageButton_seis -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_6)
                tocarSom()
            }

            R.id.imageButton_sete -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_7)
                tocarSom()
            }

            R.id.imageButton_oito -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_8)
                tocarSom()
            }

            R.id.imageButton_nove -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_9)
                tocarSom()
            }

            R.id.imageButton_dez -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.pronuncia_10)
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
