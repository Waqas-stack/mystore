package com.example.mystore.Screens.Login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mystore.R



@Composable
fun Login(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize().background(colorResource(id = R.color.scfool_color)),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(26.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            Icon(
                painter = painterResource(id = R.drawable.arrow_back_ios_new),
                contentDescription = "Back Arrow Icon",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Sign In", fontWeight = FontWeight.W600, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(0.dp,),)

        }
        Spacer(modifier = Modifier.height(213.dp,),)
        Column (
            modifier = Modifier.padding(16.dp),
        ){

            TextField(
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = colorResource(id = R.color.white),
                    unfocusedContainerColor = colorResource(id = R.color.white),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                value = email, onValueChange ={
                    email = it
                },
                placeholder = {
                    Text(text = "email")

                } )

            Spacer(modifier = Modifier.height(14.dp,),)

            TextField(
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = colorResource(id = R.color.white),
                    unfocusedContainerColor = colorResource(id = R.color.white),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                value = password, onValueChange ={
                    password = it
                },
                placeholder = {
                    Text(text = "password")

                } )


            Spacer(modifier = Modifier.height(10.dp,),)
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
            ){
                Text(text = "Forgot your password?", fontWeight = FontWeight.W400, fontSize = 16.sp)
                Spacer(modifier = Modifier.width(10.dp,),)

                Icon(
                    painter = painterResource(id = R.drawable.forwardarrow),
                    contentDescription = "Forward Arrow Icon",
                    tint = colorResource(id = R.color.arrow_color),
                    modifier = Modifier.size(24.dp)
                )
            }
            Spacer(modifier = Modifier.height(14.dp,),)

            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.btn_color),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
                    .height(55.dp),
                onClick = {
                    navController.navigate("SignUp")
                }) {
                Text(text = "LOGIN")
            }

        }


    }
}