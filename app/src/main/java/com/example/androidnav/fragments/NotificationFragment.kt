package com.example.androidnav.fragments

import android.app.Notification
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.androidnav.R

/*
 *  Created by Nikoloz Katsitadze on 5/6/21
 */

class NotificationFragment : Fragment(R.layout.fragment_notification) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.username_textview).text =
            NotificationFragmentArgs.fromBundle(requireArguments()).username
        view.findViewById<TextView>(R.id.password_textview).text =
            NotificationFragmentArgs.fromBundle(requireArguments()).password
    }

}