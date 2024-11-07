package com.example.cc17_3f_mallaricjy_act7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.cc17_3f_bravojrs_act7.R

class RestaurantsCategory : Fragment() {

    private lateinit var viewModel: RestaurantsCategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_restaurants_category, container, false)
        viewModel = ViewModelProvider(requireActivity()).get(RestaurantsCategoryViewModel::class.java)

        val restaurantDetails = listOf("Grumpy Joe", "Foam Coffee", "Guidos Ristorante")
        viewModel.setRestaurantDetails(restaurantDetails)

        setupNavigationButtons(view)

        return view
    }

    private fun setupNavigationButtons(view: View) {
        val buttonGrumpyJoe = view.findViewById<Button>(R.id.button_grumpyjoe)
        val buttonFoamCoffee = view.findViewById<Button>(R.id.button_foamcoffee)
        val buttonGuidosRistorante = view.findViewById<Button>(R.id.button_guidosristorante)

        buttonGrumpyJoe.setOnClickListener {
            val bundle = Bundle().apply {
                putString("restaurantName", "Grumpy Joe")
            }
            findNavController().navigate(R.id.action_restaurants_category_to_grumpy_joe, bundle)
        }

        buttonFoamCoffee.setOnClickListener {
            val bundle = Bundle().apply {
                putString("restaurantName", "Foam Coffee")
            }
            findNavController().navigate(R.id.action_restaurants_category_to_foamcoffee, bundle)
        }

        buttonGuidosRistorante.setOnClickListener {
            val bundle = Bundle().apply {
                putString("restaurantName", "Guidos Ristorante")
            }
            findNavController().navigate(R.id.action_restaurants_category_to_guidos_ristorante, bundle)
        }
    }
}
