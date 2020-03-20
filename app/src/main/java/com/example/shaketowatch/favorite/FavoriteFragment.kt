package com.example.shaketowatch.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.shaketowatch.R

class FavoriteFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Toast.makeText(requireContext(), "FavoriteFragment", Toast.LENGTH_SHORT).show()
    }

    companion object {

        const val TAG = "FavoriteFragment"

        fun create(): FavoriteFragment {
            return FavoriteFragment()
        }
    }
}