package com.jaques.projetos.aprendaingles.fragment

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

import com.jaques.projetos.aprendaingles.R

/**
 * A simple [Fragment] subclass.
 */
class ConsoantesFragment : Fragment() {
    private lateinit var buttonB: ImageButton
    private lateinit var buttonC: ImageButton
    private lateinit var buttonD: ImageButton
    private lateinit var buttonF: ImageButton
    private lateinit var buttonG: ImageButton
    private lateinit var buttonH: ImageButton
    private lateinit var buttonJ: ImageButton
    private lateinit var buttonK: ImageButton
    private lateinit var buttonL: ImageButton
    private lateinit var buttonM: ImageButton
    private lateinit var buttonN: ImageButton
    private lateinit var buttonP: ImageButton
    private lateinit var buttonQ: ImageButton
    private lateinit var buttonR: ImageButton
    private lateinit var buttonS: ImageButton
    private lateinit var buttonT: ImageButton
    private lateinit var buttonV: ImageButton
    private lateinit var buttonX: ImageButton
    private lateinit var buttonY: ImageButton
    private lateinit var buttonZ: ImageButton
    private lateinit var buttonW: ImageButton


    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_consoantes, container, false)

        buttonB = view.findViewById(R.id.imageButton_b)
        buttonC = view.findViewById(R.id.imageButton_c)
        buttonD = view.findViewById(R.id.imageButton_d)
        buttonF = view.findViewById(R.id.imageButton_f)
        buttonG = view.findViewById(R.id.imageButton_g)
        buttonH = view.findViewById(R.id.imageButton_h)
        buttonJ = view.findViewById(R.id.imageButton_j)
        buttonK = view.findViewById(R.id.imageButton_k)
        buttonL = view.findViewById(R.id.imageButton_l)
        buttonM = view.findViewById(R.id.imageButton_m)
        buttonN = view.findViewById(R.id.imageButton_n)
        buttonP = view.findViewById(R.id.imageButton_p)
        buttonQ = view.findViewById(R.id.imageButton_q)
        buttonR = view.findViewById(R.id.imageButton_r)
        buttonS = view.findViewById(R.id.imageButton_s)
        buttonT = view.findViewById(R.id.imageButton_t)
        buttonV = view.findViewById(R.id.imageButton_v)
        buttonX = view.findViewById(R.id.imageButton_x)
        buttonY = view.findViewById(R.id.imageButton_y)
        buttonZ = view.findViewById(R.id.imageButton_z)
        buttonW = view.findViewById(R.id.imageButton_w)

//
        buttonB.setOnClickListener(listener)
        buttonC.setOnClickListener(listener)
        buttonD.setOnClickListener(listener)
        buttonF.setOnClickListener(listener)
        buttonG.setOnClickListener(listener)
        buttonH.setOnClickListener(listener)
        buttonJ.setOnClickListener(listener)
        buttonK.setOnClickListener(listener)
        buttonL.setOnClickListener(listener)
        buttonM.setOnClickListener(listener)
        buttonN.setOnClickListener(listener)
        buttonP.setOnClickListener(listener)
        buttonQ.setOnClickListener(listener)
        buttonR.setOnClickListener(listener)
        buttonS.setOnClickListener(listener)
        buttonT.setOnClickListener(listener)
        buttonV.setOnClickListener(listener)
        buttonX.setOnClickListener(listener)
        buttonY.setOnClickListener(listener)
        buttonZ.setOnClickListener(listener)
        buttonW.setOnClickListener(listener)

        return view
    }

    val listener = View.OnClickListener { v ->
        when (v.id) {
            R.id.imageButton_b -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.b)
                tocarSom()
            }
            R.id.imageButton_c -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.c)
                tocarSom()
            }
            R.id.imageButton_d -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.d)
                tocarSom()
            }
            R.id.imageButton_f -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.f)
                tocarSom()
            }
            R.id.imageButton_g -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.g)
                tocarSom()
            }
            R.id.imageButton_h -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.h)
                tocarSom()
            }
            R.id.imageButton_j -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.j)
                tocarSom()
            }
            R.id.imageButton_k -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.k)
                tocarSom()
            }
            R.id.imageButton_l -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.l)
                tocarSom()
            }
            R.id.imageButton_m -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.m)
                tocarSom()
            }
            R.id.imageButton_n -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.n)
                tocarSom()
            }

            R.id.imageButton_p -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.p)
                tocarSom()
            }
            R.id.imageButton_q -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.q)
                tocarSom()
            }
            R.id.imageButton_r -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.r)
                tocarSom()
            }
            R.id.imageButton_s -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.s)
                tocarSom()
            }
            R.id.imageButton_t -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.t)
                tocarSom()
            }
            R.id.imageButton_v -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.v)
                tocarSom()
            }
            R.id.imageButton_w -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.w)
                tocarSom()
            }
            R.id.imageButton_x -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.x)
                tocarSom()
            }
            R.id.imageButton_y -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.y)
                tocarSom()
            }
            R.id.imageButton_z -> {
                mediaPlayer = MediaPlayer.create(activity, R.raw.z)
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
