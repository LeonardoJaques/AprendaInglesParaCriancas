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
class VogaisFragment : Fragment() {

    private lateinit var buttonA: ImageButton
    private lateinit var buttonE: ImageButton
    private lateinit var buttonI: ImageButton
    private lateinit var buttonO: ImageButton
    private lateinit var buttonU: ImageButton
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_vogais, container, false)

        buttonA = view.findViewById(R.id.imageButton_a)
        buttonE = view.findViewById(R.id.imageButton_e)
        buttonI = view.findViewById(R.id.imageButton_i)
        buttonO = view.findViewById(R.id.imageButton_o)
        buttonU = view.findViewById(R.id.imageButton_u)


        buttonA.setOnClickListener(listener)
        buttonE.setOnClickListener(listener)
        buttonI.setOnClickListener(listener)
        buttonO.setOnClickListener(listener)
        buttonU.setOnClickListener(listener)



        return view
    }

    val listener = View.OnClickListener { v ->
        when (v.id) {
            R.id.imageButton_a -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.a)
                Toast.makeText(context ,"PRONUNCIATION OF A" , Toast.LENGTH_SHORT).show()
                tocarSom()
            }
            R.id.imageButton_e -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.e)
                Toast.makeText(context ,"PRONUNCIATION OF E" , Toast.LENGTH_SHORT).show()
                tocarSom()
            }
            R.id.imageButton_i -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.i)
                Toast.makeText(context ,"PRONUNCIATION OF I" , Toast.LENGTH_SHORT).show()
                tocarSom()
            }
            R.id.imageButton_o -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.o)
                Toast.makeText(context ,"PRONUNCIATION OF O" , Toast.LENGTH_SHORT).show()
                tocarSom()
            }
            R.id.imageButton_u -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.u)
                Toast.makeText(context ,"PRONUNCIATION OF U" , Toast.LENGTH_LONG).show()
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
