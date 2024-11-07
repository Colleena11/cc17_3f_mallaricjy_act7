package com.example.cc17_3f_mallaricjy_act7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cc17_3f_bravojrs_act7.R


/**
 * A simple [Fragment] subclass.
 * Use the [grumpyjoe.newInstance] factory method to
 * create an instance of this fragment.
 */
class GrumpyJoe : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grumpyjoe, container, false)
    }


}