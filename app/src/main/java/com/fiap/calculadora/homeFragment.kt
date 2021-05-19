package com.fiap.calculadora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.fiap.calculadora.databinding.FragmentHomeBinding

class homeFragment : Fragment() {

    private lateinit var bindings: FragmentHomeBinding
    private var num1 : Int
    private var num2 : Int

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        return bindings.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindings.resultado.setOnClickListener{
            val action = homeFragmentDirections.actionHomeFragmentToAnwserFragment(soma(num1, num2))
            findNavController().navigate(action)
        }
    }


    fun soma(num1: Int, num2: Int): Int {
        val resposta = num1 + num2
        return resposta
    }

}
