package com.example.mystore.Screens.CheckOut

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mystore.R


@Composable
fun Checkout(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp) // Set the size of the box
                    .background(
                        Color(android.graphics.Color.parseColor("#F8F7F7")),
                        shape = RoundedCornerShape(100.dp)
                    ) // Rounded corners
                    .padding(16.dp), // Padding for inner content
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.back),
                        contentDescription = "no",
                        modifier = Modifier.size(34.dp)
                    )
                }
            }

            Text(text = "Checkout", fontWeight = FontWeight.W600, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(0.dp))

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp) // Set the size of the box
                    .background(
                        Color(android.graphics.Color.parseColor("#F8F7F7")),
                        shape = RoundedCornerShape(100.dp)
                    ) // Rounded corners
                    .padding(16.dp), // Padding for inner content
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = { /* Handle back button click */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.location),
                        contentDescription = "no",
                        tint = Color(android.graphics.Color.parseColor("#6055D8")),
                        modifier = Modifier.size(54.dp)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 16.dp),
                verticalArrangement = Arrangement.Center,

                ) {
                Text(
                    text = "325 15th Eighth Avenue, NewYork",
                    fontWeight = FontWeight.W600,
                    fontSize = 14.sp
                )
                Text(
                    text = "Saepe eaque fugiat ea voluptatum veniam.",
                    fontWeight = FontWeight.W400,
                    fontSize = 12.sp
                )

            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(206.dp)
                .padding(start = 16.dp, end = 16.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color(android.graphics.Color.parseColor("#A9A6A6"))),

            ) {
            Text(
                text = "Order Summary",
                fontWeight = FontWeight.W600, fontSize = 16.sp,
                modifier = Modifier.padding(top = 5.dp, start = 5.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, start = 15.dp, end = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Items")
                Text(text = "3")
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, start = 15.dp, end = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Items")
                Text(text = "3")
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, start = 15.dp, end = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Items")
                Text(text = "3")
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, start = 15.dp, end = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Items")
                Text(text = "3")
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, start = 15.dp, end = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Items")
                Text(text = "3")
            }

        }
        Spacer(modifier = Modifier.height(110.dp))
        Text(text = "Choose payment method",
            fontWeight = FontWeight.W600, fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp)

        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(painter = painterResource(id = R.drawable.money),
                    contentDescription = "cash",
                    tint = Color(android.graphics.Color.parseColor("#FFD700")),
                    modifier = Modifier.size(54.dp)

                )
                Text(text = "Cash",fontWeight = FontWeight.W400, fontSize = 16.sp,)

            }
            Box(
                modifier = Modifier
                    .size(50.dp) // Set the size of the box
                    .background(
                        Color(android.graphics.Color.parseColor("#F8F7F7")),
                        shape = RoundedCornerShape(100.dp)
                    ) // Rounded corners
                    .padding(16.dp), // Padding for inner content
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = { /* Handle back button click */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.done),
                        contentDescription = "no",
                        tint = Color(android.graphics.Color.parseColor("#6055D8")),
                        modifier = Modifier.size(54.dp)
                    )
                }
            }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "Add new payment method",fontWeight = FontWeight.W400, fontSize = 16.sp,)
                Box(
                    modifier = Modifier
                        .size(50.dp) // Set the size of the box
                        .background(
                            Color(android.graphics.Color.parseColor("#F8F7F7")),
                            shape = RoundedCornerShape(100.dp)
                        ) // Rounded corners
                        .padding(16.dp), // Padding for inner content
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(onClick = { /* Handle back button click */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.plus),
                            contentDescription = "no",
                            tint = Color(android.graphics.Color.parseColor("#6055D8")),
                            modifier = Modifier.size(54.dp)
                        )
                    }
                }
        }
        Spacer(modifier = Modifier.height(50.dp))

        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#6055D8")),
                contentColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth().padding(start = 16.dp, end = 16.dp)
                .height(55.dp),
            onClick = {
                navController.navigate("AddShippingAdress")
            }) {
            Text(text = "Confirm Order")
        }
        }
}