package com.example.shaketowatch.top

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import com.example.shaketowatch.R
import com.example.shaketowatch.api.TheMovieApi
import com.example.shaketowatch.api.response.TopResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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
        //test
        TheMovieApi.api().loadTopList(1).enqueue(object : Callback<TopResponse> {

            override fun onFailure(call: Call<TopResponse>, t: Throwable) {
                Log.d("Test api", t.printStackTrace().toString())
            }

            override fun onResponse(call: Call<TopResponse>, response: Response<TopResponse>) {
                Log.d("Test api", response.body().toString())
            }

        })
    }

    companion object {

        const val TAG = "TopListFragment"

        fun create(): TopListFragment {
            return TopListFragment()
        }
    }
}