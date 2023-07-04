package com.example.lesson3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.lesson3_8.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var navArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()


    }

    private fun initView() {
        arguments?.let {
            navArgs= SecondFragmentArgs.fromBundle(it)
        }


        binding.apply {
            navArgs.character.image?.let { imgDetail.loadImage(it) }
            tvDetailIsAlive.text = navArgs.character.isAlive
            tvDetailName.text = navArgs.character.name

        }
    }
}