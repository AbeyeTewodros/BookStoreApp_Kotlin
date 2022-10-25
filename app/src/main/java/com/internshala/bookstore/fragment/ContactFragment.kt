package com.internshala.bookstore.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.internshala.bookstore.R


class ContactFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_profile_fragmenr, container, false)


        val btnlinkedin:Button = view.findViewById(R.id.btnlinkedin)
        val btninsta: Button =  view.findViewById(R.id.btninsta)
        val btngithub: Button =  view.findViewById(R.id.btngithub)
        val btntelegram: Button =  view.findViewById(R.id.btntelegram)

        btnlinkedin.setOnClickListener {
            val btnlinkedin= Intent(Intent.ACTION_VIEW)

            btnlinkedin.data= Uri.parse("https://www.linkedin.com/in/abeye-tewodros-3957521b6/")

            startActivity(btnlinkedin)
        }
        btninsta.setOnClickListener {
            val btninsta= Intent(Intent.ACTION_VIEW)

            btninsta.data= Uri.parse("https://www.instagram.com/Kingston007j")

            startActivity(btninsta)
        }
        btngithub.setOnClickListener {
            val btngithub= Intent(Intent.ACTION_VIEW)

            btngithub.data= Uri.parse("https://github.com/AbeyeTewodros")

            startActivity(btngithub)
        }
        btntelegram.setOnClickListener {
            val btntelegram= Intent(Intent.ACTION_VIEW)

            btntelegram.data= Uri.parse("https://t.me/Kingston007j")

            startActivity(btntelegram)
        }


        return view

    }
}