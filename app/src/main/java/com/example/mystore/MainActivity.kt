package com.example.mystore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mystore.Screens.AddShippingAdress.AddShippingAdress
import com.example.mystore.Screens.Cart.Cart
import com.example.mystore.Screens.CheckOut.Checkout
import com.example.mystore.Screens.Details.Details
import com.example.mystore.Screens.Home.Home
import com.example.mystore.Screens.Login.Login
import com.example.mystore.Screens.MyOrder.Myorder
import com.example.mystore.Screens.ProductList.ProductList
import com.example.mystore.Screens.Profile.Profile
import com.example.mystore.Screens.Search.Seach
import com.example.mystore.Screens.Settings.Settings
import com.example.mystore.Screens.SignUp.SignUp
import com.example.mystore.Screens.Success.Success
import com.example.mystore.ui.theme.MyStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            MyStoreTheme {
                NavHost(navController = navController, startDestination ="Login" ) {
                   composable("Login"){
                       Login(navController)
                   }
                    composable("SignUp"){
                        SignUp(navController)
                    }
                    composable("Home"){
                        Home(navController)
                    }
                    composable("Profile"){
                        Profile(navController)
                    }
                    composable("Settings"){
                        Settings(navController)
                    }
                    composable("Seach"){
                        Seach(navController)
                    }
                    composable("ProductList"){
                        ProductList(navController)
                    }
                    composable("Details"){
                        Details(navController)
                    }
                    composable("Cart"){
                        Cart(navController)
                    }
                    composable("Checkout"){
                        Checkout(navController)
                    }
                    composable("AddShippingAdress"){
                        AddShippingAdress(navController)
                    }
                    composable("Success"){
                        Success(navController)
                    }
                    composable("Myorder"){
                        Myorder(navController)
                    }
                }
            }
        }
    }
}

