package com.example.shaketowatch.top

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import com.example.shaketowatch.R
import kotlinx.android.synthetic.main.fragment_top_list.top_list as topList

class TopListFragment : Fragment() {

    private val topListAdapter = TopListAdapter(
        object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }
        }
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_top_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        topList.adapter = topListAdapter
        Toast.makeText(requireContext(), "TopListFragment", Toast.LENGTH_SHORT).show()
    }

    companion object {

        const val TAG = "TopListFragment"

        fun create(): TopListFragment {
            return TopListFragment()
        }
    }
}