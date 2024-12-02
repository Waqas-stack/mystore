package com.example.mystore.Screens.Success

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mystore.R


@Composable
fun Success(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.bags),
            contentDescription = "bags",
            modifier = Modifier.size(213.dp)
        )
        Text(text = "Success!", fontSize = 34.sp, fontWeight = FontWeight.W700)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Your order will be delivered soon.\n" +
                "Thank you for choosing our app!", fontSize = 14.sp, fontWeight = FontWeight.W500)
            Spacer(modifier = Modifier.height(180.dp))

            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(android.graphics.Color.parseColor("#6055D8")),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                onClick = {
                    navController.navigate("Myorder")
                }) {
                Text(text = "CONTINUE SHOPPING")
            }
    }
}