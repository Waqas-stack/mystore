package com.example.mystore.Screens.Profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mystore.R


@Composable
fun Profile(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(android.graphics.Color.parseColor("#FFFFFF"))),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Card(
            shape = CircleShape,
            elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier.size(110.dp) // Set your desired size
        ) {
            Image(
                painter = painterResource(id = R.drawable.profilepic), // Replace with your image resource
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape), // This makes the image circular
                contentScale = ContentScale.Crop // Crop to make the image fill the shape
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Mark Adam", fontWeight = FontWeight.Bold, fontSize = 22.sp)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "waqas.ahmad@examplepetstore.com", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(34.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 16.dp, end = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#F4F4F4")),
                contentColor = androidx.compose.ui.graphics.Color.White
            ),
            onClick = {
                navController.navigate("Settings")
            }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.person),
                    modifier = Modifier.size(24.dp),
                    contentDescription = "person"
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Profile",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.arrow_forward_ios),
                    contentDescription = "Back Arrow Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(14.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 16.dp, end = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#F4F4F4")),
                contentColor = androidx.compose.ui.graphics.Color.White
            ),
            onClick = {
                navController.navigate("Settings")
            }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.setting),
                    modifier = Modifier.size(24.dp),
                    contentDescription = "person"
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Setting",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.arrow_forward_ios),
                    contentDescription = "Back Arrow Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(14.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 16.dp, end = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#F4F4F4")),
                contentColor = androidx.compose.ui.graphics.Color.White
            ),
            onClick = {
                navController.navigate("Settings")
            }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.contact),
                    modifier = Modifier.size(24.dp),
                    contentDescription = "person"
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Contact ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.arrow_forward_ios),
                    contentDescription = "Back Arrow Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(14.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 16.dp, end = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#F4F4F4")),
                contentColor = androidx.compose.ui.graphics.Color.White
            ),
            onClick = {
                navController.navigate("Settings")
            }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.shareapp),
                    modifier = Modifier.size(24.dp),
                    contentDescription = "person"
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Share App",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.arrow_forward_ios),
                    contentDescription = "Back Arrow Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(14.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 16.dp, end = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#F4F4F4")),
                contentColor = androidx.compose.ui.graphics.Color.White
            ),
            onClick = {
                navController.navigate("Settings")
            }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.help),
                    modifier = Modifier.size(24.dp),
                    contentDescription = "person"
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Help",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.arrow_forward_ios),
                    contentDescription = "Back Arrow Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(94.dp))

        Text(text = "Sign Out",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp, color = Color.Red)
    }
}