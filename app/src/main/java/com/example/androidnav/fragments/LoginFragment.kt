package com.example.androidnav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import com.example.androidnav.R


//ცოტა ლოგიკას მოკლებულია მარა აქ username da პაროლს რასაც შეიყვან notification fragment ზე გიჩვენებს
class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usernameEditText = view.findViewById(R.id.username_edit_text)
        passwordEditText = view.findViewById(R.id.password_edit_text)
        loginButton = view.findViewById(R.id.login_button)

        val navController = Navigation.findNavController(view)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            val action = LoginFragmentDirections.actionLoginFragmentToNotificationFragment(username,password)
            navController.navigate(action)
        }

    }

}