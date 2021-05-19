package com.fiap.calculadora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.fiap.calculadora.databinding.FragmentAnwserBinding
import com.fiap.calculadora.databinding.FragmentHomeBinding


class anwserFragment : Fragment() {

    private lateinit var bindings: FragmentAnwserBinding
    private val args: anwserFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindings = DataBindingUtil.inflate(inflater, R.layout.fragment_anwser, container, false)
        // Inflate the layout for this fragment
        return bindings.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindings.correctAnswer = args.resposta
    }

}