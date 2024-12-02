package com.example.mystore.Screens.Settings

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Divider
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
fun Settings(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//
    ){
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
                modifier = Modifier.size(24.dp).clickable {
                    navController.popBackStack()
                }
            )
            Text(text = "Settings", fontWeight = FontWeight.W600, fontSize = 16.sp)
            Spacer(modifier = Modifier.height(0.dp,),)

        }
        Spacer(modifier = Modifier.height(13.dp,),)
        Text(text = "Account",
            fontWeight = FontWeight.W600,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp)
        )
        Spacer(modifier = Modifier.height(14.dp,),)
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .padding(start = 16.dp, end = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(android.graphics.Color.parseColor("#F4F4F4")),
                contentColor = Color.White
            ),
            onClick = { /*TODO*/ }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Card(
                    shape = CircleShape,
                    elevation = CardDefaults.cardElevation(8.dp),
                    modifier = Modifier.size(40.dp) // Set your desired size
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
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(start = 16.dp),
                verticalArrangement = Arrangement.Center,

            ) {
                Text(
                    text = "Profile",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Text(
                    text = "waqas.ahmad@examplepetstore.com",
                    fontSize = 12.sp,
                    color = Color.Black
                )

            }

            Row (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Spacer(modifier = Modifier.height(14.dp,),)

                Icon(
                    painter = painterResource(id = R.drawable.arrow_forward_ios),
                    contentDescription = "Back Arrow Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(14.dp))
        Divider()
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Setting",
            fontWeight = FontWeight.W600,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
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
            onClick = { /*TODO*/ }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.notification),
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
                    text = "Notification",
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
            onClick = { /*TODO*/ }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.language),
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
                    text = "Language ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
              Row (
              ){
                  Text(
                      text = "English ",
                      fontWeight = FontWeight.W400,
                      fontSize = 12.sp,
                      color = Color.Black,
                      modifier = Modifier.align(Alignment.CenterVertically)
                  )
                  Icon(
                      painter = painterResource(id = R.drawable.arrow_forward_ios),
                      contentDescription = "Back Arrow Icon",
                      tint = Color.Black,
                      modifier = Modifier.size(24.dp)
                  )
              }
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
            onClick = { /*TODO*/ }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.privacy),
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
                    text = "Privacy",
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
            onClick = { /*TODO*/ }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.helpcenter),
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
                    text = "Help Center",
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
            onClick = { /*TODO*/ }) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.aboutus),
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
                    text = "About us",
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
    }
}