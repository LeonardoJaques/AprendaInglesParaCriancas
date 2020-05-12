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

/**
 * A simple [Fragment] subclass.
 */
class BichosFragment : Fragment() {


    private lateinit var buttonCao: ImageButton
    private lateinit var buttonGato: ImageButton
    private lateinit var buttonLeao: ImageButton
    private lateinit var buttonMacaco: ImageButton
    private lateinit var buttonOvelha: ImageButton
    private lateinit var buttonVaca: ImageButton
    private lateinit var mediaPlayer: MediaPlayer


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bichos, container, false)

        buttonCao = view.findViewById(R.id.imageButton_a)
        buttonGato = view.findViewById(R.id.imageButton_gato)
        buttonLeao = view.findViewById(R.id.imageButton_leao)
        buttonMacaco = view.findViewById(R.id.imageButton_macaco)
        buttonOvelha = view.findViewById(R.id.imageButton_ovelha)
        buttonVaca = view.findViewById(R.id.imageButton_vaca)

        buttonCao.setOnClickListener(listener)
        buttonGato.setOnClickListener(listener)
        buttonLeao.setOnClickListener(listener)
        buttonMacaco.setOnClickListener(listener)
        buttonOvelha.setOnClickListener(listener)
        buttonVaca.setOnClickListener(listener)

        return view
    }

    val listener = View.OnClickListener { v ->
        when (v.id) {
            R.id.imageButton_a -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.dog)
                Toast.makeText(context ,"PRONUNCIATION OF DOG" , Toast.LENGTH_SHORT).show()

                tocarSom()
            }
            R.id.imageButton_gato -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.cat)
                Toast.makeText(context ,"PRONUNCIATION OF CAT" ,Toast.LENGTH_SHORT).show()

                tocarSom()
            }
            R.id.imageButton_leao -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.lion)
                Toast.makeText(context ,"PRONUNCIATION OF LION" ,Toast.LENGTH_SHORT).show()
                tocarSom()
            }
            R.id.imageButton_macaco -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.monkey)
                Toast.makeText(context ,"PRONUNCIATION OF MONKEY" ,Toast.LENGTH_SHORT).show()
                tocarSom()
            }
            R.id.imageButton_ovelha -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.sheep)
                Toast.makeText(context ,"PRONUNCIATION OF SHEEP" ,Toast.LENGTH_SHORT).show()
                tocarSom()
            }
            R.id.imageButton_vaca -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.cow)
                Toast.makeText(context ,"PRONUNCIATION OF COW" ,Toast.LENGTH_SHORT).show()
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







